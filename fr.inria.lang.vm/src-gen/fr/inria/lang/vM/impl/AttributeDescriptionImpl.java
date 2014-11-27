/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Abstract_ATT_ID;
import fr.inria.lang.vM.AttributeDescription;
import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.AttributeDescriptionImpl#getRefFeat <em>Ref Feat</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AttributeDescriptionImpl#getRefAtt <em>Ref Att</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AttributeDescriptionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDescriptionImpl extends MinimalEObjectImpl.Container implements AttributeDescription
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
   * The cached value of the '{@link #getRefAtt() <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefAtt()
   * @generated
   * @ordered
   */
  protected Abstract_ATT_ID refAtt;

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
  protected AttributeDescriptionImpl()
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
    return VMPackage.Literals.ATTRIBUTE_DESCRIPTION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.ATTRIBUTE_DESCRIPTION__REF_FEAT, oldRefFeat, refFeat));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATTRIBUTE_DESCRIPTION__REF_FEAT, oldRefFeat, refFeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstract_ATT_ID getRefAtt()
  {
    if (refAtt != null && refAtt.eIsProxy())
    {
      InternalEObject oldRefAtt = (InternalEObject)refAtt;
      refAtt = (Abstract_ATT_ID)eResolveProxy(oldRefAtt);
      if (refAtt != oldRefAtt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.ATTRIBUTE_DESCRIPTION__REF_ATT, oldRefAtt, refAtt));
      }
    }
    return refAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstract_ATT_ID basicGetRefAtt()
  {
    return refAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefAtt(Abstract_ATT_ID newRefAtt)
  {
    Abstract_ATT_ID oldRefAtt = refAtt;
    refAtt = newRefAtt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATTRIBUTE_DESCRIPTION__REF_ATT, oldRefAtt, refAtt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATTRIBUTE_DESCRIPTION__DESCRIPTION, oldDescription, description));
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
      case VMPackage.ATTRIBUTE_DESCRIPTION__REF_FEAT:
        if (resolve) return getRefFeat();
        return basicGetRefFeat();
      case VMPackage.ATTRIBUTE_DESCRIPTION__REF_ATT:
        if (resolve) return getRefAtt();
        return basicGetRefAtt();
      case VMPackage.ATTRIBUTE_DESCRIPTION__DESCRIPTION:
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
      case VMPackage.ATTRIBUTE_DESCRIPTION__REF_FEAT:
        setRefFeat((Feature)newValue);
        return;
      case VMPackage.ATTRIBUTE_DESCRIPTION__REF_ATT:
        setRefAtt((Abstract_ATT_ID)newValue);
        return;
      case VMPackage.ATTRIBUTE_DESCRIPTION__DESCRIPTION:
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
      case VMPackage.ATTRIBUTE_DESCRIPTION__REF_FEAT:
        setRefFeat((Feature)null);
        return;
      case VMPackage.ATTRIBUTE_DESCRIPTION__REF_ATT:
        setRefAtt((Abstract_ATT_ID)null);
        return;
      case VMPackage.ATTRIBUTE_DESCRIPTION__DESCRIPTION:
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
      case VMPackage.ATTRIBUTE_DESCRIPTION__REF_FEAT:
        return refFeat != null;
      case VMPackage.ATTRIBUTE_DESCRIPTION__REF_ATT:
        return refAtt != null;
      case VMPackage.ATTRIBUTE_DESCRIPTION__DESCRIPTION:
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

} //AttributeDescriptionImpl
