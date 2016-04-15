package org.xtext.example.mydsl2.validation;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import com.google.inject.Inject;

public class TERM extends DefaultTerminalConverters{
	
	@Inject
	KKK lll;
	 @ValueConverter(rule = "VV")
	    public IValueConverter<Integer> VV() {
	        return new IValueConverter<Integer>() {

				@Override
				public Integer toValue(String string, INode node)
						throws ValueConverterException {
					lll.dosome();
					return new Integer(-1);
				}

				@Override
				public String toString(Integer value)
						throws ValueConverterException {
					// TODO Auto-generated method stub
					return value.toString();
				}};
}
}
