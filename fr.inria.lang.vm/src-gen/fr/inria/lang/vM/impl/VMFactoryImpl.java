/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VMFactoryImpl extends EFactoryImpl implements VMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VMFactory init()
  {
    try
    {
      VMFactory theVMFactory = (VMFactory)EPackage.Registry.INSTANCE.getEFactory(VMPackage.eNS_URI);
      if (theVMFactory != null)
      {
        return theVMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VMPackage.MODEL: return createModel();
      case VMPackage.VM_BLOCK: return createVmBlock();
      case VMPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case VMPackage.IMPORT_DECLARATION: return createImportDeclaration();
      case VMPackage.META_DATA_DECLARATION: return createMetaDataDeclaration();
      case VMPackage.EMAIL: return createEmail();
      case VMPackage.VERSION: return createVersion();
      case VMPackage.RELATIONSHIPS: return createRelationships();
      case VMPackage.FEATURE_HIERARCHY: return createFeatureHierarchy();
      case VMPackage.FEATURE_DEFINITION: return createFeatureDefinition();
      case VMPackage.FEATURE: return createFeature();
      case VMPackage.FEATURES_GROUP: return createFeaturesGroup();
      case VMPackage.XORGROUP: return createXorgroup();
      case VMPackage.ORGROUP: return createOrgroup();
      case VMPackage.CARDINALITY_BASED: return createCardinalityBased();
      case VMPackage.ATTRIBUTES: return createAttributes();
      case VMPackage.ATTR_DEF: return createAttrDef();
      case VMPackage.BASIC_ATTR_DEF: return createBasicAttrDef();
      case VMPackage.BOOLEAN_ATTR_DEF: return createBooleanAttrDef();
      case VMPackage.STRING_ATTR_DEF: return createStringAttrDef();
      case VMPackage.INTEGER_ATTR_DEF: return createIntegerAttrDef();
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED: return createIntegerAttrDefBounded();
      case VMPackage.INTEGER_ATTR_DEF_COMPLEMENT: return createIntegerAttrDefComplement();
      case VMPackage.INTEGER_ATTR_DEF_UNBOUNDED: return createIntegerAttrDefUnbounded();
      case VMPackage.REAL_ATTR_DEF: return createRealAttrDef();
      case VMPackage.REAL_ATTR_DEF_BOUNDED: return createRealAttrDefBounded();
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT: return createRealAttrDefComplement();
      case VMPackage.REAL_ATTR_DEF_UNBOUNDED: return createRealAttrDefUnbounded();
      case VMPackage.ENUM_ATTR_DEF: return createEnumAttrDef();
      case VMPackage.ENUM_STRING_DEF: return createEnumStringDef();
      case VMPackage.ENUM_INTEGER_DEF: return createEnumIntegerDef();
      case VMPackage.ENUM_REAL_DEF: return createEnumRealDef();
      case VMPackage.BOOL_DEFAULT_DEF: return createBoolDefaultDef();
      case VMPackage.STRING_DEFAULT_DEF: return createStringDefaultDef();
      case VMPackage.INTEGER_DELTA_DEF: return createIntegerDeltaDef();
      case VMPackage.INTEGER_DEFAULT_DEF: return createIntegerDefaultDef();
      case VMPackage.REAL_DELTA_DEF: return createRealDeltaDef();
      case VMPackage.REAL_DEFAULT_DEF: return createRealDefaultDef();
      case VMPackage.DESCRIPTIONS: return createDescriptions();
      case VMPackage.FEATURE_DESCRIPTION: return createFeatureDescription();
      case VMPackage.ATTRIBUTE_DESCRIPTION: return createAttributeDescription();
      case VMPackage.CONSTRAINTS: return createConstraints();
      case VMPackage.CONSTRAINT: return createConstraint();
      case VMPackage.COMPLEX_EXPRESSION: return createComplexExpression();
      case VMPackage.EXPRESSION: return createExpression();
      case VMPackage.SPECIAL_EXPRESSION: return createSpecialExpression();
      case VMPackage.STRING_EXPRESSION: return createStringExpression();
      case VMPackage.PRIMITIVE_EXPRESSION: return createPrimitiveExpression();
      case VMPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case VMPackage.BRACKED_EXPRESSION: return createBrackedExpression();
      case VMPackage.NUMERIC_EXPRESSION: return createNumericExpression();
      case VMPackage.NUMERIC_EXPRESSION_LIST: return createNumericExpression_List();
      case VMPackage.BOOLEAN_EXPRESSION_LIST: return createBooleanExpression_List();
      case VMPackage.OBJECTIVES: return createObjectives();
      case VMPackage.OBJECTIVE: return createObjective();
      case VMPackage.OBJECTIVE_EXPRESSION: return createObjectiveExpression();
      case VMPackage.CONFIGURATIONS: return createConfigurations();
      case VMPackage.CONFIGURATION: return createConfiguration();
      case VMPackage.BOOLEAN_VALUATION: return createBooleanValuation();
      case VMPackage.EXTENDED_VALUATION: return createExtendedValuation();
      case VMPackage.BASIC_ATTR_VALUATION: return createBasicAttrValuation();
      case VMPackage.REAL_ATTR_VALUATION: return createRealAttrValuation();
      case VMPackage.INTEGER_ATTR_VALUATION: return createIntegerAttrValuation();
      case VMPackage.BOOLEAN_ATTR_VALUATION: return createBooleanAttrValuation();
      case VMPackage.STRING_ATTR_VALUATION: return createStringAttrValuation();
      case VMPackage.ADVANCED_ATTR_VALUATION: return createAdvancedAttrValuation();
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE: return createTableBasedValuationByFeatureAndClone();
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE: return createTableBasedValuationByFeature();
      case VMPackage.PAIR_ATTRIBUTE_VALUE: return createPairAttributeValue();
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE: return createTableBasedValuationByAttribute();
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER: return createTableBasedValuationByAttributeForInteger();
      case VMPackage.PAIR_FEATURE_INTEGER: return createPairFeatureInteger();
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL: return createTableBasedValuationByAttributeForReal();
      case VMPackage.PAIR_FEATURE_REAL: return createPairFeatureReal();
      case VMPackage.BOOLEAN_ATT_ID: return createBoolean_ATT_ID();
      case VMPackage.STRING_ATT_ID: return createString_ATT_ID();
      case VMPackage.INTEGER_ATT_ID: return createInteger_ATT_ID();
      case VMPackage.REAL_ATT_ID: return createReal_ATT_ID();
      case VMPackage.ENUM_STRING_ATT_ID: return createEnum_String_ATT_ID();
      case VMPackage.ENUM_INTEGER_ATT_ID: return createEnum_Integer_ATT_ID();
      case VMPackage.ENUM_REAL_ATT_ID: return createEnum_Real_ATT_ID();
      case VMPackage.ATT_HEAD: return createAttHead();
      case VMPackage.ABSTRACT_ATT_ID: return createAbstract_ATT_ID();
      case VMPackage.IF: return createIf();
      case VMPackage.LEFT_IMPLICATION: return createLeftImplication();
      case VMPackage.RIGHT_IMPLICATION: return createRightImplication();
      case VMPackage.BI_IMPLICATION: return createBiImplication();
      case VMPackage.OR: return createOr();
      case VMPackage.AND: return createAnd();
      case VMPackage.EQUALITY: return createEquality();
      case VMPackage.INEQUALITY: return createInequality();
      case VMPackage.LESS: return createLess();
      case VMPackage.LESSEQUAL: return createLessequal();
      case VMPackage.GREATER: return createGreater();
      case VMPackage.GREATEREQUAL: return createGreaterequal();
      case VMPackage.PLUS: return createPlus();
      case VMPackage.MINUS: return createMinus();
      case VMPackage.MULTIPLICATION: return createMultiplication();
      case VMPackage.DIVISION: return createDivision();
      case VMPackage.EXCLUDES: return createExcludes();
      case VMPackage.REQUIRES: return createRequires();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VmBlock createVmBlock()
  {
    VmBlockImpl vmBlock = new VmBlockImpl();
    return vmBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDeclaration createImportDeclaration()
  {
    ImportDeclarationImpl importDeclaration = new ImportDeclarationImpl();
    return importDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaDataDeclaration createMetaDataDeclaration()
  {
    MetaDataDeclarationImpl metaDataDeclaration = new MetaDataDeclarationImpl();
    return metaDataDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Email createEmail()
  {
    EmailImpl email = new EmailImpl();
    return email;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationships createRelationships()
  {
    RelationshipsImpl relationships = new RelationshipsImpl();
    return relationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureHierarchy createFeatureHierarchy()
  {
    FeatureHierarchyImpl featureHierarchy = new FeatureHierarchyImpl();
    return featureHierarchy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureDefinition createFeatureDefinition()
  {
    FeatureDefinitionImpl featureDefinition = new FeatureDefinitionImpl();
    return featureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeaturesGroup createFeaturesGroup()
  {
    FeaturesGroupImpl featuresGroup = new FeaturesGroupImpl();
    return featuresGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xorgroup createXorgroup()
  {
    XorgroupImpl xorgroup = new XorgroupImpl();
    return xorgroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orgroup createOrgroup()
  {
    OrgroupImpl orgroup = new OrgroupImpl();
    return orgroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CardinalityBased createCardinalityBased()
  {
    CardinalityBasedImpl cardinalityBased = new CardinalityBasedImpl();
    return cardinalityBased;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attributes createAttributes()
  {
    AttributesImpl attributes = new AttributesImpl();
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrDef createAttrDef()
  {
    AttrDefImpl attrDef = new AttrDefImpl();
    return attrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicAttrDef createBasicAttrDef()
  {
    BasicAttrDefImpl basicAttrDef = new BasicAttrDefImpl();
    return basicAttrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanAttrDef createBooleanAttrDef()
  {
    BooleanAttrDefImpl booleanAttrDef = new BooleanAttrDefImpl();
    return booleanAttrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringAttrDef createStringAttrDef()
  {
    StringAttrDefImpl stringAttrDef = new StringAttrDefImpl();
    return stringAttrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerAttrDef createIntegerAttrDef()
  {
    IntegerAttrDefImpl integerAttrDef = new IntegerAttrDefImpl();
    return integerAttrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerAttrDefBounded createIntegerAttrDefBounded()
  {
    IntegerAttrDefBoundedImpl integerAttrDefBounded = new IntegerAttrDefBoundedImpl();
    return integerAttrDefBounded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerAttrDefComplement createIntegerAttrDefComplement()
  {
    IntegerAttrDefComplementImpl integerAttrDefComplement = new IntegerAttrDefComplementImpl();
    return integerAttrDefComplement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerAttrDefUnbounded createIntegerAttrDefUnbounded()
  {
    IntegerAttrDefUnboundedImpl integerAttrDefUnbounded = new IntegerAttrDefUnboundedImpl();
    return integerAttrDefUnbounded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealAttrDef createRealAttrDef()
  {
    RealAttrDefImpl realAttrDef = new RealAttrDefImpl();
    return realAttrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealAttrDefBounded createRealAttrDefBounded()
  {
    RealAttrDefBoundedImpl realAttrDefBounded = new RealAttrDefBoundedImpl();
    return realAttrDefBounded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealAttrDefComplement createRealAttrDefComplement()
  {
    RealAttrDefComplementImpl realAttrDefComplement = new RealAttrDefComplementImpl();
    return realAttrDefComplement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealAttrDefUnbounded createRealAttrDefUnbounded()
  {
    RealAttrDefUnboundedImpl realAttrDefUnbounded = new RealAttrDefUnboundedImpl();
    return realAttrDefUnbounded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumAttrDef createEnumAttrDef()
  {
    EnumAttrDefImpl enumAttrDef = new EnumAttrDefImpl();
    return enumAttrDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumStringDef createEnumStringDef()
  {
    EnumStringDefImpl enumStringDef = new EnumStringDefImpl();
    return enumStringDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumIntegerDef createEnumIntegerDef()
  {
    EnumIntegerDefImpl enumIntegerDef = new EnumIntegerDefImpl();
    return enumIntegerDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumRealDef createEnumRealDef()
  {
    EnumRealDefImpl enumRealDef = new EnumRealDefImpl();
    return enumRealDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolDefaultDef createBoolDefaultDef()
  {
    BoolDefaultDefImpl boolDefaultDef = new BoolDefaultDefImpl();
    return boolDefaultDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringDefaultDef createStringDefaultDef()
  {
    StringDefaultDefImpl stringDefaultDef = new StringDefaultDefImpl();
    return stringDefaultDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerDeltaDef createIntegerDeltaDef()
  {
    IntegerDeltaDefImpl integerDeltaDef = new IntegerDeltaDefImpl();
    return integerDeltaDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerDefaultDef createIntegerDefaultDef()
  {
    IntegerDefaultDefImpl integerDefaultDef = new IntegerDefaultDefImpl();
    return integerDefaultDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealDeltaDef createRealDeltaDef()
  {
    RealDeltaDefImpl realDeltaDef = new RealDeltaDefImpl();
    return realDeltaDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealDefaultDef createRealDefaultDef()
  {
    RealDefaultDefImpl realDefaultDef = new RealDefaultDefImpl();
    return realDefaultDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Descriptions createDescriptions()
  {
    DescriptionsImpl descriptions = new DescriptionsImpl();
    return descriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureDescription createFeatureDescription()
  {
    FeatureDescriptionImpl featureDescription = new FeatureDescriptionImpl();
    return featureDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDescription createAttributeDescription()
  {
    AttributeDescriptionImpl attributeDescription = new AttributeDescriptionImpl();
    return attributeDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraints createConstraints()
  {
    ConstraintsImpl constraints = new ConstraintsImpl();
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression createComplexExpression()
  {
    ComplexExpressionImpl complexExpression = new ComplexExpressionImpl();
    return complexExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecialExpression createSpecialExpression()
  {
    SpecialExpressionImpl specialExpression = new SpecialExpressionImpl();
    return specialExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveExpression createPrimitiveExpression()
  {
    PrimitiveExpressionImpl primitiveExpression = new PrimitiveExpressionImpl();
    return primitiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrackedExpression createBrackedExpression()
  {
    BrackedExpressionImpl brackedExpression = new BrackedExpressionImpl();
    return brackedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericExpression createNumericExpression()
  {
    NumericExpressionImpl numericExpression = new NumericExpressionImpl();
    return numericExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericExpression_List createNumericExpression_List()
  {
    NumericExpression_ListImpl numericExpression_List = new NumericExpression_ListImpl();
    return numericExpression_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression_List createBooleanExpression_List()
  {
    BooleanExpression_ListImpl booleanExpression_List = new BooleanExpression_ListImpl();
    return booleanExpression_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objectives createObjectives()
  {
    ObjectivesImpl objectives = new ObjectivesImpl();
    return objectives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objective createObjective()
  {
    ObjectiveImpl objective = new ObjectiveImpl();
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectiveExpression createObjectiveExpression()
  {
    ObjectiveExpressionImpl objectiveExpression = new ObjectiveExpressionImpl();
    return objectiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configurations createConfigurations()
  {
    ConfigurationsImpl configurations = new ConfigurationsImpl();
    return configurations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValuation createBooleanValuation()
  {
    BooleanValuationImpl booleanValuation = new BooleanValuationImpl();
    return booleanValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedValuation createExtendedValuation()
  {
    ExtendedValuationImpl extendedValuation = new ExtendedValuationImpl();
    return extendedValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicAttrValuation createBasicAttrValuation()
  {
    BasicAttrValuationImpl basicAttrValuation = new BasicAttrValuationImpl();
    return basicAttrValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealAttrValuation createRealAttrValuation()
  {
    RealAttrValuationImpl realAttrValuation = new RealAttrValuationImpl();
    return realAttrValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerAttrValuation createIntegerAttrValuation()
  {
    IntegerAttrValuationImpl integerAttrValuation = new IntegerAttrValuationImpl();
    return integerAttrValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanAttrValuation createBooleanAttrValuation()
  {
    BooleanAttrValuationImpl booleanAttrValuation = new BooleanAttrValuationImpl();
    return booleanAttrValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringAttrValuation createStringAttrValuation()
  {
    StringAttrValuationImpl stringAttrValuation = new StringAttrValuationImpl();
    return stringAttrValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdvancedAttrValuation createAdvancedAttrValuation()
  {
    AdvancedAttrValuationImpl advancedAttrValuation = new AdvancedAttrValuationImpl();
    return advancedAttrValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableBasedValuationByFeatureAndClone createTableBasedValuationByFeatureAndClone()
  {
    TableBasedValuationByFeatureAndCloneImpl tableBasedValuationByFeatureAndClone = new TableBasedValuationByFeatureAndCloneImpl();
    return tableBasedValuationByFeatureAndClone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableBasedValuationByFeature createTableBasedValuationByFeature()
  {
    TableBasedValuationByFeatureImpl tableBasedValuationByFeature = new TableBasedValuationByFeatureImpl();
    return tableBasedValuationByFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PairAttributeValue createPairAttributeValue()
  {
    PairAttributeValueImpl pairAttributeValue = new PairAttributeValueImpl();
    return pairAttributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableBasedValuationByAttribute createTableBasedValuationByAttribute()
  {
    TableBasedValuationByAttributeImpl tableBasedValuationByAttribute = new TableBasedValuationByAttributeImpl();
    return tableBasedValuationByAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableBasedValuationByAttributeForInteger createTableBasedValuationByAttributeForInteger()
  {
    TableBasedValuationByAttributeForIntegerImpl tableBasedValuationByAttributeForInteger = new TableBasedValuationByAttributeForIntegerImpl();
    return tableBasedValuationByAttributeForInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PairFeatureInteger createPairFeatureInteger()
  {
    PairFeatureIntegerImpl pairFeatureInteger = new PairFeatureIntegerImpl();
    return pairFeatureInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableBasedValuationByAttributeForReal createTableBasedValuationByAttributeForReal()
  {
    TableBasedValuationByAttributeForRealImpl tableBasedValuationByAttributeForReal = new TableBasedValuationByAttributeForRealImpl();
    return tableBasedValuationByAttributeForReal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PairFeatureReal createPairFeatureReal()
  {
    PairFeatureRealImpl pairFeatureReal = new PairFeatureRealImpl();
    return pairFeatureReal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean_ATT_ID createBoolean_ATT_ID()
  {
    Boolean_ATT_IDImpl boolean_ATT_ID = new Boolean_ATT_IDImpl();
    return boolean_ATT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String_ATT_ID createString_ATT_ID()
  {
    String_ATT_IDImpl string_ATT_ID = new String_ATT_IDImpl();
    return string_ATT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer_ATT_ID createInteger_ATT_ID()
  {
    Integer_ATT_IDImpl integer_ATT_ID = new Integer_ATT_IDImpl();
    return integer_ATT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Real_ATT_ID createReal_ATT_ID()
  {
    Real_ATT_IDImpl real_ATT_ID = new Real_ATT_IDImpl();
    return real_ATT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enum_String_ATT_ID createEnum_String_ATT_ID()
  {
    Enum_String_ATT_IDImpl enum_String_ATT_ID = new Enum_String_ATT_IDImpl();
    return enum_String_ATT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enum_Integer_ATT_ID createEnum_Integer_ATT_ID()
  {
    Enum_Integer_ATT_IDImpl enum_Integer_ATT_ID = new Enum_Integer_ATT_IDImpl();
    return enum_Integer_ATT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enum_Real_ATT_ID createEnum_Real_ATT_ID()
  {
    Enum_Real_ATT_IDImpl enum_Real_ATT_ID = new Enum_Real_ATT_IDImpl();
    return enum_Real_ATT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttHead createAttHead()
  {
    AttHeadImpl attHead = new AttHeadImpl();
    return attHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstract_ATT_ID createAbstract_ATT_ID()
  {
    Abstract_ATT_IDImpl abstract_ATT_ID = new Abstract_ATT_IDImpl();
    return abstract_ATT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftImplication createLeftImplication()
  {
    LeftImplicationImpl leftImplication = new LeftImplicationImpl();
    return leftImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightImplication createRightImplication()
  {
    RightImplicationImpl rightImplication = new RightImplicationImpl();
    return rightImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BiImplication createBiImplication()
  {
    BiImplicationImpl biImplication = new BiImplicationImpl();
    return biImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inequality createInequality()
  {
    InequalityImpl inequality = new InequalityImpl();
    return inequality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Less createLess()
  {
    LessImpl less = new LessImpl();
    return less;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lessequal createLessequal()
  {
    LessequalImpl lessequal = new LessequalImpl();
    return lessequal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greater createGreater()
  {
    GreaterImpl greater = new GreaterImpl();
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greaterequal createGreaterequal()
  {
    GreaterequalImpl greaterequal = new GreaterequalImpl();
    return greaterequal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Excludes createExcludes()
  {
    ExcludesImpl excludes = new ExcludesImpl();
    return excludes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requires createRequires()
  {
    RequiresImpl requires = new RequiresImpl();
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMPackage getVMPackage()
  {
    return (VMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VMPackage getPackage()
  {
    return VMPackage.eINSTANCE;
  }

} //VMFactoryImpl
