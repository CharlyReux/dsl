package org.xtext.ice.generator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.ice.fsm.model.Fsm
import fr.ice.fsm.model.State



@Aspect(className=Fsm)
class FSMAspect {
	
	public State currentState;
	
}