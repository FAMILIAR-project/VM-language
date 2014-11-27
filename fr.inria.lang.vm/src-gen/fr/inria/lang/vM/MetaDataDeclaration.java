/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.MetaDataDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.MetaDataDeclaration#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.inria.lang.vM.MetaDataDeclaration#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.lang.vM.MetaDataDeclaration#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.inria.lang.vM.MetaDataDeclaration#getEmail <em>Email</em>}</li>
 *   <li>{@link fr.inria.lang.vM.MetaDataDeclaration#getOrganization <em>Organization</em>}</li>
 *   <li>{@link fr.inria.lang.vM.MetaDataDeclaration#getPublication <em>Publication</em>}</li>
 *   <li>{@link fr.inria.lang.vM.MetaDataDeclaration#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration()
 * @model
 * @generated
 */
public interface MetaDataDeclaration extends VmBlock
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.MetaDataDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(Version)
   * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration_Version()
   * @model containment="true"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.MetaDataDeclaration#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(Version value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.MetaDataDeclaration#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' attribute.
   * @see #setAuthor(String)
   * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration_Author()
   * @model
   * @generated
   */
  String getAuthor();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.MetaDataDeclaration#getAuthor <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' attribute.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(String value);

  /**
   * Returns the value of the '<em><b>Email</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email</em>' containment reference.
   * @see #setEmail(Email)
   * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration_Email()
   * @model containment="true"
   * @generated
   */
  Email getEmail();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.MetaDataDeclaration#getEmail <em>Email</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email</em>' containment reference.
   * @see #getEmail()
   * @generated
   */
  void setEmail(Email value);

  /**
   * Returns the value of the '<em><b>Organization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organization</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organization</em>' attribute.
   * @see #setOrganization(String)
   * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration_Organization()
   * @model
   * @generated
   */
  String getOrganization();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.MetaDataDeclaration#getOrganization <em>Organization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organization</em>' attribute.
   * @see #getOrganization()
   * @generated
   */
  void setOrganization(String value);

  /**
   * Returns the value of the '<em><b>Publication</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publication</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Publication</em>' attribute.
   * @see #setPublication(String)
   * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration_Publication()
   * @model
   * @generated
   */
  String getPublication();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.MetaDataDeclaration#getPublication <em>Publication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Publication</em>' attribute.
   * @see #getPublication()
   * @generated
   */
  void setPublication(String value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see fr.inria.lang.vM.VMPackage#getMetaDataDeclaration_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.MetaDataDeclaration#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

} // MetaDataDeclaration
