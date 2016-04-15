/**
 */
package org.eclipse.xtext.tutorial.survey.survey;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow Up</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getFollowUp()
 * @model
 * @generated
 */
public interface FollowUp extends EObject
{
  /**
   * Returns the value of the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' reference.
   * @see #setNext(Survey)
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getFollowUp_Next()
   * @model
   * @generated
   */
  Survey getNext();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp#getNext <em>Next</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Survey value);

} // FollowUp
