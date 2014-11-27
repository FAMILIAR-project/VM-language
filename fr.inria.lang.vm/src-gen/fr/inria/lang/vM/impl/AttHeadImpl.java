/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.AttHead;
import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Att Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.AttHeadImpl#isForAllFeatures <em>For All Features</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AttHeadImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttHeadImpl extends MinimalEObjectImpl.Container implements AttHead
{
  /**
   * The default value of the '{@link #isForAllFeatures() <em>For All Features</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForAllFeatures()
   * @generated
   * @ordered
   */
  protected static final boolean FOR_ALL_FEATURES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForAllFeatures() <em>For All Features</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForAllFeatures()
   * @generated
   * @ordered
   */
  protected boolean forAllFeatures = FOR_ALL_FEATURES_EDEFAULT;

  /**
   * The cached value of the '{@link #getOwnedFeature() <em>Owned Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedFeature()
   * @generated
   * @ordered
   */
  protected Feature ownedFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttHeadImpl()
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
    return VMPackage.Literals.ATT_HEAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForAllFeatures()
  {
    return forAllFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForAllFeatures(boolean newForAllFeatures)
  {
    boolean oldForAllFeatures = forAllFeatures;
    forAllFeatures = newForAllFeatures;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATT_HEAD__FOR_ALL_FEATURES, oldForAllFeatures, forAllFeatures));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getOwnedFeature()
  {
    if (ownedFeature != null && ownedFeature.eIsProxy())
    {
      InternalEObject oldOwnedFeature = (InternalEObject)ownedFeature;
      ownedFeature = (Feature)eResolveProxy(oldOwnedFeature);
      if (ownedFeature != oldOwnedFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.ATT_HEAD__OWNED_FEATURE, oldOwnedFeature, ownedFeature));
      }
    }
    return ownedFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetOwnedFeature()
  {
    return ownedFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedFeature(Feature newOwnedFeature)
  {
    Feature oldOwnedFeature = ownedFeature;
    ownedFeature = newOwnedFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATT_HEAD__OWNED_FEATURE, oldOwnedFeature, ownedFeature));
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
      case VMPackage.ATT_HEAD__FOR_ALL_FEATURES:
        return isForAllFeatures();
      case VMPackage.ATT_HEAD__OWNED_FEATURE:
        if (resolve) return getOwnedFeature();
        return basicGetOwnedFeature();
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
      case VMPackage.ATT_HEAD__FOR_ALL_FEATURES:
        setForAllFeatures((Boolean)newValue);
        return;
      case VMPackage.ATT_HEAD__OWNED_FEATURE:
        setOwnedFeature((Feature)newValue);
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
      case VMPackage.ATT_HEAD__FOR_ALL_FEATURES:
        setForAllFeatures(FOR_ALL_FEATURES_EDEFAULT);
        return;
      case VMPackage.ATT_HEAD__OWNED_FEATURE:
        setOwnedFeature((Feature)null);
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
      case VMPackage.ATT_HEAD__FOR_ALL_FEATURES:
        return forAllFeatures != FOR_ALL_FEATURES_EDEFAULT;
      case VMPackage.ATT_HEAD__OWNED_FEATURE:
        return ownedFeature != null;
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
    result.append(" (forAllFeatures: ");
    result.append(forAllFeatures);
    result.append(')');
    return result.toString();
  }

} //AttHeadImpl
