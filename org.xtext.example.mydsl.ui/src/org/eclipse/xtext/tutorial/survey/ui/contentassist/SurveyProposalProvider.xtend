/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.ui.contentassist

import org.eclipse.xtext.tutorial.survey.ui.contentassist.AbstractSurveyProposalProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.RuleCall

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class SurveyProposalProvider extends AbstractSurveyProposalProvider {

	override completeGuard_Question(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		println()
		super.completeGuard_Question(model, assignment, context, acceptor)
		
	}
	
	override completeGuard_Answer(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeGuard_Answer(model, assignment, context, acceptor)
	}
	
	override complete_Page(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		println("page")
		super.complete_Page(model, ruleCall, context, acceptor)
		
	}
	
	override complete_Guard(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
println("guard called")
		super.complete_Guard(model, ruleCall, context, acceptor)
	}
	
	override complete_FollowUp(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		println("FOLLOW UP")
		super.complete_FollowUp(model, ruleCall, context, acceptor)
	}
	
//	override completeFollowUp_Guard(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		println("FOLLOW UP GUARD")
//		super.completeFollowUp_Guard(model, assignment, context, acceptor)
//		
//	}
	
	override completeFollowUp_Next(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		println("lets see")
		super.completeFollowUp_Next(model, assignment, context, acceptor)
	} 
	
	
	
}
