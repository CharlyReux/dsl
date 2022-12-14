/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ice.serializer;

import com.google.inject.Inject;
import fr.ice.fsm.model.Fsm;
import fr.ice.fsm.model.ModelPackage;
import fr.ice.fsm.model.State;
import fr.ice.fsm.model.Transition;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.ice.services.FsmGrammarAccess;

@SuppressWarnings("all")
public class FsmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FsmGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ModelPackage.FSM:
				sequence_Fsm(context, (Fsm) semanticObject); 
				return; 
			case ModelPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case ModelPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Fsm returns Fsm
	 *
	 * Constraint:
	 *     (name=EString (state+=State | transition+=Transition)*)
	 */
	protected void sequence_Fsm(ISerializationContext context, Fsm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (init?='init'? name=EString entryName=EString)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (name=EString source=[State|EString] destination=[State|EString] trigger=EString)
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.TRANSITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.TRANSITION__NAME));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.TRANSITION__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.TRANSITION__SOURCE));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.TRANSITION__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.TRANSITION__DESTINATION));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.TRANSITION__TRIGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.TRANSITION__TRIGGER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_3_0_0_1(), semanticObject.eGet(ModelPackage.Literals.TRANSITION__SOURCE, false));
		feeder.accept(grammarAccess.getTransitionAccess().getDestinationStateEStringParserRuleCall_3_2_0_1(), semanticObject.eGet(ModelPackage.Literals.TRANSITION__DESTINATION, false));
		feeder.accept(grammarAccess.getTransitionAccess().getTriggerEStringParserRuleCall_4_1_0(), semanticObject.getTrigger());
		feeder.finish();
	}
	
	
}
