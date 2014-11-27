package fr.inria.lang.serializer;

import com.google.inject.Inject;
import fr.inria.lang.services.VMGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class VMSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VMGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AttributeDescription_AsteriskFullStopKeyword_1_0_q;
	protected AbstractElementAlias match_TableBasedValuationByAttribute_FeatureValuePairsForAttributeKeyword_0_0_q;
	protected AbstractElementAlias match_TableBasedValuationByFeature_AttributeValuePairsForFeatureKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VMGrammarAccess) access;
		match_AttributeDescription_AsteriskFullStopKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getAttributeDescriptionAccess().getAsteriskFullStopKeyword_1_0());
		match_TableBasedValuationByAttribute_FeatureValuePairsForAttributeKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getTableBasedValuationByAttributeAccess().getFeatureValuePairsForAttributeKeyword_0_0());
		match_TableBasedValuationByFeature_AttributeValuePairsForFeatureKeyword_0_q = new TokenAlias(false, true, grammarAccess.getTableBasedValuationByFeatureAccess().getAttributeValuePairsForFeatureKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AttributeDescription_AsteriskFullStopKeyword_1_0_q.equals(syntax))
				emit_AttributeDescription_AsteriskFullStopKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TableBasedValuationByAttribute_FeatureValuePairsForAttributeKeyword_0_0_q.equals(syntax))
				emit_TableBasedValuationByAttribute_FeatureValuePairsForAttributeKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TableBasedValuationByFeature_AttributeValuePairsForFeatureKeyword_0_q.equals(syntax))
				emit_TableBasedValuationByFeature_AttributeValuePairsForFeatureKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '*.'?
	 */
	protected void emit_AttributeDescription_AsteriskFullStopKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'feature-value pairs for attribute:'?
	 */
	protected void emit_TableBasedValuationByAttribute_FeatureValuePairsForAttributeKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'attribute-value pairs for feature:'?
	 */
	protected void emit_TableBasedValuationByFeature_AttributeValuePairsForFeatureKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
