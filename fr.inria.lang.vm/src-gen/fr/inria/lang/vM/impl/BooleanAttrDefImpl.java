/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.BoolDefaultDef;
import fr.inria.lang.vM.BooleanAttrDef;
import fr.inria.lang.vM.Boolean_ATT_ID;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Attr Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.BooleanAttrDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.BooleanAttrDefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.BooleanAttrDefImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanAttrDefImpl extends BasicAttrDefImpl implements BooleanAttrDef
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Boolean_ATT_ID name;

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
  protected BoolDefaultDef default_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanAttrDefImpl()
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
    return VMPackage.Literals.BOOLEAN_ATTR_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean_ATT_ID getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Boolean_ATT_ID newName, NotificationChain msgs)
  {
    Boolean_ATT_ID oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.BOOLEAN_ATTR_DEF__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Boolean_ATT_ID newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.BOOLEAN_ATTR_DEF__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.BOOLEAN_ATTR_DEF__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.BOOLEAN_ATTR_DEF__NAME, newName, newName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.BOOLEAN_ATTR_DEF__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolDefaultDef getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(BoolDefaultDef newDefault, NotificationChain msgs)
  {
    BoolDefaultDef oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.BOOLEAN_ATTR_DEF__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(BoolDefaultDef newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.BOOLEAN_ATTR_DEF__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.BOOLEAN_ATTR_DEF__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.BOOLEAN_ATTR_DEF__DEFAULT, newDefault, newDefault));
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
      case VMPackage.BOOLEAN_ATTR_DEF__NAME:
        return basicSetName(null, msgs);
      case VMPackage.BOOLEAN_ATTR_DEF__DEFAULT:
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
      case VMPackage.BOOLEAN_ATTR_DEF__NAME:
        return getName();
      case VMPackage.BOOLEAN_ATTR_DEF__VALUE:
        return getValue();
      case VMPackage.BOOLEAN_ATTR_DEF__DEFAULT:
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
      case VMPackage.BOOLEAN_ATTR_DEF__NAME:
        setName((Boolean_ATT_ID)newValue);
        return;
      case VMPackage.BOOLEAN_ATTR_DEF__VALUE:
        setValue((String)newValue);
        return;
      case VMPackage.BOOLEAN_ATTR_DEF__DEFAULT:
        setDefault((BoolDefaultDef)newValue);
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
      case VMPackage.BOOLEAN_ATTR_DEF__NAME:
        setName((Boolean_ATT_ID)null);
        return;
      case VMPackage.BOOLEAN_ATTR_DEF__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case VMPackage.BOOLEAN_ATTR_DEF__DEFAULT:
        setDefault((BoolDefaultDef)null);
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
      case VMPackage.BOOLEAN_ATTR_DEF__NAME:
        return name != null;
      case VMPackage.BOOLEAN_ATTR_DEF__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case VMPackage.BOOLEAN_ATTR_DEF__DEFAULT:
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

} //BooleanAttrDefImpl
