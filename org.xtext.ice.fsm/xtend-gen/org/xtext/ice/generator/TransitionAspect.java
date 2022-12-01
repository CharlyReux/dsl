package org.xtext.ice.generator;

import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self, final Fsm myFsm) {
    final org.xtext.ice.generator.TransitionAspectTransitionAspectProperties _self_ = org.xtext.ice.generator.TransitionAspectTransitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fire(Fsm)
    if (_self instanceof fr.ice.fsm.model.Transition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.xtext.ice.generator.TransitionAspect._privk3_fire(_self_, (fr.ice.fsm.model.Transition)_self,myFsm);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {myFsm}, command, "Transition", "fire");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Fsm myFsm) {
    String _name = _self.getName();
    String _plus = ("Firing " + _name);
    String _plus_1 = (_plus + " and entering ");
    String _name_1 = _self.getDestination().getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    final Fsm fsm = myFsm;
    FSMAspect.currentState(fsm, _self.getDestination());
  }
}
