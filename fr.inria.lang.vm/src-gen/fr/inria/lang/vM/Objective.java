/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Objective#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Objective#getOp <em>Op</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Objective#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getObjective()
 * @model
 * @generated
 */
public interface Objective extends EObject
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
   * @see fr.inria.lang.vM.VMPackage#getObjective_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Objective#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see fr.inria.lang.vM.VMPackage#getObjective_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Objective#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ObjectiveExpression)
   * @see fr.inria.lang.vM.VMPackage#getObjective_Expression()
   * @model containment="true"
   * @generated
   */
  ObjectiveExpression getExpression();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Objective#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ObjectiveExpression value);

} // Objective
