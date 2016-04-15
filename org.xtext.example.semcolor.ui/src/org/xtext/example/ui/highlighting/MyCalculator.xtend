package org.xtext.example.ui.highlighting

import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.xtext.example.semcolor.Person

import static org.xtext.example.ui.highlighting.MyHighlightingConfiguration.*

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

class MyCalculator implements ISemanticHighlightingCalculator {

	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		resource.allContents.filter(Person).forEach [
			val node = name.findActualNodeFor()
			switch (gender) {
				case FEMALE: acceptor.addPosition(node.offset, node.length, FEMALE_ID)
				case MALE: acceptor.addPosition(node.offset, node.length, MALE_ID)
				default: {
				}
			}
		]
	}

}
