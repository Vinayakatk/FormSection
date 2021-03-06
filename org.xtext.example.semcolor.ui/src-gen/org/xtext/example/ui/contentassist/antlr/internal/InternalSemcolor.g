/*
 * generated by Xtext
 */
grammar InternalSemcolor;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.ui.contentassist.antlr.internal; 

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
import org.xtext.example.services.SemcolorGrammarAccess;

}

@parser::members {
 
 	private SemcolorGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(SemcolorGrammarAccess grammarAccess) {
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




// Entry rule entryRulePersons
entryRulePersons 
:
{ before(grammarAccess.getPersonsRule()); }
	 rulePersons
{ after(grammarAccess.getPersonsRule()); } 
	 EOF 
;

// Rule Persons
rulePersons
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPersonsAccess().getPersonsAssignment()); }
(rule__Persons__PersonsAssignment)*
{ after(grammarAccess.getPersonsAccess().getPersonsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePerson
entryRulePerson 
:
{ before(grammarAccess.getPersonRule()); }
	 rulePerson
{ after(grammarAccess.getPersonRule()); } 
	 EOF 
;

// Rule Person
rulePerson
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPersonAccess().getGroup()); }
(rule__Person__Group__0)
{ after(grammarAccess.getPersonAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleName
entryRuleName 
:
{ before(grammarAccess.getNameRule()); }
	 ruleName
{ after(grammarAccess.getNameRule()); } 
	 EOF 
;

// Rule Name
ruleName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNameAccess().getGroup()); }
(rule__Name__Group__0)
{ after(grammarAccess.getNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule Gender
ruleGender
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenderAccess().getAlternatives()); }
(rule__Gender__Alternatives)
{ after(grammarAccess.getGenderAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Gender__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGenderAccess().getUnknownEnumLiteralDeclaration_0()); }
(	'unknown' 
)
{ after(grammarAccess.getGenderAccess().getUnknownEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1()); }
(	'female' 
)
{ after(grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_2()); }
(	'male' 
)
{ after(grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Person__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Person__Group__0__Impl
	rule__Person__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersonAccess().getNameAssignment_0()); }
(rule__Person__NameAssignment_0)
{ after(grammarAccess.getPersonAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Person__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Person__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersonAccess().getGenderAssignment_1()); }
(rule__Person__GenderAssignment_1)?
{ after(grammarAccess.getPersonAccess().getGenderAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Name__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Name__Group__0__Impl
	rule__Name__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameAccess().getFirstNameAssignment_0()); }
(rule__Name__FirstNameAssignment_0)
{ after(grammarAccess.getNameAccess().getFirstNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Name__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Name__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameAccess().getLastNameAssignment_1()); }
(rule__Name__LastNameAssignment_1)
{ after(grammarAccess.getNameAccess().getLastNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Persons__PersonsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0()); }
	rulePerson{ after(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Person__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersonAccess().getNameNameParserRuleCall_0_0()); }
	ruleName{ after(grammarAccess.getPersonAccess().getNameNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Person__GenderAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersonAccess().getGenderGenderEnumRuleCall_1_0()); }
	ruleGender{ after(grammarAccess.getPersonAccess().getGenderGenderEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Name__FirstNameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameAccess().getFirstNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getNameAccess().getFirstNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Name__LastNameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameAccess().getLastNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getNameAccess().getLastNameIDTerminalRuleCall_1_0()); }
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


