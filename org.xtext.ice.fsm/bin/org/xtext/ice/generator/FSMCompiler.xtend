package org.xtext.ice.generator

import fr.ice.fsm.model.Fsm

abstract class FSMCompiler {
		def CharSequence compile(Fsm fsm);	
}