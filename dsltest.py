import model
import uuid


def state_system(*args):
    return SystemBuilder(args)


code = []

class SystemBuilder(object):
    def __init__(self, *args):
        self.processed_def = process_raw_definition(args)
        self.y = 140
        self.build_model(self.processed_def, self.y)


    def build_model(self, elements, y):
        states = (s for s in elements if isinstance(s, model.State))
        myfile = open("testfile.xml", "w")
        current_state = None
        init_xml()
        for x in states:
            build_state(x.name,y)
            y+=150

        for e in elements:
            if isinstance(e, model.State):
                current_state = e
                print(e.name)
                #build_state(e.name, elements[e])

            if isinstance(e, model.Transition) and not current_state:
                raise Exception("initial state missing")

            elif isinstance(e, model.Transition) and current_state:
                build_transition(current_state.name, e.name, e.target.name)

        end_xml()
        myfile.write(''.join([part for part in code]))


def init_xml():
    mxGraphModel = '<mxGraphModel dx="1426" dy="778" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" ' \
                   'arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">\n'
    root = '<root>\n'
    mxCell = '<mxCell id="0"/>\n<mxCell id="1" parent="0"/>\n'
    code.append(mxGraphModel+root+mxCell)


def end_xml():
    endRoot = '</root>\n'
    endModel = '</mxGraphModel>\n'
    code.append(endRoot+endModel)


def build_state(name, y):
    mxCell = '<mxCell id="'+name+'" value="'+name+'" style="shape=rect;rounded=1;html=1;' \
             'whiteSpace=wrap;align=center;" parent="1" vertex="1">\n'
    mxGeometry = '<mxGeometry x="290" y="'+str(y)+'" width="100" height="40" as="geometry"/>\n'
    endMxCell = '</mxCell>\n'
    code.append(mxCell+mxGeometry+endMxCell)


def build_transition(source, name, target):
    mxCell = '<mxCell id="'+name+'" style="edgeStyle=orthogonalEdgeStyle;rounded=0;html=1;exitX=0.25;' \
             'exitY=0;exitDx=0;exitDy=0;entryX=0.25;entryY=1;entryDx=0;entryDy=0;jettySize=auto;' \
             'orthogonalLoop=1;" edge="1" parent="1" source="'+source+'" ' \
             'target="'+target+'">\n'

    mxCell = '<mxCell id="'+name+'" style="rounded=0;html=1;exitX=0.25;exitY=0;exitDx=0;exitDy=0;entryX=0.25;entryY=1;entryDx=0;entryDy=0;jettySize=auto;orthogonalLoop=1;" parent="1" source="'+source+'" target="'+target+'" edge="1">\n'
    mxGeometry = '<mxGeometry relative="1" as="geometry"/>\n'
    endMxCell = '</mxCell>\n'
    code.append(mxCell + mxGeometry + endMxCell)


def process_raw_definition(elements):
    result = []
    for e in elements[0]:
        if isinstance(e, model.State):
            result.append(e)
        elif isinstance(e, model.Transition):
            result.append(e)
        else:
            raise Exception('Not supported by dsl')
    return result


state = model.State
transition = model.Transition
