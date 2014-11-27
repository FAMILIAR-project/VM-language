/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Attributes#getAttrDefs <em>Attr Defs</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Attributes#getAttrValuations <em>Attr Valuations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getAttributes()
 * @model
 * @generated
 */
public interface Attributes extends VmBlock
{
  /**
   * Returns the value of the '<em><b>Attr Defs</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.AttrDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Defs</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getAttributes_AttrDefs()
   * @model containment="true"
   * @generated
   */
  EList<AttrDef> getAttrDefs();

  /**
   * Returns the value of the '<em><b>Attr Valuations</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.BasicAttrValuation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr Valuations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Valuations</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getAttributes_AttrValuations()
   * @model containment="true"
   * @generated
   */
  EList<BasicAttrValuation> getAttrValuations();

} // Attributes
