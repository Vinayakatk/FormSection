/*
 * generated by Xtext
 */
package org.xtext.example.myStateMachines.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyStateMachinesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class StatemachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Statemachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStatemachineAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEventsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEventsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEventsEventParserRuleCall_1_1_0 = (RuleCall)cEventsAssignment_1_1.eContents().get(0);
		private final Keyword cEndKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cStatesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatesStateParserRuleCall_2_0 = (RuleCall)cStatesAssignment_2.eContents().get(0);
		
		//Statemachine:
		//	{Statemachine} ("events" events+=Event+ "end")? states+=State*;
		@Override public ParserRule getRule() { return rule; }

		//{Statemachine} ("events" events+=Event+ "end")? states+=State*
		public Group getGroup() { return cGroup; }

		//{Statemachine}
		public Action getStatemachineAction_0() { return cStatemachineAction_0; }

		//("events" events+=Event+ "end")?
		public Group getGroup_1() { return cGroup_1; }

		//"events"
		public Keyword getEventsKeyword_1_0() { return cEventsKeyword_1_0; }

		//events+=Event+
		public Assignment getEventsAssignment_1_1() { return cEventsAssignment_1_1; }

		//Event
		public RuleCall getEventsEventParserRuleCall_1_1_0() { return cEventsEventParserRuleCall_1_1_0; }

		//"end"
		public Keyword getEndKeyword_1_2() { return cEndKeyword_1_2; }

		//states+=State*
		public Assignment getStatesAssignment_2() { return cStatesAssignment_2; }

		//State
		public RuleCall getStatesStateParserRuleCall_2_0() { return cStatesStateParserRuleCall_2_0; }
	}

	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Event");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Event:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cActionsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cActionsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Alternatives cActionsAlternatives_2_1_0 = (Alternatives)cActionsAssignment_2_1.eContents().get(0);
		private final RuleCall cActionsIDTerminalRuleCall_2_1_0_0 = (RuleCall)cActionsAlternatives_2_1_0.eContents().get(0);
		private final RuleCall cActionsSTRINGTerminalRuleCall_2_1_0_1 = (RuleCall)cActionsAlternatives_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cRefinementKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cRefinementAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cRefinementStatemachineParserRuleCall_3_2_0 = (RuleCall)cRefinementAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsTransitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//State:
		//	"state" name=ID ("actions" actions+=(ID | STRING)+)? ("refinement" "{" refinement=Statemachine "}")?
		//	transitions+=Transition* "end";
		@Override public ParserRule getRule() { return rule; }

		//"state" name=ID ("actions" actions+=(ID | STRING)+)? ("refinement" "{" refinement=Statemachine "}")?
		//transitions+=Transition* "end"
		public Group getGroup() { return cGroup; }

		//"state"
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("actions" actions+=(ID | STRING)+)?
		public Group getGroup_2() { return cGroup_2; }

		//"actions"
		public Keyword getActionsKeyword_2_0() { return cActionsKeyword_2_0; }

		//actions+=(ID | STRING)+
		public Assignment getActionsAssignment_2_1() { return cActionsAssignment_2_1; }

		//ID | STRING
		public Alternatives getActionsAlternatives_2_1_0() { return cActionsAlternatives_2_1_0; }

		//ID
		public RuleCall getActionsIDTerminalRuleCall_2_1_0_0() { return cActionsIDTerminalRuleCall_2_1_0_0; }

		//STRING
		public RuleCall getActionsSTRINGTerminalRuleCall_2_1_0_1() { return cActionsSTRINGTerminalRuleCall_2_1_0_1; }

		//("refinement" "{" refinement=Statemachine "}")?
		public Group getGroup_3() { return cGroup_3; }

		//"refinement"
		public Keyword getRefinementKeyword_3_0() { return cRefinementKeyword_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }

		//refinement=Statemachine
		public Assignment getRefinementAssignment_3_2() { return cRefinementAssignment_3_2; }

		//Statemachine
		public RuleCall getRefinementStatemachineParserRuleCall_3_2_0() { return cRefinementStatemachineParserRuleCall_3_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }

		//transitions+=Transition*
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }

		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_4_0() { return cTransitionsTransitionParserRuleCall_4_0; }

		//"end"
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEventAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEventEventCrossReference_0_0 = (CrossReference)cEventAssignment_0.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_0_0_1 = (RuleCall)cEventEventCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cStateStateCrossReference_2_0 = (CrossReference)cStateAssignment_2.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_2_0_1 = (RuleCall)cStateStateCrossReference_2_0.eContents().get(1);
		
		//Transition:
		//	event=[Event]? "=>" state=[State];
		@Override public ParserRule getRule() { return rule; }

		//event=[Event]? "=>" state=[State]
		public Group getGroup() { return cGroup; }

		//event=[Event]?
		public Assignment getEventAssignment_0() { return cEventAssignment_0; }

		//[Event]
		public CrossReference getEventEventCrossReference_0_0() { return cEventEventCrossReference_0_0; }

		//ID
		public RuleCall getEventEventIDTerminalRuleCall_0_0_1() { return cEventEventIDTerminalRuleCall_0_0_1; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }

		//state=[State]
		public Assignment getStateAssignment_2() { return cStateAssignment_2; }

		//[State]
		public CrossReference getStateStateCrossReference_2_0() { return cStateStateCrossReference_2_0; }

		//ID
		public RuleCall getStateStateIDTerminalRuleCall_2_0_1() { return cStateStateIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final StatemachineElements pStatemachine;
	private final EventElements pEvent;
	private final StateElements pState;
	private final TransitionElements pTransition;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyStateMachinesGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStatemachine = new StatemachineElements();
		this.pEvent = new EventElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.myStateMachines.MyStateMachines".equals(grammar.getName())) {
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

	
	//Statemachine:
	//	{Statemachine} ("events" events+=Event+ "end")? states+=State*;
	public StatemachineElements getStatemachineAccess() {
		return pStatemachine;
	}
	
	public ParserRule getStatemachineRule() {
		return getStatemachineAccess().getRule();
	}

	//Event:
	//	name=ID;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}

	//State:
	//	"state" name=ID ("actions" actions+=(ID | STRING)+)? ("refinement" "{" refinement=Statemachine "}")?
	//	transitions+=Transition* "end";
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Transition:
	//	event=[Event]? "=>" state=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}