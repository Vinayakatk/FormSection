/*
* generated by Xtext
*/
package org.xtext.quickfix.ui.quickfix

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.model.edit.IModification
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.validation.Issue
import org.xtext.quickfix.exampleQuickfix.City
import org.xtext.quickfix.exampleQuickfix.ExampleQuickfixFactory
import org.xtext.quickfix.validation.ExampleQuickfixValidator

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class ExampleQuickfixQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(ExampleQuickfixValidator.INVALID_NAME)
	def void capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize name",
			"Capitalize the name \"" // retrieve the 'user data' from the validation warning
			+ issue.getData().head + "\".", // icon to display (in the icons folder)
			"upcase.png",[IModificationContext context |
					val xtextDocument = context.getXtextDocument();
					val firstLetter = xtextDocument.get(issue.getOffset() + 1, 1);
					xtextDocument.replace(issue.getOffset() + 1, 1, firstLetter.toUpperCase());
				]
			);
	}

	@Fix(ExampleQuickfixValidator.CITY_NOT_INTERESTING)
	def void addSightToCity(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add sight to make city more interesting",
			"Add a random sight, to make the city look more interesting.",
			// providing null for the icon name makes Eclipse use the
			// standard quick fix icon
			null,[EObject element, IModificationContext context|
					// we know that the warning applies to cities
					val c = element as City;
					// programmatic modification of the model
					val sight = ExampleQuickfixFactory.eINSTANCE.createSight();
					sight.name = "Central Station"
					sight.setDescription("The famous central station of " + Strings::toFirstUpper(c.getName()) + ".");
					c.getSights().add(sight);
				]
				
			);
	}
}
