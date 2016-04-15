/**
 */
package org.xtext.example.semcolor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.semcolor.Persons#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.semcolor.SemcolorPackage#getPersons()
 * @model
 * @generated
 */
public interface Persons extends EObject
{
  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.semcolor.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see org.xtext.example.semcolor.SemcolorPackage#getPersons_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

} // Persons
