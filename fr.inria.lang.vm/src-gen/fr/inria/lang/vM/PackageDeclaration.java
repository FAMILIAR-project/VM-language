/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.PackageDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.PackageDeclaration#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getPackageDeclaration()
 * @model
 * @generated
 */
public interface PackageDeclaration extends VmBlock
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
   * @see fr.inria.lang.vM.VMPackage#getPackageDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.PackageDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.VmBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getPackageDeclaration_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<VmBlock> getBlocks();

} // PackageDeclaration
