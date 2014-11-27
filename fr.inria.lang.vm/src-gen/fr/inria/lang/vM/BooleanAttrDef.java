/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Attr Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.BooleanAttrDef#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.BooleanAttrDef#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.lang.vM.BooleanAttrDef#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getBooleanAttrDef()
 * @model
 * @generated
 */
public interface BooleanAttrDef extends BasicAttrDef
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Boolean_ATT_ID)
   * @see fr.inria.lang.vM.VMPackage#getBooleanAttrDef_Name()
   * @model containment="true"
   * @generated
   */
  Boolean_ATT_ID getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.BooleanAttrDef#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Boolean_ATT_ID value);

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
   * @see fr.inria.lang.vM.VMPackage#getBooleanAttrDef_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.BooleanAttrDef#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(BoolDefaultDef)
   * @see fr.inria.lang.vM.VMPackage#getBooleanAttrDef_Default()
   * @model containment="true"
   * @generated
   */
  BoolDefaultDef getDefault();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.BooleanAttrDef#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(BoolDefaultDef value);

} // BooleanAttrDef
