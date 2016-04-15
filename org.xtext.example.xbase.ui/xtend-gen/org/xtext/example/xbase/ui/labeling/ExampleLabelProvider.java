/**
 * generated by Xtext
 */
package org.xtext.example.xbase.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class ExampleLabelProvider extends XbaseLabelProvider {
  @Inject
  public ExampleLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
