package fr.inria.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.lang.services.VMGrammarAccess;
import fr.inria.lang.vM.AdvancedAttrValuation;
import fr.inria.lang.vM.And;
import fr.inria.lang.vM.AttHead;
import fr.inria.lang.vM.AttrDef;
import fr.inria.lang.vM.AttributeDescription;
import fr.inria.lang.vM.Attributes;
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
import fr.inria.lang.vM.Configuration;
import fr.inria.lang.vM.Configurations;
import fr.inria.lang.vM.Constraint;
import fr.inria.lang.vM.Constraints;
import fr.inria.lang.vM.Descriptions;
import fr.inria.lang.vM.Division;
import fr.inria.lang.vM.Email;
import fr.inria.lang.vM.EnumIntegerDef;
import fr.inria.lang.vM.EnumRealDef;
import fr.inria.lang.vM.EnumStringDef;
import fr.inria.lang.vM.Enum_Integer_ATT_ID;
import fr.inria.lang.vM.Enum_Real_ATT_ID;
import fr.inria.lang.vM.Enum_String_ATT_ID;
import fr.inria.lang.vM.Equality;
import fr.inria.lang.vM.Excludes;
import fr.inria.lang.vM.Feature;
import fr.inria.lang.vM.FeatureDescription;
import fr.inria.lang.vM.FeatureHierarchy;
import fr.inria.lang.vM.Greater;
import fr.inria.lang.vM.Greaterequal;
import fr.inria.lang.vM.If;
import fr.inria.lang.vM.ImportDeclaration;
import fr.inria.lang.vM.Inequality;
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
import fr.inria.lang.vM.TableBasedValuationByAttributeForInteger;
import fr.inria.lang.vM.TableBasedValuationByAttributeForReal;
import fr.inria.lang.vM.TableBasedValuationByFeature;
import fr.inria.lang.vM.TableBasedValuationByFeatureAndClone;
import fr.inria.lang.vM.VMPackage;
import fr.inria.lang.vM.Version;
import fr.inria.lang.vM.Xorgroup;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class VMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VMGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VMPackage.ADVANCED_ATTR_VALUATION:
				if(context == grammarAccess.getAdvancedAttrValuationRule() ||
				   context == grammarAccess.getExtendedValuationRule()) {
					sequence_AdvancedAttrValuation(context, (AdvancedAttrValuation) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.AND:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0()) {
					sequence_SubExpression5(context, (And) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ATT_HEAD:
				if(context == grammarAccess.getAttHeadRule()) {
					sequence_AttHead(context, (AttHead) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ATTR_DEF:
				if(context == grammarAccess.getAttrDefRule()) {
					sequence_AttrDef(context, (AttrDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ATTRIBUTE_DESCRIPTION:
				if(context == grammarAccess.getAttributeDescriptionRule()) {
					sequence_AttributeDescription(context, (AttributeDescription) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ATTRIBUTES:
				if(context == grammarAccess.getAttributesRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_Attributes(context, (Attributes) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BI_IMPLICATION:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0()) {
					sequence_SubExpression3(context, (BiImplication) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BOOL_DEFAULT_DEF:
				if(context == grammarAccess.getBoolDefaultDefRule()) {
					sequence_BoolDefaultDef(context, (BoolDefaultDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BOOLEAN_ATTR_DEF:
				if(context == grammarAccess.getBasicAttrDefRule() ||
				   context == grammarAccess.getBooleanAttrDefRule()) {
					sequence_BooleanAttrDef(context, (BooleanAttrDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BOOLEAN_ATTR_VALUATION:
				if(context == grammarAccess.getBasicAttrValuationRule() ||
				   context == grammarAccess.getBooleanAttrValuationRule() ||
				   context == grammarAccess.getExtendedValuationRule()) {
					sequence_BooleanAttrValuation(context, (BooleanAttrValuation) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BOOLEAN_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression10Rule() ||
				   context == grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BOOLEAN_EXPRESSION_LIST:
				if(context == grammarAccess.getBooleanExpression_ListRule()) {
					sequence_BooleanExpression_List(context, (BooleanExpression_List) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BOOLEAN_VALUATION:
				if(context == grammarAccess.getBooleanValuationRule()) {
					sequence_BooleanValuation(context, (BooleanValuation) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BOOLEAN_ATT_ID:
				if(context == grammarAccess.getAbstract_ATT_IDRule() ||
				   context == grammarAccess.getBoolean_ATT_IDRule()) {
					sequence_Boolean_ATT_ID(context, (Boolean_ATT_ID) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.BRACKED_EXPRESSION:
				if(context == grammarAccess.getBrackedExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression10Rule() ||
				   context == grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_BrackedExpression(context, (BrackedExpression) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.CARDINALITY_BASED:
				if(context == grammarAccess.getCardinalityBasedRule() ||
				   context == grammarAccess.getFeatureDefinitionRule() ||
				   context == grammarAccess.getFeaturesGroupRule()) {
					sequence_CardinalityBased(context, (CardinalityBased) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.CONFIGURATION:
				if(context == grammarAccess.getConfigurationRule()) {
					sequence_Configuration(context, (Configuration) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.CONFIGURATIONS:
				if(context == grammarAccess.getConfigurationsRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_Configurations(context, (Configurations) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.CONSTRAINTS:
				if(context == grammarAccess.getConstraintsRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_Constraints(context, (Constraints) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.DESCRIPTIONS:
				if(context == grammarAccess.getDescriptionsRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_Descriptions(context, (Descriptions) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.DIVISION:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_SubExpression9(context, (Division) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.EMAIL:
				if(context == grammarAccess.getEmailRule()) {
					sequence_Email(context, (Email) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ENUM_INTEGER_DEF:
				if(context == grammarAccess.getEnumAttrDefRule() ||
				   context == grammarAccess.getEnumIntegerDefRule()) {
					sequence_EnumIntegerDef(context, (EnumIntegerDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ENUM_REAL_DEF:
				if(context == grammarAccess.getEnumAttrDefRule() ||
				   context == grammarAccess.getEnumRealDefRule()) {
					sequence_EnumRealDef(context, (EnumRealDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ENUM_STRING_DEF:
				if(context == grammarAccess.getEnumAttrDefRule() ||
				   context == grammarAccess.getEnumStringDefRule()) {
					sequence_EnumStringDef(context, (EnumStringDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ENUM_INTEGER_ATT_ID:
				if(context == grammarAccess.getAbstract_ATT_IDRule() ||
				   context == grammarAccess.getEnum_Integer_ATT_IDRule()) {
					sequence_Enum_Integer_ATT_ID(context, (Enum_Integer_ATT_ID) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ENUM_REAL_ATT_ID:
				if(context == grammarAccess.getAbstract_ATT_IDRule() ||
				   context == grammarAccess.getEnum_Real_ATT_IDRule()) {
					sequence_Enum_Real_ATT_ID(context, (Enum_Real_ATT_ID) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ENUM_STRING_ATT_ID:
				if(context == grammarAccess.getAbstract_ATT_IDRule() ||
				   context == grammarAccess.getEnum_String_ATT_IDRule()) {
					sequence_Enum_String_ATT_ID(context, (Enum_String_ATT_ID) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.EQUALITY:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0()) {
					sequence_SubExpression6(context, (Equality) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.EXCLUDES:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression10Rule() ||
				   context == grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_SubExpression10(context, (Excludes) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getFeatureDefinitionRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.FEATURE_DESCRIPTION:
				if(context == grammarAccess.getFeatureDescriptionRule()) {
					sequence_FeatureDescription(context, (FeatureDescription) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.FEATURE_HIERARCHY:
				if(context == grammarAccess.getFeatureDefinitionRule() ||
				   context == grammarAccess.getFeatureHierarchyRule()) {
					sequence_FeatureHierarchy(context, (FeatureHierarchy) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.GREATER:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0()) {
					sequence_SubExpression7(context, (Greater) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubExpression7Access().getGreaterequalLeftAction_1_0_0_1_2_0_0()) {
					sequence_SubExpression7_Greaterequal_1_0_0_1_2_0_0(context, (Greater) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.GREATEREQUAL:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0()) {
					sequence_SubExpression7(context, (Greaterequal) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.IF:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0()) {
					sequence_SubExpression0(context, (If) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.IMPORT_DECLARATION:
				if(context == grammarAccess.getImportDeclarationRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_ImportDeclaration(context, (ImportDeclaration) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.INEQUALITY:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0()) {
					sequence_SubExpression6(context, (Inequality) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.INTEGER_ATTR_DEF_BOUNDED:
				if(context == grammarAccess.getBasicAttrDefRule() ||
				   context == grammarAccess.getIntegerAttrDefRule() ||
				   context == grammarAccess.getIntegerAttrDefBoundedRule()) {
					sequence_IntegerAttrDefBounded(context, (IntegerAttrDefBounded) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.INTEGER_ATTR_DEF_COMPLEMENT:
				if(context == grammarAccess.getIntegerAttrDefComplementRule()) {
					sequence_IntegerAttrDefComplement(context, (IntegerAttrDefComplement) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.INTEGER_ATTR_DEF_UNBOUNDED:
				if(context == grammarAccess.getBasicAttrDefRule() ||
				   context == grammarAccess.getIntegerAttrDefRule() ||
				   context == grammarAccess.getIntegerAttrDefUnboundedRule()) {
					sequence_IntegerAttrDefUnbounded(context, (IntegerAttrDefUnbounded) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.INTEGER_ATTR_VALUATION:
				if(context == grammarAccess.getBasicAttrValuationRule() ||
				   context == grammarAccess.getExtendedValuationRule() ||
				   context == grammarAccess.getIntegerAttrValuationRule()) {
					sequence_IntegerAttrValuation(context, (IntegerAttrValuation) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.INTEGER_DEFAULT_DEF:
				if(context == grammarAccess.getIntegerDefaultDefRule()) {
					sequence_IntegerDefaultDef(context, (IntegerDefaultDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.INTEGER_DELTA_DEF:
				if(context == grammarAccess.getIntegerDeltaDefRule()) {
					sequence_IntegerDeltaDef(context, (IntegerDeltaDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.INTEGER_ATT_ID:
				if(context == grammarAccess.getAbstract_ATT_IDRule() ||
				   context == grammarAccess.getInteger_ATT_IDRule()) {
					sequence_Integer_ATT_ID(context, (Integer_ATT_ID) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.LEFT_IMPLICATION:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0()) {
					sequence_SubExpression1(context, (LeftImplication) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.LESS:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0()) {
					sequence_SubExpression7(context, (Less) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubExpression7Access().getLessequalLeftAction_1_0_0_0_2_0_0()) {
					sequence_SubExpression7_Lessequal_1_0_0_0_2_0_0(context, (Less) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.LESSEQUAL:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0()) {
					sequence_SubExpression7(context, (Lessequal) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.META_DATA_DECLARATION:
				if(context == grammarAccess.getMetaDataDeclarationRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_MetaDataDeclaration(context, (MetaDataDeclaration) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.MINUS:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0()) {
					sequence_SubExpression8(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.MULTIPLICATION:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_SubExpression9(context, (Multiplication) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.NUMERIC_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression10Rule() ||
				   context == grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_NumericExpression(context, (NumericExpression) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.NUMERIC_EXPRESSION_LIST:
				if(context == grammarAccess.getNumericExpression_ListRule()) {
					sequence_NumericExpression_List(context, (NumericExpression_List) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.OBJECTIVE:
				if(context == grammarAccess.getObjectiveRule()) {
					sequence_Objective(context, (Objective) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.OBJECTIVE_EXPRESSION:
				if(context == grammarAccess.getObjectiveExpressionRule()) {
					sequence_ObjectiveExpression(context, (ObjectiveExpression) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.OBJECTIVES:
				if(context == grammarAccess.getObjectivesRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_Objectives(context, (Objectives) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.OR:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0()) {
					sequence_SubExpression4(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.ORGROUP:
				if(context == grammarAccess.getFeatureDefinitionRule() ||
				   context == grammarAccess.getFeaturesGroupRule() ||
				   context == grammarAccess.getOrgroupRule()) {
					sequence_Orgroup(context, (Orgroup) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.PAIR_ATTRIBUTE_VALUE:
				if(context == grammarAccess.getPairAttributeValueRule()) {
					sequence_PairAttributeValue(context, (PairAttributeValue) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.PAIR_FEATURE_INTEGER:
				if(context == grammarAccess.getPairFeatureIntegerRule()) {
					sequence_PairFeatureInteger(context, (PairFeatureInteger) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.PAIR_FEATURE_REAL:
				if(context == grammarAccess.getPairFeatureRealRule()) {
					sequence_PairFeatureReal(context, (PairFeatureReal) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.PLUS:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0()) {
					sequence_SubExpression8(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.PRIMITIVE_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getPrimitiveExpressionRule() ||
				   context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression10Rule() ||
				   context == grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_PrimitiveExpression(context, (PrimitiveExpression) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.REAL_ATTR_DEF_BOUNDED:
				if(context == grammarAccess.getBasicAttrDefRule() ||
				   context == grammarAccess.getRealAttrDefRule() ||
				   context == grammarAccess.getRealAttrDefBoundedRule()) {
					sequence_RealAttrDefBounded(context, (RealAttrDefBounded) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.REAL_ATTR_DEF_COMPLEMENT:
				if(context == grammarAccess.getRealAttrDefComplementRule()) {
					sequence_RealAttrDefComplement(context, (RealAttrDefComplement) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.REAL_ATTR_DEF_UNBOUNDED:
				if(context == grammarAccess.getBasicAttrDefRule() ||
				   context == grammarAccess.getRealAttrDefRule() ||
				   context == grammarAccess.getRealAttrDefUnboundedRule()) {
					sequence_RealAttrDefUnbounded(context, (RealAttrDefUnbounded) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.REAL_ATTR_VALUATION:
				if(context == grammarAccess.getBasicAttrValuationRule() ||
				   context == grammarAccess.getExtendedValuationRule() ||
				   context == grammarAccess.getRealAttrValuationRule()) {
					sequence_RealAttrValuation(context, (RealAttrValuation) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.REAL_DEFAULT_DEF:
				if(context == grammarAccess.getRealDefaultDefRule()) {
					sequence_RealDefaultDef(context, (RealDefaultDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.REAL_DELTA_DEF:
				if(context == grammarAccess.getRealDeltaDefRule()) {
					sequence_RealDeltaDef(context, (RealDeltaDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.REAL_ATT_ID:
				if(context == grammarAccess.getAbstract_ATT_IDRule() ||
				   context == grammarAccess.getReal_ATT_IDRule()) {
					sequence_Real_ATT_ID(context, (Real_ATT_ID) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.RELATIONSHIPS:
				if(context == grammarAccess.getRelationshipsRule() ||
				   context == grammarAccess.getVmBlockRule()) {
					sequence_Relationships(context, (Relationships) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.REQUIRES:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression10Rule() ||
				   context == grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_SubExpression10(context, (Requires) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.RIGHT_IMPLICATION:
				if(context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0()) {
					sequence_SubExpression2(context, (RightImplication) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.SPECIAL_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSpecialExpressionRule() ||
				   context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression10Rule() ||
				   context == grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_SpecialExpression(context, (SpecialExpression) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.STRING_ATTR_DEF:
				if(context == grammarAccess.getBasicAttrDefRule() ||
				   context == grammarAccess.getStringAttrDefRule()) {
					sequence_StringAttrDef(context, (StringAttrDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.STRING_ATTR_VALUATION:
				if(context == grammarAccess.getBasicAttrValuationRule() ||
				   context == grammarAccess.getExtendedValuationRule() ||
				   context == grammarAccess.getStringAttrValuationRule()) {
					sequence_StringAttrValuation(context, (StringAttrValuation) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.STRING_DEFAULT_DEF:
				if(context == grammarAccess.getStringDefaultDefRule()) {
					sequence_StringDefaultDef(context, (StringDefaultDef) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.STRING_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStringExpressionRule() ||
				   context == grammarAccess.getSubExpression0Rule() ||
				   context == grammarAccess.getSubExpression0Access().getIfLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression1Rule() ||
				   context == grammarAccess.getSubExpression10Rule() ||
				   context == grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression2Rule() ||
				   context == grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression3Rule() ||
				   context == grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression4Rule() ||
				   context == grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression5Rule() ||
				   context == grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getSubExpression6Rule() ||
				   context == grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Rule() ||
				   context == grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression8Rule() ||
				   context == grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0() ||
				   context == grammarAccess.getSubExpression9Rule() ||
				   context == grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0() ||
				   context == grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0()) {
					sequence_StringExpression(context, (StringExpression) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.STRING_ATT_ID:
				if(context == grammarAccess.getAbstract_ATT_IDRule() ||
				   context == grammarAccess.getString_ATT_IDRule()) {
					sequence_String_ATT_ID(context, (String_ATT_ID) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_INTEGER:
				if(context == grammarAccess.getTableBasedValuationByAttributeRule() ||
				   context == grammarAccess.getTableBasedValuationByAttributeForIntegerRule()) {
					sequence_TableBasedValuationByAttributeForInteger(context, (TableBasedValuationByAttributeForInteger) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.TABLE_BASED_VALUATION_BY_ATTRIBUTE_FOR_REAL:
				if(context == grammarAccess.getTableBasedValuationByAttributeRule() ||
				   context == grammarAccess.getTableBasedValuationByAttributeForRealRule()) {
					sequence_TableBasedValuationByAttributeForReal(context, (TableBasedValuationByAttributeForReal) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE:
				if(context == grammarAccess.getTableBasedValuationByFeatureRule()) {
					sequence_TableBasedValuationByFeature(context, (TableBasedValuationByFeature) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.TABLE_BASED_VALUATION_BY_FEATURE_AND_CLONE:
				if(context == grammarAccess.getTableBasedValuationByFeatureAndCloneRule()) {
					sequence_TableBasedValuationByFeatureAndClone(context, (TableBasedValuationByFeatureAndClone) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.VERSION:
				if(context == grammarAccess.getVersionRule()) {
					sequence_Version(context, (Version) semanticObject); 
					return; 
				}
				else break;
			case VMPackage.XORGROUP:
				if(context == grammarAccess.getFeatureDefinitionRule() ||
				   context == grammarAccess.getFeaturesGroupRule() ||
				   context == grammarAccess.getXorgroupRule()) {
					sequence_Xorgroup(context, (Xorgroup) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attVsVal=TableBasedValuationByFeature | featVsVal+=TableBasedValuationByAttribute | attVsValForMultiFeature=TableBasedValuationByFeatureAndClone)
	 */
	protected void sequence_AdvancedAttrValuation(EObject context, AdvancedAttrValuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (forAllFeatures?='*.' | ownedFeature=[Feature|ID])
	 */
	protected void sequence_AttHead(EObject context, AttHead semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (notTranslatable?='@NT' | notTranslatable?='@NotTranslatable')? 
	 *         (runTime?='@RT' | runTime?='@RunTime')? 
	 *         (notDecidable?='@ND' | notDecidable?='@NotDecideable')? 
	 *         (basicAttrDef=BasicAttrDef | enumAttrDef=EnumAttrDef)
	 *     )
	 */
	protected void sequence_AttrDef(EObject context, AttrDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refFeat=[Feature|ID]? refAtt=[Abstract_ATT_ID|ID] description=STRING)
	 */
	protected void sequence_AttributeDescription(EObject context, AttributeDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attrDefs+=AttrDef | attrValuations+=BasicAttrValuation)+
	 */
	protected void sequence_Attributes(EObject context, Attributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_BoolDefaultDef(EObject context, BoolDefaultDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Boolean_ATT_ID (value='true' | value='false')? default=BoolDefaultDef?)
	 */
	protected void sequence_BooleanAttrDef(EObject context, BooleanAttrDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead? refAtt=[Boolean_ATT_ID|ID] (value='true' | value='false'))
	 */
	protected void sequence_BooleanAttrValuation(EObject context, BooleanAttrValuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='true' | 
	 *         value='false' | 
	 *         (op='!' expression=BooleanExpression) | 
	 *         (op='or' expression_list=BooleanExpression_List) | 
	 *         (op='xor' expression_list=BooleanExpression_List) | 
	 *         (op='and' expression_list=BooleanExpression_List)
	 *     )
	 */
	protected void sequence_BooleanExpression(EObject context, BooleanExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ex+=BooleanExpression ex+=BooleanExpression*)
	 */
	protected void sequence_BooleanExpression_List(EObject context, BooleanExpression_List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (notSelected?='!'? feature=[Feature|ID])
	 */
	protected void sequence_BooleanValuation(EObject context, BooleanValuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead name=ID)
	 */
	protected void sequence_Boolean_ATT_ID(EObject context, Boolean_ATT_ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolean_ATT_IDAccess().getHeadAttHeadParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getBoolean_ATT_IDAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=SubExpression0
	 */
	protected void sequence_BrackedExpression(EObject context, BrackedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.BRACKED_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.BRACKED_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBrackedExpressionAccess().getExpressionSubExpression0ParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((min=Integer max=Integer) | (min=Integer (max=Integer | all?='*'))) 
	 *         (groupedFeatures+=Feature | groupedFeatures+=FeatureHierarchy) 
	 *         (groupedFeatures+=Feature | groupedFeatures+=FeatureHierarchy)+
	 *     )
	 */
	protected void sequence_CardinalityBased(EObject context, CardinalityBased semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (booleanValuation+=BooleanValuation | extendedValuation+=ExtendedValuation)+)
	 */
	protected void sequence_Configuration(EObject context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     configurations+=Configuration+
	 */
	protected void sequence_Configurations(EObject context, Configurations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? expression=SubExpression0)
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constraints+=Constraint+
	 */
	protected void sequence_Constraints(EObject context, Constraints semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featuresDescriptions+=FeatureDescription | attributesDescriptions+=AttributeDescription)+
	 */
	protected void sequence_Descriptions(EObject context, Descriptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (username=QualifiedName domain=QualifiedName)
	 */
	protected void sequence_Email(EObject context, Email semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.EMAIL__USERNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.EMAIL__USERNAME));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.EMAIL__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.EMAIL__DOMAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEmailAccess().getUsernameQualifiedNameParserRuleCall_0_0(), semanticObject.getUsername());
		feeder.accept(grammarAccess.getEmailAccess().getDomainQualifiedNameParserRuleCall_2_0(), semanticObject.getDomain());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Enum_Integer_ATT_ID value+=Integer value+=Integer+ default=IntegerDefaultDef?)
	 */
	protected void sequence_EnumIntegerDef(EObject context, EnumIntegerDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Enum_Real_ATT_ID value+=Real value+=Real+ default=RealDefaultDef?)
	 */
	protected void sequence_EnumRealDef(EObject context, EnumRealDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Enum_String_ATT_ID value+=STRING value+=STRING+ default=StringDefaultDef?)
	 */
	protected void sequence_EnumStringDef(EObject context, EnumStringDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead name=ID)
	 */
	protected void sequence_Enum_Integer_ATT_ID(EObject context, Enum_Integer_ATT_ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnum_Integer_ATT_IDAccess().getHeadAttHeadParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getEnum_Integer_ATT_IDAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead name=ID)
	 */
	protected void sequence_Enum_Real_ATT_ID(EObject context, Enum_Real_ATT_ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnum_Real_ATT_IDAccess().getHeadAttHeadParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getEnum_Real_ATT_IDAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead name=ID)
	 */
	protected void sequence_Enum_String_ATT_ID(EObject context, Enum_String_ATT_ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnum_String_ATT_IDAccess().getHeadAttHeadParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getEnum_String_ATT_IDAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (refFeat=[Feature|ID] description=STRING)
	 */
	protected void sequence_FeatureDescription(EObject context, FeatureDescription semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.FEATURE_DESCRIPTION__REF_FEAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.FEATURE_DESCRIPTION__REF_FEAT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.FEATURE_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.FEATURE_DESCRIPTION__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureDescriptionAccess().getRefFeatFeatureIDTerminalRuleCall_1_0_1(), semanticObject.getRefFeat());
		feeder.accept(grammarAccess.getFeatureDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parent=Feature children+=FeatureDefinition+)
	 */
	protected void sequence_FeatureHierarchy(EObject context, FeatureHierarchy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (notTranslatable?='@NT' | notTranslatable?='@NotTranslatable')? 
	 *         (runTime?='@RT' | runTime?='@RunTime')? 
	 *         (notDecidable?='@ND' | notDecidable?='@NotDecideable')? 
	 *         optional?='?'? 
	 *         ((min=Integer max=Integer) | (min=Integer max=Integer))? 
	 *         name=ID
	 *     )
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_ImportDeclaration(EObject context, ImportDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.IMPORT_DECLARATION__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.IMPORT_DECLARATION__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Integer_ATT_ID complements+=IntegerAttrDefComplement complement+=IntegerAttrDefComplement* default=IntegerDefaultDef?)
	 */
	protected void sequence_IntegerAttrDefBounded(EObject context, IntegerAttrDefBounded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (min=Integer max=Integer delta=IntegerDeltaDef?)
	 */
	protected void sequence_IntegerAttrDefComplement(EObject context, IntegerAttrDefComplement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Integer_ATT_ID (value=Integer | default=IntegerDefaultDef)?)
	 */
	protected void sequence_IntegerAttrDefUnbounded(EObject context, IntegerAttrDefUnbounded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead? refAtt=[Integer_ATT_ID|ID] value=Integer)
	 */
	protected void sequence_IntegerAttrValuation(EObject context, IntegerAttrValuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntegerDefaultDef(EObject context, IntegerDefaultDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.INTEGER_DEFAULT_DEF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.INTEGER_DEFAULT_DEF__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerDefaultDefAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntegerDeltaDef(EObject context, IntegerDeltaDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.INTEGER_DELTA_DEF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.INTEGER_DELTA_DEF__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerDeltaDefAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead name=ID)
	 */
	protected void sequence_Integer_ATT_ID(EObject context, Integer_ATT_ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteger_ATT_IDAccess().getHeadAttHeadParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getInteger_ATT_IDAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         version=Version? 
	 *         description=STRING? 
	 *         author=STRING? 
	 *         email=Email? 
	 *         organization=STRING? 
	 *         publication=STRING? 
	 *         date=STRING?
	 *     )
	 */
	protected void sequence_MetaDataDeclaration(EObject context, MetaDataDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     blocks+=VmBlock*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ex+=NumericExpression ex+=NumericExpression*)
	 */
	protected void sequence_NumericExpression_List(EObject context, NumericExpression_List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=Integer | 
	 *         value=Real | 
	 *         (op='neg' expression=NumericExpression) | 
	 *         (op='abs' expression=NumericExpression) | 
	 *         (op='avg' expression_list=NumericExpression_List) | 
	 *         (op='max' expression_list=NumericExpression_List) | 
	 *         (op='min' expression_list=NumericExpression_List) | 
	 *         (op='mul' expression_list=NumericExpression_List) | 
	 *         (op='sum' expression_list=NumericExpression_List)
	 *     )
	 */
	protected void sequence_NumericExpression(EObject context, NumericExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op='sum' expression=PrimitiveExpression)
	 */
	protected void sequence_ObjectiveExpression(EObject context, ObjectiveExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.OBJECTIVE_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.OBJECTIVE_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.OBJECTIVE_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.OBJECTIVE_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectiveExpressionAccess().getOpSumKeyword_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getObjectiveExpressionAccess().getExpressionPrimitiveExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ((op='max' expression=ObjectiveExpression) | (op='min' expression=ObjectiveExpression)))
	 */
	protected void sequence_Objective(EObject context, Objective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     objectives+=Objective+
	 */
	protected void sequence_Objectives(EObject context, Objectives semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((groupedFeatures+=Feature | groupedFeatures+=FeatureHierarchy) (groupedFeatures+=Feature | groupedFeatures+=FeatureHierarchy)+)
	 */
	protected void sequence_Orgroup(EObject context, Orgroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName blocks+=VmBlock*)
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (refAtt=[Real_ATT_ID|ID] value=Real) | 
	 *         (refAtt=[Integer_ATT_ID|ID] value=Integer) | 
	 *         (refAtt=[Boolean_ATT_ID|ID] (value='true' | value='false')) | 
	 *         (refAtt=[String_ATT_ID|ID] value=STRING)
	 *     )
	 */
	protected void sequence_PairAttributeValue(EObject context, PairAttributeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refFeat=[Feature|ID] value=Integer)
	 */
	protected void sequence_PairFeatureInteger(EObject context, PairFeatureInteger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.PAIR_FEATURE_INTEGER__REF_FEAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.PAIR_FEATURE_INTEGER__REF_FEAT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.PAIR_FEATURE_INTEGER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.PAIR_FEATURE_INTEGER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPairFeatureIntegerAccess().getRefFeatFeatureIDTerminalRuleCall_0_0_1(), semanticObject.getRefFeat());
		feeder.accept(grammarAccess.getPairFeatureIntegerAccess().getValueIntegerParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (refFeat=[Feature|ID] value=Real)
	 */
	protected void sequence_PairFeatureReal(EObject context, PairFeatureReal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.PAIR_FEATURE_REAL__REF_FEAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.PAIR_FEATURE_REAL__REF_FEAT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.PAIR_FEATURE_REAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.PAIR_FEATURE_REAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPairFeatureRealAccess().getRefFeatFeatureIDTerminalRuleCall_0_0_1(), semanticObject.getRefFeat());
		feeder.accept(grammarAccess.getPairFeatureRealAccess().getValueRealParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (featureID=[Feature|ID] | (head=AttHead refAtt=[Abstract_ATT_ID|ID]))
	 */
	protected void sequence_PrimitiveExpression(EObject context, PrimitiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Real_ATT_ID complement+=RealAttrDefComplement complement+=RealAttrDefComplement* default=RealDefaultDef?)
	 */
	protected void sequence_RealAttrDefBounded(EObject context, RealAttrDefBounded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (min=Real max=Real delta=RealDeltaDef?)
	 */
	protected void sequence_RealAttrDefComplement(EObject context, RealAttrDefComplement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Real_ATT_ID (value=Real | default=RealDefaultDef)?)
	 */
	protected void sequence_RealAttrDefUnbounded(EObject context, RealAttrDefUnbounded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead? refAtt=[Real_ATT_ID|ID] value=Real)
	 */
	protected void sequence_RealAttrValuation(EObject context, RealAttrValuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Real
	 */
	protected void sequence_RealDefaultDef(EObject context, RealDefaultDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.REAL_DEFAULT_DEF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.REAL_DEFAULT_DEF__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRealDefaultDefAccess().getValueRealParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Real
	 */
	protected void sequence_RealDeltaDef(EObject context, RealDeltaDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.REAL_DELTA_DEF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.REAL_DELTA_DEF__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRealDeltaDefAccess().getValueRealParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead name=ID)
	 */
	protected void sequence_Real_ATT_ID(EObject context, Real_ATT_ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReal_ATT_IDAccess().getHeadAttHeadParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getReal_ATT_IDAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     root=FeatureHierarchy
	 */
	protected void sequence_Relationships(EObject context, Relationships semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.RELATIONSHIPS__ROOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.RELATIONSHIPS__ROOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationshipsAccess().getRootFeatureHierarchyParserRuleCall_1_0(), semanticObject.getRoot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op='clonesOf' expression=[Feature|ID])
	 */
	protected void sequence_SpecialExpression(EObject context, SpecialExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.SPECIAL_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.SPECIAL_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.SPECIAL_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.SPECIAL_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpecialExpressionAccess().getOpClonesOfKeyword_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getSpecialExpressionAccess().getExpressionFeatureIDTerminalRuleCall_1_0_1(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=String_ATT_ID value=STRING? default=StringDefaultDef?)
	 */
	protected void sequence_StringAttrDef(EObject context, StringAttrDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead? refAtt=[String_ATT_ID|ID] value=STRING)
	 */
	protected void sequence_StringAttrValuation(EObject context, StringAttrValuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringDefaultDef(EObject context, StringDefaultDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.STRING_DEFAULT_DEF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.STRING_DEFAULT_DEF__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringDefaultDefAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringExpression(EObject context, StringExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.STRING_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.STRING_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=AttHead name=ID)
	 */
	protected void sequence_String_ATT_ID(EObject context, String_ATT_ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__HEAD));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.ABSTRACT_ATT_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getString_ATT_IDAccess().getHeadAttHeadParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getString_ATT_IDAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression0_If_1_0_0 right+=SubExpression0 right+=SubExpression1)
	 */
	protected void sequence_SubExpression0(EObject context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression10_Excludes_1_0_0_0_0 right=Expression)
	 */
	protected void sequence_SubExpression10(EObject context, Excludes semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.EXCLUDES__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.EXCLUDES__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.EXCLUDES__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.EXCLUDES__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression10Access().getExcludesLeftAction_1_0_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression10Access().getRightExpressionParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression10_Requires_1_0_0_1_0 right=Expression)
	 */
	protected void sequence_SubExpression10(EObject context, Requires semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.REQUIRES__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.REQUIRES__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.REQUIRES__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.REQUIRES__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression10Access().getRequiresLeftAction_1_0_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression10Access().getRightExpressionParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression1_LeftImplication_1_0_0 right=SubExpression2)
	 */
	protected void sequence_SubExpression1(EObject context, LeftImplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.LEFT_IMPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.LEFT_IMPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.LEFT_IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.LEFT_IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression1Access().getLeftImplicationLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression1Access().getRightSubExpression2ParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression2_RightImplication_1_0_0 right=SubExpression3)
	 */
	protected void sequence_SubExpression2(EObject context, RightImplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.RIGHT_IMPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.RIGHT_IMPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.RIGHT_IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.RIGHT_IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression2Access().getRightImplicationLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression2Access().getRightSubExpression3ParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression3_BiImplication_1_0_0 right=SubExpression4)
	 */
	protected void sequence_SubExpression3(EObject context, BiImplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.BI_IMPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.BI_IMPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.BI_IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.BI_IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression3Access().getBiImplicationLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression3Access().getRightSubExpression4ParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression4_Or_1_0_0 right=SubExpression5)
	 */
	protected void sequence_SubExpression4(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression4Access().getOrLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression4Access().getRightSubExpression5ParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression5_And_1_0_0 right=SubExpression6)
	 */
	protected void sequence_SubExpression5(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression5Access().getAndLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression5Access().getRightSubExpression6ParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression6_Equality_1_0_0_0_0 right=SubExpression7)
	 */
	protected void sequence_SubExpression6(EObject context, Equality semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.EQUALITY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.EQUALITY__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.EQUALITY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.EQUALITY__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression6Access().getEqualityLeftAction_1_0_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression6Access().getRightSubExpression7ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression6_Inequality_1_0_0_1_0 right=SubExpression7)
	 */
	protected void sequence_SubExpression6(EObject context, Inequality semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.INEQUALITY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.INEQUALITY__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.INEQUALITY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.INEQUALITY__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression6Access().getInequalityLeftAction_1_0_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression6Access().getRightSubExpression7ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression7_Greater_1_0_0_1_0 right=SubExpression8)
	 */
	protected void sequence_SubExpression7(EObject context, Greater semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.GREATER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.GREATER__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.GREATER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.GREATER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression7Access().getGreaterLeftAction_1_0_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression7Access().getRightSubExpression8ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression7_Greaterequal_1_0_0_1_2_0_0 right=SubExpression8)
	 */
	protected void sequence_SubExpression7(EObject context, Greaterequal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.GREATEREQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.GREATEREQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.GREATEREQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.GREATEREQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression7Access().getGreaterequalLeftAction_1_0_0_1_2_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression7Access().getRightSubExpression8ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     left=SubExpression7_Greater_1_0_0_1_0
	 */
	protected void sequence_SubExpression7_Greaterequal_1_0_0_1_2_0_0(EObject context, Greater semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression7_Less_1_0_0_0_0 right=SubExpression8)
	 */
	protected void sequence_SubExpression7(EObject context, Less semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.LESS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.LESS__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.LESS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.LESS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression7Access().getLessLeftAction_1_0_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression7Access().getRightSubExpression8ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression7_Lessequal_1_0_0_0_2_0_0 right=SubExpression8)
	 */
	protected void sequence_SubExpression7(EObject context, Lessequal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.LESSEQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.LESSEQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.LESSEQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.LESSEQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression7Access().getLessequalLeftAction_1_0_0_0_2_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression7Access().getRightSubExpression8ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     left=SubExpression7_Less_1_0_0_0_0
	 */
	protected void sequence_SubExpression7_Lessequal_1_0_0_0_2_0_0(EObject context, Less semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression8_Minus_1_0_0_1_0 right=SubExpression9)
	 */
	protected void sequence_SubExpression8(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression8Access().getMinusLeftAction_1_0_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression8Access().getRightSubExpression9ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression8_Plus_1_0_0_0_0 right=SubExpression9)
	 */
	protected void sequence_SubExpression8(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression8Access().getPlusLeftAction_1_0_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression8Access().getRightSubExpression9ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression9_Division_1_0_0_1_0 right=SubExpression10)
	 */
	protected void sequence_SubExpression9(EObject context, Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression9Access().getDivisionLeftAction_1_0_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression9Access().getRightSubExpression10ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SubExpression9_Multiplication_1_0_0_0_0 right=SubExpression10)
	 */
	protected void sequence_SubExpression9(EObject context, Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, VMPackage.Literals.MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VMPackage.Literals.MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExpression9Access().getMultiplicationLeftAction_1_0_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubExpression9Access().getRightSubExpression10ParserRuleCall_1_0_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (refAtt=[Integer_ATT_ID|ID] pairs+=PairFeatureInteger pairs+=PairFeatureInteger*)
	 */
	protected void sequence_TableBasedValuationByAttributeForInteger(EObject context, TableBasedValuationByAttributeForInteger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refAtt=[Real_ATT_ID|ID] pairs+=PairFeatureReal pairs+=PairFeatureReal*)
	 */
	protected void sequence_TableBasedValuationByAttributeForReal(EObject context, TableBasedValuationByAttributeForReal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((refFeature=[Feature|ID] name=ID) | (refFeature=[Feature|ID] name=ID)) pairs+=PairAttributeValue pairs+=PairAttributeValue*)
	 */
	protected void sequence_TableBasedValuationByFeatureAndClone(EObject context, TableBasedValuationByFeatureAndClone semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refFeature=[Feature|ID] pairs+=PairAttributeValue pairs+=PairAttributeValue*)
	 */
	protected void sequence_TableBasedValuationByFeature(EObject context, TableBasedValuationByFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (main=INT tail+=INT*)
	 */
	protected void sequence_Version(EObject context, Version semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((groupedFeatures+=Feature | groupedFeatures+=FeatureHierarchy) (groupedFeatures+=Feature | groupedFeatures+=FeatureHierarchy)+)
	 */
	protected void sequence_Xorgroup(EObject context, Xorgroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
