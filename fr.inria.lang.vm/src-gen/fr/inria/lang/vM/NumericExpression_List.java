/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.NumericExpression_List#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getNumericExpression_List()
 * @model
 * @generated
 */
public interface NumericExpression_List extends EObject
{
  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.NumericExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getNumericExpression_List_Ex()
   * @model containment="true"
   * @generated
   */
  EList<NumericExpression> getEx();

} // NumericExpression_List
