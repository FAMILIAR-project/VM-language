/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Email;
import fr.inria.lang.vM.VMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.EmailImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.EmailImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmailImpl extends MinimalEObjectImpl.Container implements Email
{
  /**
   * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected static final String USERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected String username = USERNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected String domain = DOMAIN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmailImpl()
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
    return VMPackage.Literals.EMAIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsername(String newUsername)
  {
    String oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.EMAIL__USERNAME, oldUsername, username));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomain(String newDomain)
  {
    String oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.EMAIL__DOMAIN, oldDomain, domain));
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
      case VMPackage.EMAIL__USERNAME:
        return getUsername();
      case VMPackage.EMAIL__DOMAIN:
        return getDomain();
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
      case VMPackage.EMAIL__USERNAME:
        setUsername((String)newValue);
        return;
      case VMPackage.EMAIL__DOMAIN:
        setDomain((String)newValue);
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
      case VMPackage.EMAIL__USERNAME:
        setUsername(USERNAME_EDEFAULT);
        return;
      case VMPackage.EMAIL__DOMAIN:
        setDomain(DOMAIN_EDEFAULT);
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
      case VMPackage.EMAIL__USERNAME:
        return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
      case VMPackage.EMAIL__DOMAIN:
        return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
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
    result.append(" (username: ");
    result.append(username);
    result.append(", domain: ");
    result.append(domain);
    result.append(')');
    return result.toString();
  }

} //EmailImpl
