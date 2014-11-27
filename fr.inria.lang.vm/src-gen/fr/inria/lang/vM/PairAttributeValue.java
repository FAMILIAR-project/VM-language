/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.PairAttributeValue#getRefAtt <em>Ref Att</em>}</li>
 *   <li>{@link fr.inria.lang.vM.PairAttributeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getPairAttributeValue()
 * @model
 * @generated
 */
public interface PairAttributeValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Att</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Att</em>' reference.
   * @see #setRefAtt(Abstract_ATT_ID)
   * @see fr.inria.lang.vM.VMPackage#getPairAttributeValue_RefAtt()
   * @model
   * @generated
   */
  Abstract_ATT_ID getRefAtt();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.PairAttributeValue#getRefAtt <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Att</em>' reference.
   * @see #getRefAtt()
   * @generated
   */
  void setRefAtt(Abstract_ATT_ID value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see fr.inria.lang.vM.VMPackage#getPairAttributeValue_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.PairAttributeValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // PairAttributeValue
