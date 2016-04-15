/*
 * generated by Xtext
 */
package org.xtext.example.myStateMachines.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.myStateMachines.services.MyStateMachinesGrammarAccess;

public class MyStateMachinesParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MyStateMachinesGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.myStateMachines.parser.antlr.internal.InternalMyStateMachinesParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.myStateMachines.parser.antlr.internal.InternalMyStateMachinesParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Statemachine";
	}
	
	public MyStateMachinesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyStateMachinesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}