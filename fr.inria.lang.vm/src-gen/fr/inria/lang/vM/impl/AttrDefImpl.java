/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.AttrDef;
import fr.inria.lang.vM.BasicAttrDef;
import fr.inria.lang.vM.EnumAttrDef;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attr Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.AttrDefImpl#isNotTranslatable <em>Not Translatable</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AttrDefImpl#isRunTime <em>Run Time</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AttrDefImpl#isNotDecidable <em>Not Decidable</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AttrDefImpl#getBasicAttrDef <em>Basic Attr Def</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.AttrDefImpl#getEnumAttrDef <em>Enum Attr Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttrDefImpl extends MinimalEObjectImpl.Container implements AttrDef
{
  /**
   * The default value of the '{@link #isNotTranslatable() <em>Not Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotTranslatable()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_TRANSLATABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotTranslatable() <em>Not Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotTranslatable()
   * @generated
   * @ordered
   */
  protected boolean notTranslatable = NOT_TRANSLATABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isRunTime() <em>Run Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRunTime()
   * @generated
   * @ordered
   */
  protected static final boolean RUN_TIME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRunTime() <em>Run Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRunTime()
   * @generated
   * @ordered
   */
  protected boolean runTime = RUN_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #isNotDecidable() <em>Not Decidable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotDecidable()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_DECIDABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotDecidable() <em>Not Decidable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotDecidable()
   * @generated
   * @ordered
   */
  protected boolean notDecidable = NOT_DECIDABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBasicAttrDef() <em>Basic Attr Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicAttrDef()
   * @generated
   * @ordered
   */
  protected BasicAttrDef basicAttrDef;

  /**
   * The cached value of the '{@link #getEnumAttrDef() <em>Enum Attr Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumAttrDef()
   * @generated
   * @ordered
   */
  protected EnumAttrDef enumAttrDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttrDefImpl()
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
    return VMPackage.Literals.ATTR_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotTranslatable()
  {
    return notTranslatable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotTranslatable(boolean newNotTranslatable)
  {
    boolean oldNotTranslatable = notTranslatable;
    notTranslatable = newNotTranslatable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATTR_DEF__NOT_TRANSLATABLE, oldNotTranslatable, notTranslatable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRunTime()
  {
    return runTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunTime(boolean newRunTime)
  {
    boolean oldRunTime = runTime;
    runTime = newRunTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATTR_DEF__RUN_TIME, oldRunTime, runTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotDecidable()
  {
    return notDecidable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotDecidable(boolean newNotDecidable)
  {
    boolean oldNotDecidable = notDecidable;
    notDecidable = newNotDecidable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATTR_DEF__NOT_DECIDABLE, oldNotDecidable, notDecidable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicAttrDef getBasicAttrDef()
  {
    return basicAttrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicAttrDef(BasicAttrDef newBasicAttrDef, NotificationChain msgs)
  {
    BasicAttrDef oldBasicAttrDef = basicAttrDef;
    basicAttrDef = newBasicAttrDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.ATTR_DEF__BASIC_ATTR_DEF, oldBasicAttrDef, newBasicAttrDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicAttrDef(BasicAttrDef newBasicAttrDef)
  {
    if (newBasicAttrDef != basicAttrDef)
    {
      NotificationChain msgs = null;
      if (basicAttrDef != null)
        msgs = ((InternalEObject)basicAttrDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.ATTR_DEF__BASIC_ATTR_DEF, null, msgs);
      if (newBasicAttrDef != null)
        msgs = ((InternalEObject)newBasicAttrDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.ATTR_DEF__BASIC_ATTR_DEF, null, msgs);
      msgs = basicSetBasicAttrDef(newBasicAttrDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATTR_DEF__BASIC_ATTR_DEF, newBasicAttrDef, newBasicAttrDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumAttrDef getEnumAttrDef()
  {
    return enumAttrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumAttrDef(EnumAttrDef newEnumAttrDef, NotificationChain msgs)
  {
    EnumAttrDef oldEnumAttrDef = enumAttrDef;
    enumAttrDef = newEnumAttrDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.ATTR_DEF__ENUM_ATTR_DEF, oldEnumAttrDef, newEnumAttrDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumAttrDef(EnumAttrDef newEnumAttrDef)
  {
    if (newEnumAttrDef != enumAttrDef)
    {
      NotificationChain msgs = null;
      if (enumAttrDef != null)
        msgs = ((InternalEObject)enumAttrDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.ATTR_DEF__ENUM_ATTR_DEF, null, msgs);
      if (newEnumAttrDef != null)
        msgs = ((InternalEObject)newEnumAttrDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.ATTR_DEF__ENUM_ATTR_DEF, null, msgs);
      msgs = basicSetEnumAttrDef(newEnumAttrDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ATTR_DEF__ENUM_ATTR_DEF, newEnumAttrDef, newEnumAttrDef));
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
      case VMPackage.ATTR_DEF__BASIC_ATTR_DEF:
        return basicSetBasicAttrDef(null, msgs);
      case VMPackage.ATTR_DEF__ENUM_ATTR_DEF:
        return basicSetEnumAttrDef(null, msgs);
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
      case VMPackage.ATTR_DEF__NOT_TRANSLATABLE:
        return isNotTranslatable();
      case VMPackage.ATTR_DEF__RUN_TIME:
        return isRunTime();
      case VMPackage.ATTR_DEF__NOT_DECIDABLE:
        return isNotDecidable();
      case VMPackage.ATTR_DEF__BASIC_ATTR_DEF:
        return getBasicAttrDef();
      case VMPackage.ATTR_DEF__ENUM_ATTR_DEF:
        return getEnumAttrDef();
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
      case VMPackage.ATTR_DEF__NOT_TRANSLATABLE:
        setNotTranslatable((Boolean)newValue);
        return;
      case VMPackage.ATTR_DEF__RUN_TIME:
        setRunTime((Boolean)newValue);
        return;
      case VMPackage.ATTR_DEF__NOT_DECIDABLE:
        setNotDecidable((Boolean)newValue);
        return;
      case VMPackage.ATTR_DEF__BASIC_ATTR_DEF:
        setBasicAttrDef((BasicAttrDef)newValue);
        return;
      case VMPackage.ATTR_DEF__ENUM_ATTR_DEF:
        setEnumAttrDef((EnumAttrDef)newValue);
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
      case VMPackage.ATTR_DEF__NOT_TRANSLATABLE:
        setNotTranslatable(NOT_TRANSLATABLE_EDEFAULT);
        return;
      case VMPackage.ATTR_DEF__RUN_TIME:
        setRunTime(RUN_TIME_EDEFAULT);
        return;
      case VMPackage.ATTR_DEF__NOT_DECIDABLE:
        setNotDecidable(NOT_DECIDABLE_EDEFAULT);
        return;
      case VMPackage.ATTR_DEF__BASIC_ATTR_DEF:
        setBasicAttrDef((BasicAttrDef)null);
        return;
      case VMPackage.ATTR_DEF__ENUM_ATTR_DEF:
        setEnumAttrDef((EnumAttrDef)null);
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
      case VMPackage.ATTR_DEF__NOT_TRANSLATABLE:
        return notTranslatable != NOT_TRANSLATABLE_EDEFAULT;
      case VMPackage.ATTR_DEF__RUN_TIME:
        return runTime != RUN_TIME_EDEFAULT;
      case VMPackage.ATTR_DEF__NOT_DECIDABLE:
        return notDecidable != NOT_DECIDABLE_EDEFAULT;
      case VMPackage.ATTR_DEF__BASIC_ATTR_DEF:
        return basicAttrDef != null;
      case VMPackage.ATTR_DEF__ENUM_ATTR_DEF:
        return enumAttrDef != null;
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
    result.append(" (notTranslatable: ");
    result.append(notTranslatable);
    result.append(", runTime: ");
    result.append(runTime);
    result.append(", notDecidable: ");
    result.append(notDecidable);
    result.append(')');
    return result.toString();
  }

} //AttrDefImpl
