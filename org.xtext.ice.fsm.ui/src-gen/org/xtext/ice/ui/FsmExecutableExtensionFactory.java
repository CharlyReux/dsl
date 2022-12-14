/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ice.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.ice.fsm.ui.internal.FsmActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FsmExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(FsmActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		FsmActivator activator = FsmActivator.getInstance();
		return activator != null ? activator.getInjector(FsmActivator.ORG_XTEXT_ICE_FSM) : null;
	}

}
