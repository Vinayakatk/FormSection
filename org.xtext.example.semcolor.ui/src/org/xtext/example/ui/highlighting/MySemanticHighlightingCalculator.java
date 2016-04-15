package org.xtext.example.ui.highlighting;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.xtext.example.semcolor.Person;
import org.xtext.example.semcolor.Persons;
import org.xtext.example.semcolor.SemcolorPackage;

public class MySemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if(resource==null){
			return;
		}

		EList<EObject> contents = resource.getContents();
		if(contents.size()==0){
			return;
		}
		EObject root = contents.get(0);
		if(root instanceof Persons){
			Persons persons=(Persons)root;
			highlightPersons(persons, acceptor);
		}
	}

	protected void highlightPersons(Persons persons,
			IHighlightedPositionAcceptor acceptor) {
		for (Person p : persons.getPersons()) {
			String id=MyHighlightingConfiguration.DEFAULT_ID;
			switch (p.getGender()) {
				case FEMALE:
					id=MyHighlightingConfiguration.FEMALE_ID;
					break;
				case MALE:
					id=MyHighlightingConfiguration.MALE_ID;
			default:
				break;
			}
			ICompositeNode node = NodeModelUtils.findActualNodeFor(p);
			List<INode> findNodesForFeature = NodeModelUtils.findNodesForFeature(p, SemcolorPackage.Literals.PERSON__NAME);
			if(findNodesForFeature.size() > 0) {
				INode iNode = findNodesForFeature.get(0);
				acceptor.addPosition(iNode.getOffset(), iNode.getLength(), id);
			}
//			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		}
		
	}
}
