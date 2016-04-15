/**
 */
package org.xtext.example.myStateMachines.myStateMachines;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.myStateMachines.myStateMachines.State#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.myStateMachines.myStateMachines.State#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.example.myStateMachines.myStateMachines.State#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link org.xtext.example.myStateMachines.myStateMachines.State#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.myStateMachines.myStateMachines.MyStateMachinesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.myStateMachines.myStateMachines.MyStateMachinesPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.myStateMachines.myStateMachines.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' attribute list.
   * @see org.xtext.example.myStateMachines.myStateMachines.MyStateMachinesPackage#getState_Actions()
   * @model unique="false"
   * @generated
   */
  EList<String> getActions();

  /**
   * Returns the value of the '<em><b>Refinement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refinement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refinement</em>' containment reference.
   * @see #setRefinement(Statemachine)
   * @see org.xtext.example.myStateMachines.myStateMachines.MyStateMachinesPackage#getState_Refinement()
   * @model containment="true"
   * @generated
   */
  Statemachine getRefinement();

  /**
   * Sets the value of the '{@link org.xtext.example.myStateMachines.myStateMachines.State#getRefinement <em>Refinement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refinement</em>' containment reference.
   * @see #getRefinement()
   * @generated
   */
  void setRefinement(Statemachine value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.myStateMachines.myStateMachines.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.xtext.example.myStateMachines.myStateMachines.MyStateMachinesPackage#getState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // State
