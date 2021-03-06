/*
 * generated by Xtext
 */
grammar InternalMyStateMachines;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.myStateMachines.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleStatemachine
entryRuleStatemachine returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatemachineRule()); }
	 iv_ruleStatemachine=ruleStatemachine 
	 { $current=$iv_ruleStatemachine.current; } 
	 EOF 
;

// Rule Statemachine
ruleStatemachine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
            $current);
    }
)(	otherlv_1='events' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
	    }
		lv_events_2_0=ruleEvent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatemachineRule());
	        }
       		add(
       			$current, 
       			"events",
        		lv_events_2_0, 
        		"Event");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='end' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_2_0()); 
	    }
		lv_states_4_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatemachineRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_4_0, 
        		"State");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	 iv_ruleEvent=ruleEvent 
	 { $current=$iv_ruleEvent.current; } 
	 EOF 
;

// Rule Event
ruleEvent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='state' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='actions' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
    }
(
(
(
		lv_actions_3_1=RULE_ID
		{
			newLeafNode(lv_actions_3_1, grammarAccess.getStateAccess().getActionsIDTerminalRuleCall_2_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"actions",
        		lv_actions_3_1, 
        		"ID");
	    }

    |		lv_actions_3_2=RULE_STRING
		{
			newLeafNode(lv_actions_3_2, grammarAccess.getStateAccess().getActionsSTRINGTerminalRuleCall_2_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"actions",
        		lv_actions_3_2, 
        		"STRING");
	    }

)

)
)+)?(	otherlv_4='refinement' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRefinementKeyword_3_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getRefinementStatemachineParserRuleCall_3_2_0()); 
	    }
		lv_refinement_6_0=ruleStatemachine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		set(
       			$current, 
       			"refinement",
        		lv_refinement_6_0, 
        		"Statemachine");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
	    }
		lv_transitions_8_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"transitions",
        		lv_transitions_8_0, 
        		"Transition");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9='end' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getEndKeyword_5());
    }
)
;





// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	 iv_ruleTransition=ruleTransition 
	 { $current=$iv_ruleTransition.current; } 
	 EOF 
;

// Rule Transition
ruleTransition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
	}

)
)?	otherlv_1='=>' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
	}

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


