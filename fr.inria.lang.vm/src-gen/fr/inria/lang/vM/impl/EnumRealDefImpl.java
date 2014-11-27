/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.EnumRealDef;
import fr.inria.lang.vM.Enum_Real_ATT_ID;
import fr.inria.lang.vM.RealDefaultDef;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Real Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.EnumRealDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.EnumRealDefImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumRealDefImpl extends EnumAttrDefImpl implements EnumRealDef
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Enum_Real_ATT_ID name;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected RealDefaultDef default_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumRealDefImpl()
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
    return VMPackage.Literals.ENUM_REAL_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enum_Real_ATT_ID getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Enum_Real_ATT_ID newName, NotificationChain msgs)
  {
    Enum_Real_ATT_ID oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.ENUM_REAL_DEF__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Enum_Real_ATT_ID newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.ENUM_REAL_DEF__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.ENUM_REAL_DEF__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ENUM_REAL_DEF__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealDefaultDef getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(RealDefaultDef newDefault, NotificationChain msgs)
  {
    RealDefaultDef oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.ENUM_REAL_DEF__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(RealDefaultDef newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.ENUM_REAL_DEF__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.ENUM_REAL_DEF__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.ENUM_REAL_DEF__DEFAULT, newDefault, newDefault));
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
      case VMPackage.ENUM_REAL_DEF__NAME:
        return basicSetName(null, msgs);
      case VMPackage.ENUM_REAL_DEF__DEFAULT:
        return basicSetDefault(null, msgs);
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
      case VMPackage.ENUM_REAL_DEF__NAME:
        return getName();
      case VMPackage.ENUM_REAL_DEF__DEFAULT:
        return getDefault();
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
      case VMPackage.ENUM_REAL_DEF__NAME:
        setName((Enum_Real_ATT_ID)newValue);
        return;
      case VMPackage.ENUM_REAL_DEF__DEFAULT:
        setDefault((RealDefaultDef)newValue);
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
      case VMPackage.ENUM_REAL_DEF__NAME:
        setName((Enum_Real_ATT_ID)null);
        return;
      case VMPackage.ENUM_REAL_DEF__DEFAULT:
        setDefault((RealDefaultDef)null);
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
      case VMPackage.ENUM_REAL_DEF__NAME:
        return name != null;
      case VMPackage.ENUM_REAL_DEF__DEFAULT:
        return default_ != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumRealDefImpl
