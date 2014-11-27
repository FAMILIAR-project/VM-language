/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objectives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Objectives#getObjectives <em>Objectives</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getObjectives()
 * @model
 * @generated
 */
public interface Objectives extends VmBlock
{
  /**
   * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.Objective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objectives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objectives</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getObjectives_Objectives()
   * @model containment="true"
   * @generated
   */
  EList<Objective> getObjectives();

} // Objectives
