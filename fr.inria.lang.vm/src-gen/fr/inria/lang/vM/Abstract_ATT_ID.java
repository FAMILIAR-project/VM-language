/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract ATT ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Abstract_ATT_ID#getHead <em>Head</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Abstract_ATT_ID#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getAbstract_ATT_ID()
 * @model
 * @generated
 */
public interface Abstract_ATT_ID extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(AttHead)
   * @see fr.inria.lang.vM.VMPackage#getAbstract_ATT_ID_Head()
   * @model containment="true"
   * @generated
   */
  AttHead getHead();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Abstract_ATT_ID#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(AttHead value);

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
   * @see fr.inria.lang.vM.VMPackage#getAbstract_ATT_ID_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Abstract_ATT_ID#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Abstract_ATT_ID
