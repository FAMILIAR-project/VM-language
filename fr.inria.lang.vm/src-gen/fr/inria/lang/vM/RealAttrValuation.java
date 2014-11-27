/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Attr Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.RealAttrValuation#getRefAtt <em>Ref Att</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getRealAttrValuation()
 * @model
 * @generated
 */
public interface RealAttrValuation extends BasicAttrValuation
{
  /**
   * Returns the value of the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Att</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Att</em>' reference.
   * @see #setRefAtt(Real_ATT_ID)
   * @see fr.inria.lang.vM.VMPackage#getRealAttrValuation_RefAtt()
   * @model
   * @generated
   */
  Real_ATT_ID getRefAtt();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.RealAttrValuation#getRefAtt <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Att</em>' reference.
   * @see #getRefAtt()
   * @generated
   */
  void setRefAtt(Real_ATT_ID value);

} // RealAttrValuation
