package org.xtext.example.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class MyHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public static final String MALE_ID = "male";
	public static final String FEMALE_ID = "female";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(MALE_ID, "male", maleTextStyle());
		acceptor.acceptDefaultHighlighting(FEMALE_ID, "female", femaleTextStyle());
	}
	
	public TextStyle maleTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(128, 128, 255));
		return textStyle;
	}
	
	public TextStyle femaleTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 192, 203));
		return textStyle;
	}
}
