/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.tutorial.survey.services.SurveyGrammarAccess;
import org.eclipse.xtext.tutorial.survey.survey.Choice;
import org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion;
import org.eclipse.xtext.tutorial.survey.survey.FollowUp;
import org.eclipse.xtext.tutorial.survey.survey.FreeTextQuestion;
import org.eclipse.xtext.tutorial.survey.survey.Guard;
import org.eclipse.xtext.tutorial.survey.survey.Import;
import org.eclipse.xtext.tutorial.survey.survey.Main;
import org.eclipse.xtext.tutorial.survey.survey.Page;
import org.eclipse.xtext.tutorial.survey.survey.Survey;
import org.eclipse.xtext.tutorial.survey.survey.SurveyPackage;

@SuppressWarnings("all")
public class SurveySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SurveyGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SurveyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SurveyPackage.CHOICE:
				sequence_Choice(context, (Choice) semanticObject); 
				return; 
			case SurveyPackage.CHOICE_QUESTION:
				sequence_ChoiceQuestion(context, (ChoiceQuestion) semanticObject); 
				return; 
			case SurveyPackage.FOLLOW_UP:
				sequence_FollowUp(context, (FollowUp) semanticObject); 
				return; 
			case SurveyPackage.FREE_TEXT_QUESTION:
				sequence_FreeTextQuestion(context, (FreeTextQuestion) semanticObject); 
				return; 
			case SurveyPackage.GUARD:
				if(context == grammarAccess.getFollowUpRule()) {
					sequence_FollowUp_Guard(context, (Guard) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGuardRule()) {
					sequence_Guard(context, (Guard) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case SurveyPackage.MAIN:
				sequence_Main(context, (Main) semanticObject); 
				return; 
			case SurveyPackage.PAGE:
				sequence_Page(context, (Page) semanticObject); 
				return; 
			case SurveyPackage.SURVEY:
				sequence_Survey(context, (Survey) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (single?='single'? name=ID text=STRING choices+=Choice+)
	 */
	protected void sequence_ChoiceQuestion(EObject context, ChoiceQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (freetext?='text'? name=ID? text=STRING)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     next=[Survey|ID]
	 */
	protected void sequence_FollowUp(EObject context, FollowUp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.FOLLOW_UP__NEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.FOLLOW_UP__NEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFollowUpAccess().getNextSurveyIDTerminalRuleCall_3_0_1(), semanticObject.getNext());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (question=[ChoiceQuestion|QualifiedName] answer=[Choice|QualifiedName] next=[Survey|ID])
	 */
	protected void sequence_FollowUp_Guard(EObject context, Guard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.FOLLOW_UP__NEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.FOLLOW_UP__NEXT));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.GUARD__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.GUARD__QUESTION));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.GUARD__ANSWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.GUARD__ANSWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuardAccess().getQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getGuardAccess().getAnswerChoiceQualifiedNameParserRuleCall_3_0_1(), semanticObject.getAnswer());
		feeder.accept(grammarAccess.getFollowUpAccess().getNextSurveyIDTerminalRuleCall_3_0_1(), semanticObject.getNext());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING)
	 */
	protected void sequence_FreeTextQuestion(EObject context, FreeTextQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.QUESTION__NAME));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.QUESTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.QUESTION__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (question=[ChoiceQuestion|QualifiedName] answer=[Choice|QualifiedName])
	 */
	protected void sequence_Guard(EObject context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* s+=Survey+)
	 */
	protected void sequence_Main(EObject context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID questions+=Question* followUps+=FollowUp*)
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING pages+=Page*)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
