/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.SpecialExpression;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.SpecialExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.SpecialExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecialExpressionImpl extends ExpressionImpl implements SpecialExpression
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Feature expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecialExpressionImpl()
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
    return VMPackage.Literals.SPECIAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.SPECIAL_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getExpression()
  {
    if (expression != null && expression.eIsProxy())
    {
      InternalEObject oldExpression = (InternalEObject)expression;
      expression = (Feature)eResolveProxy(oldExpression);
      if (expression != oldExpression)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VMPackage.SPECIAL_EXPRESSION__EXPRESSION, oldExpression, expression));
      }
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Feature newExpression)
  {
    Feature oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.SPECIAL_EXPRESSION__EXPRESSION, oldExpression, expression));
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
      case VMPackage.SPECIAL_EXPRESSION__OP:
        return getOp();
      case VMPackage.SPECIAL_EXPRESSION__EXPRESSION:
        if (resolve) return getExpression();
        return basicGetExpression();
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
      case VMPackage.SPECIAL_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case VMPackage.SPECIAL_EXPRESSION__EXPRESSION:
        setExpression((Feature)newValue);
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
      case VMPackage.SPECIAL_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case VMPackage.SPECIAL_EXPRESSION__EXPRESSION:
        setExpression((Feature)null);
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
      case VMPackage.SPECIAL_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case VMPackage.SPECIAL_EXPRESSION__EXPRESSION:
        return expression != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //SpecialExpressionImpl
