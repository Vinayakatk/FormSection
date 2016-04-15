/**
 */
package org.xtext.example.semcolor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.semcolor.SemcolorFactory
 * @model kind="package"
 * @generated
 */
public interface SemcolorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "semcolor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/Semcolor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "semcolor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SemcolorPackage eINSTANCE = org.xtext.example.semcolor.impl.SemcolorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.semcolor.impl.PersonsImpl <em>Persons</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.semcolor.impl.PersonsImpl
   * @see org.xtext.example.semcolor.impl.SemcolorPackageImpl#getPersons()
   * @generated
   */
  int PERSONS = 0;

  /**
   * The feature id for the '<em><b>Persons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONS__PERSONS = 0;

  /**
   * The number of structural features of the '<em>Persons</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.semcolor.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.semcolor.impl.PersonImpl
   * @see org.xtext.example.semcolor.impl.SemcolorPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Gender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__GENDER = 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.semcolor.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.semcolor.impl.NameImpl
   * @see org.xtext.example.semcolor.impl.SemcolorPackageImpl#getName_()
   * @generated
   */
  int NAME = 2;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__FIRST_NAME = 0;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__LAST_NAME = 1;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.semcolor.Gender <em>Gender</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.semcolor.Gender
   * @see org.xtext.example.semcolor.impl.SemcolorPackageImpl#getGender()
   * @generated
   */
  int GENDER = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.semcolor.Persons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persons</em>'.
   * @see org.xtext.example.semcolor.Persons
   * @generated
   */
  EClass getPersons();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.semcolor.Persons#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see org.xtext.example.semcolor.Persons#getPersons()
   * @see #getPersons()
   * @generated
   */
  EReference getPersons_Persons();

  /**
   * Returns the meta object for class '{@link org.xtext.example.semcolor.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see org.xtext.example.semcolor.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.semcolor.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.semcolor.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.semcolor.Person#getGender <em>Gender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gender</em>'.
   * @see org.xtext.example.semcolor.Person#getGender()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Gender();

  /**
   * Returns the meta object for class '{@link org.xtext.example.semcolor.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see org.xtext.example.semcolor.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.semcolor.Name#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see org.xtext.example.semcolor.Name#getFirstName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_FirstName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.semcolor.Name#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see org.xtext.example.semcolor.Name#getLastName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_LastName();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.semcolor.Gender <em>Gender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Gender</em>'.
   * @see org.xtext.example.semcolor.Gender
   * @generated
   */
  EEnum getGender();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SemcolorFactory getSemcolorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.semcolor.impl.PersonsImpl <em>Persons</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.semcolor.impl.PersonsImpl
     * @see org.xtext.example.semcolor.impl.SemcolorPackageImpl#getPersons()
     * @generated
     */
    EClass PERSONS = eINSTANCE.getPersons();

    /**
     * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSONS__PERSONS = eINSTANCE.getPersons_Persons();

    /**
     * The meta object literal for the '{@link org.xtext.example.semcolor.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.semcolor.impl.PersonImpl
     * @see org.xtext.example.semcolor.impl.SemcolorPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

    /**
     * The meta object literal for the '{@link org.xtext.example.semcolor.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.semcolor.impl.NameImpl
     * @see org.xtext.example.semcolor.impl.SemcolorPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__FIRST_NAME = eINSTANCE.getName_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__LAST_NAME = eINSTANCE.getName_LastName();

    /**
     * The meta object literal for the '{@link org.xtext.example.semcolor.Gender <em>Gender</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.semcolor.Gender
     * @see org.xtext.example.semcolor.impl.SemcolorPackageImpl#getGender()
     * @generated
     */
    EEnum GENDER = eINSTANCE.getGender();

  }

} //SemcolorPackage
