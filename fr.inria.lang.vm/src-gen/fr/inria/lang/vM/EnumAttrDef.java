/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Attr Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.EnumAttrDef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getEnumAttrDef()
 * @model
 * @generated
 */
public interface EnumAttrDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute list.
   * @see fr.inria.lang.vM.VMPackage#getEnumAttrDef_Value()
   * @model unique="false"
   * @generated
   */
  EList<String> getValue();

} // EnumAttrDef
