/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationships</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Relationships#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getRelationships()
 * @model
 * @generated
 */
public interface Relationships extends VmBlock
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(FeatureHierarchy)
   * @see fr.inria.lang.vM.VMPackage#getRelationships_Root()
   * @model containment="true"
   * @generated
   */
  FeatureHierarchy getRoot();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Relationships#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(FeatureHierarchy value);

} // Relationships
