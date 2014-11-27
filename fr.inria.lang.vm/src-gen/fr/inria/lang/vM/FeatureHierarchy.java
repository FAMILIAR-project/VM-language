/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.FeatureHierarchy#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.inria.lang.vM.FeatureHierarchy#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getFeatureHierarchy()
 * @model
 * @generated
 */
public interface FeatureHierarchy extends FeatureDefinition
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' containment reference.
   * @see #setParent(Feature)
   * @see fr.inria.lang.vM.VMPackage#getFeatureHierarchy_Parent()
   * @model containment="true"
   * @generated
   */
  Feature getParent();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.FeatureHierarchy#getParent <em>Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' containment reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Feature value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.FeatureDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getFeatureHierarchy_Children()
   * @model containment="true"
   * @generated
   */
  EList<FeatureDefinition> getChildren();

} // FeatureHierarchy
