/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Abstract_ATT_ID;
import fr.inria.lang.vM.AttHead;
import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.PrimitiveExpression;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.PrimitiveExpressionImpl#getFeatureID <em>Feature ID</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.PrimitiveExpressionImpl#getHead <em>Head</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.PrimitiveExpressionImpl#getRefAtt <em>Ref Att</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveExpressionImpl extends ExpressionImpl implements PrimitiveExpression
{
  /**
   * The cached value of the '{@link #getFeatureID() <em>Feature ID</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureID()
   * @generated
   * @ordered
   */
  protected Feature featureID;

  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected AttHead head;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveExpressionImpl()
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
    return VMPackage.Literals.PRIMITIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getFeatureID()
  {
    if (featureID != null && featureID.eIsProxy())
    {
      InternalEObject oldFeatureID = (InternalEObject)featureID;
      featureID = (Feature)eResolveProxy(oldFeatureID);
      if (featureID != oldFeatureID)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.PRIMITIVE_EXPRESSION__FEATURE_ID, oldFeatureID, featureID));
      }
    }
    return featureID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetFeatureID()
  {
    return featureID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureID(Feature newFeatureID)
  {
    Feature oldFeatureID = featureID;
    featureID = newFeatureID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.PRIMITIVE_EXPRESSION__FEATURE_ID, oldFeatureID, featureID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttHead getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(AttHead newHead, NotificationChain msgs)
  {
    AttHead oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.PRIMITIVE_EXPRESSION__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(AttHead newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.PRIMITIVE_EXPRESSION__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.PRIMITIVE_EXPRESSION__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.PRIMITIVE_EXPRESSION__HEAD, newHead, newHead));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.PRIMITIVE_EXPRESSION__REF_ATT, oldRefAtt, refAtt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.PRIMITIVE_EXPRESSION__REF_ATT, oldRefAtt, refAtt));
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
      case VMPackage.PRIMITIVE_EXPRESSION__HEAD:
        return basicSetHead(null, msgs);
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
      case VMPackage.PRIMITIVE_EXPRESSION__FEATURE_ID:
        if (resolve) return getFeatureID();
        return basicGetFeatureID();
      case VMPackage.PRIMITIVE_EXPRESSION__HEAD:
        return getHead();
      case VMPackage.PRIMITIVE_EXPRESSION__REF_ATT:
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
      case VMPackage.PRIMITIVE_EXPRESSION__FEATURE_ID:
        setFeatureID((Feature)newValue);
        return;
      case VMPackage.PRIMITIVE_EXPRESSION__HEAD:
        setHead((AttHead)newValue);
        return;
      case VMPackage.PRIMITIVE_EXPRESSION__REF_ATT:
        setRefAtt((Abstract_ATT_ID)newValue);
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
      case VMPackage.PRIMITIVE_EXPRESSION__FEATURE_ID:
        setFeatureID((Feature)null);
        return;
      case VMPackage.PRIMITIVE_EXPRESSION__HEAD:
        setHead((AttHead)null);
        return;
      case VMPackage.PRIMITIVE_EXPRESSION__REF_ATT:
        setRefAtt((Abstract_ATT_ID)null);
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
      case VMPackage.PRIMITIVE_EXPRESSION__FEATURE_ID:
        return this.featureID != null;
      case VMPackage.PRIMITIVE_EXPRESSION__HEAD:
        return head != null;
      case VMPackage.PRIMITIVE_EXPRESSION__REF_ATT:
        return refAtt != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimitiveExpressionImpl
