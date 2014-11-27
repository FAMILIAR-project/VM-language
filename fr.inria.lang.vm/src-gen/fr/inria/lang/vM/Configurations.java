/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Configurations#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getConfigurations()
 * @model
 * @generated
 */
public interface Configurations extends VmBlock
{
  /**
   * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.Configuration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configurations</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getConfigurations_Configurations()
   * @model containment="true"
   * @generated
   */
  EList<Configuration> getConfigurations();

} // Configurations
