package org.xtext.ice.generator

import fr.ice.fsm.model.Fsm

interface FSMvisitor {
	def CharSequence compile(Fsm fsm);
}