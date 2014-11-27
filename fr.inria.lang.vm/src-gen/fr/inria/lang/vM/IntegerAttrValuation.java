/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Attr Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.IntegerAttrValuation#getRefAtt <em>Ref Att</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getIntegerAttrValuation()
 * @model
 * @generated
 */
public interface IntegerAttrValuation extends BasicAttrValuation
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
   * @see #setRefAtt(Integer_ATT_ID)
   * @see fr.inria.lang.vM.VMPackage#getIntegerAttrValuation_RefAtt()
   * @model
   * @generated
   */
  Integer_ATT_ID getRefAtt();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.IntegerAttrValuation#getRefAtt <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Att</em>' reference.
   * @see #getRefAtt()
   * @generated
   */
  void setRefAtt(Integer_ATT_ID value);

} // IntegerAttrValuation
