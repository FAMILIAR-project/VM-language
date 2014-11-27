/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair Feature Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.PairFeatureInteger#getRefFeat <em>Ref Feat</em>}</li>
 *   <li>{@link fr.inria.lang.vM.PairFeatureInteger#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getPairFeatureInteger()
 * @model
 * @generated
 */
public interface PairFeatureInteger extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Feat</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Feat</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Feat</em>' reference.
   * @see #setRefFeat(Feature)
   * @see fr.inria.lang.vM.VMPackage#getPairFeatureInteger_RefFeat()
   * @model
   * @generated
   */
  Feature getRefFeat();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.PairFeatureInteger#getRefFeat <em>Ref Feat</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Feat</em>' reference.
   * @see #getRefFeat()
   * @generated
   */
  void setRefFeat(Feature value);

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
   * @see fr.inria.lang.vM.VMPackage#getPairFeatureInteger_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.PairFeatureInteger#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // PairFeatureInteger
