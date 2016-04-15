/**
 */
package org.xtext.example.mydsl2.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.Use#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getUse()
 * @model
 * @generated
 */
public interface Use extends EObject
{
  /**
   * Returns the value of the '<em><b>Use</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use</em>' reference.
   * @see #setUse(Define)
   * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getUse_Use()
   * @model
   * @generated
   */
  Define getUse();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.myDsl.Use#getUse <em>Use</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use</em>' reference.
   * @see #getUse()
   * @generated
   */
  void setUse(Define value);

} // Use
