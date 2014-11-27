/**
 */
package fr.inria.lang.vM.util;

import fr.inria.lang.vM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.lang.vM.VMPackage
 * @generated
 */
public class VMSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VMPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VMPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VMPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.VM_BLOCK:
      {
        VmBlock vmBlock = (VmBlock)theEObject;
        T result = caseVmBlock(vmBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = caseVmBlock(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.IMPORT_DECLARATION:
      {
        ImportDeclaration importDeclaration = (ImportDeclaration)theEObject;
        T result = caseImportDeclaration(importDeclaration);
        if (result == null) result = caseVmBlock(importDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.META_DATA_DECLARATION:
      {
        MetaDataDeclaration metaDataDeclaration = (MetaDataDeclaration)theEObject;
        T result = caseMetaDataDeclaration(metaDataDeclaration);
        if (result == null) result = caseVmBlock(metaDataDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.EMAIL:
      {
        Email email = (Email)theEObject;
        T result = caseEmail(email);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.VERSION:
      {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.RELATIONSHIPS:
      {
        Relationships relationships = (Relationships)theEObject;
        T result = caseRelationships(relationships);
        if (result == null) result = caseVmBlock(relationships);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.FEATURE_HIERARCHY:
      {
        FeatureHierarchy featureHierarchy = (FeatureHierarchy)theEObject;
        T result = caseFeatureHierarchy(featureHierarchy);
        if (result == null) result = caseFeatureDefinition(featureHierarchy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.FEATURE_DEFINITION:
      {
        FeatureDefinition featureDefinition = (FeatureDefinition)theEObject;
        T result = caseFeatureDefinition(featureDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = caseFeatureDefinition(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.FEATURES_GROUP:
      {
        FeaturesGroup featuresGroup = (FeaturesGroup)theEObject;
        T result = caseFeaturesGroup(featuresGroup);
        if (result == null) result = caseFeatureDefinition(featuresGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.XORGROUP:
      {
        Xorgroup xorgroup = (Xorgroup)theEObject;
        T result = caseXorgroup(xorgroup);
        if (result == null) result = caseFeaturesGroup(xorgroup);
        if (result == null) result = caseFeatureDefinition(xorgroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ORGROUP:
      {
        Orgroup orgroup = (Orgroup)theEObject;
        T result = caseOrgroup(orgroup);
        if (result == null) result = caseFeaturesGroup(orgroup);
        if (result == null) result = caseFeatureDefinition(orgroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.CARDINALITY_BASED:
      {
        CardinalityBased cardinalityBased = (CardinalityBased)theEObject;
        T result = caseCardinalityBased(cardinalityBased);
        if (result == null) result = caseFeaturesGroup(cardinalityBased);
        if (result == null) result = caseFeatureDefinition(cardinalityBased);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ATTRIBUTES:
      {
        Attributes attributes = (Attributes)theEObject;
        T result = caseAttributes(attributes);
        if (result == null) result = caseVmBlock(attributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ATTR_DEF:
      {
        AttrDef attrDef = (AttrDef)theEObject;
        T result = caseAttrDef(attrDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BASIC_ATTR_DEF:
      {
        BasicAttrDef basicAttrDef = (BasicAttrDef)theEObject;
        T result = caseBasicAttrDef(basicAttrDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BOOLEAN_ATTR_DEF:
      {
        BooleanAttrDef booleanAttrDef = (BooleanAttrDef)theEObject;
        T result = caseBooleanAttrDef(booleanAttrDef);
        if (result == null) result = caseBasicAttrDef(booleanAttrDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.STRING_ATTR_DEF:
      {
        StringAttrDef stringAttrDef = (StringAttrDef)theEObject;
        T result = caseStringAttrDef(stringAttrDef);
        if (result == null) result = caseBasicAttrDef(stringAttrDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INTEGER_ATTR_DEF:
      {
        IntegerAttrDef integerAttrDef = (IntegerAttrDef)theEObject;
        T result = caseIntegerAttrDef(integerAttrDef);
        if (result == null) result = caseBasicAttrDef(integerAttrDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INTEGER_ATTR_DEF_BOUNDED:
      {
        IntegerAttrDefBounded integerAttrDefBounded = (IntegerAttrDefBounded)theEObject;
        T result = caseIntegerAttrDefBounded(integerAttrDefBounded);
        if (result == null) result = caseIntegerAttrDef(integerAttrDefBounded);
        if (result == null) result = caseBasicAttrDef(integerAttrDefBounded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INTEGER_ATTR_DEF_COMPLEMENT:
      {
        IntegerAttrDefComplement integerAttrDefComplement = (IntegerAttrDefComplement)theEObject;
        T result = caseIntegerAttrDefComplement(integerAttrDefComplement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INTEGER_ATTR_DEF_UNBOUNDED:
      {
        IntegerAttrDefUnbounded integerAttrDefUnbounded = (IntegerAttrDefUnbounded)theEObject;
        T result = caseIntegerAttrDefUnbounded(integerAttrDefUnbounded);
        if (result == null) result = caseIntegerAttrDef(integerAttrDefUnbounded);
        if (result == null) result = caseBasicAttrDef(integerAttrDefUnbounded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REAL_ATTR_DEF:
      {
        RealAttrDef realAttrDef = (RealAttrDef)theEObject;
        T result = caseRealAttrDef(realAttrDef);
        if (result == null) result = caseBasicAttrDef(realAttrDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REAL_ATTR_DEF_BOUNDED:
      {
        RealAttrDefBounded realAttrDefBounded = (RealAttrDefBounded)theEObject;
        T result = caseRealAttrDefBounded(realAttrDefBounded);
        if (result == null) result = caseRealAttrDef(realAttrDefBounded);
        if (result == null) result = caseBasicAttrDef(realAttrDefBounded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REAL_ATTR_DEF_COMPLEMENT:
      {
        RealAttrDefComplement realAttrDefComplement = (RealAttrDefComplement)theEObject;
        T result = caseRealAttrDefComplement(realAttrDefComplement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REAL_ATTR_DEF_UNBOUNDED:
      {
        RealAttrDefUnbounded realAttrDefUnbounded = (RealAttrDefUnbounded)theEObject;
        T result = caseRealAttrDefUnbounded(realAttrDefUnbounded);
        if (result == null) result = caseRealAttrDef(realAttrDefUnbounded);
        if (result == null) result = caseBasicAttrDef(realAttrDefUnbounded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ENUM_ATTR_DEF:
      {
        EnumAttrDef enumAttrDef = (EnumAttrDef)theEObject;
        T result = caseEnumAttrDef(enumAttrDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ENUM_STRING_DEF:
      {
        EnumStringDef enumStringDef = (EnumStringDef)theEObject;
        T result = caseEnumStringDef(enumStringDef);
        if (result == null) result = caseEnumAttrDef(enumStringDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ENUM_INTEGER_DEF:
      {
        EnumIntegerDef enumIntegerDef = (EnumIntegerDef)theEObject;
        T result = caseEnumIntegerDef(enumIntegerDef);
        if (result == null) result = caseEnumAttrDef(enumIntegerDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ENUM_REAL_DEF:
      {
        EnumRealDef enumRealDef = (EnumRealDef)theEObject;
        T result = caseEnumRealDef(enumRealDef);
        if (result == null) result = caseEnumAttrDef(enumRealDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BOOL_DEFAULT_DEF:
      {
        BoolDefaultDef boolDefaultDef = (BoolDefaultDef)theEObject;
        T result = caseBoolDefaultDef(boolDefaultDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.STRING_DEFAULT_DEF:
      {
        StringDefaultDef stringDefaultDef = (StringDefaultDef)theEObject;
        T result = caseStringDefaultDef(stringDefaultDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INTEGER_DELTA_DEF:
      {
        IntegerDeltaDef integerDeltaDef = (IntegerDeltaDef)theEObject;
        T result = caseIntegerDeltaDef(integerDeltaDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INTEGER_DEFAULT_DEF:
      {
        IntegerDefaultDef integerDefaultDef = (IntegerDefaultDef)theEObject;
        T result = caseIntegerDefaultDef(integerDefaultDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REAL_DELTA_DEF:
      {
        RealDeltaDef realDeltaDef = (RealDeltaDef)theEObject;
        T result = caseRealDeltaDef(realDeltaDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REAL_DEFAULT_DEF:
      {
        RealDefaultDef realDefaultDef = (RealDefaultDef)theEObject;
        T result = caseRealDefaultDef(realDefaultDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.DESCRIPTIONS:
      {
        Descriptions descriptions = (Descriptions)theEObject;
        T result = caseDescriptions(descriptions);
        if (result == null) result = caseVmBlock(descriptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.FEATURE_DESCRIPTION:
      {
        FeatureDescription featureDescription = (FeatureDescription)theEObject;
        T result = caseFeatureDescription(featureDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ATTRIBUTE_DESCRIPTION:
      {
        AttributeDescription attributeDescription = (AttributeDescription)theEObject;
        T result = caseAttributeDescription(attributeDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.CONSTRAINTS:
      {
        Constraints constraints = (Constraints)theEObject;
        T result = caseConstraints(constraints);
        if (result == null) result = caseVmBlock(constraints);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.COMPLEX_EXPRESSION:
      {
        ComplexExpression complexExpression = (ComplexExpression)theEObject;
        T result = caseComplexExpression(complexExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseComplexExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.SPECIAL_EXPRESSION:
      {
        SpecialExpression specialExpression = (SpecialExpression)theEObject;
        T result = caseSpecialExpression(specialExpression);
        if (result == null) result = caseExpression(specialExpression);
        if (result == null) result = caseComplexExpression(specialExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.STRING_EXPRESSION:
      {
        StringExpression stringExpression = (StringExpression)theEObject;
        T result = caseStringExpression(stringExpression);
        if (result == null) result = caseExpression(stringExpression);
        if (result == null) result = caseComplexExpression(stringExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.PRIMITIVE_EXPRESSION:
      {
        PrimitiveExpression primitiveExpression = (PrimitiveExpression)theEObject;
        T result = casePrimitiveExpression(primitiveExpression);
        if (result == null) result = caseExpression(primitiveExpression);
        if (result == null) result = caseComplexExpression(primitiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = caseExpression(booleanExpression);
        if (result == null) result = caseComplexExpression(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BRACKED_EXPRESSION:
      {
        BrackedExpression brackedExpression = (BrackedExpression)theEObject;
        T result = caseBrackedExpression(brackedExpression);
        if (result == null) result = caseExpression(brackedExpression);
        if (result == null) result = caseComplexExpression(brackedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.NUMERIC_EXPRESSION:
      {
        NumericExpression numericExpression = (NumericExpression)theEObject;
        T result = caseNumericExpression(numericExpression);
        if (result == null) result = caseExpression(numericExpression);
        if (result == null) result = caseComplexExpression(numericExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.NUMERIC_EXPRESSION_LIST:
      {
        NumericExpression_List numericExpression_List = (NumericExpression_List)theEObject;
        T result = caseNumericExpression_List(numericExpression_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BOOLEAN_EXPRESSION_LIST:
      {
        BooleanExpression_List booleanExpression_List = (BooleanExpression_List)theEObject;
        T result = caseBooleanExpression_List(booleanExpression_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.OBJECTIVES:
      {
        Objectives objectives = (Objectives)theEObject;
        T result = caseObjectives(objectives);
        if (result == null) result = caseVmBlock(objectives);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.OBJECTIVE:
      {
        Objective objective = (Objective)theEObject;
        T result = caseObjective(objective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.OBJECTIVE_EXPRESSION:
      {
        ObjectiveExpression objectiveExpression = (ObjectiveExpression)theEObject;
        T result = caseObjectiveExpression(objectiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.CONFIGURATIONS:
      {
        Configurations configurations = (Configurations)theEObject;
        T result = caseConfigurations(configurations);
        if (result == null) result = caseVmBlock(configurations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BOOLEAN_VALUATION:
      {
        BooleanValuation booleanValuation = (BooleanValuation)theEObject;
        T result = caseBooleanValuation(booleanValuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.EXTENDED_VALUATION:
      {
        ExtendedValuation extendedValuation = (ExtendedValuation)theEObject;
        T result = caseExtendedValuation(extendedValuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BASIC_ATTR_VALUATION:
      {
        BasicAttrValuation basicAttrValuation = (BasicAttrValuation)theEObject;
        T result = caseBasicAttrValuation(basicAttrValuation);
        if (result == null) result = caseExtendedValuation(basicAttrValuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REAL_ATTR_VALUATION:
      {
        RealAttrValuation realAttrValuation = (RealAttrValuation)theEObject;
        T result = caseRealAttrValuation(realAttrValuation);
        if (result == null) result = caseBasicAttrValuation(realAttrValuation);
        if (result == null) result = caseExtendedValuation(realAttrValuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INTEGER_ATTR_VALUATION:
      {
        IntegerAttrValuation integerAttrValuation = (IntegerAttrValuation)theEObject;
        T result = caseIntegerAttrValuation(integerAttrValuation);
        if (result == null) result = caseBasicAttrValuation(integerAttrValuation);
        if (result == null) result = caseExtendedValuation(integerAttrValuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BOOLEAN_ATTR_VALUATION:
      {
        BooleanAttrValuation booleanAttrValuation = (BooleanAttrValuation)theEObject;
        T result = caseBooleanAttrValuation(booleanAttrValuation);
        if (result == null) result = caseBasicAttrValuation(booleanAttrValuation);
        if (result == null) result = caseExtendedValuation(booleanAttrValuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.STRING_ATTR_VALUATION:
      {
        StringAttrValuation stringAttrValuation = (StringAttrValuation)theEObject;
        T result = caseStringAttrValuation(stringAttrValuation);
        if (result == null) result = caseBasicAttrValuation(stringAttrValuation);
        if (result == null) result = caseExtendedValuation(stringAttrValuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ADVANCED_ATTR_VALUATION:
      {
        AdvancedAttrValuation advancedAttrValuation = (AdvancedAttrValuation)theEObject;
        T result = caseAdvancedAttrValuation(advancedAttrValuation);
        if (result == null) result = caseExtendedValuation(advancedAttrValuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE:
      {
        TableBasedValuationByFeatureAndClone tableBasedValuationByFeatureAndClone = (TableBasedValuationByFeatureAndClone)theEObject;
        T result = caseTableBasedValuationByFeatureAndClone(tableBasedValuationByFeatureAndClone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE:
      {
        TableBasedValuationByFeature tableBasedValuationByFeature = (TableBasedValuationByFeature)theEObject;
        T result = caseTableBasedValuationByFeature(tableBasedValuationByFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.PAIR_ATTRIBUTE_VALUE:
      {
        PairAttributeValue pairAttributeValue = (PairAttributeValue)theEObject;
        T result = casePairAttributeValue(pairAttributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE:
      {
        TableBasedValuationByAttribute tableBasedValuationByAttribute = (TableBasedValuationByAttribute)theEObject;
        T result = caseTableBasedValuationByAttribute(tableBasedValuationByAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER:
      {
        TableBasedValuationByAttributeForInteger tableBasedValuationByAttributeForInteger = (TableBasedValuationByAttributeForInteger)theEObject;
        T result = caseTableBasedValuationByAttributeForInteger(tableBasedValuationByAttributeForInteger);
        if (result == null) result = caseTableBasedValuationByAttribute(tableBasedValuationByAttributeForInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.PAIR_FEATURE_INTEGER:
      {
        PairFeatureInteger pairFeatureInteger = (PairFeatureInteger)theEObject;
        T result = casePairFeatureInteger(pairFeatureInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL:
      {
        TableBasedValuationByAttributeForReal tableBasedValuationByAttributeForReal = (TableBasedValuationByAttributeForReal)theEObject;
        T result = caseTableBasedValuationByAttributeForReal(tableBasedValuationByAttributeForReal);
        if (result == null) result = caseTableBasedValuationByAttribute(tableBasedValuationByAttributeForReal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.PAIR_FEATURE_REAL:
      {
        PairFeatureReal pairFeatureReal = (PairFeatureReal)theEObject;
        T result = casePairFeatureReal(pairFeatureReal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BOOLEAN_ATT_ID:
      {
        Boolean_ATT_ID boolean_ATT_ID = (Boolean_ATT_ID)theEObject;
        T result = caseBoolean_ATT_ID(boolean_ATT_ID);
        if (result == null) result = caseAbstract_ATT_ID(boolean_ATT_ID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.STRING_ATT_ID:
      {
        String_ATT_ID string_ATT_ID = (String_ATT_ID)theEObject;
        T result = caseString_ATT_ID(string_ATT_ID);
        if (result == null) result = caseAbstract_ATT_ID(string_ATT_ID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INTEGER_ATT_ID:
      {
        Integer_ATT_ID integer_ATT_ID = (Integer_ATT_ID)theEObject;
        T result = caseInteger_ATT_ID(integer_ATT_ID);
        if (result == null) result = caseAbstract_ATT_ID(integer_ATT_ID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REAL_ATT_ID:
      {
        Real_ATT_ID real_ATT_ID = (Real_ATT_ID)theEObject;
        T result = caseReal_ATT_ID(real_ATT_ID);
        if (result == null) result = caseAbstract_ATT_ID(real_ATT_ID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ENUM_STRING_ATT_ID:
      {
        Enum_String_ATT_ID enum_String_ATT_ID = (Enum_String_ATT_ID)theEObject;
        T result = caseEnum_String_ATT_ID(enum_String_ATT_ID);
        if (result == null) result = caseAbstract_ATT_ID(enum_String_ATT_ID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ENUM_INTEGER_ATT_ID:
      {
        Enum_Integer_ATT_ID enum_Integer_ATT_ID = (Enum_Integer_ATT_ID)theEObject;
        T result = caseEnum_Integer_ATT_ID(enum_Integer_ATT_ID);
        if (result == null) result = caseAbstract_ATT_ID(enum_Integer_ATT_ID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ENUM_REAL_ATT_ID:
      {
        Enum_Real_ATT_ID enum_Real_ATT_ID = (Enum_Real_ATT_ID)theEObject;
        T result = caseEnum_Real_ATT_ID(enum_Real_ATT_ID);
        if (result == null) result = caseAbstract_ATT_ID(enum_Real_ATT_ID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ATT_HEAD:
      {
        AttHead attHead = (AttHead)theEObject;
        T result = caseAttHead(attHead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.ABSTRACT_ATT_ID:
      {
        Abstract_ATT_ID abstract_ATT_ID = (Abstract_ATT_ID)theEObject;
        T result = caseAbstract_ATT_ID(abstract_ATT_ID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.IF:
      {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = caseComplexExpression(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.LEFT_IMPLICATION:
      {
        LeftImplication leftImplication = (LeftImplication)theEObject;
        T result = caseLeftImplication(leftImplication);
        if (result == null) result = caseComplexExpression(leftImplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.RIGHT_IMPLICATION:
      {
        RightImplication rightImplication = (RightImplication)theEObject;
        T result = caseRightImplication(rightImplication);
        if (result == null) result = caseComplexExpression(rightImplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.BI_IMPLICATION:
      {
        BiImplication biImplication = (BiImplication)theEObject;
        T result = caseBiImplication(biImplication);
        if (result == null) result = caseComplexExpression(biImplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseComplexExpression(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseComplexExpression(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.EQUALITY:
      {
        Equality equality = (Equality)theEObject;
        T result = caseEquality(equality);
        if (result == null) result = caseComplexExpression(equality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.INEQUALITY:
      {
        Inequality inequality = (Inequality)theEObject;
        T result = caseInequality(inequality);
        if (result == null) result = caseComplexExpression(inequality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.LESS:
      {
        Less less = (Less)theEObject;
        T result = caseLess(less);
        if (result == null) result = caseComplexExpression(less);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.LESSEQUAL:
      {
        Lessequal lessequal = (Lessequal)theEObject;
        T result = caseLessequal(lessequal);
        if (result == null) result = caseComplexExpression(lessequal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.GREATER:
      {
        Greater greater = (Greater)theEObject;
        T result = caseGreater(greater);
        if (result == null) result = caseComplexExpression(greater);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.GREATEREQUAL:
      {
        Greaterequal greaterequal = (Greaterequal)theEObject;
        T result = caseGreaterequal(greaterequal);
        if (result == null) result = caseComplexExpression(greaterequal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseComplexExpression(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseComplexExpression(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseComplexExpression(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.DIVISION:
      {
        Division division = (Division)theEObject;
        T result = caseDivision(division);
        if (result == null) result = caseComplexExpression(division);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.EXCLUDES:
      {
        Excludes excludes = (Excludes)theEObject;
        T result = caseExcludes(excludes);
        if (result == null) result = caseComplexExpression(excludes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VMPackage.REQUIRES:
      {
        Requires requires = (Requires)theEObject;
        T result = caseRequires(requires);
        if (result == null) result = caseComplexExpression(requires);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vm Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vm Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVmBlock(VmBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportDeclaration(ImportDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Data Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Data Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaDataDeclaration(MetaDataDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Email</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmail(Email object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersion(Version object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationships</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationships</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationships(Relationships object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Hierarchy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Hierarchy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureHierarchy(FeatureHierarchy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureDefinition(FeatureDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Features Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Features Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeaturesGroup(FeaturesGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xorgroup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xorgroup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXorgroup(Xorgroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Orgroup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Orgroup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrgroup(Orgroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cardinality Based</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cardinality Based</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCardinalityBased(CardinalityBased object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributes(Attributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrDef(AttrDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Attr Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Attr Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicAttrDef(BasicAttrDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Attr Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Attr Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanAttrDef(BooleanAttrDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Attr Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Attr Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringAttrDef(StringAttrDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Attr Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Attr Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerAttrDef(IntegerAttrDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Attr Def Bounded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Attr Def Bounded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerAttrDefBounded(IntegerAttrDefBounded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Attr Def Complement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Attr Def Complement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerAttrDefComplement(IntegerAttrDefComplement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Attr Def Unbounded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Attr Def Unbounded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerAttrDefUnbounded(IntegerAttrDefUnbounded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Attr Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Attr Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealAttrDef(RealAttrDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Attr Def Bounded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Attr Def Bounded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealAttrDefBounded(RealAttrDefBounded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Attr Def Complement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Attr Def Complement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealAttrDefComplement(RealAttrDefComplement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Attr Def Unbounded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Attr Def Unbounded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealAttrDefUnbounded(RealAttrDefUnbounded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Attr Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Attr Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumAttrDef(EnumAttrDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum String Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum String Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumStringDef(EnumStringDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Integer Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Integer Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumIntegerDef(EnumIntegerDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Real Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Real Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumRealDef(EnumRealDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Default Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Default Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolDefaultDef(BoolDefaultDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Default Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Default Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringDefaultDef(StringDefaultDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Delta Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Delta Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerDeltaDef(IntegerDeltaDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Default Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Default Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerDefaultDef(IntegerDefaultDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Delta Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Delta Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealDeltaDef(RealDeltaDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Default Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Default Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealDefaultDef(RealDefaultDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Descriptions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Descriptions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescriptions(Descriptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureDescription(FeatureDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeDescription(AttributeDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraints</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraints</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraints(Constraints object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexExpression(ComplexExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Special Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Special Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecialExpression(SpecialExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringExpression(StringExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveExpression(PrimitiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bracked Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bracked Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBrackedExpression(BrackedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericExpression(NumericExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericExpression_List(NumericExpression_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression_List(BooleanExpression_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objectives</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objectives</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectives(Objectives object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjective(Objective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objective Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objective Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectiveExpression(ObjectiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configurations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configurations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigurations(Configurations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Valuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Valuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanValuation(BooleanValuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extended Valuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extended Valuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendedValuation(ExtendedValuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Attr Valuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicAttrValuation(BasicAttrValuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Attr Valuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealAttrValuation(RealAttrValuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Attr Valuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerAttrValuation(IntegerAttrValuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Attr Valuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanAttrValuation(BooleanAttrValuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Attr Valuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringAttrValuation(StringAttrValuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Advanced Attr Valuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Advanced Attr Valuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdvancedAttrValuation(AdvancedAttrValuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Based Valuation By Feature And Clone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Based Valuation By Feature And Clone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableBasedValuationByFeatureAndClone(TableBasedValuationByFeatureAndClone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Based Valuation By Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Based Valuation By Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableBasedValuationByFeature(TableBasedValuationByFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pair Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pair Attribute Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePairAttributeValue(PairAttributeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Based Valuation By Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Based Valuation By Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableBasedValuationByAttribute(TableBasedValuationByAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Based Valuation By Attribute For Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Based Valuation By Attribute For Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableBasedValuationByAttributeForInteger(TableBasedValuationByAttributeForInteger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pair Feature Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pair Feature Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePairFeatureInteger(PairFeatureInteger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Based Valuation By Attribute For Real</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Based Valuation By Attribute For Real</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableBasedValuationByAttributeForReal(TableBasedValuationByAttributeForReal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pair Feature Real</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pair Feature Real</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePairFeatureReal(PairFeatureReal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean ATT ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean ATT ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean_ATT_ID(Boolean_ATT_ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String ATT ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String ATT ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseString_ATT_ID(String_ATT_ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer ATT ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer ATT ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteger_ATT_ID(Integer_ATT_ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real ATT ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real ATT ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReal_ATT_ID(Real_ATT_ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum String ATT ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum String ATT ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum_String_ATT_ID(Enum_String_ATT_ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Integer ATT ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Integer ATT ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum_Integer_ATT_ID(Enum_Integer_ATT_ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Real ATT ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Real ATT ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum_Real_ATT_ID(Enum_Real_ATT_ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Att Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Att Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttHead(AttHead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract ATT ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract ATT ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstract_ATT_ID(Abstract_ATT_ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftImplication(LeftImplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightImplication(RightImplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bi Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bi Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBiImplication(BiImplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquality(Equality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inequality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inequality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInequality(Inequality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Less</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLess(Less object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lessequal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lessequal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLessequal(Lessequal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreater(Greater object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greaterequal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greaterequal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreaterequal(Greaterequal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivision(Division object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Excludes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Excludes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExcludes(Excludes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requires</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requires</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequires(Requires object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VMSwitch
