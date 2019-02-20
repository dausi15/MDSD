'''
Created on 9 Jan 2018
@author: ups
'''

import model

def entitysystem(definition):
    return EntitySystemBuilder(definition)

class EntitySystemBuilder(object):
    def __init__(self, definition):
        self.raw_definition = definition._elements
        self.processed_def = process_raw_definition(definition._elements)
        self.entities = {}
        self.current_entity = None
        self.build_model(self.processed_def)
    def dump(self):
        print(self.processed_def)
        dump_elements(self.raw_definition,0)
    def build_model(self,rest):
        if len(rest)==0:
            self.save_entity()
            return
        head = rest[0]
        if head=='entity':
            self.build_entity(rest[1:])
        elif head=='extends':
            self.build_extends(rest[1:])
        elif head=='field':
            self.build_field(rest[1:])
        elif head=='relation':
            self.build_relation(rest[1:])
        else:
            raise Exception('illegal dsl: expected entity at '+rest[0])
    def build_entity(self,rest):
        self.save_entity()
        self.current_entity = model.Entity(rest[0])
        self.build_model(rest[1:])
    def build_extends(self,rest):
        self.current_entity.set_extends(rest[0])
        self.build_model(rest[1:])
    def build_field(self,rest):
        field = rest[0]
        self.current_entity.add_field(field[0],field[1])
        self.build_model(rest[1:])
    def build_relation(self,rest):
        kind = rest[0]
        tipe= rest[1]
        name = rest[2]
        inverse = rest[3][1]
        self.current_entity.add_relation(kind,tipe,name,inverse)
        self.build_model(rest[4:])
    def save_entity(self):
        if self.current_entity==None:
            return
        self.entities[self.current_entity.name] = self.current_entity
        self.current_entity = None

class BuilderCreator(object):
    def __init__(self, clazz):
        self._clazz = clazz
    def __getattribute__(self, *args, **kwargs):
        if args[0].startswith("_"):
            return object.__getattribute__(self, *args, **kwargs)
        return BuilderWorker(self._clazz,args[0])
    def __call__(self, *args, **kwargs):
        return BuilderWorker(self._clazz,args[0])
        return self

class BuilderWorker(object):
    def __init__(self, clazz, first):
        self._clazz = clazz
        self._elements = [clazz,first]
    def __getattribute__(self, *args, **kwargs):
        if args[0].startswith("_"):
            return object.__getattribute__(self, *args, **kwargs)
        self._elements.append(args[0])
        return self
    def __call__(self, *args, **kwargs):
        self._elements.append(args[0])
        return self

def dump_elements(elements,indent):
    spacing = ' '*indent
    for e in elements:
        if isinstance(e,str):
            print(spacing,e)
        elif isinstance(e,BuilderWorker):
            dump_elements(e._elements,indent+2)
        else:
            raise Exception('unexpected')

def process_raw_definition(elements):
    result = []
    for e in elements:
        if isinstance(e,str):
            result.append(e)
        elif isinstance(e,BuilderWorker):
            result.append(process_raw_definition(e._elements))
        else:
            raise Exception('unexpected')
    return result

state = BuilderCreator("entity")
# String = BuilderCreator("String")
# Integer = BuilderCreator("Integer")
# inverse = BuilderCreator("inverse")