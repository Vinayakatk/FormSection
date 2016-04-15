package my.klighd.diagrams.example;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * A simple handler for opening diagrams.
 */
public class OpenDiagramHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            final IStructuredSelection sSelection  = (IStructuredSelection) selection;
            Object model = null;
            if (sSelection.getFirstElement() instanceof IFile) {
                try {
                    IFile f = (IFile) sSelection.getFirstElement();
                    ResourceSet rs = new ResourceSetImpl();
                    Resource r =
                    rs.getResource(URI.createFileURI(f.getFullPath().toString()), true);
                    if (r.getContents().size() > 0) {
                        model = r.getContents().get(0);
                    }
                } catch (Exception e) {
                    StatusManager.getManager().handle(
                    new Status(IStatus.ERROR, this.getClass().getCanonicalName(),
                    "Could not load selected file.", e), StatusManager.SHOW);
                }
            } else {
                model = sSelection.getFirstElement();
            }
            
            DiagramViewManager.createView(
                    "my.klighd.diagrams.example.LibraryDiagram", "Library Diagram", model, KlighdSynthesisProperties.create());
        } else {
            MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Unsupported element",
                    "KLighD diagram synthesis is unsupported for the current selection "
                            + selection.toString() + ".");
        }
        return null;
    }
}
