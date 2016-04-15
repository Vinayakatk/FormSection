package org.eclipse.xtext.tutorial.survey.scoping;

import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

@SuppressWarnings("all")
public class MyimportURIscope extends ImportUriGlobalScopeProvider {
  @Override
  protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method importURI is undefined for the type MyimportURIscope");
  }
}
