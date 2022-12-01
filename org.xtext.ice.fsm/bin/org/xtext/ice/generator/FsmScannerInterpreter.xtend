package org.xtext.ice.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import java.util.Scanner
import fr.ice.fsm.model.Fsm
import static extension org.xtext.ice.generator.StateAspect.*

import static extension org.xtext.ice.generator.FSMAspect.*

class FsmScannerInterpreter extends FSMInterpreter{

	override interpret(Fsm myFsm) {
		myFsm.state.forEach [ st |
			if (st.init) {
				myFsm.currentState(st)
			}
		]
		val sc = new Scanner(System.in);
		while (true) {
			val trigger = sc.nextLine();
			// print(trigger)
			myFsm.currentState.step(trigger, myFsm)
		}
	}

}
