/**
 */
package org.xtext.example.mydsl2.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl2.myDsl.Define;
import org.xtext.example.mydsl2.myDsl.Import;
import org.xtext.example.mydsl2.myDsl.Model;
import org.xtext.example.mydsl2.myDsl.MyDslPackage;
import org.xtext.example.mydsl2.myDsl.Operation;
import org.xtext.example.mydsl2.myDsl.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.impl.ModelImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.impl.ModelImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.impl.ModelImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefines()
   * @generated
   * @ordered
   */
  protected EList<Define> defines;

  /**
   * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUses()
   * @generated
   * @ordered
   */
  protected EList<Use> uses;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, MyDslPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Define> getDefines()
  {
    if (defines == null)
    {
      defines = new EObjectContainmentEList<Define>(Define.class, this, MyDslPackage.MODEL__DEFINES);
    }
    return defines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Use> getUses()
  {
    if (uses == null)
    {
      uses = new EObjectContainmentEList<Use>(Use.class, this, MyDslPackage.MODEL__USES);
    }
    return uses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<Operation>(Operation.class, this, MyDslPackage.MODEL__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__DEFINES:
        return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__USES:
        return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__IMPORTS:
        return getImports();
      case MyDslPackage.MODEL__DEFINES:
        return getDefines();
      case MyDslPackage.MODEL__USES:
        return getUses();
      case MyDslPackage.MODEL__OPERATIONS:
        return getOperations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case MyDslPackage.MODEL__DEFINES:
        getDefines().clear();
        getDefines().addAll((Collection<? extends Define>)newValue);
        return;
      case MyDslPackage.MODEL__USES:
        getUses().clear();
        getUses().addAll((Collection<? extends Use>)newValue);
        return;
      case MyDslPackage.MODEL__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case MyDslPackage.MODEL__DEFINES:
        getDefines().clear();
        return;
      case MyDslPackage.MODEL__USES:
        getUses().clear();
        return;
      case MyDslPackage.MODEL__OPERATIONS:
        getOperations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MyDslPackage.MODEL__DEFINES:
        return defines != null && !defines.isEmpty();
      case MyDslPackage.MODEL__USES:
        return uses != null && !uses.isEmpty();
      case MyDslPackage.MODEL__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
