package it.unive.golisa.cfg.runtime.strings;

import it.unive.golisa.cfg.type.GoStringType;
import it.unive.golisa.cfg.type.numeric.signed.GoIntType;
import it.unive.lisa.analysis.AbstractState;
import it.unive.lisa.analysis.AnalysisState;
import it.unive.lisa.analysis.SemanticException;
import it.unive.lisa.analysis.StatementStore;
import it.unive.lisa.interprocedural.InterproceduralAnalysis;
import it.unive.lisa.program.CodeUnit;
import it.unive.lisa.program.cfg.CFG;
import it.unive.lisa.program.cfg.CodeLocation;
import it.unive.lisa.program.cfg.CodeMemberDescriptor;
import it.unive.lisa.program.cfg.NativeCFG;
import it.unive.lisa.program.cfg.Parameter;
import it.unive.lisa.program.cfg.statement.Expression;
import it.unive.lisa.program.cfg.statement.PluggableStatement;
import it.unive.lisa.program.cfg.statement.Statement;
import it.unive.lisa.symbolic.SymbolicExpression;
import it.unive.lisa.symbolic.value.BinaryExpression;
import it.unive.lisa.symbolic.value.operator.binary.StringIndexOf;
import it.unive.lisa.type.Type;

/**
 * func Index(s, substr string) int.
 * 
 * @link https://pkg.go.dev/strings#Index
 * 
 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
 */
public class Index extends NativeCFG {

	/**
	 * Builds the native cfg.
	 * 
	 * @param location   the location where this native cfg is defined
	 * @param stringUnit the unit to which this native cfg belongs to
	 */
	public Index(CodeLocation location, CodeUnit stringUnit) {
		super(new CodeMemberDescriptor(location, stringUnit, false, "Index", GoIntType.INSTANCE,
				new Parameter(location, "this", GoStringType.INSTANCE),
				new Parameter(location, "other", GoStringType.INSTANCE)),
				IndexOfImpl.class);
	}

	/**
	 * The Index implementation.
	 * 
	 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
	 */
	public static class IndexOfImpl extends it.unive.lisa.program.cfg.statement.BinaryExpression
			implements PluggableStatement {

		private Statement original;

		@Override
		public void setOriginatingStatement(Statement st) {
			original = st;
		}

		/**
		 * Builds the pluggable statement.
		 * 
		 * @param cfg      the {@link CFG} where this pluggable statement lies
		 * @param location the location where this pluggable statement is
		 *                     defined
		 * @param params   the parameters
		 * 
		 * @return the pluggable statement
		 */
		public static IndexOfImpl build(CFG cfg, CodeLocation location, Expression... params) {
			return new IndexOfImpl(cfg, location, params[0], params[1]);
		}

		/**
		 * Builds the pluggable statement.
		 * 
		 * @param cfg      the {@link CFG} where this pluggable statement lies
		 * @param location the location where this pluggable statement is
		 *                     defined
		 * @param left     the left-hand side of this pluggable statement
		 * @param right    the right-hand side of this pluggable statement
		 */
		public IndexOfImpl(CFG cfg, CodeLocation location, Expression left, Expression right) {
			super(cfg, location, "Index", GoIntType.INSTANCE, left, right);
		}

		@Override
		public <A extends AbstractState<A>> AnalysisState<A> fwdBinarySemantics(
				InterproceduralAnalysis<A> interprocedural, AnalysisState<A> state,
				SymbolicExpression left, SymbolicExpression right, StatementStore<A> expressions)
				throws SemanticException {
			Type ltype = state.getState().getDynamicTypeOf(left, this, state.getState());
			Type rtype = state.getState().getDynamicTypeOf(right, this, state.getState());

			if (!ltype.isStringType() && !ltype.isUntyped())
				return state.bottom();

			if (!rtype.isStringType() && !rtype.isUntyped())
				return state.bottom();

			return state.smallStepSemantics(new BinaryExpression(GoIntType.INSTANCE,
					left, right, StringIndexOf.INSTANCE, getLocation()), original);
		}
	}
}
