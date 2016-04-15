/**
 */
package org.xtext.example.myStateMachines.myStateMachines.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.myStateMachines.myStateMachines.MyStateMachinesPackage;
import org.xtext.example.myStateMachines.myStateMachines.State;
import org.xtext.example.myStateMachines.myStateMachines.Statemachine;
import org.xtext.example.myStateMachines.myStateMachines.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.myStateMachines.myStateMachines.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.myStateMachines.myStateMachines.impl.StateImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.example.myStateMachines.myStateMachines.impl.StateImpl#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link org.xtext.example.myStateMachines.myStateMachines.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<String> actions;

  /**
   * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinement()
   * @generated
   * @ordered
   */
  protected Statemachine refinement;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return MyStateMachinesPackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyStateMachinesPackage.STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getActions()
  {
    if (actions == null)
    {
      actions = new EDataTypeEList<String>(String.class, this, MyStateMachinesPackage.STATE__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statemachine getRefinement()
  {
    return refinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefinement(Statemachine newRefinement, NotificationChain msgs)
  {
    Statemachine oldRefinement = refinement;
    refinement = newRefinement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyStateMachinesPackage.STATE__REFINEMENT, oldRefinement, newRefinement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefinement(Statemachine newRefinement)
  {
    if (newRefinement != refinement)
    {
      NotificationChain msgs = null;
      if (refinement != null)
        msgs = ((InternalEObject)refinement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyStateMachinesPackage.STATE__REFINEMENT, null, msgs);
      if (newRefinement != null)
        msgs = ((InternalEObject)newRefinement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyStateMachinesPackage.STATE__REFINEMENT, null, msgs);
      msgs = basicSetRefinement(newRefinement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyStateMachinesPackage.STATE__REFINEMENT, newRefinement, newRefinement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, MyStateMachinesPackage.STATE__TRANSITIONS);
    }
    return transitions;
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
      case MyStateMachinesPackage.STATE__REFINEMENT:
        return basicSetRefinement(null, msgs);
      case MyStateMachinesPackage.STATE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
      case MyStateMachinesPackage.STATE__NAME:
        return getName();
      case MyStateMachinesPackage.STATE__ACTIONS:
        return getActions();
      case MyStateMachinesPackage.STATE__REFINEMENT:
        return getRefinement();
      case MyStateMachinesPackage.STATE__TRANSITIONS:
        return getTransitions();
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
      case MyStateMachinesPackage.STATE__NAME:
        setName((String)newValue);
        return;
      case MyStateMachinesPackage.STATE__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends String>)newValue);
        return;
      case MyStateMachinesPackage.STATE__REFINEMENT:
        setRefinement((Statemachine)newValue);
        return;
      case MyStateMachinesPackage.STATE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
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
      case MyStateMachinesPackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyStateMachinesPackage.STATE__ACTIONS:
        getActions().clear();
        return;
      case MyStateMachinesPackage.STATE__REFINEMENT:
        setRefinement((Statemachine)null);
        return;
      case MyStateMachinesPackage.STATE__TRANSITIONS:
        getTransitions().clear();
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
      case MyStateMachinesPackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyStateMachinesPackage.STATE__ACTIONS:
        return actions != null && !actions.isEmpty();
      case MyStateMachinesPackage.STATE__REFINEMENT:
        return refinement != null;
      case MyStateMachinesPackage.STATE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", actions: ");
    result.append(actions);
    result.append(')');
    return result.toString();
  }

} //StateImpl
