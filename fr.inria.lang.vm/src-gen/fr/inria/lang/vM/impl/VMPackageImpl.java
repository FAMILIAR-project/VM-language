/**
 */
package fr.inria.lang.vM.impl;

import fr.inria.lang.vM.Abstract_ATT_ID;
import fr.inria.lang.vM.AdvancedAttrValuation;
import fr.inria.lang.vM.And;
import fr.inria.lang.vM.AttHead;
import fr.inria.lang.vM.AttrDef;
import fr.inria.lang.vM.AttributeDescription;
import fr.inria.lang.vM.Attributes;
import fr.inria.lang.vM.BasicAttrDef;
import fr.inria.lang.vM.BasicAttrValuation;
import fr.inria.lang.vM.BiImplication;
import fr.inria.lang.vM.BoolDefaultDef;
import fr.inria.lang.vM.BooleanAttrDef;
import fr.inria.lang.vM.BooleanAttrValuation;
import fr.inria.lang.vM.BooleanExpression;
import fr.inria.lang.vM.BooleanExpression_List;
import fr.inria.lang.vM.BooleanValuation;
import fr.inria.lang.vM.Boolean_ATT_ID;
import fr.inria.lang.vM.BrackedExpression;
import fr.inria.lang.vM.CardinalityBased;
import fr.inria.lang.vM.ComplexExpression;
import fr.inria.lang.vM.Configuration;
import fr.inria.lang.vM.Configurations;
import fr.inria.lang.vM.Constraint;
import fr.inria.lang.vM.Constraints;
import fr.inria.lang.vM.Descriptions;
import fr.inria.lang.vM.Division;
import fr.inria.lang.vM.Email;
import fr.inria.lang.vM.EnumAttrDef;
import fr.inria.lang.vM.EnumIntegerDef;
import fr.inria.lang.vM.EnumRealDef;
import fr.inria.lang.vM.EnumStringDef;
import fr.inria.lang.vM.Enum_Integer_ATT_ID;
import fr.inria.lang.vM.Enum_Real_ATT_ID;
import fr.inria.lang.vM.Enum_String_ATT_ID;
import fr.inria.lang.vM.Equality;
import fr.inria.lang.vM.Excludes;
import fr.inria.lang.vM.Expression;
import fr.inria.lang.vM.ExtendedValuation;
import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.FeatureDefinition;
import fr.inria.lang.vM.FeatureDescription;
import fr.inria.lang.vM.FeatureHierarchy;
import fr.inria.lang.vM.FeaturesGroup;
import fr.inria.lang.vM.Greater;
import fr.inria.lang.vM.Greaterequal;
import fr.inria.lang.vM.If;
import fr.inria.lang.vM.ImportDeclaration;
import fr.inria.lang.vM.Inequality;
import fr.inria.lang.vM.IntegerAttrDef;
import fr.inria.lang.vM.IntegerAttrDefBounded;
import fr.inria.lang.vM.IntegerAttrDefComplement;
import fr.inria.lang.vM.IntegerAttrDefUnbounded;
import fr.inria.lang.vM.IntegerAttrValuation;
import fr.inria.lang.vM.IntegerDefaultDef;
import fr.inria.lang.vM.IntegerDeltaDef;
import fr.inria.lang.vM.Integer_ATT_ID;
import fr.inria.lang.vM.LeftImplication;
import fr.inria.lang.vM.Less;
import fr.inria.lang.vM.Lessequal;
import fr.inria.lang.vM.MetaDataDeclaration;
import fr.inria.lang.vM.Minus;
import fr.inria.lang.vM.Model;
import fr.inria.lang.vM.Multiplication;
import fr.inria.lang.vM.NumericExpression;
import fr.inria.lang.vM.NumericExpression_List;
import fr.inria.lang.vM.Objective;
import fr.inria.lang.vM.ObjectiveExpression;
import fr.inria.lang.vM.Objectives;
import fr.inria.lang.vM.Or;
import fr.inria.lang.vM.Orgroup;
import fr.inria.lang.vM.PackageDeclaration;
import fr.inria.lang.vM.PairAttributeValue;
import fr.inria.lang.vM.PairFeatureInteger;
import fr.inria.lang.vM.PairFeatureReal;
import fr.inria.lang.vM.Plus;
import fr.inria.lang.vM.PrimitiveExpression;
import fr.inria.lang.vM.RealAttrDef;
import fr.inria.lang.vM.RealAttrDefBounded;
import fr.inria.lang.vM.RealAttrDefComplement;
import fr.inria.lang.vM.RealAttrDefUnbounded;
import fr.inria.lang.vM.RealAttrValuation;
import fr.inria.lang.vM.RealDefaultDef;
import fr.inria.lang.vM.RealDeltaDef;
import fr.inria.lang.vM.Real_ATT_ID;
import fr.inria.lang.vM.Relationships;
import fr.inria.lang.vM.Requires;
import fr.inria.lang.vM.RightImplication;
import fr.inria.lang.vM.SpecialExpression;
import fr.inria.lang.vM.StringAttrDef;
import fr.inria.lang.vM.StringAttrValuation;
import fr.inria.lang.vM.StringDefaultDef;
import fr.inria.lang.vM.StringExpression;
import fr.inria.lang.vM.String_ATT_ID;
import fr.inria.lang.vM.TableBasedValuationByAttribute;
import fr.inria.lang.vM.TableBasedValuationByAttributeForInteger;
import fr.inria.lang.vM.TableBasedValuationByAttributeForReal;
import fr.inria.lang.vM.TableBasedValuationByFeature;
import fr.inria.lang.vM.TableBasedValuationByFeatureAndClone;
import fr.inria.lang.vM.VMFactory;
import fr.inria.lang.vM.VMPackage;
import fr.inria.lang.vM.Version;
import fr.inria.lang.vM.VmBlock;
import fr.inria.lang.vM.Xorgroup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VMPackageImpl extends EPackageImpl implements VMPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vmBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaDataDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureHierarchyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featuresGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xorgroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orgroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardinalityBasedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attrDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicAttrDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanAttrDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringAttrDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerAttrDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerAttrDefBoundedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerAttrDefComplementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerAttrDefUnboundedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realAttrDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realAttrDefBoundedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realAttrDefComplementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realAttrDefUnboundedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumAttrDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumStringDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumIntegerDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumRealDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolDefaultDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringDefaultDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerDeltaDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerDefaultDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realDeltaDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realDefaultDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specialExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass brackedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericExpression_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpression_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectivesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanValuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendedValuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicAttrValuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realAttrValuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerAttrValuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanAttrValuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringAttrValuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass advancedAttrValuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableBasedValuationByFeatureAndCloneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableBasedValuationByFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pairAttributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableBasedValuationByAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableBasedValuationByAttributeForIntegerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pairFeatureIntegerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableBasedValuationByAttributeForRealEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pairFeatureRealEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolean_ATT_IDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass string_ATT_IDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integer_ATT_IDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass real_ATT_IDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_String_ATT_IDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_Integer_ATT_IDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_Real_ATT_IDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attHeadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstract_ATT_IDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leftImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass biImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inequalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lessequalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greaterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greaterequalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass excludesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiresEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.inria.lang.vM.VMPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VMPackageImpl()
  {
    super(eNS_URI, VMFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VMPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VMPackage init()
  {
    if (isInited) return (VMPackage)EPackage.Registry.INSTANCE.getEPackage(VMPackage.eNS_URI);

    // Obtain or create and register package
    VMPackageImpl theVMPackage = (VMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VMPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVMPackage.createPackageContents();

    // Initialize created meta-data
    theVMPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVMPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VMPackage.eNS_URI, theVMPackage);
    return theVMPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Blocks()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVmBlock()
  {
    return vmBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDeclaration_Blocks()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportDeclaration()
  {
    return importDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDeclaration_ImportedNamespace()
  {
    return (EAttribute)importDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaDataDeclaration()
  {
    return metaDataDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaDataDeclaration_Name()
  {
    return (EAttribute)metaDataDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaDataDeclaration_Version()
  {
    return (EReference)metaDataDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaDataDeclaration_Description()
  {
    return (EAttribute)metaDataDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaDataDeclaration_Author()
  {
    return (EAttribute)metaDataDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaDataDeclaration_Email()
  {
    return (EReference)metaDataDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaDataDeclaration_Organization()
  {
    return (EAttribute)metaDataDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaDataDeclaration_Publication()
  {
    return (EAttribute)metaDataDeclarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaDataDeclaration_Date()
  {
    return (EAttribute)metaDataDeclarationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmail()
  {
    return emailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_Username()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_Domain()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion()
  {
    return versionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Main()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Tail()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationships()
  {
    return relationshipsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationships_Root()
  {
    return (EReference)relationshipsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureHierarchy()
  {
    return featureHierarchyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureHierarchy_Parent()
  {
    return (EReference)featureHierarchyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureHierarchy_Children()
  {
    return (EReference)featureHierarchyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureDefinition()
  {
    return featureDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_NotTranslatable()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_RunTime()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_NotDecidable()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Optional()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Min()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Max()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeaturesGroup()
  {
    return featuresGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeaturesGroup_GroupedFeatures()
  {
    return (EReference)featuresGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXorgroup()
  {
    return xorgroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrgroup()
  {
    return orgroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCardinalityBased()
  {
    return cardinalityBasedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCardinalityBased_Min()
  {
    return (EAttribute)cardinalityBasedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCardinalityBased_Max()
  {
    return (EAttribute)cardinalityBasedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCardinalityBased_All()
  {
    return (EAttribute)cardinalityBasedEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributes()
  {
    return attributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributes_AttrDefs()
  {
    return (EReference)attributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributes_AttrValuations()
  {
    return (EReference)attributesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttrDef()
  {
    return attrDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrDef_NotTranslatable()
  {
    return (EAttribute)attrDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrDef_RunTime()
  {
    return (EAttribute)attrDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrDef_NotDecidable()
  {
    return (EAttribute)attrDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttrDef_BasicAttrDef()
  {
    return (EReference)attrDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttrDef_EnumAttrDef()
  {
    return (EReference)attrDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicAttrDef()
  {
    return basicAttrDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanAttrDef()
  {
    return booleanAttrDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanAttrDef_Name()
  {
    return (EReference)booleanAttrDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanAttrDef_Value()
  {
    return (EAttribute)booleanAttrDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanAttrDef_Default()
  {
    return (EReference)booleanAttrDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringAttrDef()
  {
    return stringAttrDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringAttrDef_Name()
  {
    return (EReference)stringAttrDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringAttrDef_Value()
  {
    return (EAttribute)stringAttrDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringAttrDef_Default()
  {
    return (EReference)stringAttrDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerAttrDef()
  {
    return integerAttrDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerAttrDef_Name()
  {
    return (EReference)integerAttrDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerAttrDef_Default()
  {
    return (EReference)integerAttrDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerAttrDefBounded()
  {
    return integerAttrDefBoundedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerAttrDefBounded_Complements()
  {
    return (EReference)integerAttrDefBoundedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerAttrDefBounded_Complement()
  {
    return (EReference)integerAttrDefBoundedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerAttrDefComplement()
  {
    return integerAttrDefComplementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerAttrDefComplement_Min()
  {
    return (EAttribute)integerAttrDefComplementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerAttrDefComplement_Max()
  {
    return (EAttribute)integerAttrDefComplementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerAttrDefComplement_Delta()
  {
    return (EReference)integerAttrDefComplementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerAttrDefUnbounded()
  {
    return integerAttrDefUnboundedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerAttrDefUnbounded_Value()
  {
    return (EAttribute)integerAttrDefUnboundedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealAttrDef()
  {
    return realAttrDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealAttrDef_Name()
  {
    return (EReference)realAttrDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealAttrDef_Default()
  {
    return (EReference)realAttrDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealAttrDefBounded()
  {
    return realAttrDefBoundedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealAttrDefBounded_Complement()
  {
    return (EReference)realAttrDefBoundedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealAttrDefComplement()
  {
    return realAttrDefComplementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealAttrDefComplement_Min()
  {
    return (EAttribute)realAttrDefComplementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealAttrDefComplement_Max()
  {
    return (EAttribute)realAttrDefComplementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealAttrDefComplement_Delta()
  {
    return (EReference)realAttrDefComplementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealAttrDefUnbounded()
  {
    return realAttrDefUnboundedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealAttrDefUnbounded_Value()
  {
    return (EAttribute)realAttrDefUnboundedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumAttrDef()
  {
    return enumAttrDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumAttrDef_Value()
  {
    return (EAttribute)enumAttrDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumStringDef()
  {
    return enumStringDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumStringDef_Name()
  {
    return (EReference)enumStringDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumStringDef_Default()
  {
    return (EReference)enumStringDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumIntegerDef()
  {
    return enumIntegerDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumIntegerDef_Name()
  {
    return (EReference)enumIntegerDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumIntegerDef_Default()
  {
    return (EReference)enumIntegerDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumRealDef()
  {
    return enumRealDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumRealDef_Name()
  {
    return (EReference)enumRealDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumRealDef_Default()
  {
    return (EReference)enumRealDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolDefaultDef()
  {
    return boolDefaultDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolDefaultDef_Value()
  {
    return (EAttribute)boolDefaultDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringDefaultDef()
  {
    return stringDefaultDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringDefaultDef_Value()
  {
    return (EAttribute)stringDefaultDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerDeltaDef()
  {
    return integerDeltaDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerDeltaDef_Value()
  {
    return (EAttribute)integerDeltaDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerDefaultDef()
  {
    return integerDefaultDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerDefaultDef_Value()
  {
    return (EAttribute)integerDefaultDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealDeltaDef()
  {
    return realDeltaDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealDeltaDef_Value()
  {
    return (EAttribute)realDeltaDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealDefaultDef()
  {
    return realDefaultDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealDefaultDef_Value()
  {
    return (EAttribute)realDefaultDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescriptions()
  {
    return descriptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescriptions_FeaturesDescriptions()
  {
    return (EReference)descriptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescriptions_AttributesDescriptions()
  {
    return (EReference)descriptionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureDescription()
  {
    return featureDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureDescription_RefFeat()
  {
    return (EReference)featureDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureDescription_Description()
  {
    return (EAttribute)featureDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeDescription()
  {
    return attributeDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeDescription_RefFeat()
  {
    return (EReference)attributeDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeDescription_RefAtt()
  {
    return (EReference)attributeDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeDescription_Description()
  {
    return (EAttribute)attributeDescriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraints()
  {
    return constraintsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraints_Constraints()
  {
    return (EReference)constraintsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Name()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Expression()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexExpression()
  {
    return complexExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecialExpression()
  {
    return specialExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecialExpression_Op()
  {
    return (EAttribute)specialExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecialExpression_Expression()
  {
    return (EReference)specialExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringExpression()
  {
    return stringExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringExpression_Value()
  {
    return (EAttribute)stringExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveExpression()
  {
    return primitiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveExpression_FeatureID()
  {
    return (EReference)primitiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveExpression_Head()
  {
    return (EReference)primitiveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveExpression_RefAtt()
  {
    return (EReference)primitiveExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpression()
  {
    return booleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExpression_Value()
  {
    return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExpression_Op()
  {
    return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpression_Expression()
  {
    return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpression_Expression_list()
  {
    return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBrackedExpression()
  {
    return brackedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBrackedExpression_Expression()
  {
    return (EReference)brackedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericExpression()
  {
    return numericExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericExpression_Value()
  {
    return (EAttribute)numericExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericExpression_Op()
  {
    return (EAttribute)numericExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericExpression_Expression()
  {
    return (EReference)numericExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericExpression_Expression_list()
  {
    return (EReference)numericExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericExpression_List()
  {
    return numericExpression_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericExpression_List_Ex()
  {
    return (EReference)numericExpression_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpression_List()
  {
    return booleanExpression_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpression_List_Ex()
  {
    return (EReference)booleanExpression_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectives()
  {
    return objectivesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectives_Objectives()
  {
    return (EReference)objectivesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjective()
  {
    return objectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjective_Name()
  {
    return (EAttribute)objectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjective_Op()
  {
    return (EAttribute)objectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjective_Expression()
  {
    return (EReference)objectiveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectiveExpression()
  {
    return objectiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectiveExpression_Op()
  {
    return (EAttribute)objectiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectiveExpression_Expression()
  {
    return (EReference)objectiveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurations()
  {
    return configurationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurations_Configurations()
  {
    return (EReference)configurationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfiguration()
  {
    return configurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfiguration_Name()
  {
    return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_BooleanValuation()
  {
    return (EReference)configurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_ExtendedValuation()
  {
    return (EReference)configurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanValuation()
  {
    return booleanValuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanValuation_NotSelected()
  {
    return (EAttribute)booleanValuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanValuation_Feature()
  {
    return (EReference)booleanValuationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendedValuation()
  {
    return extendedValuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicAttrValuation()
  {
    return basicAttrValuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicAttrValuation_Head()
  {
    return (EReference)basicAttrValuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicAttrValuation_Value()
  {
    return (EAttribute)basicAttrValuationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealAttrValuation()
  {
    return realAttrValuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealAttrValuation_RefAtt()
  {
    return (EReference)realAttrValuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerAttrValuation()
  {
    return integerAttrValuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerAttrValuation_RefAtt()
  {
    return (EReference)integerAttrValuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanAttrValuation()
  {
    return booleanAttrValuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanAttrValuation_RefAtt()
  {
    return (EReference)booleanAttrValuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringAttrValuation()
  {
    return stringAttrValuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringAttrValuation_RefAtt()
  {
    return (EReference)stringAttrValuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdvancedAttrValuation()
  {
    return advancedAttrValuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdvancedAttrValuation_AttVsVal()
  {
    return (EReference)advancedAttrValuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdvancedAttrValuation_FeatVsVal()
  {
    return (EReference)advancedAttrValuationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdvancedAttrValuation_AttVsValForMultiFeature()
  {
    return (EReference)advancedAttrValuationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableBasedValuationByFeatureAndClone()
  {
    return tableBasedValuationByFeatureAndCloneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableBasedValuationByFeatureAndClone_RefFeature()
  {
    return (EReference)tableBasedValuationByFeatureAndCloneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableBasedValuationByFeatureAndClone_Name()
  {
    return (EAttribute)tableBasedValuationByFeatureAndCloneEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableBasedValuationByFeatureAndClone_Pairs()
  {
    return (EReference)tableBasedValuationByFeatureAndCloneEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableBasedValuationByFeature()
  {
    return tableBasedValuationByFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableBasedValuationByFeature_RefFeature()
  {
    return (EReference)tableBasedValuationByFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableBasedValuationByFeature_Pairs()
  {
    return (EReference)tableBasedValuationByFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPairAttributeValue()
  {
    return pairAttributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPairAttributeValue_RefAtt()
  {
    return (EReference)pairAttributeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPairAttributeValue_Value()
  {
    return (EAttribute)pairAttributeValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableBasedValuationByAttribute()
  {
    return tableBasedValuationByAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableBasedValuationByAttributeForInteger()
  {
    return tableBasedValuationByAttributeForIntegerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableBasedValuationByAttributeForInteger_RefAtt()
  {
    return (EReference)tableBasedValuationByAttributeForIntegerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableBasedValuationByAttributeForInteger_Pairs()
  {
    return (EReference)tableBasedValuationByAttributeForIntegerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPairFeatureInteger()
  {
    return pairFeatureIntegerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPairFeatureInteger_RefFeat()
  {
    return (EReference)pairFeatureIntegerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPairFeatureInteger_Value()
  {
    return (EAttribute)pairFeatureIntegerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableBasedValuationByAttributeForReal()
  {
    return tableBasedValuationByAttributeForRealEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableBasedValuationByAttributeForReal_RefAtt()
  {
    return (EReference)tableBasedValuationByAttributeForRealEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableBasedValuationByAttributeForReal_Pairs()
  {
    return (EReference)tableBasedValuationByAttributeForRealEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPairFeatureReal()
  {
    return pairFeatureRealEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPairFeatureReal_RefFeat()
  {
    return (EReference)pairFeatureRealEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPairFeatureReal_Value()
  {
    return (EAttribute)pairFeatureRealEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolean_ATT_ID()
  {
    return boolean_ATT_IDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getString_ATT_ID()
  {
    return string_ATT_IDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteger_ATT_ID()
  {
    return integer_ATT_IDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReal_ATT_ID()
  {
    return real_ATT_IDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum_String_ATT_ID()
  {
    return enum_String_ATT_IDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum_Integer_ATT_ID()
  {
    return enum_Integer_ATT_IDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum_Real_ATT_ID()
  {
    return enum_Real_ATT_IDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttHead()
  {
    return attHeadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttHead_ForAllFeatures()
  {
    return (EAttribute)attHeadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttHead_OwnedFeature()
  {
    return (EReference)attHeadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstract_ATT_ID()
  {
    return abstract_ATT_IDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstract_ATT_ID_Head()
  {
    return (EReference)abstract_ATT_IDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstract_ATT_ID_Name()
  {
    return (EAttribute)abstract_ATT_IDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIf()
  {
    return ifEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_Left()
  {
    return (EReference)ifEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_Right()
  {
    return (EReference)ifEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeftImplication()
  {
    return leftImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeftImplication_Left()
  {
    return (EReference)leftImplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeftImplication_Right()
  {
    return (EReference)leftImplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRightImplication()
  {
    return rightImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRightImplication_Left()
  {
    return (EReference)rightImplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRightImplication_Right()
  {
    return (EReference)rightImplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBiImplication()
  {
    return biImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBiImplication_Left()
  {
    return (EReference)biImplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBiImplication_Right()
  {
    return (EReference)biImplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOr()
  {
    return orEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOr_Left()
  {
    return (EReference)orEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOr_Right()
  {
    return (EReference)orEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnd()
  {
    return andEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnd_Left()
  {
    return (EReference)andEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnd_Right()
  {
    return (EReference)andEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquality()
  {
    return equalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquality_Left()
  {
    return (EReference)equalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquality_Right()
  {
    return (EReference)equalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInequality()
  {
    return inequalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInequality_Left()
  {
    return (EReference)inequalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInequality_Right()
  {
    return (EReference)inequalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLess()
  {
    return lessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLess_Left()
  {
    return (EReference)lessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLess_Right()
  {
    return (EReference)lessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLessequal()
  {
    return lessequalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLessequal_Left()
  {
    return (EReference)lessequalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLessequal_Right()
  {
    return (EReference)lessequalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreater()
  {
    return greaterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreater_Left()
  {
    return (EReference)greaterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreater_Right()
  {
    return (EReference)greaterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreaterequal()
  {
    return greaterequalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreaterequal_Left()
  {
    return (EReference)greaterequalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreaterequal_Right()
  {
    return (EReference)greaterequalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Left()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Right()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinus()
  {
    return minusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinus_Left()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinus_Right()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplication()
  {
    return multiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplication_Left()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplication_Right()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivision()
  {
    return divisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDivision_Left()
  {
    return (EReference)divisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDivision_Right()
  {
    return (EReference)divisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExcludes()
  {
    return excludesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExcludes_Left()
  {
    return (EReference)excludesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExcludes_Right()
  {
    return (EReference)excludesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequires()
  {
    return requiresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequires_Left()
  {
    return (EReference)requiresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequires_Right()
  {
    return (EReference)requiresEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VMFactory getVMFactory()
  {
    return (VMFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__BLOCKS);

    vmBlockEClass = createEClass(VM_BLOCK);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__BLOCKS);

    importDeclarationEClass = createEClass(IMPORT_DECLARATION);
    createEAttribute(importDeclarationEClass, IMPORT_DECLARATION__IMPORTED_NAMESPACE);

    metaDataDeclarationEClass = createEClass(META_DATA_DECLARATION);
    createEAttribute(metaDataDeclarationEClass, META_DATA_DECLARATION__NAME);
    createEReference(metaDataDeclarationEClass, META_DATA_DECLARATION__VERSION);
    createEAttribute(metaDataDeclarationEClass, META_DATA_DECLARATION__DESCRIPTION);
    createEAttribute(metaDataDeclarationEClass, META_DATA_DECLARATION__AUTHOR);
    createEReference(metaDataDeclarationEClass, META_DATA_DECLARATION__EMAIL);
    createEAttribute(metaDataDeclarationEClass, META_DATA_DECLARATION__ORGANIZATION);
    createEAttribute(metaDataDeclarationEClass, META_DATA_DECLARATION__PUBLICATION);
    createEAttribute(metaDataDeclarationEClass, META_DATA_DECLARATION__DATE);

    emailEClass = createEClass(EMAIL);
    createEAttribute(emailEClass, EMAIL__USERNAME);
    createEAttribute(emailEClass, EMAIL__DOMAIN);

    versionEClass = createEClass(VERSION);
    createEAttribute(versionEClass, VERSION__MAIN);
    createEAttribute(versionEClass, VERSION__TAIL);

    relationshipsEClass = createEClass(RELATIONSHIPS);
    createEReference(relationshipsEClass, RELATIONSHIPS__ROOT);

    featureHierarchyEClass = createEClass(FEATURE_HIERARCHY);
    createEReference(featureHierarchyEClass, FEATURE_HIERARCHY__PARENT);
    createEReference(featureHierarchyEClass, FEATURE_HIERARCHY__CHILDREN);

    featureDefinitionEClass = createEClass(FEATURE_DEFINITION);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NOT_TRANSLATABLE);
    createEAttribute(featureEClass, FEATURE__RUN_TIME);
    createEAttribute(featureEClass, FEATURE__NOT_DECIDABLE);
    createEAttribute(featureEClass, FEATURE__OPTIONAL);
    createEAttribute(featureEClass, FEATURE__MIN);
    createEAttribute(featureEClass, FEATURE__MAX);
    createEAttribute(featureEClass, FEATURE__NAME);

    featuresGroupEClass = createEClass(FEATURES_GROUP);
    createEReference(featuresGroupEClass, FEATURES_GROUP__GROUPED_FEATURES);

    xorgroupEClass = createEClass(XORGROUP);

    orgroupEClass = createEClass(ORGROUP);

    cardinalityBasedEClass = createEClass(CARDINALITY_BASED);
    createEAttribute(cardinalityBasedEClass, CARDINALITY_BASED__MIN);
    createEAttribute(cardinalityBasedEClass, CARDINALITY_BASED__MAX);
    createEAttribute(cardinalityBasedEClass, CARDINALITY_BASED__ALL);

    attributesEClass = createEClass(ATTRIBUTES);
    createEReference(attributesEClass, ATTRIBUTES__ATTR_DEFS);
    createEReference(attributesEClass, ATTRIBUTES__ATTR_VALUATIONS);

    attrDefEClass = createEClass(ATTR_DEF);
    createEAttribute(attrDefEClass, ATTR_DEF__NOT_TRANSLATABLE);
    createEAttribute(attrDefEClass, ATTR_DEF__RUN_TIME);
    createEAttribute(attrDefEClass, ATTR_DEF__NOT_DECIDABLE);
    createEReference(attrDefEClass, ATTR_DEF__BASIC_ATTR_DEF);
    createEReference(attrDefEClass, ATTR_DEF__ENUM_ATTR_DEF);

    basicAttrDefEClass = createEClass(BASIC_ATTR_DEF);

    booleanAttrDefEClass = createEClass(BOOLEAN_ATTR_DEF);
    createEReference(booleanAttrDefEClass, BOOLEAN_ATTR_DEF__NAME);
    createEAttribute(booleanAttrDefEClass, BOOLEAN_ATTR_DEF__VALUE);
    createEReference(booleanAttrDefEClass, BOOLEAN_ATTR_DEF__DEFAULT);

    stringAttrDefEClass = createEClass(STRING_ATTR_DEF);
    createEReference(stringAttrDefEClass, STRING_ATTR_DEF__NAME);
    createEAttribute(stringAttrDefEClass, STRING_ATTR_DEF__VALUE);
    createEReference(stringAttrDefEClass, STRING_ATTR_DEF__DEFAULT);

    integerAttrDefEClass = createEClass(INTEGER_ATTR_DEF);
    createEReference(integerAttrDefEClass, INTEGER_ATTR_DEF__NAME);
    createEReference(integerAttrDefEClass, INTEGER_ATTR_DEF__DEFAULT);

    integerAttrDefBoundedEClass = createEClass(INTEGER_ATTR_DEF_BOUNDED);
    createEReference(integerAttrDefBoundedEClass, INTEGER_ATTR_DEF_BOUNDED__COMPLEMENTS);
    createEReference(integerAttrDefBoundedEClass, INTEGER_ATTR_DEF_BOUNDED__COMPLEMENT);

    integerAttrDefComplementEClass = createEClass(INTEGER_ATTR_DEF_COMPLEMENT);
    createEAttribute(integerAttrDefComplementEClass, INTEGER_ATTR_DEF_COMPLEMENT__MIN);
    createEAttribute(integerAttrDefComplementEClass, INTEGER_ATTR_DEF_COMPLEMENT__MAX);
    createEReference(integerAttrDefComplementEClass, INTEGER_ATTR_DEF_COMPLEMENT__DELTA);

    integerAttrDefUnboundedEClass = createEClass(INTEGER_ATTR_DEF_UNBOUNDED);
    createEAttribute(integerAttrDefUnboundedEClass, INTEGER_ATTR_DEF_UNBOUNDED__VALUE);

    realAttrDefEClass = createEClass(REAL_ATTR_DEF);
    createEReference(realAttrDefEClass, REAL_ATTR_DEF__NAME);
    createEReference(realAttrDefEClass, REAL_ATTR_DEF__DEFAULT);

    realAttrDefBoundedEClass = createEClass(REAL_ATTR_DEF_BOUNDED);
    createEReference(realAttrDefBoundedEClass, REAL_ATTR_DEF_BOUNDED__COMPLEMENT);

    realAttrDefComplementEClass = createEClass(REAL_ATTR_DEF_COMPLEMENT);
    createEAttribute(realAttrDefComplementEClass, REAL_ATTR_DEF_COMPLEMENT__MIN);
    createEAttribute(realAttrDefComplementEClass, REAL_ATTR_DEF_COMPLEMENT__MAX);
    createEReference(realAttrDefComplementEClass, REAL_ATTR_DEF_COMPLEMENT__DELTA);

    realAttrDefUnboundedEClass = createEClass(REAL_ATTR_DEF_UNBOUNDED);
    createEAttribute(realAttrDefUnboundedEClass, REAL_ATTR_DEF_UNBOUNDED__VALUE);

    enumAttrDefEClass = createEClass(ENUM_ATTR_DEF);
    createEAttribute(enumAttrDefEClass, ENUM_ATTR_DEF__VALUE);

    enumStringDefEClass = createEClass(ENUM_STRING_DEF);
    createEReference(enumStringDefEClass, ENUM_STRING_DEF__NAME);
    createEReference(enumStringDefEClass, ENUM_STRING_DEF__DEFAULT);

    enumIntegerDefEClass = createEClass(ENUM_INTEGER_DEF);
    createEReference(enumIntegerDefEClass, ENUM_INTEGER_DEF__NAME);
    createEReference(enumIntegerDefEClass, ENUM_INTEGER_DEF__DEFAULT);

    enumRealDefEClass = createEClass(ENUM_REAL_DEF);
    createEReference(enumRealDefEClass, ENUM_REAL_DEF__NAME);
    createEReference(enumRealDefEClass, ENUM_REAL_DEF__DEFAULT);

    boolDefaultDefEClass = createEClass(BOOL_DEFAULT_DEF);
    createEAttribute(boolDefaultDefEClass, BOOL_DEFAULT_DEF__VALUE);

    stringDefaultDefEClass = createEClass(STRING_DEFAULT_DEF);
    createEAttribute(stringDefaultDefEClass, STRING_DEFAULT_DEF__VALUE);

    integerDeltaDefEClass = createEClass(INTEGER_DELTA_DEF);
    createEAttribute(integerDeltaDefEClass, INTEGER_DELTA_DEF__VALUE);

    integerDefaultDefEClass = createEClass(INTEGER_DEFAULT_DEF);
    createEAttribute(integerDefaultDefEClass, INTEGER_DEFAULT_DEF__VALUE);

    realDeltaDefEClass = createEClass(REAL_DELTA_DEF);
    createEAttribute(realDeltaDefEClass, REAL_DELTA_DEF__VALUE);

    realDefaultDefEClass = createEClass(REAL_DEFAULT_DEF);
    createEAttribute(realDefaultDefEClass, REAL_DEFAULT_DEF__VALUE);

    descriptionsEClass = createEClass(DESCRIPTIONS);
    createEReference(descriptionsEClass, DESCRIPTIONS__FEATURES_DESCRIPTIONS);
    createEReference(descriptionsEClass, DESCRIPTIONS__ATTRIBUTES_DESCRIPTIONS);

    featureDescriptionEClass = createEClass(FEATURE_DESCRIPTION);
    createEReference(featureDescriptionEClass, FEATURE_DESCRIPTION__REF_FEAT);
    createEAttribute(featureDescriptionEClass, FEATURE_DESCRIPTION__DESCRIPTION);

    attributeDescriptionEClass = createEClass(ATTRIBUTE_DESCRIPTION);
    createEReference(attributeDescriptionEClass, ATTRIBUTE_DESCRIPTION__REF_FEAT);
    createEReference(attributeDescriptionEClass, ATTRIBUTE_DESCRIPTION__REF_ATT);
    createEAttribute(attributeDescriptionEClass, ATTRIBUTE_DESCRIPTION__DESCRIPTION);

    constraintsEClass = createEClass(CONSTRAINTS);
    createEReference(constraintsEClass, CONSTRAINTS__CONSTRAINTS);

    constraintEClass = createEClass(CONSTRAINT);
    createEAttribute(constraintEClass, CONSTRAINT__NAME);
    createEReference(constraintEClass, CONSTRAINT__EXPRESSION);

    complexExpressionEClass = createEClass(COMPLEX_EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);

    specialExpressionEClass = createEClass(SPECIAL_EXPRESSION);
    createEAttribute(specialExpressionEClass, SPECIAL_EXPRESSION__OP);
    createEReference(specialExpressionEClass, SPECIAL_EXPRESSION__EXPRESSION);

    stringExpressionEClass = createEClass(STRING_EXPRESSION);
    createEAttribute(stringExpressionEClass, STRING_EXPRESSION__VALUE);

    primitiveExpressionEClass = createEClass(PRIMITIVE_EXPRESSION);
    createEReference(primitiveExpressionEClass, PRIMITIVE_EXPRESSION__FEATURE_ID);
    createEReference(primitiveExpressionEClass, PRIMITIVE_EXPRESSION__HEAD);
    createEReference(primitiveExpressionEClass, PRIMITIVE_EXPRESSION__REF_ATT);

    booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
    createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__VALUE);
    createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__OP);
    createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__EXPRESSION);
    createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__EXPRESSION_LIST);

    brackedExpressionEClass = createEClass(BRACKED_EXPRESSION);
    createEReference(brackedExpressionEClass, BRACKED_EXPRESSION__EXPRESSION);

    numericExpressionEClass = createEClass(NUMERIC_EXPRESSION);
    createEAttribute(numericExpressionEClass, NUMERIC_EXPRESSION__VALUE);
    createEAttribute(numericExpressionEClass, NUMERIC_EXPRESSION__OP);
    createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__EXPRESSION);
    createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__EXPRESSION_LIST);

    numericExpression_ListEClass = createEClass(NUMERIC_EXPRESSION_LIST);
    createEReference(numericExpression_ListEClass, NUMERIC_EXPRESSION_LIST__EX);

    booleanExpression_ListEClass = createEClass(BOOLEAN_EXPRESSION_LIST);
    createEReference(booleanExpression_ListEClass, BOOLEAN_EXPRESSION_LIST__EX);

    objectivesEClass = createEClass(OBJECTIVES);
    createEReference(objectivesEClass, OBJECTIVES__OBJECTIVES);

    objectiveEClass = createEClass(OBJECTIVE);
    createEAttribute(objectiveEClass, OBJECTIVE__NAME);
    createEAttribute(objectiveEClass, OBJECTIVE__OP);
    createEReference(objectiveEClass, OBJECTIVE__EXPRESSION);

    objectiveExpressionEClass = createEClass(OBJECTIVE_EXPRESSION);
    createEAttribute(objectiveExpressionEClass, OBJECTIVE_EXPRESSION__OP);
    createEReference(objectiveExpressionEClass, OBJECTIVE_EXPRESSION__EXPRESSION);

    configurationsEClass = createEClass(CONFIGURATIONS);
    createEReference(configurationsEClass, CONFIGURATIONS__CONFIGURATIONS);

    configurationEClass = createEClass(CONFIGURATION);
    createEAttribute(configurationEClass, CONFIGURATION__NAME);
    createEReference(configurationEClass, CONFIGURATION__BOOLEAN_VALUATION);
    createEReference(configurationEClass, CONFIGURATION__EXTENDED_VALUATION);

    booleanValuationEClass = createEClass(BOOLEAN_VALUATION);
    createEAttribute(booleanValuationEClass, BOOLEAN_VALUATION__NOT_SELECTED);
    createEReference(booleanValuationEClass, BOOLEAN_VALUATION__FEATURE);

    extendedValuationEClass = createEClass(EXTENDED_VALUATION);

    basicAttrValuationEClass = createEClass(BASIC_ATTR_VALUATION);
    createEReference(basicAttrValuationEClass, BASIC_ATTR_VALUATION__HEAD);
    createEAttribute(basicAttrValuationEClass, BASIC_ATTR_VALUATION__VALUE);

    realAttrValuationEClass = createEClass(REAL_ATTR_VALUATION);
    createEReference(realAttrValuationEClass, REAL_ATTR_VALUATION__REF_ATT);

    integerAttrValuationEClass = createEClass(INTEGER_ATTR_VALUATION);
    createEReference(integerAttrValuationEClass, INTEGER_ATTR_VALUATION__REF_ATT);

    booleanAttrValuationEClass = createEClass(BOOLEAN_ATTR_VALUATION);
    createEReference(booleanAttrValuationEClass, BOOLEAN_ATTR_VALUATION__REF_ATT);

    stringAttrValuationEClass = createEClass(STRING_ATTR_VALUATION);
    createEReference(stringAttrValuationEClass, STRING_ATTR_VALUATION__REF_ATT);

    advancedAttrValuationEClass = createEClass(ADVANCED_ATTR_VALUATION);
    createEReference(advancedAttrValuationEClass, ADVANCED_ATTR_VALUATION__ATT_VS_VAL);
    createEReference(advancedAttrValuationEClass, ADVANCED_ATTR_VALUATION__FEAT_VS_VAL);
    createEReference(advancedAttrValuationEClass, ADVANCED_ATTR_VALUATION__ATT_VS_VAL_FOR_MULTI_FEATURE);

    tableBasedValuationByFeatureAndCloneEClass = createEClass(TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE);
    createEReference(tableBasedValuationByFeatureAndCloneEClass, TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__REF_FEATURE);
    createEAttribute(tableBasedValuationByFeatureAndCloneEClass, TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__NAME);
    createEReference(tableBasedValuationByFeatureAndCloneEClass, TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE__PAIRS);

    tableBasedValuationByFeatureEClass = createEClass(TABLE_BASED_VALUATION_BY_FEATURE);
    createEReference(tableBasedValuationByFeatureEClass, TABLE_BASED_VALUATION_BY_FEATURE__REF_FEATURE);
    createEReference(tableBasedValuationByFeatureEClass, TABLE_BASED_VALUATION_BY_FEATURE__PAIRS);

    pairAttributeValueEClass = createEClass(PAIR_ATTRIBUTE_VALUE);
    createEReference(pairAttributeValueEClass, PAIR_ATTRIBUTE_VALUE__REF_ATT);
    createEAttribute(pairAttributeValueEClass, PAIR_ATTRIBUTE_VALUE__VALUE);

    tableBasedValuationByAttributeEClass = createEClass(TABLE_BASED_VALUATION_BY_ATTRIBUTE);

    tableBasedValuationByAttributeForIntegerEClass = createEClass(TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER);
    createEReference(tableBasedValuationByAttributeForIntegerEClass, TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__REF_ATT);
    createEReference(tableBasedValuationByAttributeForIntegerEClass, TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER__PAIRS);

    pairFeatureIntegerEClass = createEClass(PAIR_FEATURE_INTEGER);
    createEReference(pairFeatureIntegerEClass, PAIR_FEATURE_INTEGER__REF_FEAT);
    createEAttribute(pairFeatureIntegerEClass, PAIR_FEATURE_INTEGER__VALUE);

    tableBasedValuationByAttributeForRealEClass = createEClass(TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL);
    createEReference(tableBasedValuationByAttributeForRealEClass, TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL__REF_ATT);
    createEReference(tableBasedValuationByAttributeForRealEClass, TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL__PAIRS);

    pairFeatureRealEClass = createEClass(PAIR_FEATURE_REAL);
    createEReference(pairFeatureRealEClass, PAIR_FEATURE_REAL__REF_FEAT);
    createEAttribute(pairFeatureRealEClass, PAIR_FEATURE_REAL__VALUE);

    boolean_ATT_IDEClass = createEClass(BOOLEAN_ATT_ID);

    string_ATT_IDEClass = createEClass(STRING_ATT_ID);

    integer_ATT_IDEClass = createEClass(INTEGER_ATT_ID);

    real_ATT_IDEClass = createEClass(REAL_ATT_ID);

    enum_String_ATT_IDEClass = createEClass(ENUM_STRING_ATT_ID);

    enum_Integer_ATT_IDEClass = createEClass(ENUM_INTEGER_ATT_ID);

    enum_Real_ATT_IDEClass = createEClass(ENUM_REAL_ATT_ID);

    attHeadEClass = createEClass(ATT_HEAD);
    createEAttribute(attHeadEClass, ATT_HEAD__FOR_ALL_FEATURES);
    createEReference(attHeadEClass, ATT_HEAD__OWNED_FEATURE);

    abstract_ATT_IDEClass = createEClass(ABSTRACT_ATT_ID);
    createEReference(abstract_ATT_IDEClass, ABSTRACT_ATT_ID__HEAD);
    createEAttribute(abstract_ATT_IDEClass, ABSTRACT_ATT_ID__NAME);

    ifEClass = createEClass(IF);
    createEReference(ifEClass, IF__LEFT);
    createEReference(ifEClass, IF__RIGHT);

    leftImplicationEClass = createEClass(LEFT_IMPLICATION);
    createEReference(leftImplicationEClass, LEFT_IMPLICATION__LEFT);
    createEReference(leftImplicationEClass, LEFT_IMPLICATION__RIGHT);

    rightImplicationEClass = createEClass(RIGHT_IMPLICATION);
    createEReference(rightImplicationEClass, RIGHT_IMPLICATION__LEFT);
    createEReference(rightImplicationEClass, RIGHT_IMPLICATION__RIGHT);

    biImplicationEClass = createEClass(BI_IMPLICATION);
    createEReference(biImplicationEClass, BI_IMPLICATION__LEFT);
    createEReference(biImplicationEClass, BI_IMPLICATION__RIGHT);

    orEClass = createEClass(OR);
    createEReference(orEClass, OR__LEFT);
    createEReference(orEClass, OR__RIGHT);

    andEClass = createEClass(AND);
    createEReference(andEClass, AND__LEFT);
    createEReference(andEClass, AND__RIGHT);

    equalityEClass = createEClass(EQUALITY);
    createEReference(equalityEClass, EQUALITY__LEFT);
    createEReference(equalityEClass, EQUALITY__RIGHT);

    inequalityEClass = createEClass(INEQUALITY);
    createEReference(inequalityEClass, INEQUALITY__LEFT);
    createEReference(inequalityEClass, INEQUALITY__RIGHT);

    lessEClass = createEClass(LESS);
    createEReference(lessEClass, LESS__LEFT);
    createEReference(lessEClass, LESS__RIGHT);

    lessequalEClass = createEClass(LESSEQUAL);
    createEReference(lessequalEClass, LESSEQUAL__LEFT);
    createEReference(lessequalEClass, LESSEQUAL__RIGHT);

    greaterEClass = createEClass(GREATER);
    createEReference(greaterEClass, GREATER__LEFT);
    createEReference(greaterEClass, GREATER__RIGHT);

    greaterequalEClass = createEClass(GREATEREQUAL);
    createEReference(greaterequalEClass, GREATEREQUAL__LEFT);
    createEReference(greaterequalEClass, GREATEREQUAL__RIGHT);

    plusEClass = createEClass(PLUS);
    createEReference(plusEClass, PLUS__LEFT);
    createEReference(plusEClass, PLUS__RIGHT);

    minusEClass = createEClass(MINUS);
    createEReference(minusEClass, MINUS__LEFT);
    createEReference(minusEClass, MINUS__RIGHT);

    multiplicationEClass = createEClass(MULTIPLICATION);
    createEReference(multiplicationEClass, MULTIPLICATION__LEFT);
    createEReference(multiplicationEClass, MULTIPLICATION__RIGHT);

    divisionEClass = createEClass(DIVISION);
    createEReference(divisionEClass, DIVISION__LEFT);
    createEReference(divisionEClass, DIVISION__RIGHT);

    excludesEClass = createEClass(EXCLUDES);
    createEReference(excludesEClass, EXCLUDES__LEFT);
    createEReference(excludesEClass, EXCLUDES__RIGHT);

    requiresEClass = createEClass(REQUIRES);
    createEReference(requiresEClass, REQUIRES__LEFT);
    createEReference(requiresEClass, REQUIRES__RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageDeclarationEClass.getESuperTypes().add(this.getVmBlock());
    importDeclarationEClass.getESuperTypes().add(this.getVmBlock());
    metaDataDeclarationEClass.getESuperTypes().add(this.getVmBlock());
    relationshipsEClass.getESuperTypes().add(this.getVmBlock());
    featureHierarchyEClass.getESuperTypes().add(this.getFeatureDefinition());
    featureEClass.getESuperTypes().add(this.getFeatureDefinition());
    featuresGroupEClass.getESuperTypes().add(this.getFeatureDefinition());
    xorgroupEClass.getESuperTypes().add(this.getFeaturesGroup());
    orgroupEClass.getESuperTypes().add(this.getFeaturesGroup());
    cardinalityBasedEClass.getESuperTypes().add(this.getFeaturesGroup());
    attributesEClass.getESuperTypes().add(this.getVmBlock());
    booleanAttrDefEClass.getESuperTypes().add(this.getBasicAttrDef());
    stringAttrDefEClass.getESuperTypes().add(this.getBasicAttrDef());
    integerAttrDefEClass.getESuperTypes().add(this.getBasicAttrDef());
    integerAttrDefBoundedEClass.getESuperTypes().add(this.getIntegerAttrDef());
    integerAttrDefUnboundedEClass.getESuperTypes().add(this.getIntegerAttrDef());
    realAttrDefEClass.getESuperTypes().add(this.getBasicAttrDef());
    realAttrDefBoundedEClass.getESuperTypes().add(this.getRealAttrDef());
    realAttrDefUnboundedEClass.getESuperTypes().add(this.getRealAttrDef());
    enumStringDefEClass.getESuperTypes().add(this.getEnumAttrDef());
    enumIntegerDefEClass.getESuperTypes().add(this.getEnumAttrDef());
    enumRealDefEClass.getESuperTypes().add(this.getEnumAttrDef());
    descriptionsEClass.getESuperTypes().add(this.getVmBlock());
    constraintsEClass.getESuperTypes().add(this.getVmBlock());
    expressionEClass.getESuperTypes().add(this.getComplexExpression());
    specialExpressionEClass.getESuperTypes().add(this.getExpression());
    stringExpressionEClass.getESuperTypes().add(this.getExpression());
    primitiveExpressionEClass.getESuperTypes().add(this.getExpression());
    booleanExpressionEClass.getESuperTypes().add(this.getExpression());
    brackedExpressionEClass.getESuperTypes().add(this.getExpression());
    numericExpressionEClass.getESuperTypes().add(this.getExpression());
    objectivesEClass.getESuperTypes().add(this.getVmBlock());
    configurationsEClass.getESuperTypes().add(this.getVmBlock());
    basicAttrValuationEClass.getESuperTypes().add(this.getExtendedValuation());
    realAttrValuationEClass.getESuperTypes().add(this.getBasicAttrValuation());
    integerAttrValuationEClass.getESuperTypes().add(this.getBasicAttrValuation());
    booleanAttrValuationEClass.getESuperTypes().add(this.getBasicAttrValuation());
    stringAttrValuationEClass.getESuperTypes().add(this.getBasicAttrValuation());
    advancedAttrValuationEClass.getESuperTypes().add(this.getExtendedValuation());
    tableBasedValuationByAttributeForIntegerEClass.getESuperTypes().add(this.getTableBasedValuationByAttribute());
    tableBasedValuationByAttributeForRealEClass.getESuperTypes().add(this.getTableBasedValuationByAttribute());
    boolean_ATT_IDEClass.getESuperTypes().add(this.getAbstract_ATT_ID());
    string_ATT_IDEClass.getESuperTypes().add(this.getAbstract_ATT_ID());
    integer_ATT_IDEClass.getESuperTypes().add(this.getAbstract_ATT_ID());
    real_ATT_IDEClass.getESuperTypes().add(this.getAbstract_ATT_ID());
    enum_String_ATT_IDEClass.getESuperTypes().add(this.getAbstract_ATT_ID());
    enum_Integer_ATT_IDEClass.getESuperTypes().add(this.getAbstract_ATT_ID());
    enum_Real_ATT_IDEClass.getESuperTypes().add(this.getAbstract_ATT_ID());
    ifEClass.getESuperTypes().add(this.getComplexExpression());
    leftImplicationEClass.getESuperTypes().add(this.getComplexExpression());
    rightImplicationEClass.getESuperTypes().add(this.getComplexExpression());
    biImplicationEClass.getESuperTypes().add(this.getComplexExpression());
    orEClass.getESuperTypes().add(this.getComplexExpression());
    andEClass.getESuperTypes().add(this.getComplexExpression());
    equalityEClass.getESuperTypes().add(this.getComplexExpression());
    inequalityEClass.getESuperTypes().add(this.getComplexExpression());
    lessEClass.getESuperTypes().add(this.getComplexExpression());
    lessequalEClass.getESuperTypes().add(this.getComplexExpression());
    greaterEClass.getESuperTypes().add(this.getComplexExpression());
    greaterequalEClass.getESuperTypes().add(this.getComplexExpression());
    plusEClass.getESuperTypes().add(this.getComplexExpression());
    minusEClass.getESuperTypes().add(this.getComplexExpression());
    multiplicationEClass.getESuperTypes().add(this.getComplexExpression());
    divisionEClass.getESuperTypes().add(this.getComplexExpression());
    excludesEClass.getESuperTypes().add(this.getComplexExpression());
    requiresEClass.getESuperTypes().add(this.getComplexExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Blocks(), this.getVmBlock(), null, "blocks", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vmBlockEClass, VmBlock.class, "VmBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDeclaration_Blocks(), this.getVmBlock(), null, "blocks", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importDeclarationEClass, ImportDeclaration.class, "ImportDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportDeclaration_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaDataDeclarationEClass, MetaDataDeclaration.class, "MetaDataDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaDataDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaDataDeclaration_Version(), this.getVersion(), null, "version", null, 0, 1, MetaDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaDataDeclaration_Description(), ecorePackage.getEString(), "description", null, 0, 1, MetaDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaDataDeclaration_Author(), ecorePackage.getEString(), "author", null, 0, 1, MetaDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaDataDeclaration_Email(), this.getEmail(), null, "email", null, 0, 1, MetaDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaDataDeclaration_Organization(), ecorePackage.getEString(), "organization", null, 0, 1, MetaDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaDataDeclaration_Publication(), ecorePackage.getEString(), "publication", null, 0, 1, MetaDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaDataDeclaration_Date(), ecorePackage.getEString(), "date", null, 0, 1, MetaDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emailEClass, Email.class, "Email", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmail_Username(), ecorePackage.getEString(), "username", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmail_Domain(), ecorePackage.getEString(), "domain", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersion_Main(), ecorePackage.getEInt(), "main", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVersion_Tail(), ecorePackage.getEInt(), "tail", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipsEClass, Relationships.class, "Relationships", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationships_Root(), this.getFeatureHierarchy(), null, "root", null, 0, 1, Relationships.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureHierarchyEClass, FeatureHierarchy.class, "FeatureHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureHierarchy_Parent(), this.getFeature(), null, "parent", null, 0, 1, FeatureHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureHierarchy_Children(), this.getFeatureDefinition(), null, "children", null, 0, -1, FeatureHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureDefinitionEClass, FeatureDefinition.class, "FeatureDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_NotTranslatable(), ecorePackage.getEBoolean(), "notTranslatable", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_RunTime(), ecorePackage.getEBoolean(), "runTime", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_NotDecidable(), ecorePackage.getEBoolean(), "notDecidable", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Min(), ecorePackage.getEString(), "min", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Max(), ecorePackage.getEString(), "max", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featuresGroupEClass, FeaturesGroup.class, "FeaturesGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeaturesGroup_GroupedFeatures(), this.getFeatureDefinition(), null, "groupedFeatures", null, 0, -1, FeaturesGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xorgroupEClass, Xorgroup.class, "Xorgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orgroupEClass, Orgroup.class, "Orgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cardinalityBasedEClass, CardinalityBased.class, "CardinalityBased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCardinalityBased_Min(), ecorePackage.getEString(), "min", null, 0, 1, CardinalityBased.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCardinalityBased_Max(), ecorePackage.getEString(), "max", null, 0, 1, CardinalityBased.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCardinalityBased_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, CardinalityBased.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributes_AttrDefs(), this.getAttrDef(), null, "attrDefs", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributes_AttrValuations(), this.getBasicAttrValuation(), null, "attrValuations", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attrDefEClass, AttrDef.class, "AttrDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttrDef_NotTranslatable(), ecorePackage.getEBoolean(), "notTranslatable", null, 0, 1, AttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrDef_RunTime(), ecorePackage.getEBoolean(), "runTime", null, 0, 1, AttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrDef_NotDecidable(), ecorePackage.getEBoolean(), "notDecidable", null, 0, 1, AttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttrDef_BasicAttrDef(), this.getBasicAttrDef(), null, "basicAttrDef", null, 0, 1, AttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttrDef_EnumAttrDef(), this.getEnumAttrDef(), null, "enumAttrDef", null, 0, 1, AttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicAttrDefEClass, BasicAttrDef.class, "BasicAttrDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanAttrDefEClass, BooleanAttrDef.class, "BooleanAttrDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanAttrDef_Name(), this.getBoolean_ATT_ID(), null, "name", null, 0, 1, BooleanAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanAttrDef_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanAttrDef_Default(), this.getBoolDefaultDef(), null, "default", null, 0, 1, BooleanAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringAttrDefEClass, StringAttrDef.class, "StringAttrDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringAttrDef_Name(), this.getString_ATT_ID(), null, "name", null, 0, 1, StringAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringAttrDef_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringAttrDef_Default(), this.getStringDefaultDef(), null, "default", null, 0, 1, StringAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerAttrDefEClass, IntegerAttrDef.class, "IntegerAttrDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerAttrDef_Name(), this.getInteger_ATT_ID(), null, "name", null, 0, 1, IntegerAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerAttrDef_Default(), this.getIntegerDefaultDef(), null, "default", null, 0, 1, IntegerAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerAttrDefBoundedEClass, IntegerAttrDefBounded.class, "IntegerAttrDefBounded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerAttrDefBounded_Complements(), this.getIntegerAttrDefComplement(), null, "complements", null, 0, -1, IntegerAttrDefBounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerAttrDefBounded_Complement(), this.getIntegerAttrDefComplement(), null, "complement", null, 0, -1, IntegerAttrDefBounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerAttrDefComplementEClass, IntegerAttrDefComplement.class, "IntegerAttrDefComplement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerAttrDefComplement_Min(), ecorePackage.getEString(), "min", null, 0, 1, IntegerAttrDefComplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerAttrDefComplement_Max(), ecorePackage.getEString(), "max", null, 0, 1, IntegerAttrDefComplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerAttrDefComplement_Delta(), this.getIntegerDeltaDef(), null, "delta", null, 0, 1, IntegerAttrDefComplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerAttrDefUnboundedEClass, IntegerAttrDefUnbounded.class, "IntegerAttrDefUnbounded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerAttrDefUnbounded_Value(), ecorePackage.getEString(), "value", null, 0, 1, IntegerAttrDefUnbounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realAttrDefEClass, RealAttrDef.class, "RealAttrDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRealAttrDef_Name(), this.getReal_ATT_ID(), null, "name", null, 0, 1, RealAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRealAttrDef_Default(), this.getRealDefaultDef(), null, "default", null, 0, 1, RealAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realAttrDefBoundedEClass, RealAttrDefBounded.class, "RealAttrDefBounded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRealAttrDefBounded_Complement(), this.getRealAttrDefComplement(), null, "complement", null, 0, -1, RealAttrDefBounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realAttrDefComplementEClass, RealAttrDefComplement.class, "RealAttrDefComplement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealAttrDefComplement_Min(), ecorePackage.getEString(), "min", null, 0, 1, RealAttrDefComplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRealAttrDefComplement_Max(), ecorePackage.getEString(), "max", null, 0, 1, RealAttrDefComplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRealAttrDefComplement_Delta(), this.getRealDeltaDef(), null, "delta", null, 0, 1, RealAttrDefComplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realAttrDefUnboundedEClass, RealAttrDefUnbounded.class, "RealAttrDefUnbounded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealAttrDefUnbounded_Value(), ecorePackage.getEString(), "value", null, 0, 1, RealAttrDefUnbounded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumAttrDefEClass, EnumAttrDef.class, "EnumAttrDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumAttrDef_Value(), ecorePackage.getEString(), "value", null, 0, -1, EnumAttrDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumStringDefEClass, EnumStringDef.class, "EnumStringDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumStringDef_Name(), this.getEnum_String_ATT_ID(), null, "name", null, 0, 1, EnumStringDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumStringDef_Default(), this.getStringDefaultDef(), null, "default", null, 0, 1, EnumStringDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumIntegerDefEClass, EnumIntegerDef.class, "EnumIntegerDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumIntegerDef_Name(), this.getEnum_Integer_ATT_ID(), null, "name", null, 0, 1, EnumIntegerDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumIntegerDef_Default(), this.getIntegerDefaultDef(), null, "default", null, 0, 1, EnumIntegerDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumRealDefEClass, EnumRealDef.class, "EnumRealDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumRealDef_Name(), this.getEnum_Real_ATT_ID(), null, "name", null, 0, 1, EnumRealDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumRealDef_Default(), this.getRealDefaultDef(), null, "default", null, 0, 1, EnumRealDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolDefaultDefEClass, BoolDefaultDef.class, "BoolDefaultDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolDefaultDef_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolDefaultDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringDefaultDefEClass, StringDefaultDef.class, "StringDefaultDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringDefaultDef_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringDefaultDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerDeltaDefEClass, IntegerDeltaDef.class, "IntegerDeltaDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerDeltaDef_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerDeltaDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerDefaultDefEClass, IntegerDefaultDef.class, "IntegerDefaultDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerDefaultDef_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerDefaultDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realDeltaDefEClass, RealDeltaDef.class, "RealDeltaDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealDeltaDef_Value(), ecorePackage.getEString(), "value", null, 0, 1, RealDeltaDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realDefaultDefEClass, RealDefaultDef.class, "RealDefaultDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealDefaultDef_Value(), ecorePackage.getEString(), "value", null, 0, 1, RealDefaultDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionsEClass, Descriptions.class, "Descriptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescriptions_FeaturesDescriptions(), this.getFeatureDescription(), null, "featuresDescriptions", null, 0, -1, Descriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDescriptions_AttributesDescriptions(), this.getAttributeDescription(), null, "attributesDescriptions", null, 0, -1, Descriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureDescriptionEClass, FeatureDescription.class, "FeatureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureDescription_RefFeat(), this.getFeature(), null, "refFeat", null, 0, 1, FeatureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureDescription_Description(), ecorePackage.getEString(), "description", null, 0, 1, FeatureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeDescriptionEClass, AttributeDescription.class, "AttributeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeDescription_RefFeat(), this.getFeature(), null, "refFeat", null, 0, 1, AttributeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeDescription_RefAtt(), this.getAbstract_ATT_ID(), null, "refAtt", null, 0, 1, AttributeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeDescription_Description(), ecorePackage.getEString(), "description", null, 0, 1, AttributeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintsEClass, Constraints.class, "Constraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraints_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Constraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Expression(), this.getComplexExpression(), null, "expression", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexExpressionEClass, ComplexExpression.class, "ComplexExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(specialExpressionEClass, SpecialExpression.class, "SpecialExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecialExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, SpecialExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecialExpression_Expression(), this.getFeature(), null, "expression", null, 0, 1, SpecialExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveExpressionEClass, PrimitiveExpression.class, "PrimitiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimitiveExpression_FeatureID(), this.getFeature(), null, "featureID", null, 0, 1, PrimitiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveExpression_Head(), this.getAttHead(), null, "head", null, 0, 1, PrimitiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveExpression_RefAtt(), this.getAbstract_ATT_ID(), null, "refAtt", null, 0, 1, PrimitiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanExpression_Expression(), this.getBooleanExpression(), null, "expression", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanExpression_Expression_list(), this.getBooleanExpression_List(), null, "expression_list", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(brackedExpressionEClass, BrackedExpression.class, "BrackedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBrackedExpression_Expression(), this.getComplexExpression(), null, "expression", null, 0, 1, BrackedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericExpressionEClass, NumericExpression.class, "NumericExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumericExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumericExpression_Expression(), this.getNumericExpression(), null, "expression", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumericExpression_Expression_list(), this.getNumericExpression_List(), null, "expression_list", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericExpression_ListEClass, NumericExpression_List.class, "NumericExpression_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumericExpression_List_Ex(), this.getNumericExpression(), null, "ex", null, 0, -1, NumericExpression_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpression_ListEClass, BooleanExpression_List.class, "BooleanExpression_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanExpression_List_Ex(), this.getBooleanExpression(), null, "ex", null, 0, -1, BooleanExpression_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectivesEClass, Objectives.class, "Objectives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectives_Objectives(), this.getObjective(), null, "objectives", null, 0, -1, Objectives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjective_Op(), ecorePackage.getEString(), "op", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjective_Expression(), this.getObjectiveExpression(), null, "expression", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectiveExpressionEClass, ObjectiveExpression.class, "ObjectiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectiveExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ObjectiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectiveExpression_Expression(), this.getPrimitiveExpression(), null, "expression", null, 0, 1, ObjectiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationsEClass, Configurations.class, "Configurations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigurations_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, Configurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_BooleanValuation(), this.getBooleanValuation(), null, "booleanValuation", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_ExtendedValuation(), this.getExtendedValuation(), null, "extendedValuation", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanValuationEClass, BooleanValuation.class, "BooleanValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanValuation_NotSelected(), ecorePackage.getEBoolean(), "notSelected", null, 0, 1, BooleanValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanValuation_Feature(), this.getFeature(), null, "feature", null, 0, 1, BooleanValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendedValuationEClass, ExtendedValuation.class, "ExtendedValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicAttrValuationEClass, BasicAttrValuation.class, "BasicAttrValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicAttrValuation_Head(), this.getAttHead(), null, "head", null, 0, 1, BasicAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBasicAttrValuation_Value(), ecorePackage.getEString(), "value", null, 0, 1, BasicAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realAttrValuationEClass, RealAttrValuation.class, "RealAttrValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRealAttrValuation_RefAtt(), this.getReal_ATT_ID(), null, "refAtt", null, 0, 1, RealAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerAttrValuationEClass, IntegerAttrValuation.class, "IntegerAttrValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerAttrValuation_RefAtt(), this.getInteger_ATT_ID(), null, "refAtt", null, 0, 1, IntegerAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanAttrValuationEClass, BooleanAttrValuation.class, "BooleanAttrValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanAttrValuation_RefAtt(), this.getBoolean_ATT_ID(), null, "refAtt", null, 0, 1, BooleanAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringAttrValuationEClass, StringAttrValuation.class, "StringAttrValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringAttrValuation_RefAtt(), this.getString_ATT_ID(), null, "refAtt", null, 0, 1, StringAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(advancedAttrValuationEClass, AdvancedAttrValuation.class, "AdvancedAttrValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdvancedAttrValuation_AttVsVal(), this.getTableBasedValuationByFeature(), null, "attVsVal", null, 0, 1, AdvancedAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdvancedAttrValuation_FeatVsVal(), this.getTableBasedValuationByAttribute(), null, "featVsVal", null, 0, -1, AdvancedAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdvancedAttrValuation_AttVsValForMultiFeature(), this.getTableBasedValuationByFeatureAndClone(), null, "attVsValForMultiFeature", null, 0, 1, AdvancedAttrValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableBasedValuationByFeatureAndCloneEClass, TableBasedValuationByFeatureAndClone.class, "TableBasedValuationByFeatureAndClone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableBasedValuationByFeatureAndClone_RefFeature(), this.getFeature(), null, "refFeature", null, 0, 1, TableBasedValuationByFeatureAndClone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableBasedValuationByFeatureAndClone_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableBasedValuationByFeatureAndClone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableBasedValuationByFeatureAndClone_Pairs(), this.getPairAttributeValue(), null, "pairs", null, 0, -1, TableBasedValuationByFeatureAndClone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableBasedValuationByFeatureEClass, TableBasedValuationByFeature.class, "TableBasedValuationByFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableBasedValuationByFeature_RefFeature(), this.getFeature(), null, "refFeature", null, 0, 1, TableBasedValuationByFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableBasedValuationByFeature_Pairs(), this.getPairAttributeValue(), null, "pairs", null, 0, -1, TableBasedValuationByFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pairAttributeValueEClass, PairAttributeValue.class, "PairAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPairAttributeValue_RefAtt(), this.getAbstract_ATT_ID(), null, "refAtt", null, 0, 1, PairAttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPairAttributeValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, PairAttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableBasedValuationByAttributeEClass, TableBasedValuationByAttribute.class, "TableBasedValuationByAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableBasedValuationByAttributeForIntegerEClass, TableBasedValuationByAttributeForInteger.class, "TableBasedValuationByAttributeForInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableBasedValuationByAttributeForInteger_RefAtt(), this.getInteger_ATT_ID(), null, "refAtt", null, 0, 1, TableBasedValuationByAttributeForInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableBasedValuationByAttributeForInteger_Pairs(), this.getPairFeatureInteger(), null, "pairs", null, 0, -1, TableBasedValuationByAttributeForInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pairFeatureIntegerEClass, PairFeatureInteger.class, "PairFeatureInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPairFeatureInteger_RefFeat(), this.getFeature(), null, "refFeat", null, 0, 1, PairFeatureInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPairFeatureInteger_Value(), ecorePackage.getEString(), "value", null, 0, 1, PairFeatureInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableBasedValuationByAttributeForRealEClass, TableBasedValuationByAttributeForReal.class, "TableBasedValuationByAttributeForReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableBasedValuationByAttributeForReal_RefAtt(), this.getReal_ATT_ID(), null, "refAtt", null, 0, 1, TableBasedValuationByAttributeForReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableBasedValuationByAttributeForReal_Pairs(), this.getPairFeatureReal(), null, "pairs", null, 0, -1, TableBasedValuationByAttributeForReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pairFeatureRealEClass, PairFeatureReal.class, "PairFeatureReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPairFeatureReal_RefFeat(), this.getFeature(), null, "refFeat", null, 0, 1, PairFeatureReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPairFeatureReal_Value(), ecorePackage.getEString(), "value", null, 0, 1, PairFeatureReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolean_ATT_IDEClass, Boolean_ATT_ID.class, "Boolean_ATT_ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(string_ATT_IDEClass, String_ATT_ID.class, "String_ATT_ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integer_ATT_IDEClass, Integer_ATT_ID.class, "Integer_ATT_ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(real_ATT_IDEClass, Real_ATT_ID.class, "Real_ATT_ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enum_String_ATT_IDEClass, Enum_String_ATT_ID.class, "Enum_String_ATT_ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enum_Integer_ATT_IDEClass, Enum_Integer_ATT_ID.class, "Enum_Integer_ATT_ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enum_Real_ATT_IDEClass, Enum_Real_ATT_ID.class, "Enum_Real_ATT_ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attHeadEClass, AttHead.class, "AttHead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttHead_ForAllFeatures(), ecorePackage.getEBoolean(), "forAllFeatures", null, 0, 1, AttHead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttHead_OwnedFeature(), this.getFeature(), null, "ownedFeature", null, 0, 1, AttHead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstract_ATT_IDEClass, Abstract_ATT_ID.class, "Abstract_ATT_ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstract_ATT_ID_Head(), this.getAttHead(), null, "head", null, 0, 1, Abstract_ATT_ID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstract_ATT_ID_Name(), ecorePackage.getEString(), "name", null, 0, 1, Abstract_ATT_ID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIf_Left(), this.getComplexExpression(), null, "left", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_Right(), this.getComplexExpression(), null, "right", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(leftImplicationEClass, LeftImplication.class, "LeftImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLeftImplication_Left(), this.getComplexExpression(), null, "left", null, 0, 1, LeftImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLeftImplication_Right(), this.getComplexExpression(), null, "right", null, 0, 1, LeftImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rightImplicationEClass, RightImplication.class, "RightImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRightImplication_Left(), this.getComplexExpression(), null, "left", null, 0, 1, RightImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRightImplication_Right(), this.getComplexExpression(), null, "right", null, 0, 1, RightImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(biImplicationEClass, BiImplication.class, "BiImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBiImplication_Left(), this.getComplexExpression(), null, "left", null, 0, 1, BiImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBiImplication_Right(), this.getComplexExpression(), null, "right", null, 0, 1, BiImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOr_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOr_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnd_Left(), this.getComplexExpression(), null, "left", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnd_Right(), this.getComplexExpression(), null, "right", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquality_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquality_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inequalityEClass, Inequality.class, "Inequality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInequality_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Inequality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInequality_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Inequality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lessEClass, Less.class, "Less", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLess_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Less.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLess_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Less.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lessequalEClass, Lessequal.class, "Lessequal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLessequal_Left(), this.getLess(), null, "left", null, 0, 1, Lessequal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLessequal_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Lessequal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(greaterEClass, Greater.class, "Greater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGreater_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Greater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGreater_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Greater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(greaterequalEClass, Greaterequal.class, "Greaterequal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGreaterequal_Left(), this.getGreater(), null, "left", null, 0, 1, Greaterequal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGreaterequal_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Greaterequal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlus_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlus_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinus_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinus_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplication_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplication_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDivision_Left(), this.getComplexExpression(), null, "left", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDivision_Right(), this.getComplexExpression(), null, "right", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(excludesEClass, Excludes.class, "Excludes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExcludes_Left(), this.getExpression(), null, "left", null, 0, 1, Excludes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExcludes_Right(), this.getExpression(), null, "right", null, 0, 1, Excludes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiresEClass, Requires.class, "Requires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequires_Left(), this.getExpression(), null, "left", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequires_Right(), this.getExpression(), null, "right", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VMPackageImpl
