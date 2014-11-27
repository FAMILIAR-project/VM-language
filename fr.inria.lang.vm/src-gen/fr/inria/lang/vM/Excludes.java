/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excludes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Excludes#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Excludes#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getExcludes()
 * @model
 * @generated
 */
public interface Excludes extends ComplexExpression
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
   * @see #setLeft(Expression)
   * @see fr.inria.lang.vM.VMPackage#getExcludes_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Excludes#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see fr.inria.lang.vM.VMPackage#getExcludes_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Excludes#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Excludes
