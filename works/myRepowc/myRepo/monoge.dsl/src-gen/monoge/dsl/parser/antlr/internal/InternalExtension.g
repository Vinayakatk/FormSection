/*
 * generated by Xtext
 */
grammar InternalExtension;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package monoge.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package monoge.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import monoge.dsl.services.ExtensionGrammarAccess;

}

@parser::members {

 	private ExtensionGrammarAccess grammarAccess;
 	
    public InternalExtensionParser(TokenStream input, ExtensionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected ExtensionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='define' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDefineKeyword_0());
    }
(
(
		lv_extensionName_1_0=RULE_ID
		{
			newLeafNode(lv_extensionName_1_0, grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"extensionName",
        		lv_extensionName_1_0, 
        		"ID");
	    }

)
)	otherlv_2='extending' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getExtendingKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getModelAccess().getMetamodelEPackageCrossReference_3_0()); 
	}

)
)	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getColonKeyword_4());
    }
(
(
		lv_name_5_0=RULE_ID
		{
			newLeafNode(lv_name_5_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"ID");
	    }

)
)	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_7_0()); 
	    }
		lv_extensions_7_0=ruleExtension		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"extensions",
        		lv_extensions_7_0, 
        		"Extension");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleExtension
entryRuleExtension returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExtensionRule()); }
	 iv_ruleExtension=ruleExtension 
	 { $current=$iv_ruleExtension.current; } 
	 EOF 
;

// Rule Extension
ruleExtension returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 
    }
    this_Create_0=ruleCreate
    { 
        $current = $this_Create_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 
    }
    this_Refine_1=ruleRefine
    { 
        $current = $this_Refine_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 
    }
    this_Generalize_2=ruleGeneralize
    { 
        $current = $this_Generalize_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 
    }
    this_ModifyClass_3=ruleModifyClass
    { 
        $current = $this_ModifyClass_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 
    }
    this_FilterClass_4=ruleFilterClass
    { 
        $current = $this_FilterClass_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;







// Entry rule entryRuleCreate
entryRuleCreate returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCreateRule()); }
	 iv_ruleCreate=ruleCreate 
	 { $current=$iv_ruleCreate.current; } 
	 EOF 
;

// Rule Create
ruleCreate returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='add class' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getAddClassKeyword_0());
    }
(
(
		lv_class_1_0=RULE_ID
		{
			newLeafNode(lv_class_1_0, grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCreateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"class",
        		lv_class_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleRefine
entryRuleRefine returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRefineRule()); }
	 iv_ruleRefine=ruleRefine 
	 { $current=$iv_ruleRefine.current; } 
	 EOF 
;

// Rule Refine
ruleRefine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='add class' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRefineAccess().getAddClassKeyword_0());
    }
(
(
		lv_classNew_1_0=RULE_ID
		{
			newLeafNode(lv_classNew_1_0, grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefineRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"classNew",
        		lv_classNew_1_0, 
        		"ID");
	    }

)
)	otherlv_2='specializing' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRefineAccess().getSpecializingKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefineRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getRefineAccess().getPrefixEClassCrossReference_3_0()); 
	}

)
)	otherlv_4='.' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRefineAccess().getFullStopKeyword_4());
    }
(
(
		lv_classOriginal_5_0=RULE_ID
		{
			newLeafNode(lv_classOriginal_5_0, grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefineRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"classOriginal",
        		lv_classOriginal_5_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleGeneralize
entryRuleGeneralize returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGeneralizeRule()); }
	 iv_ruleGeneralize=ruleGeneralize 
	 { $current=$iv_ruleGeneralize.current; } 
	 EOF 
;

// Rule Generalize
ruleGeneralize returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='add class' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGeneralizeAccess().getAddClassKeyword_0());
    }
(
(
		lv_classNew_1_0=RULE_ID
		{
			newLeafNode(lv_classNew_1_0, grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneralizeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"classNew",
        		lv_classNew_1_0, 
        		"ID");
	    }

)
)	otherlv_2='supertyping' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneralizeRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getGeneralizeAccess().getPrefixEClassCrossReference_3_0()); 
	}

)
)	otherlv_4='.' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGeneralizeAccess().getFullStopKeyword_4());
    }
(
(
		lv_class_5_0=RULE_ID
		{
			newLeafNode(lv_class_5_0, grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneralizeRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"class",
        		lv_class_5_0, 
        		"ID");
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneralizeRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getGeneralizeAccess().getPrefixEClassCrossReference_6_1_0()); 
	}

)
)	otherlv_8='.' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2());
    }
(
(
		lv_class_9_0=RULE_ID
		{
			newLeafNode(lv_class_9_0, grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneralizeRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"class",
        		lv_class_9_0, 
        		"ID");
	    }

)
))*)
;





// Entry rule entryRuleModifyClass
entryRuleModifyClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModifyClassRule()); }
	 iv_ruleModifyClass=ruleModifyClass 
	 { $current=$iv_ruleModifyClass.current; } 
	 EOF 
;

// Rule ModifyClass
ruleModifyClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='modify class' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModifyClassAccess().getModifyClassKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifyClassRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getModifyClassAccess().getPrefixEClassCrossReference_1_0()); 
	}

)
)	otherlv_2='.' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModifyClassAccess().getFullStopKeyword_2());
    }
(
(
		lv_class_3_0=RULE_ID
		{
			newLeafNode(lv_class_3_0, grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifyClassRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"class",
        		lv_class_3_0, 
        		"ID");
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 
	    }
		lv_modifyOperators_5_0=ruleModifyOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModifyClassRule());
	        }
       		add(
       			$current, 
       			"modifyOperators",
        		lv_modifyOperators_5_0, 
        		"ModifyOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleModifyOperator
entryRuleModifyOperator returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModifyOperatorRule()); }
	 iv_ruleModifyOperator=ruleModifyOperator 
	 { $current=$iv_ruleModifyOperator.current; } 
	 EOF 
;

// Rule ModifyOperator
ruleModifyOperator returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 
    }
    this_AddProperty_0=ruleAddProperty
    { 
        $current = $this_AddProperty_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 
    }
    this_ModifyProperty_1=ruleModifyProperty
    { 
        $current = $this_ModifyProperty_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 
    }
    this_FilterProperty_2=ruleFilterProperty
    { 
        $current = $this_FilterProperty_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 
    }
    this_AddConstraint_3=ruleAddConstraint
    { 
        $current = $this_AddConstraint_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_4()); 
    }
    this_FilterConstraint_4=ruleFilterConstraint
    { 
        $current = $this_FilterConstraint_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAddProperty
entryRuleAddProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAddPropertyRule()); }
	 iv_ruleAddProperty=ruleAddProperty 
	 { $current=$iv_ruleAddProperty.current; } 
	 EOF 
;

// Rule AddProperty
ruleAddProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='add property' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0());
    }
(
(
		lv_property_1_0=RULE_ID
		{
			newLeafNode(lv_property_1_0, grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAddPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"property",
        		lv_property_1_0, 
        		"ID");
	    }

)
)	otherlv_2='type' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAddPropertyAccess().getTypeKeyword_2());
    }
(
(
		lv_type_3_0=RULE_ID
		{
			newLeafNode(lv_type_3_0, grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAddPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleModifyProperty
entryRuleModifyProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModifyPropertyRule()); }
	 iv_ruleModifyProperty=ruleModifyProperty 
	 { $current=$iv_ruleModifyProperty.current; } 
	 EOF 
;

// Rule ModifyProperty
ruleModifyProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='modify property' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0());
    }
(
(
		lv_property_1_0=RULE_ID
		{
			newLeafNode(lv_property_1_0, grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifyPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"property",
        		lv_property_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModifyPropertyRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"ValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 
	    }
		lv_value_4_0=ruleValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModifyPropertyRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"ValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleValueAssignment
entryRuleValueAssignment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueAssignmentRule()); }
	 iv_ruleValueAssignment=ruleValueAssignment 
	 { $current=$iv_ruleValueAssignment.current; } 
	 EOF 
;

// Rule ValueAssignment
ruleValueAssignment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_attribute_0_0=RULE_ID
		{
			newLeafNode(lv_attribute_0_0, grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getValueAssignmentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"attribute",
        		lv_attribute_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValueAssignmentRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFilterProperty
entryRuleFilterProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFilterPropertyRule()); }
	 iv_ruleFilterProperty=ruleFilterProperty 
	 { $current=$iv_ruleFilterProperty.current; } 
	 EOF 
;

// Rule FilterProperty
ruleFilterProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='filter property' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0());
    }
(
(
		lv_property_1_0=RULE_ID
		{
			newLeafNode(lv_property_1_0, grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFilterPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"property",
        		lv_property_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleFilterClass
entryRuleFilterClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFilterClassRule()); }
	 iv_ruleFilterClass=ruleFilterClass 
	 { $current=$iv_ruleFilterClass.current; } 
	 EOF 
;

// Rule FilterClass
ruleFilterClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='filter class' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFilterClassAccess().getFilterClassKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFilterClassRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getFilterClassAccess().getPrefixEClassCrossReference_1_0()); 
	}

)
)	otherlv_2='.' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFilterClassAccess().getFullStopKeyword_2());
    }
(
(
		lv_class_3_0=RULE_ID
		{
			newLeafNode(lv_class_3_0, grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFilterClassRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"class",
        		lv_class_3_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleAddConstraint
entryRuleAddConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAddConstraintRule()); }
	 iv_ruleAddConstraint=ruleAddConstraint 
	 { $current=$iv_ruleAddConstraint.current; } 
	 EOF 
;

// Rule AddConstraint
ruleAddConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='add constraint' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0());
    }
(
(
		lv_constraint_1_0=RULE_ID
		{
			newLeafNode(lv_constraint_1_0, grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAddConstraintRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"constraint",
        		lv_constraint_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAddConstraintRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFilterConstraint
entryRuleFilterConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFilterConstraintRule()); }
	 iv_ruleFilterConstraint=ruleFilterConstraint 
	 { $current=$iv_ruleFilterConstraint.current; } 
	 EOF 
;

// Rule FilterConstraint
ruleFilterConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='filter constraint' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 
	    }
		lv_constraint_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
	        }
       		set(
       			$current, 
       			"constraint",
        		lv_constraint_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


