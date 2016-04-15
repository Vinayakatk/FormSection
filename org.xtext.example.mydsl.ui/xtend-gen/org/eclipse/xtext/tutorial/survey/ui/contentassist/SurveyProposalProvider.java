/**
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.tutorial.survey.ui.contentassist.AbstractSurveyProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class SurveyProposalProvider extends AbstractSurveyProposalProvider {
  @Override
  public void completeGuard_Question(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    InputOutput.println();
    super.completeGuard_Question(model, assignment, context, acceptor);
  }
  
  @Override
  public void completeGuard_Answer(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeGuard_Answer(model, assignment, context, acceptor);
  }
  
  @Override
  public void complete_Page(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    InputOutput.<String>println("page");
    super.complete_Page(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void complete_Guard(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    InputOutput.<String>println("guard called");
    super.complete_Guard(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void complete_FollowUp(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    InputOutput.<String>println("FOLLOW UP");
    super.complete_FollowUp(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void completeFollowUp_Next(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    InputOutput.<String>println("lets see");
    super.completeFollowUp_Next(model, assignment, context, acceptor);
  }
}
