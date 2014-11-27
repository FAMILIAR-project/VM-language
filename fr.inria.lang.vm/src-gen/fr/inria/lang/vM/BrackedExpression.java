/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bracked Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.BrackedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getBrackedExpression()
 * @model
 * @generated
 */
public interface BrackedExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ComplexExpression)
   * @see fr.inria.lang.vM.VMPackage#getBrackedExpression_Expression()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getExpression();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.BrackedExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ComplexExpression value);

} // BrackedExpression
