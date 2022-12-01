package org.xtext.ice.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ice.services.FsmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFsmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fsm'", "'state'", "'init'", "'entry'", "'transition'", "'->'", "'['", "']'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFsmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFsmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFsmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFsm.g"; }



     	private FsmGrammarAccess grammarAccess;

        public InternalFsmParser(TokenStream input, FsmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Fsm";
       	}

       	@Override
       	protected FsmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFsm"
    // InternalFsm.g:64:1: entryRuleFsm returns [EObject current=null] : iv_ruleFsm= ruleFsm EOF ;
    public final EObject entryRuleFsm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFsm = null;


        try {
            // InternalFsm.g:64:44: (iv_ruleFsm= ruleFsm EOF )
            // InternalFsm.g:65:2: iv_ruleFsm= ruleFsm EOF
            {
             newCompositeNode(grammarAccess.getFsmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFsm=ruleFsm();

            state._fsp--;

             current =iv_ruleFsm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFsm"


    // $ANTLR start "ruleFsm"
    // InternalFsm.g:71:1: ruleFsm returns [EObject current=null] : ( () otherlv_1= 'fsm' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_state_3_0= ruleState ) ) | ( (lv_transition_4_0= ruleTransition ) ) )* ) ;
    public final EObject ruleFsm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_3_0 = null;

        EObject lv_transition_4_0 = null;



        	enterRule();

        try {
            // InternalFsm.g:77:2: ( ( () otherlv_1= 'fsm' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_state_3_0= ruleState ) ) | ( (lv_transition_4_0= ruleTransition ) ) )* ) )
            // InternalFsm.g:78:2: ( () otherlv_1= 'fsm' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_state_3_0= ruleState ) ) | ( (lv_transition_4_0= ruleTransition ) ) )* )
            {
            // InternalFsm.g:78:2: ( () otherlv_1= 'fsm' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_state_3_0= ruleState ) ) | ( (lv_transition_4_0= ruleTransition ) ) )* )
            // InternalFsm.g:79:3: () otherlv_1= 'fsm' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_state_3_0= ruleState ) ) | ( (lv_transition_4_0= ruleTransition ) ) )*
            {
            // InternalFsm.g:79:3: ()
            // InternalFsm.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFsmAccess().getFsmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFsmAccess().getFsmKeyword_1());
            		
            // InternalFsm.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFsm.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalFsm.g:91:4: (lv_name_2_0= ruleEString )
            // InternalFsm.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFsmAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFsmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.ice.Fsm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFsm.g:109:3: ( ( (lv_state_3_0= ruleState ) ) | ( (lv_transition_4_0= ruleTransition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==15) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFsm.g:110:4: ( (lv_state_3_0= ruleState ) )
            	    {
            	    // InternalFsm.g:110:4: ( (lv_state_3_0= ruleState ) )
            	    // InternalFsm.g:111:5: (lv_state_3_0= ruleState )
            	    {
            	    // InternalFsm.g:111:5: (lv_state_3_0= ruleState )
            	    // InternalFsm.g:112:6: lv_state_3_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getFsmAccess().getStateStateParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_state_3_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFsmRule());
            	    						}
            	    						add(
            	    							current,
            	    							"state",
            	    							lv_state_3_0,
            	    							"org.xtext.ice.Fsm.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFsm.g:130:4: ( (lv_transition_4_0= ruleTransition ) )
            	    {
            	    // InternalFsm.g:130:4: ( (lv_transition_4_0= ruleTransition ) )
            	    // InternalFsm.g:131:5: (lv_transition_4_0= ruleTransition )
            	    {
            	    // InternalFsm.g:131:5: (lv_transition_4_0= ruleTransition )
            	    // InternalFsm.g:132:6: lv_transition_4_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getFsmAccess().getTransitionTransitionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_transition_4_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFsmRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transition",
            	    							lv_transition_4_0,
            	    							"org.xtext.ice.Fsm.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFsm"


    // $ANTLR start "entryRuleState"
    // InternalFsm.g:154:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalFsm.g:154:46: (iv_ruleState= ruleState EOF )
            // InternalFsm.g:155:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalFsm.g:161:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_init_2_0= 'init' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'entry' ( (lv_entryName_5_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_init_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_entryName_5_0 = null;



        	enterRule();

        try {
            // InternalFsm.g:167:2: ( ( () otherlv_1= 'state' ( (lv_init_2_0= 'init' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'entry' ( (lv_entryName_5_0= ruleEString ) ) ) )
            // InternalFsm.g:168:2: ( () otherlv_1= 'state' ( (lv_init_2_0= 'init' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'entry' ( (lv_entryName_5_0= ruleEString ) ) )
            {
            // InternalFsm.g:168:2: ( () otherlv_1= 'state' ( (lv_init_2_0= 'init' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'entry' ( (lv_entryName_5_0= ruleEString ) ) )
            // InternalFsm.g:169:3: () otherlv_1= 'state' ( (lv_init_2_0= 'init' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'entry' ( (lv_entryName_5_0= ruleEString ) )
            {
            // InternalFsm.g:169:3: ()
            // InternalFsm.g:170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalFsm.g:180:3: ( (lv_init_2_0= 'init' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFsm.g:181:4: (lv_init_2_0= 'init' )
                    {
                    // InternalFsm.g:181:4: (lv_init_2_0= 'init' )
                    // InternalFsm.g:182:5: lv_init_2_0= 'init'
                    {
                    lv_init_2_0=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(lv_init_2_0, grammarAccess.getStateAccess().getInitInitKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_2_0 != null, "init");
                    				

                    }


                    }
                    break;

            }

            // InternalFsm.g:194:3: ( (lv_name_3_0= ruleEString ) )
            // InternalFsm.g:195:4: (lv_name_3_0= ruleEString )
            {
            // InternalFsm.g:195:4: (lv_name_3_0= ruleEString )
            // InternalFsm.g:196:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.ice.Fsm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEntryKeyword_4());
            		
            // InternalFsm.g:217:3: ( (lv_entryName_5_0= ruleEString ) )
            // InternalFsm.g:218:4: (lv_entryName_5_0= ruleEString )
            {
            // InternalFsm.g:218:4: (lv_entryName_5_0= ruleEString )
            // InternalFsm.g:219:5: lv_entryName_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getEntryNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_entryName_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"entryName",
            						lv_entryName_5_0,
            						"org.xtext.ice.Fsm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalFsm.g:240:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFsm.g:240:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFsm.g:241:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFsm.g:247:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) (otherlv_6= '[' ( (lv_trigger_7_0= ruleEString ) ) otherlv_8= ']' ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_trigger_7_0 = null;



        	enterRule();

        try {
            // InternalFsm.g:253:2: ( ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) (otherlv_6= '[' ( (lv_trigger_7_0= ruleEString ) ) otherlv_8= ']' ) ) )
            // InternalFsm.g:254:2: ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) (otherlv_6= '[' ( (lv_trigger_7_0= ruleEString ) ) otherlv_8= ']' ) )
            {
            // InternalFsm.g:254:2: ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) (otherlv_6= '[' ( (lv_trigger_7_0= ruleEString ) ) otherlv_8= ']' ) )
            // InternalFsm.g:255:3: () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) (otherlv_6= '[' ( (lv_trigger_7_0= ruleEString ) ) otherlv_8= ']' )
            {
            // InternalFsm.g:255:3: ()
            // InternalFsm.g:256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalFsm.g:266:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFsm.g:267:4: (lv_name_2_0= ruleEString )
            {
            // InternalFsm.g:267:4: (lv_name_2_0= ruleEString )
            // InternalFsm.g:268:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.ice.Fsm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFsm.g:285:3: ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )
            // InternalFsm.g:286:4: ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) )
            {
            // InternalFsm.g:286:4: ( ( ruleEString ) )
            // InternalFsm.g:287:5: ( ruleEString )
            {
            // InternalFsm.g:287:5: ( ruleEString )
            // InternalFsm.g:288:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getTransitionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_3_0_0());
            					
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3_1());
            			
            // InternalFsm.g:306:4: ( ( ruleEString ) )
            // InternalFsm.g:307:5: ( ruleEString )
            {
            // InternalFsm.g:307:5: ( ruleEString )
            // InternalFsm.g:308:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getTransitionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getTransitionAccess().getDestinationStateCrossReference_3_2_0());
            					
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalFsm.g:323:3: (otherlv_6= '[' ( (lv_trigger_7_0= ruleEString ) ) otherlv_8= ']' )
            // InternalFsm.g:324:4: otherlv_6= '[' ( (lv_trigger_7_0= ruleEString ) ) otherlv_8= ']'
            {
            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_4_0());
            			
            // InternalFsm.g:328:4: ( (lv_trigger_7_0= ruleEString ) )
            // InternalFsm.g:329:5: (lv_trigger_7_0= ruleEString )
            {
            // InternalFsm.g:329:5: (lv_trigger_7_0= ruleEString )
            // InternalFsm.g:330:6: lv_trigger_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTransitionAccess().getTriggerEStringParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_9);
            lv_trigger_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTransitionRule());
            						}
            						set(
            							current,
            							"trigger",
            							lv_trigger_7_0,
            							"org.xtext.ice.Fsm.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            				newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_4_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalFsm.g:356:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFsm.g:356:47: (iv_ruleEString= ruleEString EOF )
            // InternalFsm.g:357:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFsm.g:363:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFsm.g:369:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFsm.g:370:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFsm.g:370:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFsm.g:371:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFsm.g:379:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}