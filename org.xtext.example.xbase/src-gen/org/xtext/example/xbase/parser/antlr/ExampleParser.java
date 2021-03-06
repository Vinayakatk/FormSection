/*
 * generated by Xtext
 */
package org.xtext.example.xbase.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.xbase.services.ExampleGrammarAccess;

public class ExampleParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ExampleGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.xbase.parser.antlr.internal.InternalExampleParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.xbase.parser.antlr.internal.InternalExampleParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Package";
	}
	
	public ExampleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ExampleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
