/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Descriptions#getFeaturesDescriptions <em>Features Descriptions</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Descriptions#getAttributesDescriptions <em>Attributes Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getDescriptions()
 * @model
 * @generated
 */
public interface Descriptions extends VmBlock
{
  /**
   * Returns the value of the '<em><b>Features Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.FeatureDescription}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features Descriptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features Descriptions</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getDescriptions_FeaturesDescriptions()
   * @model containment="true"
   * @generated
   */
  EList<FeatureDescription> getFeaturesDescriptions();

  /**
   * Returns the value of the '<em><b>Attributes Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.AttributeDescription}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes Descriptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes Descriptions</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getDescriptions_AttributesDescriptions()
   * @model containment="true"
   * @generated
   */
  EList<AttributeDescription> getAttributesDescriptions();

} // Descriptions
