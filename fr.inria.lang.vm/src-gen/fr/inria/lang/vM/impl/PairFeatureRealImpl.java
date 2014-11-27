/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.PairFeatureReal;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pair Feature Real</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.PairFeatureRealImpl#getRefFeat <em>Ref Feat</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.PairFeatureRealImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PairFeatureRealImpl extends MinimalEObjectImpl.Container implements PairFeatureReal
{
  /**
   * The cached value of the '{@link #getRefFeat() <em>Ref Feat</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefFeat()
   * @generated
   * @ordered
   */
  protected Feature refFeat;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PairFeatureRealImpl()
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
    return VMPackage.Literals.PAIR_FEATURE_REAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getRefFeat()
  {
    if (refFeat != null && refFeat.eIsProxy())
    {
      InternalEObject oldRefFeat = (InternalEObject)refFeat;
      refFeat = (Feature)eResolveProxy(oldRefFeat);
      if (refFeat != oldRefFeat)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.PAIR_FEATURE_REAL__REF_FEAT, oldRefFeat, refFeat));
      }
    }
    return refFeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetRefFeat()
  {
    return refFeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefFeat(Feature newRefFeat)
  {
    Feature oldRefFeat = refFeat;
    refFeat = newRefFeat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.PAIR_FEATURE_REAL__REF_FEAT, oldRefFeat, refFeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.PAIR_FEATURE_REAL__VALUE, oldValue, value));
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
      case VMPackage.PAIR_FEATURE_REAL__REF_FEAT:
        if (resolve) return getRefFeat();
        return basicGetRefFeat();
      case VMPackage.PAIR_FEATURE_REAL__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VMPackage.PAIR_FEATURE_REAL__REF_FEAT:
        setRefFeat((Feature)newValue);
        return;
      case VMPackage.PAIR_FEATURE_REAL__VALUE:
        setValue((String)newValue);
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
      case VMPackage.PAIR_FEATURE_REAL__REF_FEAT:
        setRefFeat((Feature)null);
        return;
      case VMPackage.PAIR_FEATURE_REAL__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case VMPackage.PAIR_FEATURE_REAL__REF_FEAT:
        return refFeat != null;
      case VMPackage.PAIR_FEATURE_REAL__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //PairFeatureRealImpl
