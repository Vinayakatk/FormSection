package org.xtext.example.myStateMachines.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.myStateMachines.services.MyStateMachinesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyStateMachinesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'", "'end'", "'state'", "'actions'", "'refinement'", "'{'", "'}'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyStateMachinesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyStateMachinesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyStateMachinesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g"; }



     	private MyStateMachinesGrammarAccess grammarAccess;
     	
        public InternalMyStateMachinesParser(TokenStream input, MyStateMachinesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";	
       	}
       	
       	@Override
       	protected MyStateMachinesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatemachine"
    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:67:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:68:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:69:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine75);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine85); 

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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:76:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? ( (lv_states_4_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_events_2_0 = null;

        EObject lv_states_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:79:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? ( (lv_states_4_0= ruleState ) )* ) )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:80:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? ( (lv_states_4_0= ruleState ) )* )
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:80:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? ( (lv_states_4_0= ruleState ) )* )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:80:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? ( (lv_states_4_0= ruleState ) )*
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:80:2: ()
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:86:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:86:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleStatemachine132); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:90:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:91:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:91:1: (lv_events_2_0= ruleEvent )
                    	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:92:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine153);
                    	    lv_events_2_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_2_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine166); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:112:3: ( (lv_states_4_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:113:1: (lv_states_4_0= ruleState )
            	    {
            	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:113:1: (lv_states_4_0= ruleState )
            	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:114:3: lv_states_4_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine189);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_4_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:138:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:139:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:140:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent226);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent236); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:147:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:150:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:151:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:151:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:152:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:152:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:153:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent277); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:177:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:178:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:179:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState317);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState327); 

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
    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:186:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' ( ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) ) )+ )? (otherlv_4= 'refinement' otherlv_5= '{' ( (lv_refinement_6_0= ruleStatemachine ) ) otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_actions_3_1=null;
        Token lv_actions_3_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_refinement_6_0 = null;

        EObject lv_transitions_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:189:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' ( ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) ) )+ )? (otherlv_4= 'refinement' otherlv_5= '{' ( (lv_refinement_6_0= ruleStatemachine ) ) otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' ) )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:190:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' ( ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) ) )+ )? (otherlv_4= 'refinement' otherlv_5= '{' ( (lv_refinement_6_0= ruleStatemachine ) ) otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' )
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:190:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' ( ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) ) )+ )? (otherlv_4= 'refinement' otherlv_5= '{' ( (lv_refinement_6_0= ruleStatemachine ) ) otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end' )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:190:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' ( ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) ) )+ )? (otherlv_4= 'refinement' otherlv_5= '{' ( (lv_refinement_6_0= ruleStatemachine ) ) otherlv_7= '}' )? ( (lv_transitions_8_0= ruleTransition ) )* otherlv_9= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleState364); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:194:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:195:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:195:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:196:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState381); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:212:2: (otherlv_2= 'actions' ( ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:212:4: otherlv_2= 'actions' ( ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) ) )+
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleState399); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                        
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:216:1: ( ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:217:1: ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) )
                    	    {
                    	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:217:1: ( (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING ) )
                    	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:218:1: (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING )
                    	    {
                    	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:218:1: (lv_actions_3_1= RULE_ID | lv_actions_3_2= RULE_STRING )
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==RULE_ID) ) {
                    	        alt4=1;
                    	    }
                    	    else if ( (LA4_0==RULE_STRING) ) {
                    	        alt4=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 4, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:219:3: lv_actions_3_1= RULE_ID
                    	            {
                    	            lv_actions_3_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState418); 

                    	            			newLeafNode(lv_actions_3_1, grammarAccess.getStateAccess().getActionsIDTerminalRuleCall_2_1_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getStateRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"actions",
                    	                    		lv_actions_3_1, 
                    	                    		"ID");
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:234:8: lv_actions_3_2= RULE_STRING
                    	            {
                    	            lv_actions_3_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState438); 

                    	            			newLeafNode(lv_actions_3_2, grammarAccess.getStateAccess().getActionsSTRINGTerminalRuleCall_2_1_0_1()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getStateRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"actions",
                    	                    		lv_actions_3_2, 
                    	                    		"STRING");
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:252:5: (otherlv_4= 'refinement' otherlv_5= '{' ( (lv_refinement_6_0= ruleStatemachine ) ) otherlv_7= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:252:7: otherlv_4= 'refinement' otherlv_5= '{' ( (lv_refinement_6_0= ruleStatemachine ) ) otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleState462); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRefinementKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleState474); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:260:1: ( (lv_refinement_6_0= ruleStatemachine ) )
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:261:1: (lv_refinement_6_0= ruleStatemachine )
                    {
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:261:1: (lv_refinement_6_0= ruleStatemachine )
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:262:3: lv_refinement_6_0= ruleStatemachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getRefinementStatemachineParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatemachine_in_ruleState495);
                    lv_refinement_6_0=ruleStatemachine();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"refinement",
                            		lv_refinement_6_0, 
                            		"Statemachine");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleState507); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:282:3: ( (lv_transitions_8_0= ruleTransition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:283:1: (lv_transitions_8_0= ruleTransition )
            	    {
            	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:283:1: (lv_transitions_8_0= ruleTransition )
            	    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:284:3: lv_transitions_8_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState530);
            	    lv_transitions_8_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_8_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleState543); 

                	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getEndKeyword_5());
                

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
    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:312:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:313:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:314:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition579);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition589); 

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
    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:321:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:324:28: ( ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:325:1: ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:325:1: ( ( (otherlv_0= RULE_ID ) )? otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:325:2: ( (otherlv_0= RULE_ID ) )? otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:325:2: ( (otherlv_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:326:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:326:1: (otherlv_0= RULE_ID )
                    // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:327:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition634); 

                    		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTransition647); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:342:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:343:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:343:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.myStateMachines/src-gen/org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.g:344:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition667); 

            		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatemachine132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine153 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine166 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine189 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleState364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState381 = new BitSet(new long[]{0x000000000004D010L});
    public static final BitSet FOLLOW_14_in_ruleState399 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState418 = new BitSet(new long[]{0x0000000000049030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState438 = new BitSet(new long[]{0x0000000000049030L});
    public static final BitSet FOLLOW_15_in_ruleState462 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleState474 = new BitSet(new long[]{0x0000000000022800L});
    public static final BitSet FOLLOW_ruleStatemachine_in_ruleState495 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState507 = new BitSet(new long[]{0x0000000000041010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState530 = new BitSet(new long[]{0x0000000000041010L});
    public static final BitSet FOLLOW_12_in_ruleState543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition634 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTransition647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition667 = new BitSet(new long[]{0x0000000000000002L});

}