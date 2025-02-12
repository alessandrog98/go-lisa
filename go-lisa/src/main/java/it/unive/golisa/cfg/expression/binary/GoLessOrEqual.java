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
import it.unive.lisa.symbolic.value.operator.binary.ComparisonLe;
import it.unive.lisa.type.Type;
import java.util.Set;

/**
 * A Go less or equal than expression (e.g., e1 < e2).
 * 
 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
 */
public class GoLessOrEqual extends it.unive.lisa.program.cfg.statement.BinaryExpression {

	/**
	 * Builds the less or equal than expression.
	 *
	 * @param cfg      the {@link CFG} where this expression lies
	 * @param location the location where this expression is defined
	 * @param left     the left-hand side of this expression
	 * @param right    the right-hand side of this expression
	 */
	public GoLessOrEqual(CFG cfg, SourceCodeLocation location, Expression right, Expression left) {
		super(cfg, location, "<=", GoBoolType.INSTANCE, right, left);
	}

	@Override
	public <A extends AbstractState<A>> AnalysisState<A> fwdBinarySemantics(InterproceduralAnalysis<A> arg0,
			AnalysisState<A> state, SymbolicExpression left, SymbolicExpression right, StatementStore<A> arg4)
			throws SemanticException {
		AnalysisState<A> result = state.bottom();

		Set<Type> ltypes = state.getState().getRuntimeTypesOf(left, this, state.getState());
		Set<Type> rtypes = state.getState().getRuntimeTypesOf(right, this, state.getState());

		// following the Golang specification:
		// in any comparison, the first operand must be assignable to the type
		// of the second operand, or vice versa.
		for (Type leftType : ltypes)
			for (Type rightType : rtypes) {
				if (leftType.canBeAssignedTo(rightType) || rightType.canBeAssignedTo(leftType)) {
					// TODO: only, integer, floating point values, strings are
					// ordered
					// but missing lexicographical string order in LiSA
					AnalysisState<A> tmp = state
							.smallStepSemantics(
									new BinaryExpression(GoBoolType.INSTANCE,
											left, right, ComparisonLe.INSTANCE, getLocation()),
									this);
					result = result.lub(tmp);
				}
			}
		return result;
	}
}
