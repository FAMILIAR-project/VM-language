/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.RealAttrDefComplement;
import fr.inria.lang.vM.RealDeltaDef;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Attr Def Complement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.RealAttrDefComplementImpl#getMin <em>Min</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.RealAttrDefComplementImpl#getMax <em>Max</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.RealAttrDefComplementImpl#getDelta <em>Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealAttrDefComplementImpl extends MinimalEObjectImpl.Container implements RealAttrDefComplement
{
  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final String MIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected String min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final String MAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected String max = MAX_EDEFAULT;

  /**
   * The cached value of the '{@link #getDelta() <em>Delta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta()
   * @generated
   * @ordered
   */
  protected RealDeltaDef delta;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealAttrDefComplementImpl()
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
    return VMPackage.Literals.REAL_ATTR_DEF_COMPLEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(String newMin)
  {
    String oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.REAL_ATTR_DEF_COMPLEMENT__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(String newMax)
  {
    String oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.REAL_ATTR_DEF_COMPLEMENT__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealDeltaDef getDelta()
  {
    return delta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelta(RealDeltaDef newDelta, NotificationChain msgs)
  {
    RealDeltaDef oldDelta = delta;
    delta = newDelta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA, oldDelta, newDelta);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelta(RealDeltaDef newDelta)
  {
    if (newDelta != delta)
    {
      NotificationChain msgs = null;
      if (delta != null)
        msgs = ((InternalEObject)delta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA, null, msgs);
      if (newDelta != null)
        msgs = ((InternalEObject)newDelta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA, null, msgs);
      msgs = basicSetDelta(newDelta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA, newDelta, newDelta));
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
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA:
        return basicSetDelta(null, msgs);
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
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__MIN:
        return getMin();
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__MAX:
        return getMax();
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA:
        return getDelta();
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
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__MIN:
        setMin((String)newValue);
        return;
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__MAX:
        setMax((String)newValue);
        return;
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA:
        setDelta((RealDeltaDef)newValue);
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
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA:
        setDelta((RealDeltaDef)null);
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
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT__DELTA:
        return delta != null;
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
    result.append(" (min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(')');
    return result.toString();
  }

} //RealAttrDefComplementImpl
