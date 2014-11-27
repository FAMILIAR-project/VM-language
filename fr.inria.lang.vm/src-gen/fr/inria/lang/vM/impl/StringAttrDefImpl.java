/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.StringAttrDef;
import fr.inria.lang.vM.StringDefaultDef;
import fr.inria.lang.vM.String_ATT_ID;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Attr Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.StringAttrDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.StringAttrDefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.StringAttrDefImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringAttrDefImpl extends BasicAttrDefImpl implements StringAttrDef
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String_ATT_ID name;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected StringDefaultDef default_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringAttrDefImpl()
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
    return VMPackage.Literals.STRING_ATTR_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String_ATT_ID getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(String_ATT_ID newName, NotificationChain msgs)
  {
    String_ATT_ID oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.STRING_ATTR_DEF__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String_ATT_ID newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.STRING_ATTR_DEF__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.STRING_ATTR_DEF__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.STRING_ATTR_DEF__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.STRING_ATTR_DEF__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringDefaultDef getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(StringDefaultDef newDefault, NotificationChain msgs)
  {
    StringDefaultDef oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.STRING_ATTR_DEF__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(StringDefaultDef newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.STRING_ATTR_DEF__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.STRING_ATTR_DEF__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.STRING_ATTR_DEF__DEFAULT, newDefault, newDefault));
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
      case VMPackage.STRING_ATTR_DEF__NAME:
        return basicSetName(null, msgs);
      case VMPackage.STRING_ATTR_DEF__DEFAULT:
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
      case VMPackage.STRING_ATTR_DEF__NAME:
        return getName();
      case VMPackage.STRING_ATTR_DEF__VALUE:
        return getValue();
      case VMPackage.STRING_ATTR_DEF__DEFAULT:
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
      case VMPackage.STRING_ATTR_DEF__NAME:
        setName((String_ATT_ID)newValue);
        return;
      case VMPackage.STRING_ATTR_DEF__VALUE:
        setValue((String)newValue);
        return;
      case VMPackage.STRING_ATTR_DEF__DEFAULT:
        setDefault((StringDefaultDef)newValue);
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
      case VMPackage.STRING_ATTR_DEF__NAME:
        setName((String_ATT_ID)null);
        return;
      case VMPackage.STRING_ATTR_DEF__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case VMPackage.STRING_ATTR_DEF__DEFAULT:
        setDefault((StringDefaultDef)null);
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
      case VMPackage.STRING_ATTR_DEF__NAME:
        return name != null;
      case VMPackage.STRING_ATTR_DEF__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case VMPackage.STRING_ATTR_DEF__DEFAULT:
        return default_ != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //StringAttrDefImpl
