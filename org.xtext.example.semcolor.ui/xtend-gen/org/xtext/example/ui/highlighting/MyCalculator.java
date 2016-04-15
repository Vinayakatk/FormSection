package org.xtext.example.ui.highlighting;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.semcolor.Gender;
import org.xtext.example.semcolor.Name;
import org.xtext.example.semcolor.Person;
import org.xtext.example.ui.highlighting.MyHighlightingConfiguration;

@SuppressWarnings("all")
public class MyCalculator implements ISemanticHighlightingCalculator {
  @Override
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Person> _filter = Iterators.<Person>filter(_allContents, Person.class);
    final Procedure1<Person> _function = (Person it) -> {
      Name _name = it.getName();
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(_name);
      Gender _gender = it.getGender();
      if (_gender != null) {
        switch (_gender) {
          case FEMALE:
            int _offset = node.getOffset();
            int _length = node.getLength();
            acceptor.addPosition(_offset, _length, MyHighlightingConfiguration.FEMALE_ID);
            break;
          case MALE:
            int _offset_1 = node.getOffset();
            int _length_1 = node.getLength();
            acceptor.addPosition(_offset_1, _length_1, MyHighlightingConfiguration.MALE_ID);
            break;
          default:
            break;
        }
      } else {
      }
    };
    IteratorExtensions.<Person>forEach(_filter, _function);
  }
}
