/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Real Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.EnumRealDef#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.EnumRealDef#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getEnumRealDef()
 * @model
 * @generated
 */
public interface EnumRealDef extends EnumAttrDef
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
   * @see #setName(Enum_Real_ATT_ID)
   * @see fr.inria.lang.vM.VMPackage#getEnumRealDef_Name()
   * @model containment="true"
   * @generated
   */
  Enum_Real_ATT_ID getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.EnumRealDef#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Enum_Real_ATT_ID value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(RealDefaultDef)
   * @see fr.inria.lang.vM.VMPackage#getEnumRealDef_Default()
   * @model containment="true"
   * @generated
   */
  RealDefaultDef getDefault();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.EnumRealDef#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(RealDefaultDef value);

} // EnumRealDef
