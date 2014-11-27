/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Objective;
import fr.inria.lang.vM.Objectives;
import fr.inria.lang.vM.VMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objectives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.ObjectivesImpl#getObjectives <em>Objectives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectivesImpl extends VmBlockImpl implements Objectives
{
  /**
   * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectives()
   * @generated
   * @ordered
   */
  protected EList<Objective> objectives;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectivesImpl()
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
    return VMPackage.Literals.OBJECTIVES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Objective> getObjectives()
  {
    if (objectives == null)
    {
      objectives = new EObjectContainmentEList<Objective>(Objective.class, this, VMPackage.OBJECTIVES__OBJECTIVES);
    }
    return objectives;
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
      case VMPackage.OBJECTIVES__OBJECTIVES:
        return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
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
      case VMPackage.OBJECTIVES__OBJECTIVES:
        return getObjectives();
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
      case VMPackage.OBJECTIVES__OBJECTIVES:
        getObjectives().clear();
        getObjectives().addAll((Collection<? extends Objective>)newValue);
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
      case VMPackage.OBJECTIVES__OBJECTIVES:
        getObjectives().clear();
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
      case VMPackage.OBJECTIVES__OBJECTIVES:
        return objectives != null && !objectives.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ObjectivesImpl
