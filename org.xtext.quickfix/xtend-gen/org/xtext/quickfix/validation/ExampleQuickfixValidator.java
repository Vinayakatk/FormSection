/**
 * generated by Xtext
 */
package org.xtext.quickfix.validation;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.quickfix.exampleQuickfix.City;
import org.xtext.quickfix.exampleQuickfix.ExampleQuickfixPackage;
import org.xtext.quickfix.exampleQuickfix.Sight;
import org.xtext.quickfix.validation.AbstractExampleQuickfixValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class ExampleQuickfixValidator extends AbstractExampleQuickfixValidator {
  public final static String INVALID_NAME = "org.xtext.quickfix.InvalidTypeName";
  
  @Check
  public void checkTypeNameStartsWithCapital(final City city) {
    boolean _or = false;
    String _name = city.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      _or = true;
    } else {
      String _name_1 = city.getName();
      int _length = _name_1.length();
      boolean _equals_1 = (_length == 0);
      _or = _equals_1;
    }
    if (_or) {
      return;
    }
    String _name_2 = city.getName();
    char _charAt = _name_2.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      String _name_3 = city.getName();
      this.warning("Name should start with a capital letter.", 
        ExampleQuickfixPackage.Literals.CITY__NAME, ExampleQuickfixValidator.INVALID_NAME, _name_3);
    }
  }
  
  public final static String CITY_NOT_INTERESTING = "xtext.workshop.advanced.quickfix.CityNotInteresting";
  
  @Check
  public void checkAtLeastOneSight(final City city) {
    EList<Sight> _sights = city.getSights();
    int _size = _sights.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("City not interesting - no sights specified.", city, 
        ExampleQuickfixPackage.Literals.CITY__NAME, ExampleQuickfixValidator.CITY_NOT_INTERESTING);
    }
  }
}