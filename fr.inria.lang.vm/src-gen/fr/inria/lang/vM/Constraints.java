/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Constraints#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getConstraints()
 * @model
 * @generated
 */
public interface Constraints extends VmBlock
{
  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getConstraints_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // Constraints
