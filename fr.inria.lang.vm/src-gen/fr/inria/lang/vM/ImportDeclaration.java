/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.lang.vM.ImportDeclaration#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.lang.vM.VMPackage#getImportDeclaration()
 * @model
 * @generated
 */
public interface ImportDeclaration extends VmBlock
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see fr.inria.lang.vM.VMPackage#getImportDeclaration_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.ImportDeclaration#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

} // ImportDeclaration
