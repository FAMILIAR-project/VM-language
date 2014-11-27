/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Email#getUsername <em>Username</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Email#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getEmail()
 * @model
 * @generated
 */
public interface Email extends EObject
{
  /**
   * Returns the value of the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Username</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' attribute.
   * @see #setUsername(String)
   * @see fr.inria.lang.vM.VMPackage#getEmail_Username()
   * @model
   * @generated
   */
  String getUsername();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Email#getUsername <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' attribute.
   * @see #getUsername()
   * @generated
   */
  void setUsername(String value);

  /**
   * Returns the value of the '<em><b>Domain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' attribute.
   * @see #setDomain(String)
   * @see fr.inria.lang.vM.VMPackage#getEmail_Domain()
   * @model
   * @generated
   */
  String getDomain();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Email#getDomain <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' attribute.
   * @see #getDomain()
   * @generated
   */
  void setDomain(String value);

} // Email
