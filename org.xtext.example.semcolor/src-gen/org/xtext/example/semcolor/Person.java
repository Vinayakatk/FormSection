/**
 */
package org.xtext.example.semcolor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.semcolor.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.semcolor.Person#getGender <em>Gender</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.semcolor.SemcolorPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.xtext.example.semcolor.SemcolorPackage#getPerson_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.xtext.example.semcolor.Person#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Gender</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.semcolor.Gender}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gender</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gender</em>' attribute.
   * @see org.xtext.example.semcolor.Gender
   * @see #setGender(Gender)
   * @see org.xtext.example.semcolor.SemcolorPackage#getPerson_Gender()
   * @model
   * @generated
   */
  Gender getGender();

  /**
   * Sets the value of the '{@link org.xtext.example.semcolor.Person#getGender <em>Gender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gender</em>' attribute.
   * @see org.xtext.example.semcolor.Gender
   * @see #getGender()
   * @generated
   */
  void setGender(Gender value);

} // Person
