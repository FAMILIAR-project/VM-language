/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.FeaturesGroup#getGroupedFeatures <em>Grouped Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getFeaturesGroup()
 * @model
 * @generated
 */
public interface FeaturesGroup extends FeatureDefinition
{
  /**
   * Returns the value of the '<em><b>Grouped Features</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.FeatureDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grouped Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grouped Features</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getFeaturesGroup_GroupedFeatures()
   * @model containment="true"
   * @generated
   */
  EList<FeatureDefinition> getGroupedFeatures();

} // FeaturesGroup
