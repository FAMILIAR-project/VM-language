/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advanced Attr Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.AdvancedAttrValuation#getAttVsVal <em>Att Vs Val</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AdvancedAttrValuation#getFeatVsVal <em>Feat Vs Val</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AdvancedAttrValuation#getAttVsValForMultiFeature <em>Att Vs Val For Multi Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getAdvancedAttrValuation()
 * @model
 * @generated
 */
public interface AdvancedAttrValuation extends ExtendedValuation
{
  /**
   * Returns the value of the '<em><b>Att Vs Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Vs Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Vs Val</em>' containment reference.
   * @see #setAttVsVal(TableBasedValuationByFeature)
   * @see fr.inria.lang.vM.VMPackage#getAdvancedAttrValuation_AttVsVal()
   * @model containment="true"
   * @generated
   */
  TableBasedValuationByFeature getAttVsVal();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AdvancedAttrValuation#getAttVsVal <em>Att Vs Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att Vs Val</em>' containment reference.
   * @see #getAttVsVal()
   * @generated
   */
  void setAttVsVal(TableBasedValuationByFeature value);

  /**
   * Returns the value of the '<em><b>Feat Vs Val</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.TableBasedValuationByAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feat Vs Val</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feat Vs Val</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getAdvancedAttrValuation_FeatVsVal()
   * @model containment="true"
   * @generated
   */
  EList<TableBasedValuationByAttribute> getFeatVsVal();

  /**
   * Returns the value of the '<em><b>Att Vs Val For Multi Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Vs Val For Multi Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Vs Val For Multi Feature</em>' containment reference.
   * @see #setAttVsValForMultiFeature(TableBasedValuationByFeatureAndClone)
   * @see fr.inria.lang.vM.VMPackage#getAdvancedAttrValuation_AttVsValForMultiFeature()
   * @model containment="true"
   * @generated
   */
  TableBasedValuationByFeatureAndClone getAttVsValForMultiFeature();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AdvancedAttrValuation#getAttVsValForMultiFeature <em>Att Vs Val For Multi Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att Vs Val For Multi Feature</em>' containment reference.
   * @see #getAttVsValForMultiFeature()
   * @generated
   */
  void setAttVsValForMultiFeature(TableBasedValuationByFeatureAndClone value);

} // AdvancedAttrValuation
