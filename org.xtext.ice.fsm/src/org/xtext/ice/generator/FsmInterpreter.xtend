package org.xtext.ice.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import java.util.Scanner
import fr.ice.fsm.model.Fsm
import static extension org.xtext.ice.generator.StateAspect.*

class FsmInterpreter {

	def interpret(Fsm myFsm) {
		val sc = new Scanner(System.in);
		while (true) {
			val trigger = sc.nextLine();
			print(trigger)
			myFsm.state.forEach[st|st.step(trigger, myFsm)]
		}
	}

}
