/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.PairAttributeValue;
import fr.inria.lang.vM.TableBasedValuationByFeature;
import fr.inria.lang.vM.VMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Based Valuation By Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureImpl#getRefFeature <em>Ref Feature</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureImpl#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableBasedValuationByFeatureImpl extends MinimalEObjectImpl.Container implements TableBasedValuationByFeature
{
  /**
   * The cached value of the '{@link #getRefFeature() <em>Ref Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefFeature()
   * @generated
   * @ordered
   */
  protected Feature refFeature;

  /**
   * The cached value of the '{@link #getPairs() <em>Pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPairs()
   * @generated
   * @ordered
   */
  protected EList<PairAttributeValue> pairs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableBasedValuationByFeatureImpl()
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
    return VMPackage.Literals.TABLE_BASED_VALUATION_BY_FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getRefFeature()
  {
    if (refFeature != null && refFeature.eIsProxy())
    {
      InternalEObject oldRefFeature = (InternalEObject)refFeature;
      refFeature = (Feature)eResolveProxy(oldRefFeature);
      if (refFeature != oldRefFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE, oldRefFeature, refFeature));
      }
    }
    return refFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetRefFeature()
  {
    return refFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefFeature(Feature newRefFeature)
  {
    Feature oldRefFeature = refFeature;
    refFeature = newRefFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE, oldRefFeature, refFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PairAttributeValue> getPairs()
  {
    if (pairs == null)
    {
      pairs = new EObjectContainmentEList<PairAttributeValue>(PairAttributeValue.class, this, VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__PAIRS);
    }
    return pairs;
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__PAIRS:
        return ((InternalEList<?>)getPairs()).basicRemove(otherEnd, msgs);
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE:
        if (resolve) return getRefFeature();
        return basicGetRefFeature();
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__PAIRS:
        return getPairs();
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE:
        setRefFeature((Feature)newValue);
        return;
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__PAIRS:
        getPairs().clear();
        getPairs().addAll((Collection<? extends PairAttributeValue>)newValue);
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE:
        setRefFeature((Feature)null);
        return;
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__PAIRS:
        getPairs().clear();
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE:
        return refFeature != null;
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE__PAIRS:
        return pairs != null && !pairs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TableBasedValuationByFeatureImpl
