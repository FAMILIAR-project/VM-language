/**
 */
package fr.inria.lang.vM.util;

import fr.inria.lang.vM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.lang.vM.VMPackage
 * @generated
 */
public class VMAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VMPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VMPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VMSwitch<Adapter> modelSwitch =
    new VMSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseVmBlock(VmBlock object)
      {
        return createVmBlockAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseImportDeclaration(ImportDeclaration object)
      {
        return createImportDeclarationAdapter();
      }
      @Override
      public Adapter caseMetaDataDeclaration(MetaDataDeclaration object)
      {
        return createMetaDataDeclarationAdapter();
      }
      @Override
      public Adapter caseEmail(Email object)
      {
        return createEmailAdapter();
      }
      @Override
      public Adapter caseVersion(Version object)
      {
        return createVersionAdapter();
      }
      @Override
      public Adapter caseRelationships(Relationships object)
      {
        return createRelationshipsAdapter();
      }
      @Override
      public Adapter caseFeatureHierarchy(FeatureHierarchy object)
      {
        return createFeatureHierarchyAdapter();
      }
      @Override
      public Adapter caseFeatureDefinition(FeatureDefinition object)
      {
        return createFeatureDefinitionAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseFeaturesGroup(FeaturesGroup object)
      {
        return createFeaturesGroupAdapter();
      }
      @Override
      public Adapter caseXorgroup(Xorgroup object)
      {
        return createXorgroupAdapter();
      }
      @Override
      public Adapter caseOrgroup(Orgroup object)
      {
        return createOrgroupAdapter();
      }
      @Override
      public Adapter caseCardinalityBased(CardinalityBased object)
      {
        return createCardinalityBasedAdapter();
      }
      @Override
      public Adapter caseAttributes(Attributes object)
      {
        return createAttributesAdapter();
      }
      @Override
      public Adapter caseAttrDef(AttrDef object)
      {
        return createAttrDefAdapter();
      }
      @Override
      public Adapter caseBasicAttrDef(BasicAttrDef object)
      {
        return createBasicAttrDefAdapter();
      }
      @Override
      public Adapter caseBooleanAttrDef(BooleanAttrDef object)
      {
        return createBooleanAttrDefAdapter();
      }
      @Override
      public Adapter caseStringAttrDef(StringAttrDef object)
      {
        return createStringAttrDefAdapter();
      }
      @Override
      public Adapter caseIntegerAttrDef(IntegerAttrDef object)
      {
        return createIntegerAttrDefAdapter();
      }
      @Override
      public Adapter caseIntegerAttrDefBounded(IntegerAttrDefBounded object)
      {
        return createIntegerAttrDefBoundedAdapter();
      }
      @Override
      public Adapter caseIntegerAttrDefComplement(IntegerAttrDefComplement object)
      {
        return createIntegerAttrDefComplementAdapter();
      }
      @Override
      public Adapter caseIntegerAttrDefUnbounded(IntegerAttrDefUnbounded object)
      {
        return createIntegerAttrDefUnboundedAdapter();
      }
      @Override
      public Adapter caseRealAttrDef(RealAttrDef object)
      {
        return createRealAttrDefAdapter();
      }
      @Override
      public Adapter caseRealAttrDefBounded(RealAttrDefBounded object)
      {
        return createRealAttrDefBoundedAdapter();
      }
      @Override
      public Adapter caseRealAttrDefComplement(RealAttrDefComplement object)
      {
        return createRealAttrDefComplementAdapter();
      }
      @Override
      public Adapter caseRealAttrDefUnbounded(RealAttrDefUnbounded object)
      {
        return createRealAttrDefUnboundedAdapter();
      }
      @Override
      public Adapter caseEnumAttrDef(EnumAttrDef object)
      {
        return createEnumAttrDefAdapter();
      }
      @Override
      public Adapter caseEnumStringDef(EnumStringDef object)
      {
        return createEnumStringDefAdapter();
      }
      @Override
      public Adapter caseEnumIntegerDef(EnumIntegerDef object)
      {
        return createEnumIntegerDefAdapter();
      }
      @Override
      public Adapter caseEnumRealDef(EnumRealDef object)
      {
        return createEnumRealDefAdapter();
      }
      @Override
      public Adapter caseBoolDefaultDef(BoolDefaultDef object)
      {
        return createBoolDefaultDefAdapter();
      }
      @Override
      public Adapter caseStringDefaultDef(StringDefaultDef object)
      {
        return createStringDefaultDefAdapter();
      }
      @Override
      public Adapter caseIntegerDeltaDef(IntegerDeltaDef object)
      {
        return createIntegerDeltaDefAdapter();
      }
      @Override
      public Adapter caseIntegerDefaultDef(IntegerDefaultDef object)
      {
        return createIntegerDefaultDefAdapter();
      }
      @Override
      public Adapter caseRealDeltaDef(RealDeltaDef object)
      {
        return createRealDeltaDefAdapter();
      }
      @Override
      public Adapter caseRealDefaultDef(RealDefaultDef object)
      {
        return createRealDefaultDefAdapter();
      }
      @Override
      public Adapter caseDescriptions(Descriptions object)
      {
        return createDescriptionsAdapter();
      }
      @Override
      public Adapter caseFeatureDescription(FeatureDescription object)
      {
        return createFeatureDescriptionAdapter();
      }
      @Override
      public Adapter caseAttributeDescription(AttributeDescription object)
      {
        return createAttributeDescriptionAdapter();
      }
      @Override
      public Adapter caseConstraints(Constraints object)
      {
        return createConstraintsAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseComplexExpression(ComplexExpression object)
      {
        return createComplexExpressionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSpecialExpression(SpecialExpression object)
      {
        return createSpecialExpressionAdapter();
      }
      @Override
      public Adapter caseStringExpression(StringExpression object)
      {
        return createStringExpressionAdapter();
      }
      @Override
      public Adapter casePrimitiveExpression(PrimitiveExpression object)
      {
        return createPrimitiveExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseBrackedExpression(BrackedExpression object)
      {
        return createBrackedExpressionAdapter();
      }
      @Override
      public Adapter caseNumericExpression(NumericExpression object)
      {
        return createNumericExpressionAdapter();
      }
      @Override
      public Adapter caseNumericExpression_List(NumericExpression_List object)
      {
        return createNumericExpression_ListAdapter();
      }
      @Override
      public Adapter caseBooleanExpression_List(BooleanExpression_List object)
      {
        return createBooleanExpression_ListAdapter();
      }
      @Override
      public Adapter caseObjectives(Objectives object)
      {
        return createObjectivesAdapter();
      }
      @Override
      public Adapter caseObjective(Objective object)
      {
        return createObjectiveAdapter();
      }
      @Override
      public Adapter caseObjectiveExpression(ObjectiveExpression object)
      {
        return createObjectiveExpressionAdapter();
      }
      @Override
      public Adapter caseConfigurations(Configurations object)
      {
        return createConfigurationsAdapter();
      }
      @Override
      public Adapter caseConfiguration(Configuration object)
      {
        return createConfigurationAdapter();
      }
      @Override
      public Adapter caseBooleanValuation(BooleanValuation object)
      {
        return createBooleanValuationAdapter();
      }
      @Override
      public Adapter caseExtendedValuation(ExtendedValuation object)
      {
        return createExtendedValuationAdapter();
      }
      @Override
      public Adapter caseBasicAttrValuation(BasicAttrValuation object)
      {
        return createBasicAttrValuationAdapter();
      }
      @Override
      public Adapter caseRealAttrValuation(RealAttrValuation object)
      {
        return createRealAttrValuationAdapter();
      }
      @Override
      public Adapter caseIntegerAttrValuation(IntegerAttrValuation object)
      {
        return createIntegerAttrValuationAdapter();
      }
      @Override
      public Adapter caseBooleanAttrValuation(BooleanAttrValuation object)
      {
        return createBooleanAttrValuationAdapter();
      }
      @Override
      public Adapter caseStringAttrValuation(StringAttrValuation object)
      {
        return createStringAttrValuationAdapter();
      }
      @Override
      public Adapter caseAdvancedAttrValuation(AdvancedAttrValuation object)
      {
        return createAdvancedAttrValuationAdapter();
      }
      @Override
      public Adapter caseTableBasedValuationByFeatureAndClone(TableBasedValuationByFeatureAndClone object)
      {
        return createTableBasedValuationByFeatureAndCloneAdapter();
      }
      @Override
      public Adapter caseTableBasedValuationByFeature(TableBasedValuationByFeature object)
      {
        return createTableBasedValuationByFeatureAdapter();
      }
      @Override
      public Adapter casePairAttributeValue(PairAttributeValue object)
      {
        return createPairAttributeValueAdapter();
      }
      @Override
      public Adapter caseTableBasedValuationByAttribute(TableBasedValuationByAttribute object)
      {
        return createTableBasedValuationByAttributeAdapter();
      }
      @Override
      public Adapter caseTableBasedValuationByAttributeForInteger(TableBasedValuationByAttributeForInteger object)
      {
        return createTableBasedValuationByAttributeForIntegerAdapter();
      }
      @Override
      public Adapter casePairFeatureInteger(PairFeatureInteger object)
      {
        return createPairFeatureIntegerAdapter();
      }
      @Override
      public Adapter caseTableBasedValuationByAttributeForReal(TableBasedValuationByAttributeForReal object)
      {
        return createTableBasedValuationByAttributeForRealAdapter();
      }
      @Override
      public Adapter casePairFeatureReal(PairFeatureReal object)
      {
        return createPairFeatureRealAdapter();
      }
      @Override
      public Adapter caseBoolean_ATT_ID(Boolean_ATT_ID object)
      {
        return createBoolean_ATT_IDAdapter();
      }
      @Override
      public Adapter caseString_ATT_ID(String_ATT_ID object)
      {
        return createString_ATT_IDAdapter();
      }
      @Override
      public Adapter caseInteger_ATT_ID(Integer_ATT_ID object)
      {
        return createInteger_ATT_IDAdapter();
      }
      @Override
      public Adapter caseReal_ATT_ID(Real_ATT_ID object)
      {
        return createReal_ATT_IDAdapter();
      }
      @Override
      public Adapter caseEnum_String_ATT_ID(Enum_String_ATT_ID object)
      {
        return createEnum_String_ATT_IDAdapter();
      }
      @Override
      public Adapter caseEnum_Integer_ATT_ID(Enum_Integer_ATT_ID object)
      {
        return createEnum_Integer_ATT_IDAdapter();
      }
      @Override
      public Adapter caseEnum_Real_ATT_ID(Enum_Real_ATT_ID object)
      {
        return createEnum_Real_ATT_IDAdapter();
      }
      @Override
      public Adapter caseAttHead(AttHead object)
      {
        return createAttHeadAdapter();
      }
      @Override
      public Adapter caseAbstract_ATT_ID(Abstract_ATT_ID object)
      {
        return createAbstract_ATT_IDAdapter();
      }
      @Override
      public Adapter caseIf(If object)
      {
        return createIfAdapter();
      }
      @Override
      public Adapter caseLeftImplication(LeftImplication object)
      {
        return createLeftImplicationAdapter();
      }
      @Override
      public Adapter caseRightImplication(RightImplication object)
      {
        return createRightImplicationAdapter();
      }
      @Override
      public Adapter caseBiImplication(BiImplication object)
      {
        return createBiImplicationAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseEquality(Equality object)
      {
        return createEqualityAdapter();
      }
      @Override
      public Adapter caseInequality(Inequality object)
      {
        return createInequalityAdapter();
      }
      @Override
      public Adapter caseLess(Less object)
      {
        return createLessAdapter();
      }
      @Override
      public Adapter caseLessequal(Lessequal object)
      {
        return createLessequalAdapter();
      }
      @Override
      public Adapter caseGreater(Greater object)
      {
        return createGreaterAdapter();
      }
      @Override
      public Adapter caseGreaterequal(Greaterequal object)
      {
        return createGreaterequalAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseDivision(Division object)
      {
        return createDivisionAdapter();
      }
      @Override
      public Adapter caseExcludes(Excludes object)
      {
        return createExcludesAdapter();
      }
      @Override
      public Adapter caseRequires(Requires object)
      {
        return createRequiresAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.VmBlock <em>Vm Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.VmBlock
   * @generated
   */
  public Adapter createVmBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.ImportDeclaration
   * @generated
   */
  public Adapter createImportDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.MetaDataDeclaration <em>Meta Data Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.MetaDataDeclaration
   * @generated
   */
  public Adapter createMetaDataDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Email
   * @generated
   */
  public Adapter createEmailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Version
   * @generated
   */
  public Adapter createVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Relationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Relationships
   * @generated
   */
  public Adapter createRelationshipsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.FeatureHierarchy <em>Feature Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.FeatureHierarchy
   * @generated
   */
  public Adapter createFeatureHierarchyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.FeatureDefinition <em>Feature Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.FeatureDefinition
   * @generated
   */
  public Adapter createFeatureDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.FeaturesGroup <em>Features Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.FeaturesGroup
   * @generated
   */
  public Adapter createFeaturesGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Xorgroup <em>Xorgroup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Xorgroup
   * @generated
   */
  public Adapter createXorgroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Orgroup <em>Orgroup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Orgroup
   * @generated
   */
  public Adapter createOrgroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.CardinalityBased <em>Cardinality Based</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.CardinalityBased
   * @generated
   */
  public Adapter createCardinalityBasedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Attributes
   * @generated
   */
  public Adapter createAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.AttrDef <em>Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.AttrDef
   * @generated
   */
  public Adapter createAttrDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BasicAttrDef <em>Basic Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BasicAttrDef
   * @generated
   */
  public Adapter createBasicAttrDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BooleanAttrDef <em>Boolean Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BooleanAttrDef
   * @generated
   */
  public Adapter createBooleanAttrDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.StringAttrDef <em>String Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.StringAttrDef
   * @generated
   */
  public Adapter createStringAttrDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.IntegerAttrDef <em>Integer Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.IntegerAttrDef
   * @generated
   */
  public Adapter createIntegerAttrDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.IntegerAttrDefBounded <em>Integer Attr Def Bounded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.IntegerAttrDefBounded
   * @generated
   */
  public Adapter createIntegerAttrDefBoundedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.IntegerAttrDefComplement <em>Integer Attr Def Complement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.IntegerAttrDefComplement
   * @generated
   */
  public Adapter createIntegerAttrDefComplementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.IntegerAttrDefUnbounded <em>Integer Attr Def Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.IntegerAttrDefUnbounded
   * @generated
   */
  public Adapter createIntegerAttrDefUnboundedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.RealAttrDef <em>Real Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.RealAttrDef
   * @generated
   */
  public Adapter createRealAttrDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.RealAttrDefBounded <em>Real Attr Def Bounded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.RealAttrDefBounded
   * @generated
   */
  public Adapter createRealAttrDefBoundedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.RealAttrDefComplement <em>Real Attr Def Complement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.RealAttrDefComplement
   * @generated
   */
  public Adapter createRealAttrDefComplementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.RealAttrDefUnbounded <em>Real Attr Def Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.RealAttrDefUnbounded
   * @generated
   */
  public Adapter createRealAttrDefUnboundedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.EnumAttrDef <em>Enum Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.EnumAttrDef
   * @generated
   */
  public Adapter createEnumAttrDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.EnumStringDef <em>Enum String Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.EnumStringDef
   * @generated
   */
  public Adapter createEnumStringDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.EnumIntegerDef <em>Enum Integer Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.EnumIntegerDef
   * @generated
   */
  public Adapter createEnumIntegerDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.EnumRealDef <em>Enum Real Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.EnumRealDef
   * @generated
   */
  public Adapter createEnumRealDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BoolDefaultDef <em>Bool Default Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BoolDefaultDef
   * @generated
   */
  public Adapter createBoolDefaultDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.StringDefaultDef <em>String Default Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.StringDefaultDef
   * @generated
   */
  public Adapter createStringDefaultDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.IntegerDeltaDef <em>Integer Delta Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.IntegerDeltaDef
   * @generated
   */
  public Adapter createIntegerDeltaDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.IntegerDefaultDef <em>Integer Default Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.IntegerDefaultDef
   * @generated
   */
  public Adapter createIntegerDefaultDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.RealDeltaDef <em>Real Delta Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.RealDeltaDef
   * @generated
   */
  public Adapter createRealDeltaDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.RealDefaultDef <em>Real Default Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.RealDefaultDef
   * @generated
   */
  public Adapter createRealDefaultDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Descriptions <em>Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Descriptions
   * @generated
   */
  public Adapter createDescriptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.FeatureDescription <em>Feature Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.FeatureDescription
   * @generated
   */
  public Adapter createFeatureDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.AttributeDescription <em>Attribute Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.AttributeDescription
   * @generated
   */
  public Adapter createAttributeDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Constraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Constraints
   * @generated
   */
  public Adapter createConstraintsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.ComplexExpression <em>Complex Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.ComplexExpression
   * @generated
   */
  public Adapter createComplexExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.SpecialExpression <em>Special Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.SpecialExpression
   * @generated
   */
  public Adapter createSpecialExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.StringExpression
   * @generated
   */
  public Adapter createStringExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.PrimitiveExpression <em>Primitive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.PrimitiveExpression
   * @generated
   */
  public Adapter createPrimitiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BrackedExpression <em>Bracked Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BrackedExpression
   * @generated
   */
  public Adapter createBrackedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.NumericExpression <em>Numeric Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.NumericExpression
   * @generated
   */
  public Adapter createNumericExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.NumericExpression_List <em>Numeric Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.NumericExpression_List
   * @generated
   */
  public Adapter createNumericExpression_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BooleanExpression_List <em>Boolean Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BooleanExpression_List
   * @generated
   */
  public Adapter createBooleanExpression_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Objectives <em>Objectives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Objectives
   * @generated
   */
  public Adapter createObjectivesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Objective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Objective
   * @generated
   */
  public Adapter createObjectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.ObjectiveExpression <em>Objective Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.ObjectiveExpression
   * @generated
   */
  public Adapter createObjectiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Configurations <em>Configurations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Configurations
   * @generated
   */
  public Adapter createConfigurationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Configuration
   * @generated
   */
  public Adapter createConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BooleanValuation <em>Boolean Valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BooleanValuation
   * @generated
   */
  public Adapter createBooleanValuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.ExtendedValuation <em>Extended Valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.ExtendedValuation
   * @generated
   */
  public Adapter createExtendedValuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BasicAttrValuation <em>Basic Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BasicAttrValuation
   * @generated
   */
  public Adapter createBasicAttrValuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.RealAttrValuation <em>Real Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.RealAttrValuation
   * @generated
   */
  public Adapter createRealAttrValuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.IntegerAttrValuation <em>Integer Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.IntegerAttrValuation
   * @generated
   */
  public Adapter createIntegerAttrValuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BooleanAttrValuation <em>Boolean Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BooleanAttrValuation
   * @generated
   */
  public Adapter createBooleanAttrValuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.StringAttrValuation <em>String Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.StringAttrValuation
   * @generated
   */
  public Adapter createStringAttrValuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.AdvancedAttrValuation <em>Advanced Attr Valuation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.AdvancedAttrValuation
   * @generated
   */
  public Adapter createAdvancedAttrValuationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.TableBasedValuationByFeatureAndClone <em>Table Based Valuation By Feature And Clone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.TableBasedValuationByFeatureAndClone
   * @generated
   */
  public Adapter createTableBasedValuationByFeatureAndCloneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.TableBasedValuationByFeature <em>Table Based Valuation By Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.TableBasedValuationByFeature
   * @generated
   */
  public Adapter createTableBasedValuationByFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.PairAttributeValue <em>Pair Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.PairAttributeValue
   * @generated
   */
  public Adapter createPairAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.TableBasedValuationByAttribute <em>Table Based Valuation By Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.TableBasedValuationByAttribute
   * @generated
   */
  public Adapter createTableBasedValuationByAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForInteger <em>Table Based Valuation By Attribute For Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.TableBasedValuationByAttributeForInteger
   * @generated
   */
  public Adapter createTableBasedValuationByAttributeForIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.PairFeatureInteger <em>Pair Feature Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.PairFeatureInteger
   * @generated
   */
  public Adapter createPairFeatureIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.TableBasedValuationByAttributeForReal <em>Table Based Valuation By Attribute For Real</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.TableBasedValuationByAttributeForReal
   * @generated
   */
  public Adapter createTableBasedValuationByAttributeForRealAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.PairFeatureReal <em>Pair Feature Real</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.PairFeatureReal
   * @generated
   */
  public Adapter createPairFeatureRealAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Boolean_ATT_ID <em>Boolean ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Boolean_ATT_ID
   * @generated
   */
  public Adapter createBoolean_ATT_IDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.String_ATT_ID <em>String ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.String_ATT_ID
   * @generated
   */
  public Adapter createString_ATT_IDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Integer_ATT_ID <em>Integer ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Integer_ATT_ID
   * @generated
   */
  public Adapter createInteger_ATT_IDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Real_ATT_ID <em>Real ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Real_ATT_ID
   * @generated
   */
  public Adapter createReal_ATT_IDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Enum_String_ATT_ID <em>Enum String ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Enum_String_ATT_ID
   * @generated
   */
  public Adapter createEnum_String_ATT_IDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Enum_Integer_ATT_ID <em>Enum Integer ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Enum_Integer_ATT_ID
   * @generated
   */
  public Adapter createEnum_Integer_ATT_IDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Enum_Real_ATT_ID <em>Enum Real ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Enum_Real_ATT_ID
   * @generated
   */
  public Adapter createEnum_Real_ATT_IDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.AttHead <em>Att Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.AttHead
   * @generated
   */
  public Adapter createAttHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Abstract_ATT_ID <em>Abstract ATT ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Abstract_ATT_ID
   * @generated
   */
  public Adapter createAbstract_ATT_IDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.If
   * @generated
   */
  public Adapter createIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.LeftImplication <em>Left Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.LeftImplication
   * @generated
   */
  public Adapter createLeftImplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.RightImplication <em>Right Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.RightImplication
   * @generated
   */
  public Adapter createRightImplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.BiImplication <em>Bi Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.BiImplication
   * @generated
   */
  public Adapter createBiImplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Equality
   * @generated
   */
  public Adapter createEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Inequality <em>Inequality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Inequality
   * @generated
   */
  public Adapter createInequalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Less
   * @generated
   */
  public Adapter createLessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Lessequal <em>Lessequal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Lessequal
   * @generated
   */
  public Adapter createLessequalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Greater <em>Greater</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Greater
   * @generated
   */
  public Adapter createGreaterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Greaterequal <em>Greaterequal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Greaterequal
   * @generated
   */
  public Adapter createGreaterequalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Division
   * @generated
   */
  public Adapter createDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Excludes <em>Excludes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Excludes
   * @generated
   */
  public Adapter createExcludesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.lang.vM.Requires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.lang.vM.Requires
   * @generated
   */
  public Adapter createRequiresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VMAdapterFactory
