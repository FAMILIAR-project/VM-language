/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Based Valuation By Attribute For Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.TableBasedValuationByAttributeForReal#getRefAtt <em>Ref Att</em>}</li>
 *   <li>{@link fr.inria.lang.vM.TableBasedValuationByAttributeForReal#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getTableBasedValuationByAttributeForReal()
 * @model
 * @generated
 */
public interface TableBasedValuationByAttributeForReal extends TableBasedValuationByAttribute
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
   * @see fr.inria.lang.vM.VMPackage#getTableBasedValuationByAttributeForReal_RefAtt()
   * @model
   * @generated
   */
  Real_ATT_ID getRefAtt();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForReal#getRefAtt <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Att</em>' reference.
   * @see #getRefAtt()
   * @generated
   */
  void setRefAtt(Real_ATT_ID value);

  /**
   * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.PairFeatureReal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pairs</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getTableBasedValuationByAttributeForReal_Pairs()
   * @model containment="true"
   * @generated
   */
  EList<PairFeatureReal> getPairs();

} // TableBasedValuationByAttributeForReal
