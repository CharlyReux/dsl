/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ice.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FsmGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FsmElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ice.Fsm.Fsm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFsmAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFsmKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cStateAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cStateStateParserRuleCall_3_0_0 = (RuleCall)cStateAssignment_3_0.eContents().get(0);
		private final Assignment cTransitionAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_3_1_0 = (RuleCall)cTransitionAssignment_3_1.eContents().get(0);
		
		//Fsm returns Fsm:
		//    {Fsm}
		//    'fsm'
		//    name=EString
		//        (state+=State | transition+=Transition)*
		//        ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Fsm}
		//'fsm'
		//name=EString
		//    (state+=State | transition+=Transition)*
		public Group getGroup() { return cGroup; }
		
		//{Fsm}
		public Action getFsmAction_0() { return cFsmAction_0; }
		
		//'fsm'
		public Keyword getFsmKeyword_1() { return cFsmKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//(state+=State | transition+=Transition)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//state+=State
		public Assignment getStateAssignment_3_0() { return cStateAssignment_3_0; }
		
		//State
		public RuleCall getStateStateParserRuleCall_3_0_0() { return cStateStateParserRuleCall_3_0_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_3_1() { return cTransitionAssignment_3_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_3_1_0() { return cTransitionTransitionParserRuleCall_3_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ice.Fsm.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cInitInitKeyword_2_0 = (Keyword)cInitAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cEntryKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cEntryNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEntryNameEStringParserRuleCall_5_0 = (RuleCall)cEntryNameAssignment_5.eContents().get(0);
		
		//State returns State:
		//    {State}
		//    'state' (init?='init')? name=EString "entry" entryName=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{State}
		//'state' (init?='init')? name=EString "entry" entryName=EString
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//'state'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//(init?='init')?
		public Assignment getInitAssignment_2() { return cInitAssignment_2; }
		
		//'init'
		public Keyword getInitInitKeyword_2_0() { return cInitInitKeyword_2_0; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//"entry"
		public Keyword getEntryKeyword_4() { return cEntryKeyword_4; }
		
		//entryName=EString
		public Assignment getEntryNameAssignment_5() { return cEntryNameAssignment_5; }
		
		//EString
		public RuleCall getEntryNameEStringParserRuleCall_5_0() { return cEntryNameEStringParserRuleCall_5_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ice.Fsm.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTransitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cSourceAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final CrossReference cSourceStateCrossReference_3_0_0 = (CrossReference)cSourceAssignment_3_0.eContents().get(0);
		private final RuleCall cSourceStateEStringParserRuleCall_3_0_0_1 = (RuleCall)cSourceStateCrossReference_3_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cDestinationAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cDestinationStateCrossReference_3_2_0 = (CrossReference)cDestinationAssignment_3_2.eContents().get(0);
		private final RuleCall cDestinationStateEStringParserRuleCall_3_2_0_1 = (RuleCall)cDestinationStateCrossReference_3_2_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftSquareBracketKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTriggerAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTriggerEStringParserRuleCall_4_1_0 = (RuleCall)cTriggerAssignment_4_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		
		//Transition returns Transition:
		//    {Transition}
		//    'transition' name=EString ( source=[State|EString] '->' destination=[State|EString]) ('[' trigger=EString ']')
		//        ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Transition}
		//'transition' name=EString ( source=[State|EString] '->' destination=[State|EString]) ('[' trigger=EString ']')
		public Group getGroup() { return cGroup; }
		
		//{Transition}
		public Action getTransitionAction_0() { return cTransitionAction_0; }
		
		//'transition'
		public Keyword getTransitionKeyword_1() { return cTransitionKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//( source=[State|EString] '->' destination=[State|EString])
		public Group getGroup_3() { return cGroup_3; }
		
		//source=[State|EString]
		public Assignment getSourceAssignment_3_0() { return cSourceAssignment_3_0; }
		
		//[State|EString]
		public CrossReference getSourceStateCrossReference_3_0_0() { return cSourceStateCrossReference_3_0_0; }
		
		//EString
		public RuleCall getSourceStateEStringParserRuleCall_3_0_0_1() { return cSourceStateEStringParserRuleCall_3_0_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3_1() { return cHyphenMinusGreaterThanSignKeyword_3_1; }
		
		//destination=[State|EString]
		public Assignment getDestinationAssignment_3_2() { return cDestinationAssignment_3_2; }
		
		//[State|EString]
		public CrossReference getDestinationStateCrossReference_3_2_0() { return cDestinationStateCrossReference_3_2_0; }
		
		//EString
		public RuleCall getDestinationStateEStringParserRuleCall_3_2_0_1() { return cDestinationStateEStringParserRuleCall_3_2_0_1; }
		
		//('[' trigger=EString ']')
		public Group getGroup_4() { return cGroup_4; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_4_0() { return cLeftSquareBracketKeyword_4_0; }
		
		//trigger=EString
		public Assignment getTriggerAssignment_4_1() { return cTriggerAssignment_4_1; }
		
		//EString
		public RuleCall getTriggerEStringParserRuleCall_4_1_0() { return cTriggerEStringParserRuleCall_4_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4_2() { return cRightSquareBracketKeyword_4_2; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ice.Fsm.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ice.Fsm.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//    'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	
	
	private final FsmElements pFsm;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final EStringElements pEString;
	private final EBooleanElements pEBoolean;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FsmGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFsm = new FsmElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pEString = new EStringElements();
		this.pEBoolean = new EBooleanElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.ice.Fsm".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Fsm returns Fsm:
	//    {Fsm}
	//    'fsm'
	//    name=EString
	//        (state+=State | transition+=Transition)*
	//        ;
	public FsmElements getFsmAccess() {
		return pFsm;
	}
	
	public ParserRule getFsmRule() {
		return getFsmAccess().getRule();
	}
	
	//State returns State:
	//    {State}
	//    'state' (init?='init')? name=EString "entry" entryName=EString;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition returns Transition:
	//    {Transition}
	//    'transition' name=EString ( source=[State|EString] '->' destination=[State|EString]) ('[' trigger=EString ']')
	//        ;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EBoolean returns ecore::EBoolean:
	//    'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
