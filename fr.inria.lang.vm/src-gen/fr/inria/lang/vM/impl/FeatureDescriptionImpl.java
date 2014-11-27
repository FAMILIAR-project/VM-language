/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.FeatureDescription;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureDescriptionImpl#getRefFeat <em>Ref Feat</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.FeatureDescriptionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureDescriptionImpl extends MinimalEObjectImpl.Container implements FeatureDescription
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureDescriptionImpl()
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
    return VMPackage.Literals.FEATURE_DESCRIPTION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.FEATURE_DESCRIPTION__REF_FEAT, oldRefFeat, refFeat));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE_DESCRIPTION__REF_FEAT, oldRefFeat, refFeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.FEATURE_DESCRIPTION__DESCRIPTION, oldDescription, description));
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
      case VMPackage.FEATURE_DESCRIPTION__REF_FEAT:
        if (resolve) return getRefFeat();
        return basicGetRefFeat();
      case VMPackage.FEATURE_DESCRIPTION__DESCRIPTION:
        return getDescription();
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
      case VMPackage.FEATURE_DESCRIPTION__REF_FEAT:
        setRefFeat((Feature)newValue);
        return;
      case VMPackage.FEATURE_DESCRIPTION__DESCRIPTION:
        setDescription((String)newValue);
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
      case VMPackage.FEATURE_DESCRIPTION__REF_FEAT:
        setRefFeat((Feature)null);
        return;
      case VMPackage.FEATURE_DESCRIPTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case VMPackage.FEATURE_DESCRIPTION__REF_FEAT:
        return refFeat != null;
      case VMPackage.FEATURE_DESCRIPTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //FeatureDescriptionImpl
