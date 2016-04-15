/**
 */
package org.xtext.example.semcolor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.semcolor.Name#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.xtext.example.semcolor.Name#getLastName <em>Last Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.semcolor.SemcolorPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends EObject
{
  /**
   * Returns the value of the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Name</em>' attribute.
   * @see #setFirstName(String)
   * @see org.xtext.example.semcolor.SemcolorPackage#getName_FirstName()
   * @model
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link org.xtext.example.semcolor.Name#getFirstName <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Name</em>' attribute.
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(String value);

  /**
   * Returns the value of the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Name</em>' attribute.
   * @see #setLastName(String)
   * @see org.xtext.example.semcolor.SemcolorPackage#getName_LastName()
   * @model
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link org.xtext.example.semcolor.Name#getLastName <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Name</em>' attribute.
   * @see #getLastName()
   * @generated
   */
  void setLastName(String value);

} // Name
