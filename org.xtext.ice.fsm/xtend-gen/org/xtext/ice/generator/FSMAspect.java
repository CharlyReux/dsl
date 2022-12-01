package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.State;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Fsm.class)
@SuppressWarnings("all")
public class FSMAspect {
  public static State currentState(final Fsm _self) {
    final org.xtext.ice.generator.FSMAspectFsmAspectProperties _self_ = org.xtext.ice.generator.FSMAspectFsmAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State currentState()
    if (_self instanceof fr.ice.fsm.model.Fsm){
    	result = org.xtext.ice.generator.FSMAspect._privk3_currentState(_self_, (fr.ice.fsm.model.Fsm)_self);
    };
    return (fr.ice.fsm.model.State)result;
  }
  
  public static void currentState(final Fsm _self, final State currentState) {
    final org.xtext.ice.generator.FSMAspectFsmAspectProperties _self_ = org.xtext.ice.generator.FSMAspectFsmAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentState(State)
    if (_self instanceof fr.ice.fsm.model.Fsm){
    	org.xtext.ice.generator.FSMAspect._privk3_currentState(_self_, (fr.ice.fsm.model.Fsm)_self,currentState);
    };
  }
  
  protected static State _privk3_currentState(final FSMAspectFsmAspectProperties _self_, final Fsm _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.ice.fsm.model.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final FSMAspectFsmAspectProperties _self_, final Fsm _self, final State currentState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentState = currentState;
    }
  }
}
