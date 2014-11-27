/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Att Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.AttHead#isForAllFeatures <em>For All Features</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AttHead#getOwnedFeature <em>Owned Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getAttHead()
 * @model
 * @generated
 */
public interface AttHead extends EObject
{
  /**
   * Returns the value of the '<em><b>For All Features</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For All Features</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For All Features</em>' attribute.
   * @see #setForAllFeatures(boolean)
   * @see fr.inria.lang.vM.VMPackage#getAttHead_ForAllFeatures()
   * @model
   * @generated
   */
  boolean isForAllFeatures();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttHead#isForAllFeatures <em>For All Features</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For All Features</em>' attribute.
   * @see #isForAllFeatures()
   * @generated
   */
  void setForAllFeatures(boolean value);

  /**
   * Returns the value of the '<em><b>Owned Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Feature</em>' reference.
   * @see #setOwnedFeature(Feature)
   * @see fr.inria.lang.vM.VMPackage#getAttHead_OwnedFeature()
   * @model
   * @generated
   */
  Feature getOwnedFeature();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttHead#getOwnedFeature <em>Owned Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Feature</em>' reference.
   * @see #getOwnedFeature()
   * @generated
   */
  void setOwnedFeature(Feature value);

} // AttHead
