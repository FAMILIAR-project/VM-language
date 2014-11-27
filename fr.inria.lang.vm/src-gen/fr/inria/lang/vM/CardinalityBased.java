/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Based</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.CardinalityBased#getMin <em>Min</em>}</li>
 *   <li>{@link fr.inria.lang.vM.CardinalityBased#getMax <em>Max</em>}</li>
 *   <li>{@link fr.inria.lang.vM.CardinalityBased#isAll <em>All</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getCardinalityBased()
 * @model
 * @generated
 */
public interface CardinalityBased extends FeaturesGroup
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(String)
   * @see fr.inria.lang.vM.VMPackage#getCardinalityBased_Min()
   * @model
   * @generated
   */
  String getMin();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.CardinalityBased#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(String value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(String)
   * @see fr.inria.lang.vM.VMPackage#getCardinalityBased_Max()
   * @model
   * @generated
   */
  String getMax();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.CardinalityBased#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(String value);

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see fr.inria.lang.vM.VMPackage#getCardinalityBased_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.CardinalityBased#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

} // CardinalityBased
