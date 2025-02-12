package it.unive.golisa.cfg.expression.binary;

import it.unive.golisa.cfg.type.GoBoolType;
import it.unive.lisa.analysis.AbstractState;
import it.unive.lisa.analysis.AnalysisState;
import it.unive.lisa.analysis.SemanticException;
import it.unive.lisa.analysis.StatementStore;
import it.unive.lisa.interprocedural.InterproceduralAnalysis;
import it.unive.lisa.program.SourceCodeLocation;
import it.unive.lisa.program.cfg.CFG;
import it.unive.lisa.program.cfg.statement.Expression;
import it.unive.lisa.symbolic.SymbolicExpression;
import it.unive.lisa.symbolic.value.BinaryExpression;
import it.unive.lisa.symbolic.value.operator.binary.LogicalAnd;
import it.unive.lisa.type.Type;

/**
 * A Go Boolean logical and expression (e.g., x && y).
 * 
 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
 */
public class GoLogicalAnd extends it.unive.lisa.program.cfg.statement.BinaryExpression {

	/**
	 * Builds the Boolean logical and expression.
	 *
	 * @param cfg      the {@link CFG} where this expression lies
	 * @param location the location where this expression is defined
	 * @param left     the left-hand side of this expression
	 * @param right    the right-hand side of this expression
	 */
	public GoLogicalAnd(CFG cfg, SourceCodeLocation location, Expression left, Expression right) {
		super(cfg, location, "&&", GoBoolType.INSTANCE, left, right);
	}

	@Override
	public <A extends AbstractState<A>> AnalysisState<A> fwdBinarySemantics(InterproceduralAnalysis<A> arg0,
			AnalysisState<A> state, SymbolicExpression left, SymbolicExpression right, StatementStore<A> arg4)
			throws SemanticException {
		Type ltype = state.getState().getDynamicTypeOf(left, this, state.getState());
		Type rtype = state.getState().getDynamicTypeOf(right, this, state.getState());

		if (!ltype.isBooleanType() && !ltype.isUntyped())
			return state.bottom();
		if (!rtype.isBooleanType() && !rtype.isUntyped())
			return state.bottom();
		return state
				.smallStepSemantics(
						new BinaryExpression(GoBoolType.INSTANCE, left, right,
								LogicalAnd.INSTANCE, getLocation()),
						this);
	}
}
