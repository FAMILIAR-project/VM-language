/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.Feature#isNotTranslatable <em>Not Translatable</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Feature#isRunTime <em>Run Time</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Feature#isNotDecidable <em>Not Decidable</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Feature#isOptional <em>Optional</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Feature#getMin <em>Min</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Feature#getMax <em>Max</em>}</li>
 *   <li>{@link fr.inria.lang.vM.Feature#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends FeatureDefinition
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
   * @see fr.inria.lang.vM.VMPackage#getFeature_NotTranslatable()
   * @model
   * @generated
   */
  boolean isNotTranslatable();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Feature#isNotTranslatable <em>Not Translatable</em>}' attribute.
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
   * @see fr.inria.lang.vM.VMPackage#getFeature_RunTime()
   * @model
   * @generated
   */
  boolean isRunTime();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Feature#isRunTime <em>Run Time</em>}' attribute.
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
   * @see fr.inria.lang.vM.VMPackage#getFeature_NotDecidable()
   * @model
   * @generated
   */
  boolean isNotDecidable();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Feature#isNotDecidable <em>Not Decidable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Decidable</em>' attribute.
   * @see #isNotDecidable()
   * @generated
   */
  void setNotDecidable(boolean value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see fr.inria.lang.vM.VMPackage#getFeature_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Feature#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(String)
   * @see fr.inria.lang.vM.VMPackage#getFeature_Min()
   * @model
   * @generated
   */
  String getMin();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Feature#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(String value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(String)
   * @see fr.inria.lang.vM.VMPackage#getFeature_Max()
   * @model
   * @generated
   */
  String getMax();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Feature#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(String value);

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
   * @see fr.inria.lang.vM.VMPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Feature
