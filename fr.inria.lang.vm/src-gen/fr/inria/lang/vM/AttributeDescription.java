/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.AttributeDescription#getRefFeat <em>Ref Feat</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AttributeDescription#getRefAtt <em>Ref Att</em>}</li>
 *   <li>{@link fr.inria.lang.vM.AttributeDescription#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getAttributeDescription()
 * @model
 * @generated
 */
public interface AttributeDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Feat</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Feat</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Feat</em>' reference.
   * @see #setRefFeat(Feature)
   * @see fr.inria.lang.vM.VMPackage#getAttributeDescription_RefFeat()
   * @model
   * @generated
   */
  Feature getRefFeat();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttributeDescription#getRefFeat <em>Ref Feat</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Feat</em>' reference.
   * @see #getRefFeat()
   * @generated
   */
  void setRefFeat(Feature value);

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
   * @see fr.inria.lang.vM.VMPackage#getAttributeDescription_RefAtt()
   * @model
   * @generated
   */
  Abstract_ATT_ID getRefAtt();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttributeDescription#getRefAtt <em>Ref Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Att</em>' reference.
   * @see #getRefAtt()
   * @generated
   */
  void setRefAtt(Abstract_ATT_ID value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.inria.lang.vM.VMPackage#getAttributeDescription_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.AttributeDescription#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // AttributeDescription
