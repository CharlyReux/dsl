package org.xtext.ice.generator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.ice.fsm.model.Transition
import fr.ice.fsm.model.Fsm

import static extension org.xtext.ice.generator.FSMAspect.*

@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def void fire(Fsm myFsm){
		println("Firing " + _self.name + " and entering " + _self.destination.name)
		val fsm = myFsm
		fsm.currentState = _self.destination
	}
	
	
}