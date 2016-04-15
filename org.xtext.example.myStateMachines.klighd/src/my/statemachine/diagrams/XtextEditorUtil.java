package my.statemachine.diagrams;

import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.base.Function;

import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.klighd.ISourceProxy;

public class XtextEditorUtil {

    /**
     * Factory method providing an implementation of {@link ISourceProxy} enabling the execution of
     * KLighD operations properly within Xtext's {@link IUnitOfWork IUnitOfWorks}.
     *
     * @param editorPart
     *            the {@link XtextEditor} whose model shall be accessed
     * @return the desired {@link ISourceProxy} implementation
     */
    public static ISourceProxy getXtextModelAccessProxy(final IEditorPart editorPart) {
        if (editorPart instanceof XtextEditor) {
            final XtextEditor xtextEditor = (XtextEditor) editorPart;

            return new ISourceProxy() {

                public <T> T execute(final Function<Object, T> function) {
                    if (xtextEditor.getDocument() == null) {
                        return null;
                    }

                    final Maybe<T> result = new Maybe<T>();

                    xtextEditor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {

                        @Override
                        public void process(final XtextResource state) throws Exception {
                            if (!state.getContents().isEmpty()) {
                                result.set(function.apply(state.getContents().get(0)));
                            }
                        };
                    });

                    return result.get();
                }
            };

        } else {
            return null;
        }
    }
}
