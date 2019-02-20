import dsl
import model
from dsltest import *

statemachine = state_system(
    # state("POWER_OFF"),
    #     transition("PLUS").to("POWER_ON").setState("power",MIN_POWER).
    # state("POWER_ON").
    #     transition("PLUS").to("MAX_POWER").whenStateEquals("power",MAX_POWER).
    #                          changeState("power",1).otherwise().
    #     transition("MINUS").to("POWER_OFF").whenStateEquals("power",MIN_POWER).
    #                          changeState("power",-1).otherwise().
    # state("MAX_POWER").
    #     transition("MINUS").to("POWER_ON").setState("power",MAX_POWER)
    state("POWER_OFF")                                                      ,
        transition("PLUS", state("POWER_ON"))                               ,
    state("POWER_ON")                                                       ,
        transition("PLUS [power == MAX_POWER]", state("MAX_POWER"))         ,
        transition("MINUS [power == MIN_POWER]", state("POWER_OFF"))        ,
    state("MAX_POWER")                                                      ,
        transition("MINUS", state("POWER_ON"))
)