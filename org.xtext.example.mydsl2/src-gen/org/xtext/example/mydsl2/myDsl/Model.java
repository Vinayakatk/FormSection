/**
 */
package org.xtext.example.mydsl2.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.Model#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.Model#getUses <em>Uses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.Model#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.myDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Defines</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.myDsl.Define}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defines</em>' containment reference list.
   * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getModel_Defines()
   * @model containment="true"
   * @generated
   */
  EList<Define> getDefines();

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.myDsl.Use}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference list.
   * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getModel_Uses()
   * @model containment="true"
   * @generated
   */
  EList<Use> getUses();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.myDsl.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getModel_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // Model
