/**
 */
package org.eclipse.emf.examples.extlibrary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.examples.extlibrary.Connection#getTar <em>Tar</em>}</li>
 *   <li>{@link org.eclipse.emf.examples.extlibrary.Connection#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.examples.extlibrary.EXTLibraryPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Tar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tar</em>' reference.
	 * @see #setTar(Book)
	 * @see org.eclipse.emf.examples.extlibrary.EXTLibraryPackage#getConnection_Tar()
	 * @model
	 * @generated
	 */
	Book getTar();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.examples.extlibrary.Connection#getTar <em>Tar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tar</em>' reference.
	 * @see #getTar()
	 * @generated
	 */
	void setTar(Book value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Book)
	 * @see org.eclipse.emf.examples.extlibrary.EXTLibraryPackage#getConnection_Src()
	 * @model
	 * @generated
	 */
	Book getSrc();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.examples.extlibrary.Connection#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Book value);

} // Connection
