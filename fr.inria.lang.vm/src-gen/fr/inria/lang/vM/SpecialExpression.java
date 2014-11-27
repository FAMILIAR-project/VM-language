/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.SpecialExpression#getOp <em>Op</em>}</li>
 *   <li>{@link fr.inria.lang.vM.SpecialExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getSpecialExpression()
 * @model
 * @generated
 */
public interface SpecialExpression extends Expression
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
   * @see fr.inria.lang.vM.VMPackage#getSpecialExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.SpecialExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' reference.
   * @see #setExpression(Feature)
   * @see fr.inria.lang.vM.VMPackage#getSpecialExpression_Expression()
   * @model
   * @generated
   */
  Feature getExpression();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.SpecialExpression#getExpression <em>Expression</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Feature value);

} // SpecialExpression
