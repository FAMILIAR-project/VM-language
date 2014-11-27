/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Version#getMain <em>Main</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Version#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject
{
  /**
   * Returns the value of the '<em><b>Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' attribute.
   * @see #setMain(int)
   * @see fr.inria.lang.vM.VMPackage#getVersion_Main()
   * @model
   * @generated
   */
  int getMain();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Version#getMain <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' attribute.
   * @see #getMain()
   * @generated
   */
  void setMain(int value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' attribute list.
   * @see fr.inria.lang.vM.VMPackage#getVersion_Tail()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getTail();

} // Version
