/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ice;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class FsmStandaloneSetup extends FsmStandaloneSetupGenerated {

	public static void doSetup() {
		new FsmStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
