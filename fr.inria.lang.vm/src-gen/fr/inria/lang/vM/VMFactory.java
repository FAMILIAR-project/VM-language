/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.lang.vM.VMPackage
 * @generated
 */
public interface VMFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VMFactory eINSTANCE = fr.inria.lang.vM.impl.VMFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Vm Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vm Block</em>'.
   * @generated
   */
  VmBlock createVmBlock();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>Import Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Declaration</em>'.
   * @generated
   */
  ImportDeclaration createImportDeclaration();

  /**
   * Returns a new object of class '<em>Meta Data Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Data Declaration</em>'.
   * @generated
   */
  MetaDataDeclaration createMetaDataDeclaration();

  /**
   * Returns a new object of class '<em>Email</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Email</em>'.
   * @generated
   */
  Email createEmail();

  /**
   * Returns a new object of class '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version</em>'.
   * @generated
   */
  Version createVersion();

  /**
   * Returns a new object of class '<em>Relationships</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationships</em>'.
   * @generated
   */
  Relationships createRelationships();

  /**
   * Returns a new object of class '<em>Feature Hierarchy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Hierarchy</em>'.
   * @generated
   */
  FeatureHierarchy createFeatureHierarchy();

  /**
   * Returns a new object of class '<em>Feature Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Definition</em>'.
   * @generated
   */
  FeatureDefinition createFeatureDefinition();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Features Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Features Group</em>'.
   * @generated
   */
  FeaturesGroup createFeaturesGroup();

  /**
   * Returns a new object of class '<em>Xorgroup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xorgroup</em>'.
   * @generated
   */
  Xorgroup createXorgroup();

  /**
   * Returns a new object of class '<em>Orgroup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Orgroup</em>'.
   * @generated
   */
  Orgroup createOrgroup();

  /**
   * Returns a new object of class '<em>Cardinality Based</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cardinality Based</em>'.
   * @generated
   */
  CardinalityBased createCardinalityBased();

  /**
   * Returns a new object of class '<em>Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attributes</em>'.
   * @generated
   */
  Attributes createAttributes();

  /**
   * Returns a new object of class '<em>Attr Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attr Def</em>'.
   * @generated
   */
  AttrDef createAttrDef();

  /**
   * Returns a new object of class '<em>Basic Attr Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Attr Def</em>'.
   * @generated
   */
  BasicAttrDef createBasicAttrDef();

  /**
   * Returns a new object of class '<em>Boolean Attr Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Attr Def</em>'.
   * @generated
   */
  BooleanAttrDef createBooleanAttrDef();

  /**
   * Returns a new object of class '<em>String Attr Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Attr Def</em>'.
   * @generated
   */
  StringAttrDef createStringAttrDef();

  /**
   * Returns a new object of class '<em>Integer Attr Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Attr Def</em>'.
   * @generated
   */
  IntegerAttrDef createIntegerAttrDef();

  /**
   * Returns a new object of class '<em>Integer Attr Def Bounded</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Attr Def Bounded</em>'.
   * @generated
   */
  IntegerAttrDefBounded createIntegerAttrDefBounded();

  /**
   * Returns a new object of class '<em>Integer Attr Def Complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Attr Def Complement</em>'.
   * @generated
   */
  IntegerAttrDefComplement createIntegerAttrDefComplement();

  /**
   * Returns a new object of class '<em>Integer Attr Def Unbounded</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Attr Def Unbounded</em>'.
   * @generated
   */
  IntegerAttrDefUnbounded createIntegerAttrDefUnbounded();

  /**
   * Returns a new object of class '<em>Real Attr Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Attr Def</em>'.
   * @generated
   */
  RealAttrDef createRealAttrDef();

  /**
   * Returns a new object of class '<em>Real Attr Def Bounded</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Attr Def Bounded</em>'.
   * @generated
   */
  RealAttrDefBounded createRealAttrDefBounded();

  /**
   * Returns a new object of class '<em>Real Attr Def Complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Attr Def Complement</em>'.
   * @generated
   */
  RealAttrDefComplement createRealAttrDefComplement();

  /**
   * Returns a new object of class '<em>Real Attr Def Unbounded</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Attr Def Unbounded</em>'.
   * @generated
   */
  RealAttrDefUnbounded createRealAttrDefUnbounded();

  /**
   * Returns a new object of class '<em>Enum Attr Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Attr Def</em>'.
   * @generated
   */
  EnumAttrDef createEnumAttrDef();

  /**
   * Returns a new object of class '<em>Enum String Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum String Def</em>'.
   * @generated
   */
  EnumStringDef createEnumStringDef();

  /**
   * Returns a new object of class '<em>Enum Integer Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Integer Def</em>'.
   * @generated
   */
  EnumIntegerDef createEnumIntegerDef();

  /**
   * Returns a new object of class '<em>Enum Real Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Real Def</em>'.
   * @generated
   */
  EnumRealDef createEnumRealDef();

  /**
   * Returns a new object of class '<em>Bool Default Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Default Def</em>'.
   * @generated
   */
  BoolDefaultDef createBoolDefaultDef();

  /**
   * Returns a new object of class '<em>String Default Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Default Def</em>'.
   * @generated
   */
  StringDefaultDef createStringDefaultDef();

  /**
   * Returns a new object of class '<em>Integer Delta Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Delta Def</em>'.
   * @generated
   */
  IntegerDeltaDef createIntegerDeltaDef();

  /**
   * Returns a new object of class '<em>Integer Default Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Default Def</em>'.
   * @generated
   */
  IntegerDefaultDef createIntegerDefaultDef();

  /**
   * Returns a new object of class '<em>Real Delta Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Delta Def</em>'.
   * @generated
   */
  RealDeltaDef createRealDeltaDef();

  /**
   * Returns a new object of class '<em>Real Default Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Default Def</em>'.
   * @generated
   */
  RealDefaultDef createRealDefaultDef();

  /**
   * Returns a new object of class '<em>Descriptions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Descriptions</em>'.
   * @generated
   */
  Descriptions createDescriptions();

  /**
   * Returns a new object of class '<em>Feature Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Description</em>'.
   * @generated
   */
  FeatureDescription createFeatureDescription();

  /**
   * Returns a new object of class '<em>Attribute Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Description</em>'.
   * @generated
   */
  AttributeDescription createAttributeDescription();

  /**
   * Returns a new object of class '<em>Constraints</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraints</em>'.
   * @generated
   */
  Constraints createConstraints();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Complex Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Expression</em>'.
   * @generated
   */
  ComplexExpression createComplexExpression();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Special Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Special Expression</em>'.
   * @generated
   */
  SpecialExpression createSpecialExpression();

  /**
   * Returns a new object of class '<em>String Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Expression</em>'.
   * @generated
   */
  StringExpression createStringExpression();

  /**
   * Returns a new object of class '<em>Primitive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Expression</em>'.
   * @generated
   */
  PrimitiveExpression createPrimitiveExpression();

  /**
   * Returns a new object of class '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression</em>'.
   * @generated
   */
  BooleanExpression createBooleanExpression();

  /**
   * Returns a new object of class '<em>Bracked Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bracked Expression</em>'.
   * @generated
   */
  BrackedExpression createBrackedExpression();

  /**
   * Returns a new object of class '<em>Numeric Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Expression</em>'.
   * @generated
   */
  NumericExpression createNumericExpression();

  /**
   * Returns a new object of class '<em>Numeric Expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Expression List</em>'.
   * @generated
   */
  NumericExpression_List createNumericExpression_List();

  /**
   * Returns a new object of class '<em>Boolean Expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression List</em>'.
   * @generated
   */
  BooleanExpression_List createBooleanExpression_List();

  /**
   * Returns a new object of class '<em>Objectives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objectives</em>'.
   * @generated
   */
  Objectives createObjectives();

  /**
   * Returns a new object of class '<em>Objective</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objective</em>'.
   * @generated
   */
  Objective createObjective();

  /**
   * Returns a new object of class '<em>Objective Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objective Expression</em>'.
   * @generated
   */
  ObjectiveExpression createObjectiveExpression();

  /**
   * Returns a new object of class '<em>Configurations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configurations</em>'.
   * @generated
   */
  Configurations createConfigurations();

  /**
   * Returns a new object of class '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration</em>'.
   * @generated
   */
  Configuration createConfiguration();

  /**
   * Returns a new object of class '<em>Boolean Valuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Valuation</em>'.
   * @generated
   */
  BooleanValuation createBooleanValuation();

  /**
   * Returns a new object of class '<em>Extended Valuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extended Valuation</em>'.
   * @generated
   */
  ExtendedValuation createExtendedValuation();

  /**
   * Returns a new object of class '<em>Basic Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Attr Valuation</em>'.
   * @generated
   */
  BasicAttrValuation createBasicAttrValuation();

  /**
   * Returns a new object of class '<em>Real Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Attr Valuation</em>'.
   * @generated
   */
  RealAttrValuation createRealAttrValuation();

  /**
   * Returns a new object of class '<em>Integer Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Attr Valuation</em>'.
   * @generated
   */
  IntegerAttrValuation createIntegerAttrValuation();

  /**
   * Returns a new object of class '<em>Boolean Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Attr Valuation</em>'.
   * @generated
   */
  BooleanAttrValuation createBooleanAttrValuation();

  /**
   * Returns a new object of class '<em>String Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Attr Valuation</em>'.
   * @generated
   */
  StringAttrValuation createStringAttrValuation();

  /**
   * Returns a new object of class '<em>Advanced Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Advanced Attr Valuation</em>'.
   * @generated
   */
  AdvancedAttrValuation createAdvancedAttrValuation();

  /**
   * Returns a new object of class '<em>Table Based Valuation By Feature And Clone</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Based Valuation By Feature And Clone</em>'.
   * @generated
   */
  TableBasedValuationByFeatureAndClone createTableBasedValuationByFeatureAndClone();

  /**
   * Returns a new object of class '<em>Table Based Valuation By Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Based Valuation By Feature</em>'.
   * @generated
   */
  TableBasedValuationByFeature createTableBasedValuationByFeature();

  /**
   * Returns a new object of class '<em>Pair Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pair Attribute Value</em>'.
   * @generated
   */
  PairAttributeValue createPairAttributeValue();

  /**
   * Returns a new object of class '<em>Table Based Valuation By Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Based Valuation By Attribute</em>'.
   * @generated
   */
  TableBasedValuationByAttribute createTableBasedValuationByAttribute();

  /**
   * Returns a new object of class '<em>Table Based Valuation By Attribute For Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Based Valuation By Attribute For Integer</em>'.
   * @generated
   */
  TableBasedValuationByAttributeForInteger createTableBasedValuationByAttributeForInteger();

  /**
   * Returns a new object of class '<em>Pair Feature Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pair Feature Integer</em>'.
   * @generated
   */
  PairFeatureInteger createPairFeatureInteger();

  /**
   * Returns a new object of class '<em>Table Based Valuation By Attribute For Real</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Based Valuation By Attribute For Real</em>'.
   * @generated
   */
  TableBasedValuationByAttributeForReal createTableBasedValuationByAttributeForReal();

  /**
   * Returns a new object of class '<em>Pair Feature Real</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pair Feature Real</em>'.
   * @generated
   */
  PairFeatureReal createPairFeatureReal();

  /**
   * Returns a new object of class '<em>Boolean ATT ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean ATT ID</em>'.
   * @generated
   */
  Boolean_ATT_ID createBoolean_ATT_ID();

  /**
   * Returns a new object of class '<em>String ATT ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String ATT ID</em>'.
   * @generated
   */
  String_ATT_ID createString_ATT_ID();

  /**
   * Returns a new object of class '<em>Integer ATT ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer ATT ID</em>'.
   * @generated
   */
  Integer_ATT_ID createInteger_ATT_ID();

  /**
   * Returns a new object of class '<em>Real ATT ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real ATT ID</em>'.
   * @generated
   */
  Real_ATT_ID createReal_ATT_ID();

  /**
   * Returns a new object of class '<em>Enum String ATT ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum String ATT ID</em>'.
   * @generated
   */
  Enum_String_ATT_ID createEnum_String_ATT_ID();

  /**
   * Returns a new object of class '<em>Enum Integer ATT ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Integer ATT ID</em>'.
   * @generated
   */
  Enum_Integer_ATT_ID createEnum_Integer_ATT_ID();

  /**
   * Returns a new object of class '<em>Enum Real ATT ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Real ATT ID</em>'.
   * @generated
   */
  Enum_Real_ATT_ID createEnum_Real_ATT_ID();

  /**
   * Returns a new object of class '<em>Att Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Att Head</em>'.
   * @generated
   */
  AttHead createAttHead();

  /**
   * Returns a new object of class '<em>Abstract ATT ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract ATT ID</em>'.
   * @generated
   */
  Abstract_ATT_ID createAbstract_ATT_ID();

  /**
   * Returns a new object of class '<em>If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If</em>'.
   * @generated
   */
  If createIf();

  /**
   * Returns a new object of class '<em>Left Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left Implication</em>'.
   * @generated
   */
  LeftImplication createLeftImplication();

  /**
   * Returns a new object of class '<em>Right Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Implication</em>'.
   * @generated
   */
  RightImplication createRightImplication();

  /**
   * Returns a new object of class '<em>Bi Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bi Implication</em>'.
   * @generated
   */
  BiImplication createBiImplication();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Inequality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inequality</em>'.
   * @generated
   */
  Inequality createInequality();

  /**
   * Returns a new object of class '<em>Less</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less</em>'.
   * @generated
   */
  Less createLess();

  /**
   * Returns a new object of class '<em>Lessequal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lessequal</em>'.
   * @generated
   */
  Lessequal createLessequal();

  /**
   * Returns a new object of class '<em>Greater</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater</em>'.
   * @generated
   */
  Greater createGreater();

  /**
   * Returns a new object of class '<em>Greaterequal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greaterequal</em>'.
   * @generated
   */
  Greaterequal createGreaterequal();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns a new object of class '<em>Division</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division</em>'.
   * @generated
   */
  Division createDivision();

  /**
   * Returns a new object of class '<em>Excludes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Excludes</em>'.
   * @generated
   */
  Excludes createExcludes();

  /**
   * Returns a new object of class '<em>Requires</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requires</em>'.
   * @generated
   */
  Requires createRequires();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VMPackage getVMPackage();

} //VMFactory
