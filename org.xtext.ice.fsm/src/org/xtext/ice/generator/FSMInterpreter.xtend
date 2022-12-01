package org.xtext.ice.generator

import fr.ice.fsm.model.Fsm

abstract class FSMInterpreter implements FSMvisitor{
	def void interpret(Fsm myFsm);
}