/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.PairAttributeValue;
import fr.inria.lang.vM.TableBasedValuationByFeatureAndClone;
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
 * An implementation of the model object '<em><b>Table Based Valuation By Feature And Clone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureAndCloneImpl#getRefFeature <em>Ref Feature</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureAndCloneImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureAndCloneImpl#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableBasedValuationByFeatureAndCloneImpl extends MinimalEObjectImpl.Container implements TableBasedValuationByFeatureAndClone
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
  protected TableBasedValuationByFeatureAndCloneImpl()
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
    return VMPackage.Literals.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE, oldRefFeature, refFeature));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE, oldRefFeature, refFeature));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__NAME, oldName, name));
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
      pairs = new EObjectContainmentEList<PairAttributeValue>(PairAttributeValue.class, this, VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS);
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS:
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE:
        if (resolve) return getRefFeature();
        return basicGetRefFeature();
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__NAME:
        return getName();
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS:
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE:
        setRefFeature((Feature)newValue);
        return;
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__NAME:
        setName((String)newValue);
        return;
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS:
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE:
        setRefFeature((Feature)null);
        return;
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS:
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
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE:
        return refFeature != null;
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS:
        return pairs != null && !pairs.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //TableBasedValuationByFeatureAndCloneImpl
