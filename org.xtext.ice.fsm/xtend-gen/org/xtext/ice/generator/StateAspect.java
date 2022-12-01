package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.State;
import fr.ice.fsm.model.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static void step(final State _self, final String inputString, final Fsm myFsm) {
    final org.xtext.ice.generator.StateAspectStateAspectProperties _self_ = org.xtext.ice.generator.StateAspectStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void step(String,Fsm)
    if (_self instanceof fr.ice.fsm.model.State){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.xtext.ice.generator.StateAspect._privk3_step(_self_, (fr.ice.fsm.model.State)_self,inputString,myFsm);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {inputString,myFsm}, command, "State", "step");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_step(final StateAspectStateAspectProperties _self_, final State _self, final String inputString, final Fsm myFsm) {
    try {
      final Function1<Transition, Boolean> _function = (Transition t) -> {
        return Boolean.valueOf(((_self.getName().compareTo(t.getSource().getName()) == 0) && (inputString.compareTo(t.getTrigger()) == 0)));
      };
      final Iterable<Transition> validTransitions = IterableExtensions.<Transition>filter(myFsm.getTransition(), _function);
      boolean _isEmpty = IterableExtensions.isEmpty(validTransitions);
      if (_isEmpty) {
        return;
      }
      int _size = IterableExtensions.size(validTransitions);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new Exception("non Determinism");
      }
      int _size_1 = IterableExtensions.size(validTransitions);
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        TransitionAspect.fire(((Transition[])Conversions.unwrapArray(validTransitions, Transition.class))[0], myFsm);
        return;
      }
      return;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
