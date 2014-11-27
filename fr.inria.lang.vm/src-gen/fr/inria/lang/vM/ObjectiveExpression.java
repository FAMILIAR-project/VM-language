/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.ObjectiveExpression#getOp <em>Op</em>}</li>
 *   <li>{@link fr.inria.lang.vM.ObjectiveExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getObjectiveExpression()
 * @model
 * @generated
 */
public interface ObjectiveExpression extends EObject
{
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
   * @see fr.inria.lang.vM.VMPackage#getObjectiveExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.ObjectiveExpression#getOp <em>Op</em>}' attribute.
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
   * @see #setExpression(PrimitiveExpression)
   * @see fr.inria.lang.vM.VMPackage#getObjectiveExpression_Expression()
   * @model containment="true"
   * @generated
   */
  PrimitiveExpression getExpression();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.ObjectiveExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(PrimitiveExpression value);

} // ObjectiveExpression
