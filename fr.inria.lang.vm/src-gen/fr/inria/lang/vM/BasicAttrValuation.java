/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Attr Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.BasicAttrValuation#getHead <em>Head</em>}</li>
 *   <li>{@link fr.inria.lang.vM.BasicAttrValuation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getBasicAttrValuation()
 * @model
 * @generated
 */
public interface BasicAttrValuation extends ExtendedValuation
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
   * @see fr.inria.lang.vM.VMPackage#getBasicAttrValuation_Head()
   * @model containment="true"
   * @generated
   */
  AttHead getHead();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.BasicAttrValuation#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(AttHead value);

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
   * @see fr.inria.lang.vM.VMPackage#getBasicAttrValuation_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.BasicAttrValuation#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // BasicAttrValuation
