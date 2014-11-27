/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Configuration#getBooleanValuation <em>Boolean Valuation</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Configuration#getExtendedValuation <em>Extended Valuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.inria.lang.vM.VMPackage#getConfiguration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Configuration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Boolean Valuation</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.BooleanValuation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Valuation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Valuation</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getConfiguration_BooleanValuation()
   * @model containment="true"
   * @generated
   */
  EList<BooleanValuation> getBooleanValuation();

  /**
   * Returns the value of the '<em><b>Extended Valuation</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.ExtendedValuation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extended Valuation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Valuation</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getConfiguration_ExtendedValuation()
   * @model containment="true"
   * @generated
   */
  EList<ExtendedValuation> getExtendedValuation();

} // Configuration
