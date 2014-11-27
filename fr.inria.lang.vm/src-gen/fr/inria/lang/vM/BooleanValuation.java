/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.BooleanValuation#isNotSelected <em>Not Selected</em>}</li>
 *   <li>{@link fr.inria.lang.vM.BooleanValuation#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getBooleanValuation()
 * @model
 * @generated
 */
public interface BooleanValuation extends EObject
{
  /**
   * Returns the value of the '<em><b>Not Selected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Selected</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Selected</em>' attribute.
   * @see #setNotSelected(boolean)
   * @see fr.inria.lang.vM.VMPackage#getBooleanValuation_NotSelected()
   * @model
   * @generated
   */
  boolean isNotSelected();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.BooleanValuation#isNotSelected <em>Not Selected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Selected</em>' attribute.
   * @see #isNotSelected()
   * @generated
   */
  void setNotSelected(boolean value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(Feature)
   * @see fr.inria.lang.vM.VMPackage#getBooleanValuation_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.BooleanValuation#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // BooleanValuation
