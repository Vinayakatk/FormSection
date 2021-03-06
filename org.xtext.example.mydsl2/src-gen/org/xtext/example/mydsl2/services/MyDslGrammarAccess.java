/*
 * generated by Xtext
 */
package org.xtext.example.mydsl2.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cDefinesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDefinesDefineParserRuleCall_1_0 = (RuleCall)cDefinesAssignment_1.eContents().get(0);
		private final Assignment cUsesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUsesUseParserRuleCall_2_0 = (RuleCall)cUsesAssignment_2.eContents().get(0);
		private final Assignment cOperationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOperationsOperationParserRuleCall_3_0 = (RuleCall)cOperationsAssignment_3.eContents().get(0);
		
		//Model:
		//	imports+=Import* defines+=Define* uses+=Use* operations+=Operation*;
		@Override public ParserRule getRule() { return rule; }

		//imports+=Import* defines+=Define* uses+=Use* operations+=Operation*
		public Group getGroup() { return cGroup; }

		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }

		//defines+=Define*
		public Assignment getDefinesAssignment_1() { return cDefinesAssignment_1; }

		//Define
		public RuleCall getDefinesDefineParserRuleCall_1_0() { return cDefinesDefineParserRuleCall_1_0; }

		//uses+=Use*
		public Assignment getUsesAssignment_2() { return cUsesAssignment_2; }

		//Use
		public RuleCall getUsesUseParserRuleCall_2_0() { return cUsesUseParserRuleCall_2_0; }

		//operations+=Operation*
		public Assignment getOperationsAssignment_3() { return cOperationsAssignment_3; }

		//Operation
		public RuleCall getOperationsOperationParserRuleCall_3_0() { return cOperationsOperationParserRuleCall_3_0; }
	}

	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCLASSIFIERKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cCarAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCarCardinalityParserRuleCall_2_0 = (RuleCall)cCarAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Operation:
		//	"CLASSIFIER" name=ID car=Cardinality ";";
		@Override public ParserRule getRule() { return rule; }

		//"CLASSIFIER" name=ID car=Cardinality ";"
		public Group getGroup() { return cGroup; }

		//"CLASSIFIER"
		public Keyword getCLASSIFIERKeyword_0() { return cCLASSIFIERKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//car=Cardinality
		public Assignment getCarAssignment_2() { return cCarAssignment_2; }

		//Cardinality
		public RuleCall getCarCardinalityParserRuleCall_2_0() { return cCarCardinalityParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class CardinalityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Cardinality");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLowerBoundAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLowerBoundINTTerminalRuleCall_1_0 = (RuleCall)cLowerBoundAssignment_1.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUpperBoundAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUpperBoundVVTerminalRuleCall_3_0 = (RuleCall)cUpperBoundAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//// here data trpe is taken as Int for upperbound and no value convertoer is called and default is assigned 
		//
		//Cardinality:
		//	"[" lowerBound=INT ".." upperBound=VV "]";
		@Override public ParserRule getRule() { return rule; }

		//"[" lowerBound=INT ".." upperBound=VV "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//lowerBound=INT
		public Assignment getLowerBoundAssignment_1() { return cLowerBoundAssignment_1; }

		//INT
		public RuleCall getLowerBoundINTTerminalRuleCall_1_0() { return cLowerBoundINTTerminalRuleCall_1_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_2() { return cFullStopFullStopKeyword_2; }

		//upperBound=VV
		public Assignment getUpperBoundAssignment_3() { return cUpperBoundAssignment_3; }

		//VV
		public RuleCall getUpperBoundVVTerminalRuleCall_3_0() { return cUpperBoundVVTerminalRuleCall_3_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importURI=STRING;
		@Override public ParserRule getRule() { return rule; }

		//"import" importURI=STRING
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importURI=STRING
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }

		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_1_0() { return cImportURISTRINGTerminalRuleCall_1_0; }
	}

	public class DefineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Define");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Define:
		//	"def" name=STRING;
		@Override public ParserRule getRule() { return rule; }

		//"def" name=STRING
		public Group getGroup() { return cGroup; }

		//"def"
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}

	public class UseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Use");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUseAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cUseDefineCrossReference_1_0 = (CrossReference)cUseAssignment_1.eContents().get(0);
		private final RuleCall cUseDefineSTRINGTerminalRuleCall_1_0_1 = (RuleCall)cUseDefineCrossReference_1_0.eContents().get(1);
		
		//Use:
		//	"use" use=[Define|STRING];
		@Override public ParserRule getRule() { return rule; }

		//"use" use=[Define|STRING]
		public Group getGroup() { return cGroup; }

		//"use"
		public Keyword getUseKeyword_0() { return cUseKeyword_0; }

		//use=[Define|STRING]
		public Assignment getUseAssignment_1() { return cUseAssignment_1; }

		//[Define|STRING]
		public CrossReference getUseDefineCrossReference_1_0() { return cUseDefineCrossReference_1_0; }

		//STRING
		public RuleCall getUseDefineSTRINGTerminalRuleCall_1_0_1() { return cUseDefineSTRINGTerminalRuleCall_1_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final OperationElements pOperation;
	private final CardinalityElements pCardinality;
	private final TerminalRule tVV;
	private final ImportElements pImport;
	private final DefineElements pDefine;
	private final UseElements pUse;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pOperation = new OperationElements();
		this.pCardinality = new CardinalityElements();
		this.tVV = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "VV");
		this.pImport = new ImportElements();
		this.pDefine = new DefineElements();
		this.pUse = new UseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl2.MyDsl".equals(grammar.getName())) {
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

	
	//Model:
	//	imports+=Import* defines+=Define* uses+=Use* operations+=Operation*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Operation:
	//	"CLASSIFIER" name=ID car=Cardinality ";";
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}

	//// here data trpe is taken as Int for upperbound and no value convertoer is called and default is assigned 
	//
	//Cardinality:
	//	"[" lowerBound=INT ".." upperBound=VV "]";
	public CardinalityElements getCardinalityAccess() {
		return pCardinality;
	}
	
	public ParserRule getCardinalityRule() {
		return getCardinalityAccess().getRule();
	}

	//terminal VV returns ecore::EIntegerObject:
	//	"*";
	public TerminalRule getVVRule() {
		return tVV;
	} 

	//Import:
	//	"import" importURI=STRING;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Define:
	//	"def" name=STRING;
	public DefineElements getDefineAccess() {
		return pDefine;
	}
	
	public ParserRule getDefineRule() {
		return getDefineAccess().getRule();
	}

	//Use:
	//	"use" use=[Define|STRING];
	public UseElements getUseAccess() {
		return pUse;
	}
	
	public ParserRule getUseRule() {
		return getUseAccess().getRule();
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
