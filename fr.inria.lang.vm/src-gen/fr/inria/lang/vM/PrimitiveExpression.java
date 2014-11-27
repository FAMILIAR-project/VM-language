/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.PrimitiveExpression#getFeatureID <em>Feature ID</em>}</li>
 *   <li>{@link fr.inria.lang.vM.PrimitiveExpression#getHead <em>Head</em>}</li>
 *   <li>{@link fr.inria.lang.vM.PrimitiveExpression#getRefAtt <em>Ref Att</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getPrimitiveExpression()
 * @model
 * @generated
 */
public interface PrimitiveExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Feature ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature ID</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature ID</em>' reference.
   * @see #setFeatureID(Feature)
   * @see fr.inria.lang.vM.VMPackage#getPrimitiveExpression_FeatureID()
   * @model
   * @generated
   */
  Feature getFeatureID();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.PrimitiveExpression#getFeatureID <em>Feature ID</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature ID</em>' reference.
   * @see #getFeatureID()
   * @generated
   */
  void setFeatureID(Feature value);

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
   * @see fr.inria.lang.vM.VMPackage#getPrimitiveExpression_Head()
   * @model containment="true"
   * @generated
   */
  AttHead getHead();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.PrimitiveExpression#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(AttHead value);

  /**
   * Returns the value of the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Att</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Att</em>' reference.
   * @see #setRefAtt(Abstract_ATT_ID)
   * @see fr.inria.lang.vM.VMPackage#getPrimitiveExpression_RefAtt()
   * @model
   * @generated
   */
  Abstract_ATT_ID getRefAtt();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.PrimitiveExpression#getRefAtt <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Att</em>' reference.
   * @see #getRefAtt()
   * @generated
   */
  void setRefAtt(Abstract_ATT_ID value);

} // PrimitiveExpression
