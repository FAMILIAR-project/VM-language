/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attr Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.AttrDef#isNotTranslatable <em>Not Translatable</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AttrDef#isRunTime <em>Run Time</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AttrDef#isNotDecidable <em>Not Decidable</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AttrDef#getBasicAttrDef <em>Basic Attr Def</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AttrDef#getEnumAttrDef <em>Enum Attr Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getAttrDef()
 * @model
 * @generated
 */
public interface AttrDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Not Translatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Translatable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Translatable</em>' attribute.
   * @see #setNotTranslatable(boolean)
   * @see fr.inria.lang.vM.VMPackage#getAttrDef_NotTranslatable()
   * @model
   * @generated
   */
  boolean isNotTranslatable();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttrDef#isNotTranslatable <em>Not Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Translatable</em>' attribute.
   * @see #isNotTranslatable()
   * @generated
   */
  void setNotTranslatable(boolean value);

  /**
   * Returns the value of the '<em><b>Run Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Time</em>' attribute.
   * @see #setRunTime(boolean)
   * @see fr.inria.lang.vM.VMPackage#getAttrDef_RunTime()
   * @model
   * @generated
   */
  boolean isRunTime();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttrDef#isRunTime <em>Run Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Time</em>' attribute.
   * @see #isRunTime()
   * @generated
   */
  void setRunTime(boolean value);

  /**
   * Returns the value of the '<em><b>Not Decidable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Decidable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Decidable</em>' attribute.
   * @see #setNotDecidable(boolean)
   * @see fr.inria.lang.vM.VMPackage#getAttrDef_NotDecidable()
   * @model
   * @generated
   */
  boolean isNotDecidable();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttrDef#isNotDecidable <em>Not Decidable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Decidable</em>' attribute.
   * @see #isNotDecidable()
   * @generated
   */
  void setNotDecidable(boolean value);

  /**
   * Returns the value of the '<em><b>Basic Attr Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Attr Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Attr Def</em>' containment reference.
   * @see #setBasicAttrDef(BasicAttrDef)
   * @see fr.inria.lang.vM.VMPackage#getAttrDef_BasicAttrDef()
   * @model containment="true"
   * @generated
   */
  BasicAttrDef getBasicAttrDef();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttrDef#getBasicAttrDef <em>Basic Attr Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic Attr Def</em>' containment reference.
   * @see #getBasicAttrDef()
   * @generated
   */
  void setBasicAttrDef(BasicAttrDef value);

  /**
   * Returns the value of the '<em><b>Enum Attr Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Attr Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Attr Def</em>' containment reference.
   * @see #setEnumAttrDef(EnumAttrDef)
   * @see fr.inria.lang.vM.VMPackage#getAttrDef_EnumAttrDef()
   * @model containment="true"
   * @generated
   */
  EnumAttrDef getEnumAttrDef();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttrDef#getEnumAttrDef <em>Enum Attr Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Attr Def</em>' containment reference.
   * @see #getEnumAttrDef()
   * @generated
   */
  void setEnumAttrDef(EnumAttrDef value);

} // AttrDef
