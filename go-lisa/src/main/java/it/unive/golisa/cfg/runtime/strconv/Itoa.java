package it.unive.golisa.cfg.runtime.strconv;

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
import it.unive.lisa.program.cfg.statement.UnaryExpression;
import it.unive.lisa.symbolic.SymbolicExpression;
import it.unive.lisa.type.Type;

/**
 * func Itoa(i int) string.
 * 
 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
 */
public class Itoa extends NativeCFG {

	/**
	 * Builds the native cfg.
	 * 
	 * @param location    the location where this native cfg is defined
	 * @param strconvUnit the unit to which this native cfg belongs to
	 */
	public Itoa(CodeLocation location, CodeUnit strconvUnit) {
		super(new CodeMemberDescriptor(location, strconvUnit, false, "Itoa", GoStringType.INSTANCE,
				new Parameter(location, "this", GoIntType.INSTANCE)),
				ItoaImpl.class);
	}

	/**
	 * The Itoa implementation.
	 * 
	 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
	 */
	public static class ItoaImpl extends UnaryExpression implements PluggableStatement {

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
		public static ItoaImpl build(CFG cfg, CodeLocation location, Expression... params) {
			return new ItoaImpl(cfg, location, params[0]);
		}

		/**
		 * Builds the pluggable statement.
		 * 
		 * @param cfg      the {@link CFG} where this pluggable statement lies
		 * @param location the location where this pluggable statement is
		 *                     defined
		 * @param expr     the expression
		 */
		public ItoaImpl(CFG cfg, CodeLocation location, Expression expr) {
			super(cfg, location, "Itoa", GoStringType.INSTANCE, expr);
		}

		@Override
		public <A extends AbstractState<A>> AnalysisState<A> fwdUnarySemantics(
				InterproceduralAnalysis<A> interprocedural, AnalysisState<A> state,
				SymbolicExpression expr, StatementStore<A> expressions) throws SemanticException {
			Type etype = state.getState().getDynamicTypeOf(expr, this, state.getState());
			if (!etype.isNumericType() && !etype.isUntyped())
				return state.bottom();
			return state.smallStepSemantics(expr, original);
		}

		@Override
		protected int compareSameClassAndParams(Statement o) {
			return 0; // nothing else to compare
		}
	}
}
