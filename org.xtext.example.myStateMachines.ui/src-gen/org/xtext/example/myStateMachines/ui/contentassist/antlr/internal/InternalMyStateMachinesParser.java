package org.xtext.example.myStateMachines.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.myStateMachines.services.MyStateMachinesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyStateMachinesParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g"; }


     
     	private MyStateMachinesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyStateMachinesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStatemachine"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:60:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:61:1: ( ruleStatemachine EOF )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:62:1: ruleStatemachine EOF
            {
             before(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine61);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:69:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:73:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:74:1: ( ( rule__Statemachine__Group__0 ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:74:1: ( ( rule__Statemachine__Group__0 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:75:1: ( rule__Statemachine__Group__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:76:1: ( rule__Statemachine__Group__0 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:76:2: rule__Statemachine__Group__0
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine94);
            rule__Statemachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:88:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:89:1: ( ruleEvent EOF )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:90:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent121);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:97:1: ruleEvent : ( ( rule__Event__NameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:101:2: ( ( ( rule__Event__NameAssignment ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:102:1: ( ( rule__Event__NameAssignment ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:102:1: ( ( rule__Event__NameAssignment ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:103:1: ( rule__Event__NameAssignment )
            {
             before(grammarAccess.getEventAccess().getNameAssignment()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:104:1: ( rule__Event__NameAssignment )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:104:2: rule__Event__NameAssignment
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_in_ruleEvent154);
            rule__Event__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:116:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:117:1: ( ruleState EOF )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:118:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState181);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:125:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:129:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:130:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:130:1: ( ( rule__State__Group__0 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:131:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:132:1: ( rule__State__Group__0 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:132:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState214);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:144:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:145:1: ( ruleTransition EOF )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:146:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition241);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:153:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:157:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:158:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:158:1: ( ( rule__Transition__Group__0 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:159:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:160:1: ( rule__Transition__Group__0 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:160:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition274);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__State__ActionsAlternatives_2_1_0"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:172:1: rule__State__ActionsAlternatives_2_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__State__ActionsAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:176:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:177:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:177:1: ( RULE_ID )
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:178:1: RULE_ID
                    {
                     before(grammarAccess.getStateAccess().getActionsIDTerminalRuleCall_2_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__ActionsAlternatives_2_1_0310); 
                     after(grammarAccess.getStateAccess().getActionsIDTerminalRuleCall_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:183:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:183:6: ( RULE_STRING )
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:184:1: RULE_STRING
                    {
                     before(grammarAccess.getStateAccess().getActionsSTRINGTerminalRuleCall_2_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__ActionsAlternatives_2_1_0327); 
                     after(grammarAccess.getStateAccess().getActionsSTRINGTerminalRuleCall_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAlternatives_2_1_0"


    // $ANTLR start "rule__Statemachine__Group__0"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:196:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:200:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:201:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0357);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0360);
            rule__Statemachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0"


    // $ANTLR start "rule__Statemachine__Group__0__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:208:1: rule__Statemachine__Group__0__Impl : ( () ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:212:1: ( ( () ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:213:1: ( () )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:213:1: ( () )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:214:1: ()
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:215:1: ()
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:217:1: 
            {
            }

             after(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0__Impl"


    // $ANTLR start "rule__Statemachine__Group__1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:227:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:231:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:232:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1418);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1421);
            rule__Statemachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1"


    // $ANTLR start "rule__Statemachine__Group__1__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:239:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__Group_1__0 )? ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:243:1: ( ( ( rule__Statemachine__Group_1__0 )? ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:244:1: ( ( rule__Statemachine__Group_1__0 )? )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:244:1: ( ( rule__Statemachine__Group_1__0 )? )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:245:1: ( rule__Statemachine__Group_1__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_1()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:246:1: ( rule__Statemachine__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:246:2: rule__Statemachine__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statemachine__Group_1__0_in_rule__Statemachine__Group__1__Impl448);
                    rule__Statemachine__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__2"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:256:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:260:1: ( rule__Statemachine__Group__2__Impl )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:261:2: rule__Statemachine__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__2479);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2"


    // $ANTLR start "rule__Statemachine__Group__2__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:267:1: rule__Statemachine__Group__2__Impl : ( ( rule__Statemachine__StatesAssignment_2 )* ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:271:1: ( ( ( rule__Statemachine__StatesAssignment_2 )* ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:272:1: ( ( rule__Statemachine__StatesAssignment_2 )* )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:272:1: ( ( rule__Statemachine__StatesAssignment_2 )* )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:273:1: ( rule__Statemachine__StatesAssignment_2 )*
            {
             before(grammarAccess.getStatemachineAccess().getStatesAssignment_2()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:274:1: ( rule__Statemachine__StatesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:274:2: rule__Statemachine__StatesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__StatesAssignment_2_in_rule__Statemachine__Group__2__Impl506);
            	    rule__Statemachine__StatesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getStatesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__0"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:290:1: rule__Statemachine__Group_1__0 : rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1 ;
    public final void rule__Statemachine__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:294:1: ( rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:295:2: rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__0__Impl_in_rule__Statemachine__Group_1__0543);
            rule__Statemachine__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_1__1_in_rule__Statemachine__Group_1__0546);
            rule__Statemachine__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__0"


    // $ANTLR start "rule__Statemachine__Group_1__0__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:302:1: rule__Statemachine__Group_1__0__Impl : ( 'events' ) ;
    public final void rule__Statemachine__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:306:1: ( ( 'events' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:307:1: ( 'events' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:307:1: ( 'events' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:308:1: 'events'
            {
             before(grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Statemachine__Group_1__0__Impl574); 
             after(grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:321:1: rule__Statemachine__Group_1__1 : rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2 ;
    public final void rule__Statemachine__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:325:1: ( rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:326:2: rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__1__Impl_in_rule__Statemachine__Group_1__1605);
            rule__Statemachine__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_1__2_in_rule__Statemachine__Group_1__1608);
            rule__Statemachine__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__1"


    // $ANTLR start "rule__Statemachine__Group_1__1__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:333:1: rule__Statemachine__Group_1__1__Impl : ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) ) ;
    public final void rule__Statemachine__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:337:1: ( ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:338:1: ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:338:1: ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:339:1: ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:339:1: ( ( rule__Statemachine__EventsAssignment_1_1 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:340:1: ( rule__Statemachine__EventsAssignment_1_1 )
            {
             before(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:341:1: ( rule__Statemachine__EventsAssignment_1_1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:341:2: rule__Statemachine__EventsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl637);
            rule__Statemachine__EventsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 

            }

            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:344:1: ( ( rule__Statemachine__EventsAssignment_1_1 )* )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:345:1: ( rule__Statemachine__EventsAssignment_1_1 )*
            {
             before(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:346:1: ( rule__Statemachine__EventsAssignment_1_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:346:2: rule__Statemachine__EventsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl649);
            	    rule__Statemachine__EventsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__2"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:357:1: rule__Statemachine__Group_1__2 : rule__Statemachine__Group_1__2__Impl ;
    public final void rule__Statemachine__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:361:1: ( rule__Statemachine__Group_1__2__Impl )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:362:2: rule__Statemachine__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__2__Impl_in_rule__Statemachine__Group_1__2682);
            rule__Statemachine__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__2"


    // $ANTLR start "rule__Statemachine__Group_1__2__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:368:1: rule__Statemachine__Group_1__2__Impl : ( 'end' ) ;
    public final void rule__Statemachine__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:372:1: ( ( 'end' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:373:1: ( 'end' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:373:1: ( 'end' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:374:1: 'end'
            {
             before(grammarAccess.getStatemachineAccess().getEndKeyword_1_2()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group_1__2__Impl710); 
             after(grammarAccess.getStatemachineAccess().getEndKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__2__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:393:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:397:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:398:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__0747);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__0750);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:405:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:409:1: ( ( 'state' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:410:1: ( 'state' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:410:1: ( 'state' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:411:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__State__Group__0__Impl778); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:424:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:428:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:429:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__1809);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__1812);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:436:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:440:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:441:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:441:1: ( ( rule__State__NameAssignment_1 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:442:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:443:1: ( rule__State__NameAssignment_1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:443:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl839);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:453:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:457:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:458:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__2869);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__2872);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:465:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:469:1: ( ( ( rule__State__Group_2__0 )? ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:470:1: ( ( rule__State__Group_2__0 )? )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:470:1: ( ( rule__State__Group_2__0 )? )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:471:1: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:472:1: ( rule__State__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:472:2: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl899);
                    rule__State__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:482:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:486:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:487:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__3930);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__3933);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:494:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:498:1: ( ( ( rule__State__Group_3__0 )? ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:499:1: ( ( rule__State__Group_3__0 )? )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:499:1: ( ( rule__State__Group_3__0 )? )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:500:1: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:501:1: ( rule__State__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:501:2: rule__State__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl960);
                    rule__State__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:511:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:515:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:516:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__4991);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__4994);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:523:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionsAssignment_4 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:527:1: ( ( ( rule__State__TransitionsAssignment_4 )* ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:528:1: ( ( rule__State__TransitionsAssignment_4 )* )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:528:1: ( ( rule__State__TransitionsAssignment_4 )* )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:529:1: ( rule__State__TransitionsAssignment_4 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:530:1: ( rule__State__TransitionsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:530:2: rule__State__TransitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_4_in_rule__State__Group__4__Impl1021);
            	    rule__State__TransitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:540:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:544:1: ( rule__State__Group__5__Impl )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:545:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__51052);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:551:1: rule__State__Group__5__Impl : ( 'end' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:555:1: ( ( 'end' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:556:1: ( 'end' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:556:1: ( 'end' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:557:1: 'end'
            {
             before(grammarAccess.getStateAccess().getEndKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__State__Group__5__Impl1080); 
             after(grammarAccess.getStateAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group_2__0"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:582:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:586:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:587:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__01123);
            rule__State__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__01126);
            rule__State__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0"


    // $ANTLR start "rule__State__Group_2__0__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:594:1: rule__State__Group_2__0__Impl : ( 'actions' ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:598:1: ( ( 'actions' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:599:1: ( 'actions' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:599:1: ( 'actions' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:600:1: 'actions'
            {
             before(grammarAccess.getStateAccess().getActionsKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__State__Group_2__0__Impl1154); 
             after(grammarAccess.getStateAccess().getActionsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0__Impl"


    // $ANTLR start "rule__State__Group_2__1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:613:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:617:1: ( rule__State__Group_2__1__Impl )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:618:2: rule__State__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__11185);
            rule__State__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1"


    // $ANTLR start "rule__State__Group_2__1__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:624:1: rule__State__Group_2__1__Impl : ( ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* ) ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:628:1: ( ( ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:629:1: ( ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:629:1: ( ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:630:1: ( ( rule__State__ActionsAssignment_2_1 ) ) ( ( rule__State__ActionsAssignment_2_1 )* )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:630:1: ( ( rule__State__ActionsAssignment_2_1 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:631:1: ( rule__State__ActionsAssignment_2_1 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2_1()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:632:1: ( rule__State__ActionsAssignment_2_1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:632:2: rule__State__ActionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__State__ActionsAssignment_2_1_in_rule__State__Group_2__1__Impl1214);
            rule__State__ActionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_2_1()); 

            }

            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:635:1: ( ( rule__State__ActionsAssignment_2_1 )* )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:636:1: ( rule__State__ActionsAssignment_2_1 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2_1()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:637:1: ( rule__State__ActionsAssignment_2_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:637:2: rule__State__ActionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__State__ActionsAssignment_2_1_in_rule__State__Group_2__1__Impl1226);
            	    rule__State__ActionsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActionsAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:652:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:656:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:657:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__01263);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__01266);
            rule__State__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0"


    // $ANTLR start "rule__State__Group_3__0__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:664:1: rule__State__Group_3__0__Impl : ( 'refinement' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:668:1: ( ( 'refinement' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:669:1: ( 'refinement' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:669:1: ( 'refinement' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:670:1: 'refinement'
            {
             before(grammarAccess.getStateAccess().getRefinementKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__State__Group_3__0__Impl1294); 
             after(grammarAccess.getStateAccess().getRefinementKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0__Impl"


    // $ANTLR start "rule__State__Group_3__1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:683:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:687:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:688:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__11325);
            rule__State__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__11328);
            rule__State__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1"


    // $ANTLR start "rule__State__Group_3__1__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:695:1: rule__State__Group_3__1__Impl : ( '{' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:699:1: ( ( '{' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:700:1: ( '{' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:700:1: ( '{' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:701:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,16,FOLLOW_16_in_rule__State__Group_3__1__Impl1356); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1__Impl"


    // $ANTLR start "rule__State__Group_3__2"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:714:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:718:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:719:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__21387);
            rule__State__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_3__3_in_rule__State__Group_3__21390);
            rule__State__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2"


    // $ANTLR start "rule__State__Group_3__2__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:726:1: rule__State__Group_3__2__Impl : ( ( rule__State__RefinementAssignment_3_2 ) ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:730:1: ( ( ( rule__State__RefinementAssignment_3_2 ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:731:1: ( ( rule__State__RefinementAssignment_3_2 ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:731:1: ( ( rule__State__RefinementAssignment_3_2 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:732:1: ( rule__State__RefinementAssignment_3_2 )
            {
             before(grammarAccess.getStateAccess().getRefinementAssignment_3_2()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:733:1: ( rule__State__RefinementAssignment_3_2 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:733:2: rule__State__RefinementAssignment_3_2
            {
            pushFollow(FOLLOW_rule__State__RefinementAssignment_3_2_in_rule__State__Group_3__2__Impl1417);
            rule__State__RefinementAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getRefinementAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2__Impl"


    // $ANTLR start "rule__State__Group_3__3"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:743:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:747:1: ( rule__State__Group_3__3__Impl )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:748:2: rule__State__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_3__3__Impl_in_rule__State__Group_3__31447);
            rule__State__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3"


    // $ANTLR start "rule__State__Group_3__3__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:754:1: rule__State__Group_3__3__Impl : ( '}' ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:758:1: ( ( '}' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:759:1: ( '}' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:759:1: ( '}' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:760:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,17,FOLLOW_17_in_rule__State__Group_3__3__Impl1475); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:781:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:785:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:786:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01514);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01517);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:793:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__EventAssignment_0 )? ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:797:1: ( ( ( rule__Transition__EventAssignment_0 )? ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:798:1: ( ( rule__Transition__EventAssignment_0 )? )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:798:1: ( ( rule__Transition__EventAssignment_0 )? )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:799:1: ( rule__Transition__EventAssignment_0 )?
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_0()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:800:1: ( rule__Transition__EventAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:800:2: rule__Transition__EventAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl1544);
                    rule__Transition__EventAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:810:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:814:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:815:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11575);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11578);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:822:1: rule__Transition__Group__1__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:826:1: ( ( '=>' ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:827:1: ( '=>' )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:827:1: ( '=>' )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:828:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Transition__Group__1__Impl1606); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:841:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:845:1: ( rule__Transition__Group__2__Impl )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:846:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21637);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:852:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__StateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:856:1: ( ( ( rule__Transition__StateAssignment_2 ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:857:1: ( ( rule__Transition__StateAssignment_2 ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:857:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:858:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:859:1: ( rule__Transition__StateAssignment_2 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:859:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl1664);
            rule__Transition__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__EventsAssignment_1_1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:876:1: rule__Statemachine__EventsAssignment_1_1 : ( ruleEvent ) ;
    public final void rule__Statemachine__EventsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:880:1: ( ( ruleEvent ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:881:1: ( ruleEvent )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:881:1: ( ruleEvent )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:882:1: ruleEvent
            {
             before(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statemachine__EventsAssignment_1_11705);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__EventsAssignment_1_1"


    // $ANTLR start "rule__Statemachine__StatesAssignment_2"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:891:1: rule__Statemachine__StatesAssignment_2 : ( ruleState ) ;
    public final void rule__Statemachine__StatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:895:1: ( ( ruleState ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:896:1: ( ruleState )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:896:1: ( ruleState )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:897:1: ruleState
            {
             before(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Statemachine__StatesAssignment_21736);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__StatesAssignment_2"


    // $ANTLR start "rule__Event__NameAssignment"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:906:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:910:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:911:1: ( RULE_ID )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:911:1: ( RULE_ID )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:912:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment1767); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment"


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:921:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:925:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:926:1: ( RULE_ID )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:926:1: ( RULE_ID )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:927:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_11798); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__ActionsAssignment_2_1"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:936:1: rule__State__ActionsAssignment_2_1 : ( ( rule__State__ActionsAlternatives_2_1_0 ) ) ;
    public final void rule__State__ActionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:940:1: ( ( ( rule__State__ActionsAlternatives_2_1_0 ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:941:1: ( ( rule__State__ActionsAlternatives_2_1_0 ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:941:1: ( ( rule__State__ActionsAlternatives_2_1_0 ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:942:1: ( rule__State__ActionsAlternatives_2_1_0 )
            {
             before(grammarAccess.getStateAccess().getActionsAlternatives_2_1_0()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:943:1: ( rule__State__ActionsAlternatives_2_1_0 )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:943:2: rule__State__ActionsAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__State__ActionsAlternatives_2_1_0_in_rule__State__ActionsAssignment_2_11829);
            rule__State__ActionsAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_2_1"


    // $ANTLR start "rule__State__RefinementAssignment_3_2"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:952:1: rule__State__RefinementAssignment_3_2 : ( ruleStatemachine ) ;
    public final void rule__State__RefinementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:956:1: ( ( ruleStatemachine ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:957:1: ( ruleStatemachine )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:957:1: ( ruleStatemachine )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:958:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getRefinementStatemachineParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleStatemachine_in_rule__State__RefinementAssignment_3_21862);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getRefinementStatemachineParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__RefinementAssignment_3_2"


    // $ANTLR start "rule__State__TransitionsAssignment_4"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:967:1: rule__State__TransitionsAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:971:1: ( ( ruleTransition ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:972:1: ( ruleTransition )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:972:1: ( ruleTransition )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:973:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_41893);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_4"


    // $ANTLR start "rule__Transition__EventAssignment_0"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:982:1: rule__Transition__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:986:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:987:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:987:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:988:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:989:1: ( RULE_ID )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:990:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_01928); 
             after(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_0"


    // $ANTLR start "rule__Transition__StateAssignment_2"
    // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:1001:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:1005:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:1006:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:1006:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:1007:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:1008:1: ( RULE_ID )
            // ../org.xtext.example.myStateMachines.ui/src-gen/org/xtext/example/myStateMachines/ui/contentassist/antlr/internal/InternalMyStateMachines.g:1009:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_21967); 
             after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StateAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_in_ruleEvent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__ActionsAlternatives_2_1_0310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__ActionsAlternatives_2_1_0327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0357 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1418 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__0_in_rule__Statemachine__Group__1__Impl448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__StatesAssignment_2_in_rule__Statemachine__Group__2__Impl506 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__0__Impl_in_rule__Statemachine__Group_1__0543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__1_in_rule__Statemachine__Group_1__0546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statemachine__Group_1__0__Impl574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__1__Impl_in_rule__Statemachine__Group_1__1605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__2_in_rule__Statemachine__Group_1__1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl637 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl649 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__2__Impl_in_rule__Statemachine__Group_1__2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group_1__2__Impl710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__0747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__0750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__State__Group__0__Impl778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__1809 = new BitSet(new long[]{0x000000000004D010L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__2869 = new BitSet(new long[]{0x000000000004D010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__3930 = new BitSet(new long[]{0x000000000004D010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__4991 = new BitSet(new long[]{0x000000000004D010L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_4_in_rule__State__Group__4__Impl1021 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__51052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__State__Group__5__Impl1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__01123 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__01126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__State__Group_2__0__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__11185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ActionsAssignment_2_1_in_rule__State__Group_2__1__Impl1214 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__State__ActionsAssignment_2_1_in_rule__State__Group_2__1__Impl1226 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__01263 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__01266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group_3__0__Impl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__11325 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__Group_3__1__Impl1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__21387 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_3__3_in_rule__State__Group_3__21390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__RefinementAssignment_3_2_in_rule__State__Group_3__2__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__3__Impl_in_rule__State__Group_3__31447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__Group_3__3__Impl1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01514 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transition__Group__1__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statemachine__EventsAssignment_1_11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Statemachine__StatesAssignment_21736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ActionsAlternatives_2_1_0_in_rule__State__ActionsAssignment_2_11829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__RefinementAssignment_3_21862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_41893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_01928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_21967 = new BitSet(new long[]{0x0000000000000002L});

}