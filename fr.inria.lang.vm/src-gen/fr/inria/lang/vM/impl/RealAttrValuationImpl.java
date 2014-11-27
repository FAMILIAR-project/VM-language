/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.RealAttrValuation;
import fr.inria.lang.vM.Real_ATT_ID;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Attr Valuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.RealAttrValuationImpl#getRefAtt <em>Ref Att</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealAttrValuationImpl extends BasicAttrValuationImpl implements RealAttrValuation
{
  /**
   * The cached value of the '{@link #getRefAtt() <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefAtt()
   * @generated
   * @ordered
   */
  protected Real_ATT_ID refAtt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealAttrValuationImpl()
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
    return VMPackage.Literals.REAL_ATTR_VALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Real_ATT_ID getRefAtt()
  {
    if (refAtt != null && refAtt.eIsProxy())
    {
      InternalEObject oldRefAtt = (InternalEObject)refAtt;
      refAtt = (Real_ATT_ID)eResolveProxy(oldRefAtt);
      if (refAtt != oldRefAtt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.REAL_ATTR_VALUATION__REF_ATT, oldRefAtt, refAtt));
      }
    }
    return refAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Real_ATT_ID basicGetRefAtt()
  {
    return refAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefAtt(Real_ATT_ID newRefAtt)
  {
    Real_ATT_ID oldRefAtt = refAtt;
    refAtt = newRefAtt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.REAL_ATTR_VALUATION__REF_ATT, oldRefAtt, refAtt));
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
      case VMPackage.REAL_ATTR_VALUATION__REF_ATT:
        if (resolve) return getRefAtt();
        return basicGetRefAtt();
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
      case VMPackage.REAL_ATTR_VALUATION__REF_ATT:
        setRefAtt((Real_ATT_ID)newValue);
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
      case VMPackage.REAL_ATTR_VALUATION__REF_ATT:
        setRefAtt((Real_ATT_ID)null);
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
      case VMPackage.REAL_ATTR_VALUATION__REF_ATT:
        return refAtt != null;
    }
    return super.eIsSet(featureID);
  }

} //RealAttrValuationImpl
