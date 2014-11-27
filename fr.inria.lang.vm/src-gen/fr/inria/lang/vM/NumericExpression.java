/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.NumericExpression#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.lang.vM.NumericExpression#getOp <em>Op</em>}</li>
 *   <li>{@link fr.inria.lang.vM.NumericExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.inria.lang.vM.NumericExpression#getExpression_list <em>Expression list</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getNumericExpression()
 * @model
 * @generated
 */
public interface NumericExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see fr.inria.lang.vM.VMPackage#getNumericExpression_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.NumericExpression#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

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
   * @see fr.inria.lang.vM.VMPackage#getNumericExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.NumericExpression#getOp <em>Op</em>}' attribute.
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
   * @see #setExpression(NumericExpression)
   * @see fr.inria.lang.vM.VMPackage#getNumericExpression_Expression()
   * @model containment="true"
   * @generated
   */
  NumericExpression getExpression();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.NumericExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(NumericExpression value);

  /**
   * Returns the value of the '<em><b>Expression list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression list</em>' containment reference.
   * @see #setExpression_list(NumericExpression_List)
   * @see fr.inria.lang.vM.VMPackage#getNumericExpression_Expression_list()
   * @model containment="true"
   * @generated
   */
  NumericExpression_List getExpression_list();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.NumericExpression#getExpression_list <em>Expression list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression list</em>' containment reference.
   * @see #getExpression_list()
   * @generated
   */
  void setExpression_list(NumericExpression_List value);

} // NumericExpression
