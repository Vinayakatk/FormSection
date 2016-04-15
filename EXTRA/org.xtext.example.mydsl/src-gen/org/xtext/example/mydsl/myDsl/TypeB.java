/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeB#getFullname <em>Fullname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeB()
 * @model
 * @generated
 */
public interface TypeB extends TypeA
{
  /**
   * Returns the value of the '<em><b>Fullname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fullname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fullname</em>' attribute.
   * @see #setFullname(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeB_Fullname()
   * @model
   * @generated
   */
  String getFullname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.TypeB#getFullname <em>Fullname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fullname</em>' attribute.
   * @see #getFullname()
   * @generated
   */
  void setFullname(String value);

} // TypeB
