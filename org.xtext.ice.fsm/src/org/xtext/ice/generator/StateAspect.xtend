package org.xtext.ice.generator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.ice.fsm.model.State
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.ice.fsm.model.Fsm

import static extension org.xtext.ice.generator.TransitionAspect.*



@Aspect(className=State)
class StateAspect {
	@Step
	def void step(String inputString,Fsm myFsm){
		
		//Get the valid transitions
		val validTransitions = myFsm.transition.filter[t | (_self.name.compareTo(t.source.name)==0) && (inputString.compareTo(t.trigger)==0)]
		if(validTransitions.empty){
			return			
		}
		if(validTransitions.size > 1){
			throw new Exception("non Determinism")
		}
		if(validTransitions.size > 0){
			validTransitions.get(0).fire(myFsm)
			return
		}
		return
	}
}