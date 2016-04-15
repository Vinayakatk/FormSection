/**
 * generated by Xtext
 */
package org.xtext.example.mydsl2.ui.contentassist;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.mydsl2.ui.contentassist.AbstractMyDslProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class MyDslProposalProvider extends AbstractMyDslProposalProvider {
  public static class StringProposalDelegate extends ICompletionProposalAcceptor.Delegate {
    private ContentAssistContext ctx;
    
    public StringProposalDelegate(final ICompletionProposalAcceptor delegate, final ContentAssistContext ctx) {
      super(delegate);
      this.ctx = ctx;
    }
    
    @Override
    public void accept(final ICompletionProposal proposal) {
      try {
        if ((proposal instanceof ConfigurableCompletionProposal)) {
          ConfigurableCompletionProposal proposa = ((ConfigurableCompletionProposal) proposal);
          ((ConfigurableCompletionProposal)proposal).setAdditionalProposalInfo("hello there");
          proposa.setAdditionalData("a", "yahoo");
          int _replacementOffset = ((ConfigurableCompletionProposal)proposal).getReplacementOffset();
          proposa.setSelectionStart(_replacementOffset);
          IXtextDocument _document = this.ctx.getDocument();
          int _replacementOffset_1 = ((ConfigurableCompletionProposal)proposal).getReplacementOffset();
          int _replaceContextLength = ((ConfigurableCompletionProposal)proposal).getReplaceContextLength();
          String _get = _document.get(_replacementOffset_1, _replaceContextLength);
          InputOutput.<String>println(_get);
          int _replacementOffset_2 = ((ConfigurableCompletionProposal)proposal).getReplacementOffset();
          int _replacementLength = ((ConfigurableCompletionProposal)proposal).getReplacementLength();
          final int endPos = (_replacementOffset_2 + _replacementLength);
          boolean _and = false;
          IXtextDocument _document_1 = this.ctx.getDocument();
          boolean _notEquals = (!Objects.equal(_document_1, null));
          if (!_notEquals) {
            _and = false;
          } else {
            IXtextDocument _document_2 = this.ctx.getDocument();
            int _length = _document_2.getLength();
            boolean _greaterThan = (_length > endPos);
            _and = _greaterThan;
          }
          if (_and) {
            IXtextDocument _document_3 = this.ctx.getDocument();
            String _get_1 = _document_3.get(endPos, 1);
            boolean _equals = Objects.equal("\"", _get_1);
            if (_equals) {
              String _replacementString = ((ConfigurableCompletionProposal)proposal).getReplacementString();
              String _replacementString_1 = ((ConfigurableCompletionProposal)proposal).getReplacementString();
              int _length_1 = _replacementString_1.length();
              int _minus = (_length_1 - 1);
              String _substring = _replacementString.substring(0, _minus);
              ((ConfigurableCompletionProposal)proposal).setReplacementString(_substring);
            }
          }
        }
        super.accept(proposal);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Override
  public void completeUse_Use(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    MyDslProposalProvider.StringProposalDelegate _stringProposalDelegate = new MyDslProposalProvider.StringProposalDelegate(acceptor, context);
    super.completeUse_Use(model, assignment, context, _stringProposalDelegate);
  }
}