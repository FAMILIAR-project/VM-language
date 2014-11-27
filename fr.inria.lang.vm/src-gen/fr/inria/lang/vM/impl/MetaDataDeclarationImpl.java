/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Email;
import fr.inria.lang.vM.MetaDataDeclaration;
import fr.inria.lang.vM.VMPackage;
import fr.inria.lang.vM.Version;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaDataDeclarationImpl extends VmBlockImpl implements MetaDataDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected Version version;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected static final String AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected String author = AUTHOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getEmail() <em>Email</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmail()
   * @generated
   * @ordered
   */
  protected Email email;

  /**
   * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganization()
   * @generated
   * @ordered
   */
  protected static final String ORGANIZATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganization()
   * @generated
   * @ordered
   */
  protected String organization = ORGANIZATION_EDEFAULT;

  /**
   * The default value of the '{@link #getPublication() <em>Publication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublication()
   * @generated
   * @ordered
   */
  protected static final String PUBLICATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPublication() <em>Publication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublication()
   * @generated
   * @ordered
   */
  protected String publication = PUBLICATION_EDEFAULT;

  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaDataDeclarationImpl()
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
    return VMPackage.Literals.META_DATA_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs)
  {
    Version oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(Version newVersion)
  {
    if (newVersion != version)
    {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.META_DATA_DECLARATION__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.META_DATA_DECLARATION__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__VERSION, newVersion, newVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(String newAuthor)
  {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Email getEmail()
  {
    return email;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmail(Email newEmail, NotificationChain msgs)
  {
    Email oldEmail = email;
    email = newEmail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__EMAIL, oldEmail, newEmail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmail(Email newEmail)
  {
    if (newEmail != email)
    {
      NotificationChain msgs = null;
      if (email != null)
        msgs = ((InternalEObject)email).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.META_DATA_DECLARATION__EMAIL, null, msgs);
      if (newEmail != null)
        msgs = ((InternalEObject)newEmail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.META_DATA_DECLARATION__EMAIL, null, msgs);
      msgs = basicSetEmail(newEmail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__EMAIL, newEmail, newEmail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrganization()
  {
    return organization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganization(String newOrganization)
  {
    String oldOrganization = organization;
    organization = newOrganization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__ORGANIZATION, oldOrganization, organization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPublication()
  {
    return publication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublication(String newPublication)
  {
    String oldPublication = publication;
    publication = newPublication;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__PUBLICATION, oldPublication, publication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.META_DATA_DECLARATION__DATE, oldDate, date));
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
      case VMPackage.META_DATA_DECLARATION__VERSION:
        return basicSetVersion(null, msgs);
      case VMPackage.META_DATA_DECLARATION__EMAIL:
        return basicSetEmail(null, msgs);
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
      case VMPackage.META_DATA_DECLARATION__NAME:
        return getName();
      case VMPackage.META_DATA_DECLARATION__VERSION:
        return getVersion();
      case VMPackage.META_DATA_DECLARATION__DESCRIPTION:
        return getDescription();
      case VMPackage.META_DATA_DECLARATION__AUTHOR:
        return getAuthor();
      case VMPackage.META_DATA_DECLARATION__EMAIL:
        return getEmail();
      case VMPackage.META_DATA_DECLARATION__ORGANIZATION:
        return getOrganization();
      case VMPackage.META_DATA_DECLARATION__PUBLICATION:
        return getPublication();
      case VMPackage.META_DATA_DECLARATION__DATE:
        return getDate();
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
      case VMPackage.META_DATA_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case VMPackage.META_DATA_DECLARATION__VERSION:
        setVersion((Version)newValue);
        return;
      case VMPackage.META_DATA_DECLARATION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case VMPackage.META_DATA_DECLARATION__AUTHOR:
        setAuthor((String)newValue);
        return;
      case VMPackage.META_DATA_DECLARATION__EMAIL:
        setEmail((Email)newValue);
        return;
      case VMPackage.META_DATA_DECLARATION__ORGANIZATION:
        setOrganization((String)newValue);
        return;
      case VMPackage.META_DATA_DECLARATION__PUBLICATION:
        setPublication((String)newValue);
        return;
      case VMPackage.META_DATA_DECLARATION__DATE:
        setDate((String)newValue);
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
      case VMPackage.META_DATA_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VMPackage.META_DATA_DECLARATION__VERSION:
        setVersion((Version)null);
        return;
      case VMPackage.META_DATA_DECLARATION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case VMPackage.META_DATA_DECLARATION__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case VMPackage.META_DATA_DECLARATION__EMAIL:
        setEmail((Email)null);
        return;
      case VMPackage.META_DATA_DECLARATION__ORGANIZATION:
        setOrganization(ORGANIZATION_EDEFAULT);
        return;
      case VMPackage.META_DATA_DECLARATION__PUBLICATION:
        setPublication(PUBLICATION_EDEFAULT);
        return;
      case VMPackage.META_DATA_DECLARATION__DATE:
        setDate(DATE_EDEFAULT);
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
      case VMPackage.META_DATA_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VMPackage.META_DATA_DECLARATION__VERSION:
        return version != null;
      case VMPackage.META_DATA_DECLARATION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case VMPackage.META_DATA_DECLARATION__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case VMPackage.META_DATA_DECLARATION__EMAIL:
        return email != null;
      case VMPackage.META_DATA_DECLARATION__ORGANIZATION:
        return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
      case VMPackage.META_DATA_DECLARATION__PUBLICATION:
        return PUBLICATION_EDEFAULT == null ? publication != null : !PUBLICATION_EDEFAULT.equals(publication);
      case VMPackage.META_DATA_DECLARATION__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", author: ");
    result.append(author);
    result.append(", organization: ");
    result.append(organization);
    result.append(", publication: ");
    result.append(publication);
    result.append(", date: ");
    result.append(date);
    result.append(')');
    return result.toString();
  }

} //MetaDataDeclarationImpl
