/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Based Valuation By Feature And Clone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getRefFeature <em>Ref Feature</em>}</li>
 *   <li>{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getTableBasedValuationByFeatureAndClone()
 * @model
 * @generated
 */
public interface TableBasedValuationByFeatureAndClone extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Feature</em>' reference.
   * @see #setRefFeature(Feature)
   * @see fr.inria.lang.vM.VMPackage#getTableBasedValuationByFeatureAndClone_RefFeature()
   * @model
   * @generated
   */
  Feature getRefFeature();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getRefFeature <em>Ref Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Feature</em>' reference.
   * @see #getRefFeature()
   * @generated
   */
  void setRefFeature(Feature value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.inria.lang.vM.VMPackage#getTableBasedValuationByFeatureAndClone_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.PairAttributeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pairs</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getTableBasedValuationByFeatureAndClone_Pairs()
   * @model containment="true"
   * @generated
   */
  EList<PairAttributeValue> getPairs();

} // TableBasedValuationByFeatureAndClone
