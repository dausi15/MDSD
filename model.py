'''
Created on 15 Feb 2019

@author då
'''


class State(object):
    def __init__(self, name):
        self.name = name


class Transition(object):
    def __init__(self, name, target):
        self.name = name
        self.target = target
