/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.ComplexExpression;
import fr.inria.lang.vM.LeftImplication;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.LeftImplicationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.LeftImplicationImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftImplicationImpl extends ComplexExpressionImpl implements LeftImplication
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected ComplexExpression left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected ComplexExpression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftImplicationImpl()
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
    return VMPackage.Literals.LEFT_IMPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(ComplexExpression newLeft, NotificationChain msgs)
  {
    ComplexExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.LEFT_IMPLICATION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(ComplexExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.LEFT_IMPLICATION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.LEFT_IMPLICATION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.LEFT_IMPLICATION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(ComplexExpression newRight, NotificationChain msgs)
  {
    ComplexExpression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.LEFT_IMPLICATION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(ComplexExpression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.LEFT_IMPLICATION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.LEFT_IMPLICATION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.LEFT_IMPLICATION__RIGHT, newRight, newRight));
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
      case VMPackage.LEFT_IMPLICATION__LEFT:
        return basicSetLeft(null, msgs);
      case VMPackage.LEFT_IMPLICATION__RIGHT:
        return basicSetRight(null, msgs);
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
      case VMPackage.LEFT_IMPLICATION__LEFT:
        return getLeft();
      case VMPackage.LEFT_IMPLICATION__RIGHT:
        return getRight();
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
      case VMPackage.LEFT_IMPLICATION__LEFT:
        setLeft((ComplexExpression)newValue);
        return;
      case VMPackage.LEFT_IMPLICATION__RIGHT:
        setRight((ComplexExpression)newValue);
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
      case VMPackage.LEFT_IMPLICATION__LEFT:
        setLeft((ComplexExpression)null);
        return;
      case VMPackage.LEFT_IMPLICATION__RIGHT:
        setRight((ComplexExpression)null);
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
      case VMPackage.LEFT_IMPLICATION__LEFT:
        return left != null;
      case VMPackage.LEFT_IMPLICATION__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //LeftImplicationImpl
