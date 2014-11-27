/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Attr Def Bounded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.RealAttrDefBounded#getComplement <em>Complement</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getRealAttrDefBounded()
 * @model
 * @generated
 */
public interface RealAttrDefBounded extends RealAttrDef
{
  /**
   * Returns the value of the '<em><b>Complement</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.RealAttrDefComplement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complement</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getRealAttrDefBounded_Complement()
   * @model containment="true"
   * @generated
   */
  EList<RealAttrDefComplement> getComplement();

} // RealAttrDefBounded
