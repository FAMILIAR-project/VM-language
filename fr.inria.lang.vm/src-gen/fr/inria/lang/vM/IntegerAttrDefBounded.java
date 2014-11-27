/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Attr Def Bounded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.IntegerAttrDefBounded#getComplements <em>Complements</em>}</li>
 *   <li>{@link fr.inria.lang.vM.IntegerAttrDefBounded#getComplement <em>Complement</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getIntegerAttrDefBounded()
 * @model
 * @generated
 */
public interface IntegerAttrDefBounded extends IntegerAttrDef
{
  /**
   * Returns the value of the '<em><b>Complements</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.IntegerAttrDefComplement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complements</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getIntegerAttrDefBounded_Complements()
   * @model containment="true"
   * @generated
   */
  EList<IntegerAttrDefComplement> getComplements();

  /**
   * Returns the value of the '<em><b>Complement</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.IntegerAttrDefComplement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complement</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getIntegerAttrDefBounded_Complement()
   * @model containment="true"
   * @generated
   */
  EList<IntegerAttrDefComplement> getComplement();

} // IntegerAttrDefBounded
