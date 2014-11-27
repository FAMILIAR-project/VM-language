/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.lang.vM.VMFactory
 * @model kind="package"
 * @generated
 */
public interface VMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "vM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inria.fr/lang/VM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "vM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VMPackage eINSTANCE = fr.inria.lang.vM.impl.VMPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ModelImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BLOCKS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.VmBlockImpl <em>Vm Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.VmBlockImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getVmBlock()
   * @generated
   */
  int VM_BLOCK = 1;

  /**
   * The number of structural features of the '<em>Vm Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VM_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.PackageDeclarationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__BLOCKS = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ImportDeclarationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getImportDeclaration()
   * @generated
   */
  int IMPORT_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__IMPORTED_NAMESPACE = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl <em>Meta Data Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.MetaDataDeclarationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getMetaDataDeclaration()
   * @generated
   */
  int META_DATA_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION__NAME = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION__VERSION = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION__DESCRIPTION = VM_BLOCK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION__AUTHOR = VM_BLOCK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Email</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION__EMAIL = VM_BLOCK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Organization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION__ORGANIZATION = VM_BLOCK_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Publication</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION__PUBLICATION = VM_BLOCK_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION__DATE = VM_BLOCK_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Meta Data Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_DECLARATION_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.EmailImpl <em>Email</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.EmailImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEmail()
   * @generated
   */
  int EMAIL = 5;

  /**
   * The feature id for the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__USERNAME = 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__DOMAIN = 1;

  /**
   * The number of structural features of the '<em>Email</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.VersionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 6;

  /**
   * The feature id for the '<em><b>Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MAIN = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__TAIL = 1;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RelationshipsImpl <em>Relationships</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RelationshipsImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRelationships()
   * @generated
   */
  int RELATIONSHIPS = 7;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIPS__ROOT = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relationships</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIPS_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.FeatureDefinitionImpl <em>Feature Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.FeatureDefinitionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeatureDefinition()
   * @generated
   */
  int FEATURE_DEFINITION = 9;

  /**
   * The number of structural features of the '<em>Feature Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.FeatureHierarchyImpl <em>Feature Hierarchy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.FeatureHierarchyImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeatureHierarchy()
   * @generated
   */
  int FEATURE_HIERARCHY = 8;

  /**
   * The feature id for the '<em><b>Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_HIERARCHY__PARENT = FEATURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_HIERARCHY__CHILDREN = FEATURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Hierarchy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_HIERARCHY_FEATURE_COUNT = FEATURE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.FeatureImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 10;

  /**
   * The feature id for the '<em><b>Not Translatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NOT_TRANSLATABLE = FEATURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Run Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__RUN_TIME = FEATURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Not Decidable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NOT_DECIDABLE = FEATURE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__OPTIONAL = FEATURE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MIN = FEATURE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MAX = FEATURE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = FEATURE_DEFINITION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = FEATURE_DEFINITION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.FeaturesGroupImpl <em>Features Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.FeaturesGroupImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeaturesGroup()
   * @generated
   */
  int FEATURES_GROUP = 11;

  /**
   * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_GROUP__GROUPED_FEATURES = FEATURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Features Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURES_GROUP_FEATURE_COUNT = FEATURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.XorgroupImpl <em>Xorgroup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.XorgroupImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getXorgroup()
   * @generated
   */
  int XORGROUP = 12;

  /**
   * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XORGROUP__GROUPED_FEATURES = FEATURES_GROUP__GROUPED_FEATURES;

  /**
   * The number of structural features of the '<em>Xorgroup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XORGROUP_FEATURE_COUNT = FEATURES_GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.OrgroupImpl <em>Orgroup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.OrgroupImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getOrgroup()
   * @generated
   */
  int ORGROUP = 13;

  /**
   * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGROUP__GROUPED_FEATURES = FEATURES_GROUP__GROUPED_FEATURES;

  /**
   * The number of structural features of the '<em>Orgroup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGROUP_FEATURE_COUNT = FEATURES_GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.CardinalityBasedImpl <em>Cardinality Based</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.CardinalityBasedImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getCardinalityBased()
   * @generated
   */
  int CARDINALITY_BASED = 14;

  /**
   * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_BASED__GROUPED_FEATURES = FEATURES_GROUP__GROUPED_FEATURES;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_BASED__MIN = FEATURES_GROUP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_BASED__MAX = FEATURES_GROUP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_BASED__ALL = FEATURES_GROUP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cardinality Based</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_BASED_FEATURE_COUNT = FEATURES_GROUP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.AttributesImpl <em>Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.AttributesImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getAttributes()
   * @generated
   */
  int ATTRIBUTES = 15;

  /**
   * The feature id for the '<em><b>Attr Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ATTR_DEFS = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attr Valuations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ATTR_VALUATIONS = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.AttrDefImpl <em>Attr Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.AttrDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getAttrDef()
   * @generated
   */
  int ATTR_DEF = 16;

  /**
   * The feature id for the '<em><b>Not Translatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DEF__NOT_TRANSLATABLE = 0;

  /**
   * The feature id for the '<em><b>Run Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DEF__RUN_TIME = 1;

  /**
   * The feature id for the '<em><b>Not Decidable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DEF__NOT_DECIDABLE = 2;

  /**
   * The feature id for the '<em><b>Basic Attr Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DEF__BASIC_ATTR_DEF = 3;

  /**
   * The feature id for the '<em><b>Enum Attr Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DEF__ENUM_ATTR_DEF = 4;

  /**
   * The number of structural features of the '<em>Attr Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_DEF_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BasicAttrDefImpl <em>Basic Attr Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BasicAttrDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBasicAttrDef()
   * @generated
   */
  int BASIC_ATTR_DEF = 17;

  /**
   * The number of structural features of the '<em>Basic Attr Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ATTR_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BooleanAttrDefImpl <em>Boolean Attr Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BooleanAttrDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanAttrDef()
   * @generated
   */
  int BOOLEAN_ATTR_DEF = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATTR_DEF__NAME = BASIC_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATTR_DEF__VALUE = BASIC_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATTR_DEF__DEFAULT = BASIC_ATTR_DEF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Boolean Attr Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATTR_DEF_FEATURE_COUNT = BASIC_ATTR_DEF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.StringAttrDefImpl <em>String Attr Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.StringAttrDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getStringAttrDef()
   * @generated
   */
  int STRING_ATTR_DEF = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTR_DEF__NAME = BASIC_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTR_DEF__VALUE = BASIC_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTR_DEF__DEFAULT = BASIC_ATTR_DEF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Attr Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTR_DEF_FEATURE_COUNT = BASIC_ATTR_DEF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.IntegerAttrDefImpl <em>Integer Attr Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.IntegerAttrDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrDef()
   * @generated
   */
  int INTEGER_ATTR_DEF = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF__NAME = BASIC_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF__DEFAULT = BASIC_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Attr Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_FEATURE_COUNT = BASIC_ATTR_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.IntegerAttrDefBoundedImpl <em>Integer Attr Def Bounded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.IntegerAttrDefBoundedImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrDefBounded()
   * @generated
   */
  int INTEGER_ATTR_DEF_BOUNDED = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_BOUNDED__NAME = INTEGER_ATTR_DEF__NAME;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_BOUNDED__DEFAULT = INTEGER_ATTR_DEF__DEFAULT;

  /**
   * The feature id for the '<em><b>Complements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS = INTEGER_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Complement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT = INTEGER_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Attr Def Bounded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_BOUNDED_FEATURE_COUNT = INTEGER_ATTR_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.IntegerAttrDefComplementImpl <em>Integer Attr Def Complement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.IntegerAttrDefComplementImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrDefComplement()
   * @generated
   */
  int INTEGER_ATTR_DEF_COMPLEMENT = 22;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_COMPLEMENT__MIN = 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_COMPLEMENT__MAX = 1;

  /**
   * The feature id for the '<em><b>Delta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_COMPLEMENT__DELTA = 2;

  /**
   * The number of structural features of the '<em>Integer Attr Def Complement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_COMPLEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.IntegerAttrDefUnboundedImpl <em>Integer Attr Def Unbounded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.IntegerAttrDefUnboundedImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrDefUnbounded()
   * @generated
   */
  int INTEGER_ATTR_DEF_UNBOUNDED = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_UNBOUNDED__NAME = INTEGER_ATTR_DEF__NAME;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_UNBOUNDED__DEFAULT = INTEGER_ATTR_DEF__DEFAULT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_UNBOUNDED__VALUE = INTEGER_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Attr Def Unbounded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_DEF_UNBOUNDED_FEATURE_COUNT = INTEGER_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RealAttrDefImpl <em>Real Attr Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RealAttrDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrDef()
   * @generated
   */
  int REAL_ATTR_DEF = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF__NAME = BASIC_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF__DEFAULT = BASIC_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Real Attr Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_FEATURE_COUNT = BASIC_ATTR_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RealAttrDefBoundedImpl <em>Real Attr Def Bounded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RealAttrDefBoundedImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrDefBounded()
   * @generated
   */
  int REAL_ATTR_DEF_BOUNDED = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_BOUNDED__NAME = REAL_ATTR_DEF__NAME;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_BOUNDED__DEFAULT = REAL_ATTR_DEF__DEFAULT;

  /**
   * The feature id for the '<em><b>Complement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_BOUNDED__COMPLEMENT = REAL_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Attr Def Bounded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_BOUNDED_FEATURE_COUNT = REAL_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RealAttrDefComplementImpl <em>Real Attr Def Complement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RealAttrDefComplementImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrDefComplement()
   * @generated
   */
  int REAL_ATTR_DEF_COMPLEMENT = 26;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_COMPLEMENT__MIN = 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_COMPLEMENT__MAX = 1;

  /**
   * The feature id for the '<em><b>Delta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_COMPLEMENT__DELTA = 2;

  /**
   * The number of structural features of the '<em>Real Attr Def Complement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_COMPLEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RealAttrDefUnboundedImpl <em>Real Attr Def Unbounded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RealAttrDefUnboundedImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrDefUnbounded()
   * @generated
   */
  int REAL_ATTR_DEF_UNBOUNDED = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_UNBOUNDED__NAME = REAL_ATTR_DEF__NAME;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_UNBOUNDED__DEFAULT = REAL_ATTR_DEF__DEFAULT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_UNBOUNDED__VALUE = REAL_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Attr Def Unbounded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_DEF_UNBOUNDED_FEATURE_COUNT = REAL_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.EnumAttrDefImpl <em>Enum Attr Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.EnumAttrDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnumAttrDef()
   * @generated
   */
  int ENUM_ATTR_DEF = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTR_DEF__VALUE = 0;

  /**
   * The number of structural features of the '<em>Enum Attr Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTR_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.EnumStringDefImpl <em>Enum String Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.EnumStringDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnumStringDef()
   * @generated
   */
  int ENUM_STRING_DEF = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STRING_DEF__VALUE = ENUM_ATTR_DEF__VALUE;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STRING_DEF__NAME = ENUM_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STRING_DEF__DEFAULT = ENUM_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum String Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STRING_DEF_FEATURE_COUNT = ENUM_ATTR_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.EnumIntegerDefImpl <em>Enum Integer Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.EnumIntegerDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnumIntegerDef()
   * @generated
   */
  int ENUM_INTEGER_DEF = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INTEGER_DEF__VALUE = ENUM_ATTR_DEF__VALUE;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INTEGER_DEF__NAME = ENUM_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INTEGER_DEF__DEFAULT = ENUM_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Integer Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INTEGER_DEF_FEATURE_COUNT = ENUM_ATTR_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.EnumRealDefImpl <em>Enum Real Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.EnumRealDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnumRealDef()
   * @generated
   */
  int ENUM_REAL_DEF = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REAL_DEF__VALUE = ENUM_ATTR_DEF__VALUE;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REAL_DEF__NAME = ENUM_ATTR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REAL_DEF__DEFAULT = ENUM_ATTR_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Real Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REAL_DEF_FEATURE_COUNT = ENUM_ATTR_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BoolDefaultDefImpl <em>Bool Default Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BoolDefaultDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBoolDefaultDef()
   * @generated
   */
  int BOOL_DEFAULT_DEF = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_DEFAULT_DEF__VALUE = 0;

  /**
   * The number of structural features of the '<em>Bool Default Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_DEFAULT_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.StringDefaultDefImpl <em>String Default Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.StringDefaultDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getStringDefaultDef()
   * @generated
   */
  int STRING_DEFAULT_DEF = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DEFAULT_DEF__VALUE = 0;

  /**
   * The number of structural features of the '<em>String Default Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DEFAULT_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.IntegerDeltaDefImpl <em>Integer Delta Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.IntegerDeltaDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerDeltaDef()
   * @generated
   */
  int INTEGER_DELTA_DEF = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DELTA_DEF__VALUE = 0;

  /**
   * The number of structural features of the '<em>Integer Delta Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DELTA_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.IntegerDefaultDefImpl <em>Integer Default Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.IntegerDefaultDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerDefaultDef()
   * @generated
   */
  int INTEGER_DEFAULT_DEF = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DEFAULT_DEF__VALUE = 0;

  /**
   * The number of structural features of the '<em>Integer Default Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DEFAULT_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RealDeltaDefImpl <em>Real Delta Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RealDeltaDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealDeltaDef()
   * @generated
   */
  int REAL_DELTA_DEF = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_DELTA_DEF__VALUE = 0;

  /**
   * The number of structural features of the '<em>Real Delta Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_DELTA_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RealDefaultDefImpl <em>Real Default Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RealDefaultDefImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealDefaultDef()
   * @generated
   */
  int REAL_DEFAULT_DEF = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_DEFAULT_DEF__VALUE = 0;

  /**
   * The number of structural features of the '<em>Real Default Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_DEFAULT_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.DescriptionsImpl <em>Descriptions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.DescriptionsImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getDescriptions()
   * @generated
   */
  int DESCRIPTIONS = 38;

  /**
   * The feature id for the '<em><b>Features Descriptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTIONS__FEATURES_DESCRIPTIONS = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes Descriptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Descriptions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTIONS_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.FeatureDescriptionImpl <em>Feature Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.FeatureDescriptionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeatureDescription()
   * @generated
   */
  int FEATURE_DESCRIPTION = 39;

  /**
   * The feature id for the '<em><b>Ref Feat</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DESCRIPTION__REF_FEAT = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DESCRIPTION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Feature Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DESCRIPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.AttributeDescriptionImpl <em>Attribute Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.AttributeDescriptionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getAttributeDescription()
   * @generated
   */
  int ATTRIBUTE_DESCRIPTION = 40;

  /**
   * The feature id for the '<em><b>Ref Feat</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DESCRIPTION__REF_FEAT = 0;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DESCRIPTION__REF_ATT = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DESCRIPTION__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Attribute Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DESCRIPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ConstraintsImpl <em>Constraints</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ConstraintsImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getConstraints()
   * @generated
   */
  int CONSTRAINTS = 41;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS__CONSTRAINTS = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constraints</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ConstraintImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ComplexExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getComplexExpression()
   * @generated
   */
  int COMPLEX_EXPRESSION = 43;

  /**
   * The number of structural features of the '<em>Complex Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 44;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.SpecialExpressionImpl <em>Special Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.SpecialExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getSpecialExpression()
   * @generated
   */
  int SPECIAL_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Special Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.StringExpressionImpl <em>String Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.StringExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getStringExpression()
   * @generated
   */
  int STRING_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.PrimitiveExpressionImpl <em>Primitive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.PrimitiveExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getPrimitiveExpression()
   * @generated
   */
  int PRIMITIVE_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Feature ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_EXPRESSION__FEATURE_ID = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_EXPRESSION__HEAD = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_EXPRESSION__REF_ATT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Primitive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BooleanExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__EXPRESSION_LIST = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BrackedExpressionImpl <em>Bracked Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BrackedExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBrackedExpression()
   * @generated
   */
  int BRACKED_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKED_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bracked Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.NumericExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getNumericExpression()
   * @generated
   */
  int NUMERIC_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__EXPRESSION_LIST = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Numeric Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.NumericExpression_ListImpl <em>Numeric Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.NumericExpression_ListImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getNumericExpression_List()
   * @generated
   */
  int NUMERIC_EXPRESSION_LIST = 51;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_LIST__EX = 0;

  /**
   * The number of structural features of the '<em>Numeric Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BooleanExpression_ListImpl <em>Boolean Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BooleanExpression_ListImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanExpression_List()
   * @generated
   */
  int BOOLEAN_EXPRESSION_LIST = 52;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_LIST__EX = 0;

  /**
   * The number of structural features of the '<em>Boolean Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ObjectivesImpl <em>Objectives</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ObjectivesImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getObjectives()
   * @generated
   */
  int OBJECTIVES = 53;

  /**
   * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVES__OBJECTIVES = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Objectives</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVES_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ObjectiveImpl <em>Objective</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ObjectiveImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getObjective()
   * @generated
   */
  int OBJECTIVE = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE__NAME = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE__OP = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Objective</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ObjectiveExpressionImpl <em>Objective Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ObjectiveExpressionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getObjectiveExpression()
   * @generated
   */
  int OBJECTIVE_EXPRESSION = 55;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE_EXPRESSION__OP = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE_EXPRESSION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Objective Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ConfigurationsImpl <em>Configurations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ConfigurationsImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getConfigurations()
   * @generated
   */
  int CONFIGURATIONS = 56;

  /**
   * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATIONS__CONFIGURATIONS = VM_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Configurations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATIONS_FEATURE_COUNT = VM_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ConfigurationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Boolean Valuation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__BOOLEAN_VALUATION = 1;

  /**
   * The feature id for the '<em><b>Extended Valuation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__EXTENDED_VALUATION = 2;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BooleanValuationImpl <em>Boolean Valuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BooleanValuationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanValuation()
   * @generated
   */
  int BOOLEAN_VALUATION = 58;

  /**
   * The feature id for the '<em><b>Not Selected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUATION__NOT_SELECTED = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUATION__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Boolean Valuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ExtendedValuationImpl <em>Extended Valuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ExtendedValuationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getExtendedValuation()
   * @generated
   */
  int EXTENDED_VALUATION = 59;

  /**
   * The number of structural features of the '<em>Extended Valuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_VALUATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BasicAttrValuationImpl <em>Basic Attr Valuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BasicAttrValuationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBasicAttrValuation()
   * @generated
   */
  int BASIC_ATTR_VALUATION = 60;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ATTR_VALUATION__HEAD = EXTENDED_VALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ATTR_VALUATION__VALUE = EXTENDED_VALUATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Basic Attr Valuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ATTR_VALUATION_FEATURE_COUNT = EXTENDED_VALUATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RealAttrValuationImpl <em>Real Attr Valuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RealAttrValuationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrValuation()
   * @generated
   */
  int REAL_ATTR_VALUATION = 61;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_VALUATION__HEAD = BASIC_ATTR_VALUATION__HEAD;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_VALUATION__VALUE = BASIC_ATTR_VALUATION__VALUE;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_VALUATION__REF_ATT = BASIC_ATTR_VALUATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Attr Valuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATTR_VALUATION_FEATURE_COUNT = BASIC_ATTR_VALUATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.IntegerAttrValuationImpl <em>Integer Attr Valuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.IntegerAttrValuationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrValuation()
   * @generated
   */
  int INTEGER_ATTR_VALUATION = 62;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_VALUATION__HEAD = BASIC_ATTR_VALUATION__HEAD;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_VALUATION__VALUE = BASIC_ATTR_VALUATION__VALUE;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_VALUATION__REF_ATT = BASIC_ATTR_VALUATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Attr Valuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATTR_VALUATION_FEATURE_COUNT = BASIC_ATTR_VALUATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BooleanAttrValuationImpl <em>Boolean Attr Valuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BooleanAttrValuationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanAttrValuation()
   * @generated
   */
  int BOOLEAN_ATTR_VALUATION = 63;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATTR_VALUATION__HEAD = BASIC_ATTR_VALUATION__HEAD;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATTR_VALUATION__VALUE = BASIC_ATTR_VALUATION__VALUE;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATTR_VALUATION__REF_ATT = BASIC_ATTR_VALUATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Attr Valuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATTR_VALUATION_FEATURE_COUNT = BASIC_ATTR_VALUATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.StringAttrValuationImpl <em>String Attr Valuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.StringAttrValuationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getStringAttrValuation()
   * @generated
   */
  int STRING_ATTR_VALUATION = 64;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTR_VALUATION__HEAD = BASIC_ATTR_VALUATION__HEAD;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTR_VALUATION__VALUE = BASIC_ATTR_VALUATION__VALUE;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTR_VALUATION__REF_ATT = BASIC_ATTR_VALUATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Attr Valuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTR_VALUATION_FEATURE_COUNT = BASIC_ATTR_VALUATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.AdvancedAttrValuationImpl <em>Advanced Attr Valuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.AdvancedAttrValuationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getAdvancedAttrValuation()
   * @generated
   */
  int ADVANCED_ATTR_VALUATION = 65;

  /**
   * The feature id for the '<em><b>Att Vs Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVANCED_ATTR_VALUATION__ATT_VS_VAL = EXTENDED_VALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feat Vs Val</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVANCED_ATTR_VALUATION__FEAT_VS_VAL = EXTENDED_VALUATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Att Vs Val For Multi Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE = EXTENDED_VALUATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Advanced Attr Valuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVANCED_ATTR_VALUATION_FEATURE_COUNT = EXTENDED_VALUATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureAndCloneImpl <em>Table Based Valuation By Feature And Clone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.TableBasedValuationByFeatureAndCloneImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByFeatureAndClone()
   * @generated
   */
  int TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE = 66;

  /**
   * The feature id for the '<em><b>Ref Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__NAME = 1;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS = 2;

  /**
   * The number of structural features of the '<em>Table Based Valuation By Feature And Clone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureImpl <em>Table Based Valuation By Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.TableBasedValuationByFeatureImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByFeature()
   * @generated
   */
  int TABLE_BASED_VALUATION_BY_FEATURE = 67;

  /**
   * The feature id for the '<em><b>Ref Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE = 0;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_FEATURE__PAIRS = 1;

  /**
   * The number of structural features of the '<em>Table Based Valuation By Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.PairAttributeValueImpl <em>Pair Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.PairAttributeValueImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getPairAttributeValue()
   * @generated
   */
  int PAIR_ATTRIBUTE_VALUE = 68;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_ATTRIBUTE_VALUE__REF_ATT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_ATTRIBUTE_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_ATTRIBUTE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByAttributeImpl <em>Table Based Valuation By Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.TableBasedValuationByAttributeImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByAttribute()
   * @generated
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE = 69;

  /**
   * The number of structural features of the '<em>Table Based Valuation By Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByAttributeForIntegerImpl <em>Table Based Valuation By Attribute For Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.TableBasedValuationByAttributeForIntegerImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByAttributeForInteger()
   * @generated
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER = 70;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT = TABLE_BASED_VALUATION_BY_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS = TABLE_BASED_VALUATION_BY_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Based Valuation By Attribute For Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER_FEATURE_COUNT = TABLE_BASED_VALUATION_BY_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.PairFeatureIntegerImpl <em>Pair Feature Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.PairFeatureIntegerImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getPairFeatureInteger()
   * @generated
   */
  int PAIR_FEATURE_INTEGER = 71;

  /**
   * The feature id for the '<em><b>Ref Feat</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_INTEGER__REF_FEAT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_INTEGER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair Feature Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_INTEGER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByAttributeForRealImpl <em>Table Based Valuation By Attribute For Real</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.TableBasedValuationByAttributeForRealImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByAttributeForReal()
   * @generated
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL = 72;

  /**
   * The feature id for the '<em><b>Ref Att</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL__REF_ATT = TABLE_BASED_VALUATION_BY_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL__PAIRS = TABLE_BASED_VALUATION_BY_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Based Valuation By Attribute For Real</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL_FEATURE_COUNT = TABLE_BASED_VALUATION_BY_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.PairFeatureRealImpl <em>Pair Feature Real</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.PairFeatureRealImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getPairFeatureReal()
   * @generated
   */
  int PAIR_FEATURE_REAL = 73;

  /**
   * The feature id for the '<em><b>Ref Feat</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_REAL__REF_FEAT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_REAL__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair Feature Real</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_REAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.Abstract_ATT_IDImpl <em>Abstract ATT ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.Abstract_ATT_IDImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getAbstract_ATT_ID()
   * @generated
   */
  int ABSTRACT_ATT_ID = 82;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ATT_ID__HEAD = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ATT_ID__NAME = 1;

  /**
   * The number of structural features of the '<em>Abstract ATT ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ATT_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.Boolean_ATT_IDImpl <em>Boolean ATT ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.Boolean_ATT_IDImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBoolean_ATT_ID()
   * @generated
   */
  int BOOLEAN_ATT_ID = 74;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATT_ID__HEAD = ABSTRACT_ATT_ID__HEAD;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATT_ID__NAME = ABSTRACT_ATT_ID__NAME;

  /**
   * The number of structural features of the '<em>Boolean ATT ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ATT_ID_FEATURE_COUNT = ABSTRACT_ATT_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.String_ATT_IDImpl <em>String ATT ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.String_ATT_IDImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getString_ATT_ID()
   * @generated
   */
  int STRING_ATT_ID = 75;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATT_ID__HEAD = ABSTRACT_ATT_ID__HEAD;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATT_ID__NAME = ABSTRACT_ATT_ID__NAME;

  /**
   * The number of structural features of the '<em>String ATT ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATT_ID_FEATURE_COUNT = ABSTRACT_ATT_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.Integer_ATT_IDImpl <em>Integer ATT ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.Integer_ATT_IDImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getInteger_ATT_ID()
   * @generated
   */
  int INTEGER_ATT_ID = 76;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATT_ID__HEAD = ABSTRACT_ATT_ID__HEAD;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATT_ID__NAME = ABSTRACT_ATT_ID__NAME;

  /**
   * The number of structural features of the '<em>Integer ATT ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_ATT_ID_FEATURE_COUNT = ABSTRACT_ATT_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.Real_ATT_IDImpl <em>Real ATT ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.Real_ATT_IDImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getReal_ATT_ID()
   * @generated
   */
  int REAL_ATT_ID = 77;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATT_ID__HEAD = ABSTRACT_ATT_ID__HEAD;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATT_ID__NAME = ABSTRACT_ATT_ID__NAME;

  /**
   * The number of structural features of the '<em>Real ATT ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ATT_ID_FEATURE_COUNT = ABSTRACT_ATT_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.Enum_String_ATT_IDImpl <em>Enum String ATT ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.Enum_String_ATT_IDImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnum_String_ATT_ID()
   * @generated
   */
  int ENUM_STRING_ATT_ID = 78;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STRING_ATT_ID__HEAD = ABSTRACT_ATT_ID__HEAD;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STRING_ATT_ID__NAME = ABSTRACT_ATT_ID__NAME;

  /**
   * The number of structural features of the '<em>Enum String ATT ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STRING_ATT_ID_FEATURE_COUNT = ABSTRACT_ATT_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.Enum_Integer_ATT_IDImpl <em>Enum Integer ATT ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.Enum_Integer_ATT_IDImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnum_Integer_ATT_ID()
   * @generated
   */
  int ENUM_INTEGER_ATT_ID = 79;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INTEGER_ATT_ID__HEAD = ABSTRACT_ATT_ID__HEAD;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INTEGER_ATT_ID__NAME = ABSTRACT_ATT_ID__NAME;

  /**
   * The number of structural features of the '<em>Enum Integer ATT ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INTEGER_ATT_ID_FEATURE_COUNT = ABSTRACT_ATT_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.Enum_Real_ATT_IDImpl <em>Enum Real ATT ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.Enum_Real_ATT_IDImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnum_Real_ATT_ID()
   * @generated
   */
  int ENUM_REAL_ATT_ID = 80;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REAL_ATT_ID__HEAD = ABSTRACT_ATT_ID__HEAD;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REAL_ATT_ID__NAME = ABSTRACT_ATT_ID__NAME;

  /**
   * The number of structural features of the '<em>Enum Real ATT ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REAL_ATT_ID_FEATURE_COUNT = ABSTRACT_ATT_ID_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.AttHeadImpl <em>Att Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.AttHeadImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getAttHead()
   * @generated
   */
  int ATT_HEAD = 81;

  /**
   * The feature id for the '<em><b>For All Features</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_HEAD__FOR_ALL_FEATURES = 0;

  /**
   * The feature id for the '<em><b>Owned Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_HEAD__OWNED_FEATURE = 1;

  /**
   * The number of structural features of the '<em>Att Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_HEAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.IfImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getIf()
   * @generated
   */
  int IF = 83;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.LeftImplicationImpl <em>Left Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.LeftImplicationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getLeftImplication()
   * @generated
   */
  int LEFT_IMPLICATION = 84;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_IMPLICATION__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_IMPLICATION__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Left Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_IMPLICATION_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RightImplicationImpl <em>Right Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RightImplicationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRightImplication()
   * @generated
   */
  int RIGHT_IMPLICATION = 85;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_IMPLICATION__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_IMPLICATION__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Right Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_IMPLICATION_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.BiImplicationImpl <em>Bi Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.BiImplicationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getBiImplication()
   * @generated
   */
  int BI_IMPLICATION = 86;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BI_IMPLICATION__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BI_IMPLICATION__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bi Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BI_IMPLICATION_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.OrImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getOr()
   * @generated
   */
  int OR = 87;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.AndImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getAnd()
   * @generated
   */
  int AND = 88;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.EqualityImpl <em>Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.EqualityImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 89;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.InequalityImpl <em>Inequality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.InequalityImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getInequality()
   * @generated
   */
  int INEQUALITY = 90;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INEQUALITY__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INEQUALITY__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inequality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INEQUALITY_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.LessImpl <em>Less</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.LessImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getLess()
   * @generated
   */
  int LESS = 91;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Less</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.LessequalImpl <em>Lessequal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.LessequalImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getLessequal()
   * @generated
   */
  int LESSEQUAL = 92;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSEQUAL__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSEQUAL__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lessequal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSEQUAL_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.GreaterImpl <em>Greater</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.GreaterImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getGreater()
   * @generated
   */
  int GREATER = 93;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.GreaterequalImpl <em>Greaterequal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.GreaterequalImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getGreaterequal()
   * @generated
   */
  int GREATEREQUAL = 94;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATEREQUAL__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATEREQUAL__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greaterequal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATEREQUAL_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.PlusImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 95;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.MinusImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 96;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.MultiplicationImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 97;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.DivisionImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 98;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.ExcludesImpl <em>Excludes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.ExcludesImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getExcludes()
   * @generated
   */
  int EXCLUDES = 99;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUDES__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUDES__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Excludes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUDES_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.lang.vM.impl.RequiresImpl <em>Requires</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.lang.vM.impl.RequiresImpl
   * @see fr.inria.lang.vM.impl.VMPackageImpl#getRequires()
   * @generated
   */
  int REQUIRES = 100;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES__LEFT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES__RIGHT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Requires</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.inria.lang.vM.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Model#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see fr.inria.lang.vM.Model#getBlocks()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Blocks();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.VmBlock <em>Vm Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vm Block</em>'.
   * @see fr.inria.lang.vM.VmBlock
   * @generated
   */
  EClass getVmBlock();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see fr.inria.lang.vM.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.lang.vM.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.PackageDeclaration#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see fr.inria.lang.vM.PackageDeclaration#getBlocks()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Blocks();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Declaration</em>'.
   * @see fr.inria.lang.vM.ImportDeclaration
   * @generated
   */
  EClass getImportDeclaration();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.ImportDeclaration#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see fr.inria.lang.vM.ImportDeclaration#getImportedNamespace()
   * @see #getImportDeclaration()
   * @generated
   */
  EAttribute getImportDeclaration_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.MetaDataDeclaration <em>Meta Data Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Data Declaration</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration
   * @generated
   */
  EClass getMetaDataDeclaration();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.MetaDataDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration#getName()
   * @see #getMetaDataDeclaration()
   * @generated
   */
  EAttribute getMetaDataDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.MetaDataDeclaration#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration#getVersion()
   * @see #getMetaDataDeclaration()
   * @generated
   */
  EReference getMetaDataDeclaration_Version();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.MetaDataDeclaration#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration#getDescription()
   * @see #getMetaDataDeclaration()
   * @generated
   */
  EAttribute getMetaDataDeclaration_Description();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.MetaDataDeclaration#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration#getAuthor()
   * @see #getMetaDataDeclaration()
   * @generated
   */
  EAttribute getMetaDataDeclaration_Author();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.MetaDataDeclaration#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Email</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration#getEmail()
   * @see #getMetaDataDeclaration()
   * @generated
   */
  EReference getMetaDataDeclaration_Email();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.MetaDataDeclaration#getOrganization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Organization</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration#getOrganization()
   * @see #getMetaDataDeclaration()
   * @generated
   */
  EAttribute getMetaDataDeclaration_Organization();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.MetaDataDeclaration#getPublication <em>Publication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Publication</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration#getPublication()
   * @see #getMetaDataDeclaration()
   * @generated
   */
  EAttribute getMetaDataDeclaration_Publication();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.MetaDataDeclaration#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see fr.inria.lang.vM.MetaDataDeclaration#getDate()
   * @see #getMetaDataDeclaration()
   * @generated
   */
  EAttribute getMetaDataDeclaration_Date();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Email</em>'.
   * @see fr.inria.lang.vM.Email
   * @generated
   */
  EClass getEmail();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Email#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Username</em>'.
   * @see fr.inria.lang.vM.Email#getUsername()
   * @see #getEmail()
   * @generated
   */
  EAttribute getEmail_Username();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Email#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain</em>'.
   * @see fr.inria.lang.vM.Email#getDomain()
   * @see #getEmail()
   * @generated
   */
  EAttribute getEmail_Domain();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see fr.inria.lang.vM.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Version#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Main</em>'.
   * @see fr.inria.lang.vM.Version#getMain()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Main();

  /**
   * Returns the meta object for the attribute list '{@link fr.inria.lang.vM.Version#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tail</em>'.
   * @see fr.inria.lang.vM.Version#getTail()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Tail();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Relationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationships</em>'.
   * @see fr.inria.lang.vM.Relationships
   * @generated
   */
  EClass getRelationships();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Relationships#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see fr.inria.lang.vM.Relationships#getRoot()
   * @see #getRelationships()
   * @generated
   */
  EReference getRelationships_Root();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.FeatureHierarchy <em>Feature Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Hierarchy</em>'.
   * @see fr.inria.lang.vM.FeatureHierarchy
   * @generated
   */
  EClass getFeatureHierarchy();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.FeatureHierarchy#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parent</em>'.
   * @see fr.inria.lang.vM.FeatureHierarchy#getParent()
   * @see #getFeatureHierarchy()
   * @generated
   */
  EReference getFeatureHierarchy_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.FeatureHierarchy#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see fr.inria.lang.vM.FeatureHierarchy#getChildren()
   * @see #getFeatureHierarchy()
   * @generated
   */
  EReference getFeatureHierarchy_Children();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.FeatureDefinition <em>Feature Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Definition</em>'.
   * @see fr.inria.lang.vM.FeatureDefinition
   * @generated
   */
  EClass getFeatureDefinition();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see fr.inria.lang.vM.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Feature#isNotTranslatable <em>Not Translatable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Translatable</em>'.
   * @see fr.inria.lang.vM.Feature#isNotTranslatable()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_NotTranslatable();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Feature#isRunTime <em>Run Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Run Time</em>'.
   * @see fr.inria.lang.vM.Feature#isRunTime()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_RunTime();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Feature#isNotDecidable <em>Not Decidable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Decidable</em>'.
   * @see fr.inria.lang.vM.Feature#isNotDecidable()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_NotDecidable();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Feature#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see fr.inria.lang.vM.Feature#isOptional()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Optional();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Feature#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see fr.inria.lang.vM.Feature#getMin()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Min();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Feature#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see fr.inria.lang.vM.Feature#getMax()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Max();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.lang.vM.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.FeaturesGroup <em>Features Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Features Group</em>'.
   * @see fr.inria.lang.vM.FeaturesGroup
   * @generated
   */
  EClass getFeaturesGroup();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.FeaturesGroup#getGroupedFeatures <em>Grouped Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grouped Features</em>'.
   * @see fr.inria.lang.vM.FeaturesGroup#getGroupedFeatures()
   * @see #getFeaturesGroup()
   * @generated
   */
  EReference getFeaturesGroup_GroupedFeatures();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Xorgroup <em>Xorgroup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xorgroup</em>'.
   * @see fr.inria.lang.vM.Xorgroup
   * @generated
   */
  EClass getXorgroup();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Orgroup <em>Orgroup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Orgroup</em>'.
   * @see fr.inria.lang.vM.Orgroup
   * @generated
   */
  EClass getOrgroup();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.CardinalityBased <em>Cardinality Based</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality Based</em>'.
   * @see fr.inria.lang.vM.CardinalityBased
   * @generated
   */
  EClass getCardinalityBased();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.CardinalityBased#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see fr.inria.lang.vM.CardinalityBased#getMin()
   * @see #getCardinalityBased()
   * @generated
   */
  EAttribute getCardinalityBased_Min();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.CardinalityBased#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see fr.inria.lang.vM.CardinalityBased#getMax()
   * @see #getCardinalityBased()
   * @generated
   */
  EAttribute getCardinalityBased_Max();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.CardinalityBased#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see fr.inria.lang.vM.CardinalityBased#isAll()
   * @see #getCardinalityBased()
   * @generated
   */
  EAttribute getCardinalityBased_All();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributes</em>'.
   * @see fr.inria.lang.vM.Attributes
   * @generated
   */
  EClass getAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Attributes#getAttrDefs <em>Attr Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr Defs</em>'.
   * @see fr.inria.lang.vM.Attributes#getAttrDefs()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_AttrDefs();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Attributes#getAttrValuations <em>Attr Valuations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr Valuations</em>'.
   * @see fr.inria.lang.vM.Attributes#getAttrValuations()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_AttrValuations();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.AttrDef <em>Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr Def</em>'.
   * @see fr.inria.lang.vM.AttrDef
   * @generated
   */
  EClass getAttrDef();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.AttrDef#isNotTranslatable <em>Not Translatable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Translatable</em>'.
   * @see fr.inria.lang.vM.AttrDef#isNotTranslatable()
   * @see #getAttrDef()
   * @generated
   */
  EAttribute getAttrDef_NotTranslatable();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.AttrDef#isRunTime <em>Run Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Run Time</em>'.
   * @see fr.inria.lang.vM.AttrDef#isRunTime()
   * @see #getAttrDef()
   * @generated
   */
  EAttribute getAttrDef_RunTime();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.AttrDef#isNotDecidable <em>Not Decidable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Decidable</em>'.
   * @see fr.inria.lang.vM.AttrDef#isNotDecidable()
   * @see #getAttrDef()
   * @generated
   */
  EAttribute getAttrDef_NotDecidable();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.AttrDef#getBasicAttrDef <em>Basic Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic Attr Def</em>'.
   * @see fr.inria.lang.vM.AttrDef#getBasicAttrDef()
   * @see #getAttrDef()
   * @generated
   */
  EReference getAttrDef_BasicAttrDef();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.AttrDef#getEnumAttrDef <em>Enum Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Attr Def</em>'.
   * @see fr.inria.lang.vM.AttrDef#getEnumAttrDef()
   * @see #getAttrDef()
   * @generated
   */
  EReference getAttrDef_EnumAttrDef();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BasicAttrDef <em>Basic Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Attr Def</em>'.
   * @see fr.inria.lang.vM.BasicAttrDef
   * @generated
   */
  EClass getBasicAttrDef();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BooleanAttrDef <em>Boolean Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Attr Def</em>'.
   * @see fr.inria.lang.vM.BooleanAttrDef
   * @generated
   */
  EClass getBooleanAttrDef();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.BooleanAttrDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.inria.lang.vM.BooleanAttrDef#getName()
   * @see #getBooleanAttrDef()
   * @generated
   */
  EReference getBooleanAttrDef_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.BooleanAttrDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.BooleanAttrDef#getValue()
   * @see #getBooleanAttrDef()
   * @generated
   */
  EAttribute getBooleanAttrDef_Value();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.BooleanAttrDef#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see fr.inria.lang.vM.BooleanAttrDef#getDefault()
   * @see #getBooleanAttrDef()
   * @generated
   */
  EReference getBooleanAttrDef_Default();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.StringAttrDef <em>String Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Attr Def</em>'.
   * @see fr.inria.lang.vM.StringAttrDef
   * @generated
   */
  EClass getStringAttrDef();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.StringAttrDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.inria.lang.vM.StringAttrDef#getName()
   * @see #getStringAttrDef()
   * @generated
   */
  EReference getStringAttrDef_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.StringAttrDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.StringAttrDef#getValue()
   * @see #getStringAttrDef()
   * @generated
   */
  EAttribute getStringAttrDef_Value();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.StringAttrDef#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see fr.inria.lang.vM.StringAttrDef#getDefault()
   * @see #getStringAttrDef()
   * @generated
   */
  EReference getStringAttrDef_Default();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.IntegerAttrDef <em>Integer Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Attr Def</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDef
   * @generated
   */
  EClass getIntegerAttrDef();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.IntegerAttrDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDef#getName()
   * @see #getIntegerAttrDef()
   * @generated
   */
  EReference getIntegerAttrDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.IntegerAttrDef#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDef#getDefault()
   * @see #getIntegerAttrDef()
   * @generated
   */
  EReference getIntegerAttrDef_Default();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.IntegerAttrDefBounded <em>Integer Attr Def Bounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Attr Def Bounded</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefBounded
   * @generated
   */
  EClass getIntegerAttrDefBounded();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.IntegerAttrDefBounded#getComplements <em>Complements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complements</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefBounded#getComplements()
   * @see #getIntegerAttrDefBounded()
   * @generated
   */
  EReference getIntegerAttrDefBounded_Complements();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.IntegerAttrDefBounded#getComplement <em>Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complement</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefBounded#getComplement()
   * @see #getIntegerAttrDefBounded()
   * @generated
   */
  EReference getIntegerAttrDefBounded_Complement();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.IntegerAttrDefComplement <em>Integer Attr Def Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Attr Def Complement</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefComplement
   * @generated
   */
  EClass getIntegerAttrDefComplement();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.IntegerAttrDefComplement#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefComplement#getMin()
   * @see #getIntegerAttrDefComplement()
   * @generated
   */
  EAttribute getIntegerAttrDefComplement_Min();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.IntegerAttrDefComplement#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefComplement#getMax()
   * @see #getIntegerAttrDefComplement()
   * @generated
   */
  EAttribute getIntegerAttrDefComplement_Max();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.IntegerAttrDefComplement#getDelta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delta</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefComplement#getDelta()
   * @see #getIntegerAttrDefComplement()
   * @generated
   */
  EReference getIntegerAttrDefComplement_Delta();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.IntegerAttrDefUnbounded <em>Integer Attr Def Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Attr Def Unbounded</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefUnbounded
   * @generated
   */
  EClass getIntegerAttrDefUnbounded();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.IntegerAttrDefUnbounded#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.IntegerAttrDefUnbounded#getValue()
   * @see #getIntegerAttrDefUnbounded()
   * @generated
   */
  EAttribute getIntegerAttrDefUnbounded_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.RealAttrDef <em>Real Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Attr Def</em>'.
   * @see fr.inria.lang.vM.RealAttrDef
   * @generated
   */
  EClass getRealAttrDef();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.RealAttrDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.inria.lang.vM.RealAttrDef#getName()
   * @see #getRealAttrDef()
   * @generated
   */
  EReference getRealAttrDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.RealAttrDef#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see fr.inria.lang.vM.RealAttrDef#getDefault()
   * @see #getRealAttrDef()
   * @generated
   */
  EReference getRealAttrDef_Default();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.RealAttrDefBounded <em>Real Attr Def Bounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Attr Def Bounded</em>'.
   * @see fr.inria.lang.vM.RealAttrDefBounded
   * @generated
   */
  EClass getRealAttrDefBounded();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.RealAttrDefBounded#getComplement <em>Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complement</em>'.
   * @see fr.inria.lang.vM.RealAttrDefBounded#getComplement()
   * @see #getRealAttrDefBounded()
   * @generated
   */
  EReference getRealAttrDefBounded_Complement();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.RealAttrDefComplement <em>Real Attr Def Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Attr Def Complement</em>'.
   * @see fr.inria.lang.vM.RealAttrDefComplement
   * @generated
   */
  EClass getRealAttrDefComplement();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.RealAttrDefComplement#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see fr.inria.lang.vM.RealAttrDefComplement#getMin()
   * @see #getRealAttrDefComplement()
   * @generated
   */
  EAttribute getRealAttrDefComplement_Min();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.RealAttrDefComplement#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see fr.inria.lang.vM.RealAttrDefComplement#getMax()
   * @see #getRealAttrDefComplement()
   * @generated
   */
  EAttribute getRealAttrDefComplement_Max();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.RealAttrDefComplement#getDelta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delta</em>'.
   * @see fr.inria.lang.vM.RealAttrDefComplement#getDelta()
   * @see #getRealAttrDefComplement()
   * @generated
   */
  EReference getRealAttrDefComplement_Delta();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.RealAttrDefUnbounded <em>Real Attr Def Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Attr Def Unbounded</em>'.
   * @see fr.inria.lang.vM.RealAttrDefUnbounded
   * @generated
   */
  EClass getRealAttrDefUnbounded();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.RealAttrDefUnbounded#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.RealAttrDefUnbounded#getValue()
   * @see #getRealAttrDefUnbounded()
   * @generated
   */
  EAttribute getRealAttrDefUnbounded_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.EnumAttrDef <em>Enum Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Attr Def</em>'.
   * @see fr.inria.lang.vM.EnumAttrDef
   * @generated
   */
  EClass getEnumAttrDef();

  /**
   * Returns the meta object for the attribute list '{@link fr.inria.lang.vM.EnumAttrDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see fr.inria.lang.vM.EnumAttrDef#getValue()
   * @see #getEnumAttrDef()
   * @generated
   */
  EAttribute getEnumAttrDef_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.EnumStringDef <em>Enum String Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum String Def</em>'.
   * @see fr.inria.lang.vM.EnumStringDef
   * @generated
   */
  EClass getEnumStringDef();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.EnumStringDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.inria.lang.vM.EnumStringDef#getName()
   * @see #getEnumStringDef()
   * @generated
   */
  EReference getEnumStringDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.EnumStringDef#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see fr.inria.lang.vM.EnumStringDef#getDefault()
   * @see #getEnumStringDef()
   * @generated
   */
  EReference getEnumStringDef_Default();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.EnumIntegerDef <em>Enum Integer Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Integer Def</em>'.
   * @see fr.inria.lang.vM.EnumIntegerDef
   * @generated
   */
  EClass getEnumIntegerDef();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.EnumIntegerDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.inria.lang.vM.EnumIntegerDef#getName()
   * @see #getEnumIntegerDef()
   * @generated
   */
  EReference getEnumIntegerDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.EnumIntegerDef#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see fr.inria.lang.vM.EnumIntegerDef#getDefault()
   * @see #getEnumIntegerDef()
   * @generated
   */
  EReference getEnumIntegerDef_Default();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.EnumRealDef <em>Enum Real Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Real Def</em>'.
   * @see fr.inria.lang.vM.EnumRealDef
   * @generated
   */
  EClass getEnumRealDef();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.EnumRealDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see fr.inria.lang.vM.EnumRealDef#getName()
   * @see #getEnumRealDef()
   * @generated
   */
  EReference getEnumRealDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.EnumRealDef#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see fr.inria.lang.vM.EnumRealDef#getDefault()
   * @see #getEnumRealDef()
   * @generated
   */
  EReference getEnumRealDef_Default();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BoolDefaultDef <em>Bool Default Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Default Def</em>'.
   * @see fr.inria.lang.vM.BoolDefaultDef
   * @generated
   */
  EClass getBoolDefaultDef();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.BoolDefaultDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.BoolDefaultDef#getValue()
   * @see #getBoolDefaultDef()
   * @generated
   */
  EAttribute getBoolDefaultDef_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.StringDefaultDef <em>String Default Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Default Def</em>'.
   * @see fr.inria.lang.vM.StringDefaultDef
   * @generated
   */
  EClass getStringDefaultDef();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.StringDefaultDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.StringDefaultDef#getValue()
   * @see #getStringDefaultDef()
   * @generated
   */
  EAttribute getStringDefaultDef_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.IntegerDeltaDef <em>Integer Delta Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Delta Def</em>'.
   * @see fr.inria.lang.vM.IntegerDeltaDef
   * @generated
   */
  EClass getIntegerDeltaDef();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.IntegerDeltaDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.IntegerDeltaDef#getValue()
   * @see #getIntegerDeltaDef()
   * @generated
   */
  EAttribute getIntegerDeltaDef_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.IntegerDefaultDef <em>Integer Default Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Default Def</em>'.
   * @see fr.inria.lang.vM.IntegerDefaultDef
   * @generated
   */
  EClass getIntegerDefaultDef();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.IntegerDefaultDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.IntegerDefaultDef#getValue()
   * @see #getIntegerDefaultDef()
   * @generated
   */
  EAttribute getIntegerDefaultDef_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.RealDeltaDef <em>Real Delta Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Delta Def</em>'.
   * @see fr.inria.lang.vM.RealDeltaDef
   * @generated
   */
  EClass getRealDeltaDef();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.RealDeltaDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.RealDeltaDef#getValue()
   * @see #getRealDeltaDef()
   * @generated
   */
  EAttribute getRealDeltaDef_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.RealDefaultDef <em>Real Default Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Default Def</em>'.
   * @see fr.inria.lang.vM.RealDefaultDef
   * @generated
   */
  EClass getRealDefaultDef();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.RealDefaultDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.RealDefaultDef#getValue()
   * @see #getRealDefaultDef()
   * @generated
   */
  EAttribute getRealDefaultDef_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Descriptions <em>Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descriptions</em>'.
   * @see fr.inria.lang.vM.Descriptions
   * @generated
   */
  EClass getDescriptions();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Descriptions#getFeaturesDescriptions <em>Features Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features Descriptions</em>'.
   * @see fr.inria.lang.vM.Descriptions#getFeaturesDescriptions()
   * @see #getDescriptions()
   * @generated
   */
  EReference getDescriptions_FeaturesDescriptions();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Descriptions#getAttributesDescriptions <em>Attributes Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes Descriptions</em>'.
   * @see fr.inria.lang.vM.Descriptions#getAttributesDescriptions()
   * @see #getDescriptions()
   * @generated
   */
  EReference getDescriptions_AttributesDescriptions();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.FeatureDescription <em>Feature Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Description</em>'.
   * @see fr.inria.lang.vM.FeatureDescription
   * @generated
   */
  EClass getFeatureDescription();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.FeatureDescription#getRefFeat <em>Ref Feat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Feat</em>'.
   * @see fr.inria.lang.vM.FeatureDescription#getRefFeat()
   * @see #getFeatureDescription()
   * @generated
   */
  EReference getFeatureDescription_RefFeat();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.FeatureDescription#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.inria.lang.vM.FeatureDescription#getDescription()
   * @see #getFeatureDescription()
   * @generated
   */
  EAttribute getFeatureDescription_Description();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.AttributeDescription <em>Attribute Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Description</em>'.
   * @see fr.inria.lang.vM.AttributeDescription
   * @generated
   */
  EClass getAttributeDescription();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.AttributeDescription#getRefFeat <em>Ref Feat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Feat</em>'.
   * @see fr.inria.lang.vM.AttributeDescription#getRefFeat()
   * @see #getAttributeDescription()
   * @generated
   */
  EReference getAttributeDescription_RefFeat();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.AttributeDescription#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.AttributeDescription#getRefAtt()
   * @see #getAttributeDescription()
   * @generated
   */
  EReference getAttributeDescription_RefAtt();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.AttributeDescription#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.inria.lang.vM.AttributeDescription#getDescription()
   * @see #getAttributeDescription()
   * @generated
   */
  EAttribute getAttributeDescription_Description();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Constraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraints</em>'.
   * @see fr.inria.lang.vM.Constraints
   * @generated
   */
  EClass getConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Constraints#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see fr.inria.lang.vM.Constraints#getConstraints()
   * @see #getConstraints()
   * @generated
   */
  EReference getConstraints_Constraints();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see fr.inria.lang.vM.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Constraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.lang.vM.Constraint#getName()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Constraint#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.inria.lang.vM.Constraint#getExpression()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Expression();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.ComplexExpression <em>Complex Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Expression</em>'.
   * @see fr.inria.lang.vM.ComplexExpression
   * @generated
   */
  EClass getComplexExpression();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see fr.inria.lang.vM.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.SpecialExpression <em>Special Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Special Expression</em>'.
   * @see fr.inria.lang.vM.SpecialExpression
   * @generated
   */
  EClass getSpecialExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.SpecialExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see fr.inria.lang.vM.SpecialExpression#getOp()
   * @see #getSpecialExpression()
   * @generated
   */
  EAttribute getSpecialExpression_Op();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.SpecialExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Expression</em>'.
   * @see fr.inria.lang.vM.SpecialExpression#getExpression()
   * @see #getSpecialExpression()
   * @generated
   */
  EReference getSpecialExpression_Expression();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Expression</em>'.
   * @see fr.inria.lang.vM.StringExpression
   * @generated
   */
  EClass getStringExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.StringExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.StringExpression#getValue()
   * @see #getStringExpression()
   * @generated
   */
  EAttribute getStringExpression_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.PrimitiveExpression <em>Primitive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Expression</em>'.
   * @see fr.inria.lang.vM.PrimitiveExpression
   * @generated
   */
  EClass getPrimitiveExpression();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.PrimitiveExpression#getFeatureID <em>Feature ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature ID</em>'.
   * @see fr.inria.lang.vM.PrimitiveExpression#getFeatureID()
   * @see #getPrimitiveExpression()
   * @generated
   */
  EReference getPrimitiveExpression_FeatureID();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.PrimitiveExpression#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see fr.inria.lang.vM.PrimitiveExpression#getHead()
   * @see #getPrimitiveExpression()
   * @generated
   */
  EReference getPrimitiveExpression_Head();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.PrimitiveExpression#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.PrimitiveExpression#getRefAtt()
   * @see #getPrimitiveExpression()
   * @generated
   */
  EReference getPrimitiveExpression_RefAtt();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see fr.inria.lang.vM.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.BooleanExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.BooleanExpression#getValue()
   * @see #getBooleanExpression()
   * @generated
   */
  EAttribute getBooleanExpression_Value();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.BooleanExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see fr.inria.lang.vM.BooleanExpression#getOp()
   * @see #getBooleanExpression()
   * @generated
   */
  EAttribute getBooleanExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.BooleanExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.inria.lang.vM.BooleanExpression#getExpression()
   * @see #getBooleanExpression()
   * @generated
   */
  EReference getBooleanExpression_Expression();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.BooleanExpression#getExpression_list <em>Expression list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression list</em>'.
   * @see fr.inria.lang.vM.BooleanExpression#getExpression_list()
   * @see #getBooleanExpression()
   * @generated
   */
  EReference getBooleanExpression_Expression_list();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BrackedExpression <em>Bracked Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracked Expression</em>'.
   * @see fr.inria.lang.vM.BrackedExpression
   * @generated
   */
  EClass getBrackedExpression();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.BrackedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.inria.lang.vM.BrackedExpression#getExpression()
   * @see #getBrackedExpression()
   * @generated
   */
  EReference getBrackedExpression_Expression();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.NumericExpression <em>Numeric Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Expression</em>'.
   * @see fr.inria.lang.vM.NumericExpression
   * @generated
   */
  EClass getNumericExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.NumericExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.NumericExpression#getValue()
   * @see #getNumericExpression()
   * @generated
   */
  EAttribute getNumericExpression_Value();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.NumericExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see fr.inria.lang.vM.NumericExpression#getOp()
   * @see #getNumericExpression()
   * @generated
   */
  EAttribute getNumericExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.NumericExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.inria.lang.vM.NumericExpression#getExpression()
   * @see #getNumericExpression()
   * @generated
   */
  EReference getNumericExpression_Expression();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.NumericExpression#getExpression_list <em>Expression list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression list</em>'.
   * @see fr.inria.lang.vM.NumericExpression#getExpression_list()
   * @see #getNumericExpression()
   * @generated
   */
  EReference getNumericExpression_Expression_list();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.NumericExpression_List <em>Numeric Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Expression List</em>'.
   * @see fr.inria.lang.vM.NumericExpression_List
   * @generated
   */
  EClass getNumericExpression_List();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.NumericExpression_List#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ex</em>'.
   * @see fr.inria.lang.vM.NumericExpression_List#getEx()
   * @see #getNumericExpression_List()
   * @generated
   */
  EReference getNumericExpression_List_Ex();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BooleanExpression_List <em>Boolean Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression List</em>'.
   * @see fr.inria.lang.vM.BooleanExpression_List
   * @generated
   */
  EClass getBooleanExpression_List();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.BooleanExpression_List#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ex</em>'.
   * @see fr.inria.lang.vM.BooleanExpression_List#getEx()
   * @see #getBooleanExpression_List()
   * @generated
   */
  EReference getBooleanExpression_List_Ex();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Objectives <em>Objectives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objectives</em>'.
   * @see fr.inria.lang.vM.Objectives
   * @generated
   */
  EClass getObjectives();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Objectives#getObjectives <em>Objectives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objectives</em>'.
   * @see fr.inria.lang.vM.Objectives#getObjectives()
   * @see #getObjectives()
   * @generated
   */
  EReference getObjectives_Objectives();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Objective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objective</em>'.
   * @see fr.inria.lang.vM.Objective
   * @generated
   */
  EClass getObjective();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Objective#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.lang.vM.Objective#getName()
   * @see #getObjective()
   * @generated
   */
  EAttribute getObjective_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Objective#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see fr.inria.lang.vM.Objective#getOp()
   * @see #getObjective()
   * @generated
   */
  EAttribute getObjective_Op();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Objective#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.inria.lang.vM.Objective#getExpression()
   * @see #getObjective()
   * @generated
   */
  EReference getObjective_Expression();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.ObjectiveExpression <em>Objective Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objective Expression</em>'.
   * @see fr.inria.lang.vM.ObjectiveExpression
   * @generated
   */
  EClass getObjectiveExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.ObjectiveExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see fr.inria.lang.vM.ObjectiveExpression#getOp()
   * @see #getObjectiveExpression()
   * @generated
   */
  EAttribute getObjectiveExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.ObjectiveExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.inria.lang.vM.ObjectiveExpression#getExpression()
   * @see #getObjectiveExpression()
   * @generated
   */
  EReference getObjectiveExpression_Expression();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Configurations <em>Configurations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configurations</em>'.
   * @see fr.inria.lang.vM.Configurations
   * @generated
   */
  EClass getConfigurations();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Configurations#getConfigurations <em>Configurations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configurations</em>'.
   * @see fr.inria.lang.vM.Configurations#getConfigurations()
   * @see #getConfigurations()
   * @generated
   */
  EReference getConfigurations_Configurations();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see fr.inria.lang.vM.Configuration
   * @generated
   */
  EClass getConfiguration();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Configuration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.lang.vM.Configuration#getName()
   * @see #getConfiguration()
   * @generated
   */
  EAttribute getConfiguration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Configuration#getBooleanValuation <em>Boolean Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Valuation</em>'.
   * @see fr.inria.lang.vM.Configuration#getBooleanValuation()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_BooleanValuation();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.Configuration#getExtendedValuation <em>Extended Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extended Valuation</em>'.
   * @see fr.inria.lang.vM.Configuration#getExtendedValuation()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_ExtendedValuation();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BooleanValuation <em>Boolean Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Valuation</em>'.
   * @see fr.inria.lang.vM.BooleanValuation
   * @generated
   */
  EClass getBooleanValuation();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.BooleanValuation#isNotSelected <em>Not Selected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Selected</em>'.
   * @see fr.inria.lang.vM.BooleanValuation#isNotSelected()
   * @see #getBooleanValuation()
   * @generated
   */
  EAttribute getBooleanValuation_NotSelected();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.BooleanValuation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see fr.inria.lang.vM.BooleanValuation#getFeature()
   * @see #getBooleanValuation()
   * @generated
   */
  EReference getBooleanValuation_Feature();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.ExtendedValuation <em>Extended Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Valuation</em>'.
   * @see fr.inria.lang.vM.ExtendedValuation
   * @generated
   */
  EClass getExtendedValuation();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BasicAttrValuation <em>Basic Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Attr Valuation</em>'.
   * @see fr.inria.lang.vM.BasicAttrValuation
   * @generated
   */
  EClass getBasicAttrValuation();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.BasicAttrValuation#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see fr.inria.lang.vM.BasicAttrValuation#getHead()
   * @see #getBasicAttrValuation()
   * @generated
   */
  EReference getBasicAttrValuation_Head();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.BasicAttrValuation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.BasicAttrValuation#getValue()
   * @see #getBasicAttrValuation()
   * @generated
   */
  EAttribute getBasicAttrValuation_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.RealAttrValuation <em>Real Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Attr Valuation</em>'.
   * @see fr.inria.lang.vM.RealAttrValuation
   * @generated
   */
  EClass getRealAttrValuation();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.RealAttrValuation#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.RealAttrValuation#getRefAtt()
   * @see #getRealAttrValuation()
   * @generated
   */
  EReference getRealAttrValuation_RefAtt();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.IntegerAttrValuation <em>Integer Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Attr Valuation</em>'.
   * @see fr.inria.lang.vM.IntegerAttrValuation
   * @generated
   */
  EClass getIntegerAttrValuation();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.IntegerAttrValuation#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.IntegerAttrValuation#getRefAtt()
   * @see #getIntegerAttrValuation()
   * @generated
   */
  EReference getIntegerAttrValuation_RefAtt();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BooleanAttrValuation <em>Boolean Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Attr Valuation</em>'.
   * @see fr.inria.lang.vM.BooleanAttrValuation
   * @generated
   */
  EClass getBooleanAttrValuation();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.BooleanAttrValuation#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.BooleanAttrValuation#getRefAtt()
   * @see #getBooleanAttrValuation()
   * @generated
   */
  EReference getBooleanAttrValuation_RefAtt();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.StringAttrValuation <em>String Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Attr Valuation</em>'.
   * @see fr.inria.lang.vM.StringAttrValuation
   * @generated
   */
  EClass getStringAttrValuation();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.StringAttrValuation#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.StringAttrValuation#getRefAtt()
   * @see #getStringAttrValuation()
   * @generated
   */
  EReference getStringAttrValuation_RefAtt();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.AdvancedAttrValuation <em>Advanced Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advanced Attr Valuation</em>'.
   * @see fr.inria.lang.vM.AdvancedAttrValuation
   * @generated
   */
  EClass getAdvancedAttrValuation();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.AdvancedAttrValuation#getAttVsVal <em>Att Vs Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att Vs Val</em>'.
   * @see fr.inria.lang.vM.AdvancedAttrValuation#getAttVsVal()
   * @see #getAdvancedAttrValuation()
   * @generated
   */
  EReference getAdvancedAttrValuation_AttVsVal();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.AdvancedAttrValuation#getFeatVsVal <em>Feat Vs Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feat Vs Val</em>'.
   * @see fr.inria.lang.vM.AdvancedAttrValuation#getFeatVsVal()
   * @see #getAdvancedAttrValuation()
   * @generated
   */
  EReference getAdvancedAttrValuation_FeatVsVal();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.AdvancedAttrValuation#getAttVsValForMultiFeature <em>Att Vs Val For Multi Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att Vs Val For Multi Feature</em>'.
   * @see fr.inria.lang.vM.AdvancedAttrValuation#getAttVsValForMultiFeature()
   * @see #getAdvancedAttrValuation()
   * @generated
   */
  EReference getAdvancedAttrValuation_AttVsValForMultiFeature();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone <em>Table Based Valuation By Feature And Clone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Based Valuation By Feature And Clone</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByFeatureAndClone
   * @generated
   */
  EClass getTableBasedValuationByFeatureAndClone();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getRefFeature <em>Ref Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Feature</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getRefFeature()
   * @see #getTableBasedValuationByFeatureAndClone()
   * @generated
   */
  EReference getTableBasedValuationByFeatureAndClone_RefFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getName()
   * @see #getTableBasedValuationByFeatureAndClone()
   * @generated
   */
  EAttribute getTableBasedValuationByFeatureAndClone_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByFeatureAndClone#getPairs()
   * @see #getTableBasedValuationByFeatureAndClone()
   * @generated
   */
  EReference getTableBasedValuationByFeatureAndClone_Pairs();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.TableBasedValuationByFeature <em>Table Based Valuation By Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Based Valuation By Feature</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByFeature
   * @generated
   */
  EClass getTableBasedValuationByFeature();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.TableBasedValuationByFeature#getRefFeature <em>Ref Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Feature</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByFeature#getRefFeature()
   * @see #getTableBasedValuationByFeature()
   * @generated
   */
  EReference getTableBasedValuationByFeature_RefFeature();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.TableBasedValuationByFeature#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByFeature#getPairs()
   * @see #getTableBasedValuationByFeature()
   * @generated
   */
  EReference getTableBasedValuationByFeature_Pairs();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.PairAttributeValue <em>Pair Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair Attribute Value</em>'.
   * @see fr.inria.lang.vM.PairAttributeValue
   * @generated
   */
  EClass getPairAttributeValue();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.PairAttributeValue#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.PairAttributeValue#getRefAtt()
   * @see #getPairAttributeValue()
   * @generated
   */
  EReference getPairAttributeValue_RefAtt();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.PairAttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.PairAttributeValue#getValue()
   * @see #getPairAttributeValue()
   * @generated
   */
  EAttribute getPairAttributeValue_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.TableBasedValuationByAttribute <em>Table Based Valuation By Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Based Valuation By Attribute</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByAttribute
   * @generated
   */
  EClass getTableBasedValuationByAttribute();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForInteger <em>Table Based Valuation By Attribute For Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Based Valuation By Attribute For Integer</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByAttributeForInteger
   * @generated
   */
  EClass getTableBasedValuationByAttributeForInteger();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForInteger#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByAttributeForInteger#getRefAtt()
   * @see #getTableBasedValuationByAttributeForInteger()
   * @generated
   */
  EReference getTableBasedValuationByAttributeForInteger_RefAtt();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForInteger#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByAttributeForInteger#getPairs()
   * @see #getTableBasedValuationByAttributeForInteger()
   * @generated
   */
  EReference getTableBasedValuationByAttributeForInteger_Pairs();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.PairFeatureInteger <em>Pair Feature Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair Feature Integer</em>'.
   * @see fr.inria.lang.vM.PairFeatureInteger
   * @generated
   */
  EClass getPairFeatureInteger();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.PairFeatureInteger#getRefFeat <em>Ref Feat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Feat</em>'.
   * @see fr.inria.lang.vM.PairFeatureInteger#getRefFeat()
   * @see #getPairFeatureInteger()
   * @generated
   */
  EReference getPairFeatureInteger_RefFeat();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.PairFeatureInteger#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.PairFeatureInteger#getValue()
   * @see #getPairFeatureInteger()
   * @generated
   */
  EAttribute getPairFeatureInteger_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForReal <em>Table Based Valuation By Attribute For Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Based Valuation By Attribute For Real</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByAttributeForReal
   * @generated
   */
  EClass getTableBasedValuationByAttributeForReal();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForReal#getRefAtt <em>Ref Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Att</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByAttributeForReal#getRefAtt()
   * @see #getTableBasedValuationByAttributeForReal()
   * @generated
   */
  EReference getTableBasedValuationByAttributeForReal_RefAtt();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForReal#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see fr.inria.lang.vM.TableBasedValuationByAttributeForReal#getPairs()
   * @see #getTableBasedValuationByAttributeForReal()
   * @generated
   */
  EReference getTableBasedValuationByAttributeForReal_Pairs();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.PairFeatureReal <em>Pair Feature Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair Feature Real</em>'.
   * @see fr.inria.lang.vM.PairFeatureReal
   * @generated
   */
  EClass getPairFeatureReal();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.PairFeatureReal#getRefFeat <em>Ref Feat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Feat</em>'.
   * @see fr.inria.lang.vM.PairFeatureReal#getRefFeat()
   * @see #getPairFeatureReal()
   * @generated
   */
  EReference getPairFeatureReal_RefFeat();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.PairFeatureReal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.inria.lang.vM.PairFeatureReal#getValue()
   * @see #getPairFeatureReal()
   * @generated
   */
  EAttribute getPairFeatureReal_Value();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Boolean_ATT_ID <em>Boolean ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean ATT ID</em>'.
   * @see fr.inria.lang.vM.Boolean_ATT_ID
   * @generated
   */
  EClass getBoolean_ATT_ID();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.String_ATT_ID <em>String ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String ATT ID</em>'.
   * @see fr.inria.lang.vM.String_ATT_ID
   * @generated
   */
  EClass getString_ATT_ID();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Integer_ATT_ID <em>Integer ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer ATT ID</em>'.
   * @see fr.inria.lang.vM.Integer_ATT_ID
   * @generated
   */
  EClass getInteger_ATT_ID();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Real_ATT_ID <em>Real ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real ATT ID</em>'.
   * @see fr.inria.lang.vM.Real_ATT_ID
   * @generated
   */
  EClass getReal_ATT_ID();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Enum_String_ATT_ID <em>Enum String ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum String ATT ID</em>'.
   * @see fr.inria.lang.vM.Enum_String_ATT_ID
   * @generated
   */
  EClass getEnum_String_ATT_ID();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Enum_Integer_ATT_ID <em>Enum Integer ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Integer ATT ID</em>'.
   * @see fr.inria.lang.vM.Enum_Integer_ATT_ID
   * @generated
   */
  EClass getEnum_Integer_ATT_ID();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Enum_Real_ATT_ID <em>Enum Real ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Real ATT ID</em>'.
   * @see fr.inria.lang.vM.Enum_Real_ATT_ID
   * @generated
   */
  EClass getEnum_Real_ATT_ID();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.AttHead <em>Att Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Head</em>'.
   * @see fr.inria.lang.vM.AttHead
   * @generated
   */
  EClass getAttHead();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.AttHead#isForAllFeatures <em>For All Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>For All Features</em>'.
   * @see fr.inria.lang.vM.AttHead#isForAllFeatures()
   * @see #getAttHead()
   * @generated
   */
  EAttribute getAttHead_ForAllFeatures();

  /**
   * Returns the meta object for the reference '{@link fr.inria.lang.vM.AttHead#getOwnedFeature <em>Owned Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Owned Feature</em>'.
   * @see fr.inria.lang.vM.AttHead#getOwnedFeature()
   * @see #getAttHead()
   * @generated
   */
  EReference getAttHead_OwnedFeature();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Abstract_ATT_ID <em>Abstract ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract ATT ID</em>'.
   * @see fr.inria.lang.vM.Abstract_ATT_ID
   * @generated
   */
  EClass getAbstract_ATT_ID();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Abstract_ATT_ID#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see fr.inria.lang.vM.Abstract_ATT_ID#getHead()
   * @see #getAbstract_ATT_ID()
   * @generated
   */
  EReference getAbstract_ATT_ID_Head();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.lang.vM.Abstract_ATT_ID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.lang.vM.Abstract_ATT_ID#getName()
   * @see #getAbstract_ATT_ID()
   * @generated
   */
  EAttribute getAbstract_ATT_ID_Name();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see fr.inria.lang.vM.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.If#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.If#getLeft()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Left();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.lang.vM.If#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see fr.inria.lang.vM.If#getRight()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.LeftImplication <em>Left Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Implication</em>'.
   * @see fr.inria.lang.vM.LeftImplication
   * @generated
   */
  EClass getLeftImplication();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.LeftImplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.LeftImplication#getLeft()
   * @see #getLeftImplication()
   * @generated
   */
  EReference getLeftImplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.LeftImplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.LeftImplication#getRight()
   * @see #getLeftImplication()
   * @generated
   */
  EReference getLeftImplication_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.RightImplication <em>Right Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Implication</em>'.
   * @see fr.inria.lang.vM.RightImplication
   * @generated
   */
  EClass getRightImplication();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.RightImplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.RightImplication#getLeft()
   * @see #getRightImplication()
   * @generated
   */
  EReference getRightImplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.RightImplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.RightImplication#getRight()
   * @see #getRightImplication()
   * @generated
   */
  EReference getRightImplication_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.BiImplication <em>Bi Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bi Implication</em>'.
   * @see fr.inria.lang.vM.BiImplication
   * @generated
   */
  EClass getBiImplication();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.BiImplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.BiImplication#getLeft()
   * @see #getBiImplication()
   * @generated
   */
  EReference getBiImplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.BiImplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.BiImplication#getRight()
   * @see #getBiImplication()
   * @generated
   */
  EReference getBiImplication_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see fr.inria.lang.vM.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see fr.inria.lang.vM.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality</em>'.
   * @see fr.inria.lang.vM.Equality
   * @generated
   */
  EClass getEquality();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Equality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Equality#getLeft()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Equality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Equality#getRight()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Inequality <em>Inequality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inequality</em>'.
   * @see fr.inria.lang.vM.Inequality
   * @generated
   */
  EClass getInequality();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Inequality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Inequality#getLeft()
   * @see #getInequality()
   * @generated
   */
  EReference getInequality_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Inequality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Inequality#getRight()
   * @see #getInequality()
   * @generated
   */
  EReference getInequality_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less</em>'.
   * @see fr.inria.lang.vM.Less
   * @generated
   */
  EClass getLess();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Less#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Less#getLeft()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Less#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Less#getRight()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Lessequal <em>Lessequal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lessequal</em>'.
   * @see fr.inria.lang.vM.Lessequal
   * @generated
   */
  EClass getLessequal();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Lessequal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Lessequal#getLeft()
   * @see #getLessequal()
   * @generated
   */
  EReference getLessequal_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Lessequal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Lessequal#getRight()
   * @see #getLessequal()
   * @generated
   */
  EReference getLessequal_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Greater <em>Greater</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater</em>'.
   * @see fr.inria.lang.vM.Greater
   * @generated
   */
  EClass getGreater();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Greater#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Greater#getLeft()
   * @see #getGreater()
   * @generated
   */
  EReference getGreater_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Greater#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Greater#getRight()
   * @see #getGreater()
   * @generated
   */
  EReference getGreater_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Greaterequal <em>Greaterequal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greaterequal</em>'.
   * @see fr.inria.lang.vM.Greaterequal
   * @generated
   */
  EClass getGreaterequal();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Greaterequal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Greaterequal#getLeft()
   * @see #getGreaterequal()
   * @generated
   */
  EReference getGreaterequal_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Greaterequal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Greaterequal#getRight()
   * @see #getGreaterequal()
   * @generated
   */
  EReference getGreaterequal_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see fr.inria.lang.vM.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see fr.inria.lang.vM.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see fr.inria.lang.vM.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see fr.inria.lang.vM.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Excludes <em>Excludes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Excludes</em>'.
   * @see fr.inria.lang.vM.Excludes
   * @generated
   */
  EClass getExcludes();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Excludes#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Excludes#getLeft()
   * @see #getExcludes()
   * @generated
   */
  EReference getExcludes_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Excludes#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Excludes#getRight()
   * @see #getExcludes()
   * @generated
   */
  EReference getExcludes_Right();

  /**
   * Returns the meta object for class '{@link fr.inria.lang.vM.Requires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requires</em>'.
   * @see fr.inria.lang.vM.Requires
   * @generated
   */
  EClass getRequires();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Requires#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.inria.lang.vM.Requires#getLeft()
   * @see #getRequires()
   * @generated
   */
  EReference getRequires_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.lang.vM.Requires#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.inria.lang.vM.Requires#getRight()
   * @see #getRequires()
   * @generated
   */
  EReference getRequires_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VMFactory getVMFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ModelImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BLOCKS = eINSTANCE.getModel_Blocks();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.VmBlockImpl <em>Vm Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.VmBlockImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getVmBlock()
     * @generated
     */
    EClass VM_BLOCK = eINSTANCE.getVmBlock();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.PackageDeclarationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__BLOCKS = eINSTANCE.getPackageDeclaration_Blocks();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ImportDeclarationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getImportDeclaration()
     * @generated
     */
    EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARATION__IMPORTED_NAMESPACE = eINSTANCE.getImportDeclaration_ImportedNamespace();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.MetaDataDeclarationImpl <em>Meta Data Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.MetaDataDeclarationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getMetaDataDeclaration()
     * @generated
     */
    EClass META_DATA_DECLARATION = eINSTANCE.getMetaDataDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA_DECLARATION__NAME = eINSTANCE.getMetaDataDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_DATA_DECLARATION__VERSION = eINSTANCE.getMetaDataDeclaration_Version();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA_DECLARATION__DESCRIPTION = eINSTANCE.getMetaDataDeclaration_Description();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA_DECLARATION__AUTHOR = eINSTANCE.getMetaDataDeclaration_Author();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_DATA_DECLARATION__EMAIL = eINSTANCE.getMetaDataDeclaration_Email();

    /**
     * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA_DECLARATION__ORGANIZATION = eINSTANCE.getMetaDataDeclaration_Organization();

    /**
     * The meta object literal for the '<em><b>Publication</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA_DECLARATION__PUBLICATION = eINSTANCE.getMetaDataDeclaration_Publication();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA_DECLARATION__DATE = eINSTANCE.getMetaDataDeclaration_Date();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.EmailImpl <em>Email</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.EmailImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEmail()
     * @generated
     */
    EClass EMAIL = eINSTANCE.getEmail();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAIL__USERNAME = eINSTANCE.getEmail_Username();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAIL__DOMAIN = eINSTANCE.getEmail_Domain();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.VersionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__MAIN = eINSTANCE.getVersion_Main();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__TAIL = eINSTANCE.getVersion_Tail();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RelationshipsImpl <em>Relationships</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RelationshipsImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRelationships()
     * @generated
     */
    EClass RELATIONSHIPS = eINSTANCE.getRelationships();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIPS__ROOT = eINSTANCE.getRelationships_Root();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.FeatureHierarchyImpl <em>Feature Hierarchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.FeatureHierarchyImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeatureHierarchy()
     * @generated
     */
    EClass FEATURE_HIERARCHY = eINSTANCE.getFeatureHierarchy();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_HIERARCHY__PARENT = eINSTANCE.getFeatureHierarchy_Parent();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_HIERARCHY__CHILDREN = eINSTANCE.getFeatureHierarchy_Children();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.FeatureDefinitionImpl <em>Feature Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.FeatureDefinitionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeatureDefinition()
     * @generated
     */
    EClass FEATURE_DEFINITION = eINSTANCE.getFeatureDefinition();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.FeatureImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Not Translatable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NOT_TRANSLATABLE = eINSTANCE.getFeature_NotTranslatable();

    /**
     * The meta object literal for the '<em><b>Run Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__RUN_TIME = eINSTANCE.getFeature_RunTime();

    /**
     * The meta object literal for the '<em><b>Not Decidable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NOT_DECIDABLE = eINSTANCE.getFeature_NotDecidable();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__OPTIONAL = eINSTANCE.getFeature_Optional();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MIN = eINSTANCE.getFeature_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MAX = eINSTANCE.getFeature_Max();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.FeaturesGroupImpl <em>Features Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.FeaturesGroupImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeaturesGroup()
     * @generated
     */
    EClass FEATURES_GROUP = eINSTANCE.getFeaturesGroup();

    /**
     * The meta object literal for the '<em><b>Grouped Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURES_GROUP__GROUPED_FEATURES = eINSTANCE.getFeaturesGroup_GroupedFeatures();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.XorgroupImpl <em>Xorgroup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.XorgroupImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getXorgroup()
     * @generated
     */
    EClass XORGROUP = eINSTANCE.getXorgroup();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.OrgroupImpl <em>Orgroup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.OrgroupImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getOrgroup()
     * @generated
     */
    EClass ORGROUP = eINSTANCE.getOrgroup();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.CardinalityBasedImpl <em>Cardinality Based</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.CardinalityBasedImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getCardinalityBased()
     * @generated
     */
    EClass CARDINALITY_BASED = eINSTANCE.getCardinalityBased();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARDINALITY_BASED__MIN = eINSTANCE.getCardinalityBased_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARDINALITY_BASED__MAX = eINSTANCE.getCardinalityBased_Max();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARDINALITY_BASED__ALL = eINSTANCE.getCardinalityBased_All();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.AttributesImpl <em>Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.AttributesImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getAttributes()
     * @generated
     */
    EClass ATTRIBUTES = eINSTANCE.getAttributes();

    /**
     * The meta object literal for the '<em><b>Attr Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__ATTR_DEFS = eINSTANCE.getAttributes_AttrDefs();

    /**
     * The meta object literal for the '<em><b>Attr Valuations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__ATTR_VALUATIONS = eINSTANCE.getAttributes_AttrValuations();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.AttrDefImpl <em>Attr Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.AttrDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getAttrDef()
     * @generated
     */
    EClass ATTR_DEF = eINSTANCE.getAttrDef();

    /**
     * The meta object literal for the '<em><b>Not Translatable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_DEF__NOT_TRANSLATABLE = eINSTANCE.getAttrDef_NotTranslatable();

    /**
     * The meta object literal for the '<em><b>Run Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_DEF__RUN_TIME = eINSTANCE.getAttrDef_RunTime();

    /**
     * The meta object literal for the '<em><b>Not Decidable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_DEF__NOT_DECIDABLE = eINSTANCE.getAttrDef_NotDecidable();

    /**
     * The meta object literal for the '<em><b>Basic Attr Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_DEF__BASIC_ATTR_DEF = eINSTANCE.getAttrDef_BasicAttrDef();

    /**
     * The meta object literal for the '<em><b>Enum Attr Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_DEF__ENUM_ATTR_DEF = eINSTANCE.getAttrDef_EnumAttrDef();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BasicAttrDefImpl <em>Basic Attr Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BasicAttrDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBasicAttrDef()
     * @generated
     */
    EClass BASIC_ATTR_DEF = eINSTANCE.getBasicAttrDef();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BooleanAttrDefImpl <em>Boolean Attr Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BooleanAttrDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanAttrDef()
     * @generated
     */
    EClass BOOLEAN_ATTR_DEF = eINSTANCE.getBooleanAttrDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_ATTR_DEF__NAME = eINSTANCE.getBooleanAttrDef_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_ATTR_DEF__VALUE = eINSTANCE.getBooleanAttrDef_Value();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_ATTR_DEF__DEFAULT = eINSTANCE.getBooleanAttrDef_Default();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.StringAttrDefImpl <em>String Attr Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.StringAttrDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getStringAttrDef()
     * @generated
     */
    EClass STRING_ATTR_DEF = eINSTANCE.getStringAttrDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ATTR_DEF__NAME = eINSTANCE.getStringAttrDef_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ATTR_DEF__VALUE = eINSTANCE.getStringAttrDef_Value();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ATTR_DEF__DEFAULT = eINSTANCE.getStringAttrDef_Default();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.IntegerAttrDefImpl <em>Integer Attr Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.IntegerAttrDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrDef()
     * @generated
     */
    EClass INTEGER_ATTR_DEF = eINSTANCE.getIntegerAttrDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ATTR_DEF__NAME = eINSTANCE.getIntegerAttrDef_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ATTR_DEF__DEFAULT = eINSTANCE.getIntegerAttrDef_Default();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.IntegerAttrDefBoundedImpl <em>Integer Attr Def Bounded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.IntegerAttrDefBoundedImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrDefBounded()
     * @generated
     */
    EClass INTEGER_ATTR_DEF_BOUNDED = eINSTANCE.getIntegerAttrDefBounded();

    /**
     * The meta object literal for the '<em><b>Complements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS = eINSTANCE.getIntegerAttrDefBounded_Complements();

    /**
     * The meta object literal for the '<em><b>Complement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT = eINSTANCE.getIntegerAttrDefBounded_Complement();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.IntegerAttrDefComplementImpl <em>Integer Attr Def Complement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.IntegerAttrDefComplementImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrDefComplement()
     * @generated
     */
    EClass INTEGER_ATTR_DEF_COMPLEMENT = eINSTANCE.getIntegerAttrDefComplement();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_ATTR_DEF_COMPLEMENT__MIN = eINSTANCE.getIntegerAttrDefComplement_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_ATTR_DEF_COMPLEMENT__MAX = eINSTANCE.getIntegerAttrDefComplement_Max();

    /**
     * The meta object literal for the '<em><b>Delta</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ATTR_DEF_COMPLEMENT__DELTA = eINSTANCE.getIntegerAttrDefComplement_Delta();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.IntegerAttrDefUnboundedImpl <em>Integer Attr Def Unbounded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.IntegerAttrDefUnboundedImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrDefUnbounded()
     * @generated
     */
    EClass INTEGER_ATTR_DEF_UNBOUNDED = eINSTANCE.getIntegerAttrDefUnbounded();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_ATTR_DEF_UNBOUNDED__VALUE = eINSTANCE.getIntegerAttrDefUnbounded_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RealAttrDefImpl <em>Real Attr Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RealAttrDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrDef()
     * @generated
     */
    EClass REAL_ATTR_DEF = eINSTANCE.getRealAttrDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_ATTR_DEF__NAME = eINSTANCE.getRealAttrDef_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_ATTR_DEF__DEFAULT = eINSTANCE.getRealAttrDef_Default();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RealAttrDefBoundedImpl <em>Real Attr Def Bounded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RealAttrDefBoundedImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrDefBounded()
     * @generated
     */
    EClass REAL_ATTR_DEF_BOUNDED = eINSTANCE.getRealAttrDefBounded();

    /**
     * The meta object literal for the '<em><b>Complement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_ATTR_DEF_BOUNDED__COMPLEMENT = eINSTANCE.getRealAttrDefBounded_Complement();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RealAttrDefComplementImpl <em>Real Attr Def Complement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RealAttrDefComplementImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrDefComplement()
     * @generated
     */
    EClass REAL_ATTR_DEF_COMPLEMENT = eINSTANCE.getRealAttrDefComplement();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_ATTR_DEF_COMPLEMENT__MIN = eINSTANCE.getRealAttrDefComplement_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_ATTR_DEF_COMPLEMENT__MAX = eINSTANCE.getRealAttrDefComplement_Max();

    /**
     * The meta object literal for the '<em><b>Delta</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_ATTR_DEF_COMPLEMENT__DELTA = eINSTANCE.getRealAttrDefComplement_Delta();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RealAttrDefUnboundedImpl <em>Real Attr Def Unbounded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RealAttrDefUnboundedImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrDefUnbounded()
     * @generated
     */
    EClass REAL_ATTR_DEF_UNBOUNDED = eINSTANCE.getRealAttrDefUnbounded();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_ATTR_DEF_UNBOUNDED__VALUE = eINSTANCE.getRealAttrDefUnbounded_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.EnumAttrDefImpl <em>Enum Attr Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.EnumAttrDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnumAttrDef()
     * @generated
     */
    EClass ENUM_ATTR_DEF = eINSTANCE.getEnumAttrDef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ATTR_DEF__VALUE = eINSTANCE.getEnumAttrDef_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.EnumStringDefImpl <em>Enum String Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.EnumStringDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnumStringDef()
     * @generated
     */
    EClass ENUM_STRING_DEF = eINSTANCE.getEnumStringDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_STRING_DEF__NAME = eINSTANCE.getEnumStringDef_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_STRING_DEF__DEFAULT = eINSTANCE.getEnumStringDef_Default();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.EnumIntegerDefImpl <em>Enum Integer Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.EnumIntegerDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnumIntegerDef()
     * @generated
     */
    EClass ENUM_INTEGER_DEF = eINSTANCE.getEnumIntegerDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_INTEGER_DEF__NAME = eINSTANCE.getEnumIntegerDef_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_INTEGER_DEF__DEFAULT = eINSTANCE.getEnumIntegerDef_Default();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.EnumRealDefImpl <em>Enum Real Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.EnumRealDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnumRealDef()
     * @generated
     */
    EClass ENUM_REAL_DEF = eINSTANCE.getEnumRealDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_REAL_DEF__NAME = eINSTANCE.getEnumRealDef_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_REAL_DEF__DEFAULT = eINSTANCE.getEnumRealDef_Default();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BoolDefaultDefImpl <em>Bool Default Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BoolDefaultDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBoolDefaultDef()
     * @generated
     */
    EClass BOOL_DEFAULT_DEF = eINSTANCE.getBoolDefaultDef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_DEFAULT_DEF__VALUE = eINSTANCE.getBoolDefaultDef_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.StringDefaultDefImpl <em>String Default Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.StringDefaultDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getStringDefaultDef()
     * @generated
     */
    EClass STRING_DEFAULT_DEF = eINSTANCE.getStringDefaultDef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_DEFAULT_DEF__VALUE = eINSTANCE.getStringDefaultDef_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.IntegerDeltaDefImpl <em>Integer Delta Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.IntegerDeltaDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerDeltaDef()
     * @generated
     */
    EClass INTEGER_DELTA_DEF = eINSTANCE.getIntegerDeltaDef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_DELTA_DEF__VALUE = eINSTANCE.getIntegerDeltaDef_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.IntegerDefaultDefImpl <em>Integer Default Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.IntegerDefaultDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerDefaultDef()
     * @generated
     */
    EClass INTEGER_DEFAULT_DEF = eINSTANCE.getIntegerDefaultDef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_DEFAULT_DEF__VALUE = eINSTANCE.getIntegerDefaultDef_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RealDeltaDefImpl <em>Real Delta Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RealDeltaDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealDeltaDef()
     * @generated
     */
    EClass REAL_DELTA_DEF = eINSTANCE.getRealDeltaDef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_DELTA_DEF__VALUE = eINSTANCE.getRealDeltaDef_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RealDefaultDefImpl <em>Real Default Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RealDefaultDefImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealDefaultDef()
     * @generated
     */
    EClass REAL_DEFAULT_DEF = eINSTANCE.getRealDefaultDef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_DEFAULT_DEF__VALUE = eINSTANCE.getRealDefaultDef_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.DescriptionsImpl <em>Descriptions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.DescriptionsImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getDescriptions()
     * @generated
     */
    EClass DESCRIPTIONS = eINSTANCE.getDescriptions();

    /**
     * The meta object literal for the '<em><b>Features Descriptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTIONS__FEATURES_DESCRIPTIONS = eINSTANCE.getDescriptions_FeaturesDescriptions();

    /**
     * The meta object literal for the '<em><b>Attributes Descriptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS = eINSTANCE.getDescriptions_AttributesDescriptions();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.FeatureDescriptionImpl <em>Feature Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.FeatureDescriptionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getFeatureDescription()
     * @generated
     */
    EClass FEATURE_DESCRIPTION = eINSTANCE.getFeatureDescription();

    /**
     * The meta object literal for the '<em><b>Ref Feat</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DESCRIPTION__REF_FEAT = eINSTANCE.getFeatureDescription_RefFeat();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_DESCRIPTION__DESCRIPTION = eINSTANCE.getFeatureDescription_Description();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.AttributeDescriptionImpl <em>Attribute Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.AttributeDescriptionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getAttributeDescription()
     * @generated
     */
    EClass ATTRIBUTE_DESCRIPTION = eINSTANCE.getAttributeDescription();

    /**
     * The meta object literal for the '<em><b>Ref Feat</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_DESCRIPTION__REF_FEAT = eINSTANCE.getAttributeDescription_RefFeat();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_DESCRIPTION__REF_ATT = eINSTANCE.getAttributeDescription_RefAtt();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DESCRIPTION__DESCRIPTION = eINSTANCE.getAttributeDescription_Description();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ConstraintsImpl <em>Constraints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ConstraintsImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getConstraints()
     * @generated
     */
    EClass CONSTRAINTS = eINSTANCE.getConstraints();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINTS__CONSTRAINTS = eINSTANCE.getConstraints_Constraints();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ConstraintImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ComplexExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getComplexExpression()
     * @generated
     */
    EClass COMPLEX_EXPRESSION = eINSTANCE.getComplexExpression();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.SpecialExpressionImpl <em>Special Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.SpecialExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getSpecialExpression()
     * @generated
     */
    EClass SPECIAL_EXPRESSION = eINSTANCE.getSpecialExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIAL_EXPRESSION__OP = eINSTANCE.getSpecialExpression_Op();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIAL_EXPRESSION__EXPRESSION = eINSTANCE.getSpecialExpression_Expression();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.StringExpressionImpl <em>String Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.StringExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getStringExpression()
     * @generated
     */
    EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_EXPRESSION__VALUE = eINSTANCE.getStringExpression_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.PrimitiveExpressionImpl <em>Primitive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.PrimitiveExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getPrimitiveExpression()
     * @generated
     */
    EClass PRIMITIVE_EXPRESSION = eINSTANCE.getPrimitiveExpression();

    /**
     * The meta object literal for the '<em><b>Feature ID</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_EXPRESSION__FEATURE_ID = eINSTANCE.getPrimitiveExpression_FeatureID();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_EXPRESSION__HEAD = eINSTANCE.getPrimitiveExpression_Head();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_EXPRESSION__REF_ATT = eINSTANCE.getPrimitiveExpression_RefAtt();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BooleanExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_EXPRESSION__VALUE = eINSTANCE.getBooleanExpression_Value();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_EXPRESSION__OP = eINSTANCE.getBooleanExpression_Op();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__EXPRESSION = eINSTANCE.getBooleanExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Expression list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__EXPRESSION_LIST = eINSTANCE.getBooleanExpression_Expression_list();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BrackedExpressionImpl <em>Bracked Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BrackedExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBrackedExpression()
     * @generated
     */
    EClass BRACKED_EXPRESSION = eINSTANCE.getBrackedExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRACKED_EXPRESSION__EXPRESSION = eINSTANCE.getBrackedExpression_Expression();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.NumericExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getNumericExpression()
     * @generated
     */
    EClass NUMERIC_EXPRESSION = eINSTANCE.getNumericExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_EXPRESSION__VALUE = eINSTANCE.getNumericExpression_Value();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_EXPRESSION__OP = eINSTANCE.getNumericExpression_Op();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC_EXPRESSION__EXPRESSION = eINSTANCE.getNumericExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Expression list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC_EXPRESSION__EXPRESSION_LIST = eINSTANCE.getNumericExpression_Expression_list();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.NumericExpression_ListImpl <em>Numeric Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.NumericExpression_ListImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getNumericExpression_List()
     * @generated
     */
    EClass NUMERIC_EXPRESSION_LIST = eINSTANCE.getNumericExpression_List();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC_EXPRESSION_LIST__EX = eINSTANCE.getNumericExpression_List_Ex();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BooleanExpression_ListImpl <em>Boolean Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BooleanExpression_ListImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanExpression_List()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION_LIST = eINSTANCE.getBooleanExpression_List();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION_LIST__EX = eINSTANCE.getBooleanExpression_List_Ex();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ObjectivesImpl <em>Objectives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ObjectivesImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getObjectives()
     * @generated
     */
    EClass OBJECTIVES = eINSTANCE.getObjectives();

    /**
     * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECTIVES__OBJECTIVES = eINSTANCE.getObjectives_Objectives();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ObjectiveImpl <em>Objective</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ObjectiveImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getObjective()
     * @generated
     */
    EClass OBJECTIVE = eINSTANCE.getObjective();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECTIVE__NAME = eINSTANCE.getObjective_Name();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECTIVE__OP = eINSTANCE.getObjective_Op();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECTIVE__EXPRESSION = eINSTANCE.getObjective_Expression();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ObjectiveExpressionImpl <em>Objective Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ObjectiveExpressionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getObjectiveExpression()
     * @generated
     */
    EClass OBJECTIVE_EXPRESSION = eINSTANCE.getObjectiveExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECTIVE_EXPRESSION__OP = eINSTANCE.getObjectiveExpression_Op();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECTIVE_EXPRESSION__EXPRESSION = eINSTANCE.getObjectiveExpression_Expression();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ConfigurationsImpl <em>Configurations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ConfigurationsImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getConfigurations()
     * @generated
     */
    EClass CONFIGURATIONS = eINSTANCE.getConfigurations();

    /**
     * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATIONS__CONFIGURATIONS = eINSTANCE.getConfigurations_Configurations();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ConfigurationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getConfiguration()
     * @generated
     */
    EClass CONFIGURATION = eINSTANCE.getConfiguration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Boolean Valuation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__BOOLEAN_VALUATION = eINSTANCE.getConfiguration_BooleanValuation();

    /**
     * The meta object literal for the '<em><b>Extended Valuation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__EXTENDED_VALUATION = eINSTANCE.getConfiguration_ExtendedValuation();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BooleanValuationImpl <em>Boolean Valuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BooleanValuationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanValuation()
     * @generated
     */
    EClass BOOLEAN_VALUATION = eINSTANCE.getBooleanValuation();

    /**
     * The meta object literal for the '<em><b>Not Selected</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUATION__NOT_SELECTED = eINSTANCE.getBooleanValuation_NotSelected();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_VALUATION__FEATURE = eINSTANCE.getBooleanValuation_Feature();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ExtendedValuationImpl <em>Extended Valuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ExtendedValuationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getExtendedValuation()
     * @generated
     */
    EClass EXTENDED_VALUATION = eINSTANCE.getExtendedValuation();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BasicAttrValuationImpl <em>Basic Attr Valuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BasicAttrValuationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBasicAttrValuation()
     * @generated
     */
    EClass BASIC_ATTR_VALUATION = eINSTANCE.getBasicAttrValuation();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ATTR_VALUATION__HEAD = eINSTANCE.getBasicAttrValuation_Head();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_ATTR_VALUATION__VALUE = eINSTANCE.getBasicAttrValuation_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RealAttrValuationImpl <em>Real Attr Valuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RealAttrValuationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRealAttrValuation()
     * @generated
     */
    EClass REAL_ATTR_VALUATION = eINSTANCE.getRealAttrValuation();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_ATTR_VALUATION__REF_ATT = eINSTANCE.getRealAttrValuation_RefAtt();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.IntegerAttrValuationImpl <em>Integer Attr Valuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.IntegerAttrValuationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getIntegerAttrValuation()
     * @generated
     */
    EClass INTEGER_ATTR_VALUATION = eINSTANCE.getIntegerAttrValuation();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_ATTR_VALUATION__REF_ATT = eINSTANCE.getIntegerAttrValuation_RefAtt();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BooleanAttrValuationImpl <em>Boolean Attr Valuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BooleanAttrValuationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBooleanAttrValuation()
     * @generated
     */
    EClass BOOLEAN_ATTR_VALUATION = eINSTANCE.getBooleanAttrValuation();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_ATTR_VALUATION__REF_ATT = eINSTANCE.getBooleanAttrValuation_RefAtt();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.StringAttrValuationImpl <em>String Attr Valuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.StringAttrValuationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getStringAttrValuation()
     * @generated
     */
    EClass STRING_ATTR_VALUATION = eINSTANCE.getStringAttrValuation();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ATTR_VALUATION__REF_ATT = eINSTANCE.getStringAttrValuation_RefAtt();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.AdvancedAttrValuationImpl <em>Advanced Attr Valuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.AdvancedAttrValuationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getAdvancedAttrValuation()
     * @generated
     */
    EClass ADVANCED_ATTR_VALUATION = eINSTANCE.getAdvancedAttrValuation();

    /**
     * The meta object literal for the '<em><b>Att Vs Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVANCED_ATTR_VALUATION__ATT_VS_VAL = eINSTANCE.getAdvancedAttrValuation_AttVsVal();

    /**
     * The meta object literal for the '<em><b>Feat Vs Val</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVANCED_ATTR_VALUATION__FEAT_VS_VAL = eINSTANCE.getAdvancedAttrValuation_FeatVsVal();

    /**
     * The meta object literal for the '<em><b>Att Vs Val For Multi Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE = eINSTANCE.getAdvancedAttrValuation_AttVsValForMultiFeature();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureAndCloneImpl <em>Table Based Valuation By Feature And Clone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.TableBasedValuationByFeatureAndCloneImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByFeatureAndClone()
     * @generated
     */
    EClass TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE = eINSTANCE.getTableBasedValuationByFeatureAndClone();

    /**
     * The meta object literal for the '<em><b>Ref Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE = eINSTANCE.getTableBasedValuationByFeatureAndClone_RefFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__NAME = eINSTANCE.getTableBasedValuationByFeatureAndClone_Name();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS = eINSTANCE.getTableBasedValuationByFeatureAndClone_Pairs();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByFeatureImpl <em>Table Based Valuation By Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.TableBasedValuationByFeatureImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByFeature()
     * @generated
     */
    EClass TABLE_BASED_VALUATION_BY_FEATURE = eINSTANCE.getTableBasedValuationByFeature();

    /**
     * The meta object literal for the '<em><b>Ref Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE = eINSTANCE.getTableBasedValuationByFeature_RefFeature();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_BASED_VALUATION_BY_FEATURE__PAIRS = eINSTANCE.getTableBasedValuationByFeature_Pairs();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.PairAttributeValueImpl <em>Pair Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.PairAttributeValueImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getPairAttributeValue()
     * @generated
     */
    EClass PAIR_ATTRIBUTE_VALUE = eINSTANCE.getPairAttributeValue();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR_ATTRIBUTE_VALUE__REF_ATT = eINSTANCE.getPairAttributeValue_RefAtt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR_ATTRIBUTE_VALUE__VALUE = eINSTANCE.getPairAttributeValue_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByAttributeImpl <em>Table Based Valuation By Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.TableBasedValuationByAttributeImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByAttribute()
     * @generated
     */
    EClass TABLE_BASED_VALUATION_BY_ATTRIBUTE = eINSTANCE.getTableBasedValuationByAttribute();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByAttributeForIntegerImpl <em>Table Based Valuation By Attribute For Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.TableBasedValuationByAttributeForIntegerImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByAttributeForInteger()
     * @generated
     */
    EClass TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER = eINSTANCE.getTableBasedValuationByAttributeForInteger();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT = eINSTANCE.getTableBasedValuationByAttributeForInteger_RefAtt();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS = eINSTANCE.getTableBasedValuationByAttributeForInteger_Pairs();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.PairFeatureIntegerImpl <em>Pair Feature Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.PairFeatureIntegerImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getPairFeatureInteger()
     * @generated
     */
    EClass PAIR_FEATURE_INTEGER = eINSTANCE.getPairFeatureInteger();

    /**
     * The meta object literal for the '<em><b>Ref Feat</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR_FEATURE_INTEGER__REF_FEAT = eINSTANCE.getPairFeatureInteger_RefFeat();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR_FEATURE_INTEGER__VALUE = eINSTANCE.getPairFeatureInteger_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.TableBasedValuationByAttributeForRealImpl <em>Table Based Valuation By Attribute For Real</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.TableBasedValuationByAttributeForRealImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getTableBasedValuationByAttributeForReal()
     * @generated
     */
    EClass TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL = eINSTANCE.getTableBasedValuationByAttributeForReal();

    /**
     * The meta object literal for the '<em><b>Ref Att</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL__REF_ATT = eINSTANCE.getTableBasedValuationByAttributeForReal_RefAtt();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL__PAIRS = eINSTANCE.getTableBasedValuationByAttributeForReal_Pairs();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.PairFeatureRealImpl <em>Pair Feature Real</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.PairFeatureRealImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getPairFeatureReal()
     * @generated
     */
    EClass PAIR_FEATURE_REAL = eINSTANCE.getPairFeatureReal();

    /**
     * The meta object literal for the '<em><b>Ref Feat</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR_FEATURE_REAL__REF_FEAT = eINSTANCE.getPairFeatureReal_RefFeat();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR_FEATURE_REAL__VALUE = eINSTANCE.getPairFeatureReal_Value();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.Boolean_ATT_IDImpl <em>Boolean ATT ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.Boolean_ATT_IDImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBoolean_ATT_ID()
     * @generated
     */
    EClass BOOLEAN_ATT_ID = eINSTANCE.getBoolean_ATT_ID();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.String_ATT_IDImpl <em>String ATT ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.String_ATT_IDImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getString_ATT_ID()
     * @generated
     */
    EClass STRING_ATT_ID = eINSTANCE.getString_ATT_ID();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.Integer_ATT_IDImpl <em>Integer ATT ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.Integer_ATT_IDImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getInteger_ATT_ID()
     * @generated
     */
    EClass INTEGER_ATT_ID = eINSTANCE.getInteger_ATT_ID();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.Real_ATT_IDImpl <em>Real ATT ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.Real_ATT_IDImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getReal_ATT_ID()
     * @generated
     */
    EClass REAL_ATT_ID = eINSTANCE.getReal_ATT_ID();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.Enum_String_ATT_IDImpl <em>Enum String ATT ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.Enum_String_ATT_IDImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnum_String_ATT_ID()
     * @generated
     */
    EClass ENUM_STRING_ATT_ID = eINSTANCE.getEnum_String_ATT_ID();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.Enum_Integer_ATT_IDImpl <em>Enum Integer ATT ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.Enum_Integer_ATT_IDImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnum_Integer_ATT_ID()
     * @generated
     */
    EClass ENUM_INTEGER_ATT_ID = eINSTANCE.getEnum_Integer_ATT_ID();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.Enum_Real_ATT_IDImpl <em>Enum Real ATT ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.Enum_Real_ATT_IDImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEnum_Real_ATT_ID()
     * @generated
     */
    EClass ENUM_REAL_ATT_ID = eINSTANCE.getEnum_Real_ATT_ID();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.AttHeadImpl <em>Att Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.AttHeadImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getAttHead()
     * @generated
     */
    EClass ATT_HEAD = eINSTANCE.getAttHead();

    /**
     * The meta object literal for the '<em><b>For All Features</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATT_HEAD__FOR_ALL_FEATURES = eINSTANCE.getAttHead_ForAllFeatures();

    /**
     * The meta object literal for the '<em><b>Owned Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATT_HEAD__OWNED_FEATURE = eINSTANCE.getAttHead_OwnedFeature();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.Abstract_ATT_IDImpl <em>Abstract ATT ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.Abstract_ATT_IDImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getAbstract_ATT_ID()
     * @generated
     */
    EClass ABSTRACT_ATT_ID = eINSTANCE.getAbstract_ATT_ID();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ATT_ID__HEAD = eINSTANCE.getAbstract_ATT_ID_Head();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ATT_ID__NAME = eINSTANCE.getAbstract_ATT_ID_Name();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.IfImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__LEFT = eINSTANCE.getIf_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__RIGHT = eINSTANCE.getIf_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.LeftImplicationImpl <em>Left Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.LeftImplicationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getLeftImplication()
     * @generated
     */
    EClass LEFT_IMPLICATION = eINSTANCE.getLeftImplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEFT_IMPLICATION__LEFT = eINSTANCE.getLeftImplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEFT_IMPLICATION__RIGHT = eINSTANCE.getLeftImplication_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RightImplicationImpl <em>Right Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RightImplicationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRightImplication()
     * @generated
     */
    EClass RIGHT_IMPLICATION = eINSTANCE.getRightImplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_IMPLICATION__LEFT = eINSTANCE.getRightImplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_IMPLICATION__RIGHT = eINSTANCE.getRightImplication_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.BiImplicationImpl <em>Bi Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.BiImplicationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getBiImplication()
     * @generated
     */
    EClass BI_IMPLICATION = eINSTANCE.getBiImplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BI_IMPLICATION__LEFT = eINSTANCE.getBiImplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BI_IMPLICATION__RIGHT = eINSTANCE.getBiImplication_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.OrImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.AndImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.EqualityImpl <em>Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.EqualityImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getEquality()
     * @generated
     */
    EClass EQUALITY = eINSTANCE.getEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.InequalityImpl <em>Inequality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.InequalityImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getInequality()
     * @generated
     */
    EClass INEQUALITY = eINSTANCE.getInequality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INEQUALITY__LEFT = eINSTANCE.getInequality_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INEQUALITY__RIGHT = eINSTANCE.getInequality_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.LessImpl <em>Less</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.LessImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getLess()
     * @generated
     */
    EClass LESS = eINSTANCE.getLess();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__LEFT = eINSTANCE.getLess_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__RIGHT = eINSTANCE.getLess_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.LessequalImpl <em>Lessequal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.LessequalImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getLessequal()
     * @generated
     */
    EClass LESSEQUAL = eINSTANCE.getLessequal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESSEQUAL__LEFT = eINSTANCE.getLessequal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESSEQUAL__RIGHT = eINSTANCE.getLessequal_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.GreaterImpl <em>Greater</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.GreaterImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getGreater()
     * @generated
     */
    EClass GREATER = eINSTANCE.getGreater();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER__LEFT = eINSTANCE.getGreater_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER__RIGHT = eINSTANCE.getGreater_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.GreaterequalImpl <em>Greaterequal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.GreaterequalImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getGreaterequal()
     * @generated
     */
    EClass GREATEREQUAL = eINSTANCE.getGreaterequal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATEREQUAL__LEFT = eINSTANCE.getGreaterequal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATEREQUAL__RIGHT = eINSTANCE.getGreaterequal_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.PlusImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.MinusImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.MultiplicationImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT = eINSTANCE.getMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT = eINSTANCE.getMultiplication_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.DivisionImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.ExcludesImpl <em>Excludes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.ExcludesImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getExcludes()
     * @generated
     */
    EClass EXCLUDES = eINSTANCE.getExcludes();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUDES__LEFT = eINSTANCE.getExcludes_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUDES__RIGHT = eINSTANCE.getExcludes_Right();

    /**
     * The meta object literal for the '{@link fr.inria.lang.vM.impl.RequiresImpl <em>Requires</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.lang.vM.impl.RequiresImpl
     * @see fr.inria.lang.vM.impl.VMPackageImpl#getRequires()
     * @generated
     */
    EClass REQUIRES = eINSTANCE.getRequires();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRES__LEFT = eINSTANCE.getRequires_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRES__RIGHT = eINSTANCE.getRequires_Right();

  }

} //VMPackage
