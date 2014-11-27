/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.BooleanExpression;
import fr.inria.lang.vM.BooleanExpression_List;
import fr.inria.lang.vM.VMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expression List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.BooleanExpression_ListImpl#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanExpression_ListImpl extends MinimalEObjectImpl.Container implements BooleanExpression_List
{
  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected EList<BooleanExpression> ex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanExpression_ListImpl()
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
    return VMPackage.Literals.BOOLEAN_EXPRESSION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BooleanExpression> getEx()
  {
    if (ex == null)
    {
      ex = new EObjectContainmentEList<BooleanExpression>(BooleanExpression.class, this, VMPackage.BOOLEAN_EXPRESSION_LIST__EX);
    }
    return ex;
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
      case VMPackage.BOOLEAN_EXPRESSION_LIST__EX:
        return ((InternalEList<?>)getEx()).basicRemove(otherEnd, msgs);
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
      case VMPackage.BOOLEAN_EXPRESSION_LIST__EX:
        return getEx();
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
      case VMPackage.BOOLEAN_EXPRESSION_LIST__EX:
        getEx().clear();
        getEx().addAll((Collection<? extends BooleanExpression>)newValue);
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
      case VMPackage.BOOLEAN_EXPRESSION_LIST__EX:
        getEx().clear();
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
      case VMPackage.BOOLEAN_EXPRESSION_LIST__EX:
        return ex != null && !ex.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BooleanExpression_ListImpl
