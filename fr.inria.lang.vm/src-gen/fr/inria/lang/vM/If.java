/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.If#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.lang.vM.If#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getIf()
 * @model
 * @generated
 */
public interface If extends ComplexExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ComplexExpression)
   * @see fr.inria.lang.vM.VMPackage#getIf_Left()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getLeft();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.If#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ComplexExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.ComplexExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getIf_Right()
   * @model containment="true"
   * @generated
   */
  EList<ComplexExpression> getRight();

} // If
