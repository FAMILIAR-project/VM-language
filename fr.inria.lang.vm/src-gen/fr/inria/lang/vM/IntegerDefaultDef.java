/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Default Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.IntegerDefaultDef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getIntegerDefaultDef()
 * @model
 * @generated
 */
public interface IntegerDefaultDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see fr.inria.lang.vM.VMPackage#getIntegerDefaultDef_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.IntegerDefaultDef#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntegerDefaultDef
