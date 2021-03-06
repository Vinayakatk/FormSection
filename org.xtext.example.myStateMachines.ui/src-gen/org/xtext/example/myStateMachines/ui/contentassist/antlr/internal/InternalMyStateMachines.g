/*
 * generated by Xtext
 */
grammar InternalMyStateMachines;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.myStateMachines.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleStatemachine
entryRuleStatemachine 
:
{ before(grammarAccess.getStatemachineRule()); }
	 ruleStatemachine
{ after(grammarAccess.getStatemachineRule()); } 
	 EOF 
;

// Rule Statemachine
ruleStatemachine
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStatemachineAccess().getGroup()); }
(rule__Statemachine__Group__0)
{ after(grammarAccess.getStatemachineAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEvent
entryRuleEvent 
:
{ before(grammarAccess.getEventRule()); }
	 ruleEvent
{ after(grammarAccess.getEventRule()); } 
	 EOF 
;

// Rule Event
ruleEvent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEventAccess().getNameAssignment()); }
(rule__Event__NameAssignment)
{ after(grammarAccess.getEventAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleState
entryRuleState 
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStateAccess().getGroup()); }
(rule__State__Group__0)
{ after(grammarAccess.getStateAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTransition
entryRuleTransition 
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTransitionAccess().getGroup()); }
(rule__Transition__Group__0)
{ after(grammarAccess.getTransitionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__State__ActionsAlternatives_2_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getActionsIDTerminalRuleCall_2_1_0_0()); }
	RULE_ID
{ after(grammarAccess.getStateAccess().getActionsIDTerminalRuleCall_2_1_0_0()); }
)

    |(
{ before(grammarAccess.getStateAccess().getActionsSTRINGTerminalRuleCall_2_1_0_1()); }
	RULE_STRING
{ after(grammarAccess.getStateAccess().getActionsSTRINGTerminalRuleCall_2_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Statemachine__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statemachine__Group__0__Impl
	rule__Statemachine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); }
(

)
{ after(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Statemachine__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statemachine__Group__1__Impl
	rule__Statemachine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatemachineAccess().getGroup_1()); }
(rule__Statemachine__Group_1__0)?
{ after(grammarAccess.getStatemachineAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Statemachine__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statemachine__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatemachineAccess().getStatesAssignment_2()); }
(rule__Statemachine__StatesAssignment_2)*
{ after(grammarAccess.getStatemachineAccess().getStatesAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Statemachine__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statemachine__Group_1__0__Impl
	rule__Statemachine__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()); }

	'events' 

{ after(grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Statemachine__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statemachine__Group_1__1__Impl
	rule__Statemachine__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); }
(rule__Statemachine__EventsAssignment_1_1)
{ after(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); }
)
(
{ before(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); }
(rule__Statemachine__EventsAssignment_1_1)*
{ after(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Statemachine__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Statemachine__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatemachineAccess().getEndKeyword_1_2()); }

	'end' 

{ after(grammarAccess.getStatemachineAccess().getEndKeyword_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__State__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getStateKeyword_0()); }

	'state' 

{ after(grammarAccess.getStateAccess().getStateKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getNameAssignment_1()); }
(rule__State__NameAssignment_1)
{ after(grammarAccess.getStateAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getGroup_2()); }
(rule__State__Group_2__0)?
{ after(grammarAccess.getStateAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getGroup_3()); }
(rule__State__Group_3__0)?
{ after(grammarAccess.getStateAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__4__Impl
	rule__State__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getTransitionsAssignment_4()); }
(rule__State__TransitionsAssignment_4)*
{ after(grammarAccess.getStateAccess().getTransitionsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getEndKeyword_5()); }

	'end' 

{ after(grammarAccess.getStateAccess().getEndKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__State__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_2__0__Impl
	rule__State__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getActionsKeyword_2_0()); }

	'actions' 

{ after(grammarAccess.getStateAccess().getActionsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getStateAccess().getActionsAssignment_2_1()); }
(rule__State__ActionsAssignment_2_1)
{ after(grammarAccess.getStateAccess().getActionsAssignment_2_1()); }
)
(
{ before(grammarAccess.getStateAccess().getActionsAssignment_2_1()); }
(rule__State__ActionsAssignment_2_1)*
{ after(grammarAccess.getStateAccess().getActionsAssignment_2_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}






rule__State__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_3__0__Impl
	rule__State__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getRefinementKeyword_3_0()); }

	'refinement' 

{ after(grammarAccess.getStateAccess().getRefinementKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_3__1__Impl
	rule__State__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); }

	'{' 

{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_3__2__Impl
	rule__State__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getRefinementAssignment_3_2()); }
(rule__State__RefinementAssignment_3_2)
{ after(grammarAccess.getStateAccess().getRefinementAssignment_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); }

	'}' 

{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Transition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getEventAssignment_0()); }
(rule__Transition__EventAssignment_0)?
{ after(grammarAccess.getTransitionAccess().getEventAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); }

	'=>' 

{ after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getStateAssignment_2()); }
(rule__Transition__StateAssignment_2)
{ after(grammarAccess.getTransitionAccess().getStateAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Statemachine__EventsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); }
	ruleEvent{ after(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__StatesAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_2_0()); }
	ruleState{ after(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Event__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__ActionsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getActionsAlternatives_2_1_0()); }
(rule__State__ActionsAlternatives_2_1_0)
{ after(grammarAccess.getStateAccess().getActionsAlternatives_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__RefinementAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getRefinementStatemachineParserRuleCall_3_2_0()); }
	ruleStatemachine{ after(grammarAccess.getStateAccess().getRefinementStatemachineParserRuleCall_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__TransitionsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); }
	ruleTransition{ after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__EventAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); }
(
{ before(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__StateAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); }
(
{ before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


