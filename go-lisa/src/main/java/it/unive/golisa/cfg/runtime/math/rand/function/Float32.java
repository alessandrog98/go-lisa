package it.unive.golisa.cfg.runtime.math.rand.function;

import it.unive.golisa.cfg.type.numeric.floating.GoFloat32Type;
import it.unive.lisa.analysis.AbstractState;
import it.unive.lisa.analysis.AnalysisState;
import it.unive.lisa.analysis.SemanticException;
import it.unive.lisa.analysis.StatementStore;
import it.unive.lisa.analysis.lattices.ExpressionSet;
import it.unive.lisa.interprocedural.InterproceduralAnalysis;
import it.unive.lisa.program.CodeUnit;
import it.unive.lisa.program.cfg.CFG;
import it.unive.lisa.program.cfg.CodeLocation;
import it.unive.lisa.program.cfg.CodeMemberDescriptor;
import it.unive.lisa.program.cfg.NativeCFG;
import it.unive.lisa.program.cfg.statement.Expression;
import it.unive.lisa.program.cfg.statement.PluggableStatement;
import it.unive.lisa.program.cfg.statement.Statement;
import it.unive.lisa.symbolic.value.PushAny;

/**
 * func Float32() float32.
 * 
 * @author <a href="mailto:luca.olivieri@univr.it">Luca Olivieri</a>
 */
public class Float32 extends NativeCFG {

	/**
	 * Builds the native cfg.
	 * 
	 * @param location the location where this native cfg is defined
	 * @param randUnit the unit to which this native cfg belongs to
	 */
	public Float32(CodeLocation location, CodeUnit randUnit) {
		super(new CodeMemberDescriptor(location, randUnit, false, "Float32", GoFloat32Type.INSTANCE),
				Float32Impl.class);
	}

	/**
	 * The Float32 implementation.
	 * 
	 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
	 */
	public static class Float32Impl extends it.unive.lisa.program.cfg.statement.NaryExpression
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
		public static Float32Impl build(CFG cfg, CodeLocation location, Expression... params) {
			return new Float32Impl(cfg, location);
		}

		/**
		 * Builds the pluggable statement.
		 * 
		 * @param cfg      the {@link CFG} where this pluggable statement lies
		 * @param location the location where this pluggable statement is
		 *                     defined
		 */
		public Float32Impl(CFG cfg, CodeLocation location) {
			super(cfg, location, "Float32Impl", GoFloat32Type.INSTANCE);
		}

		@Override
		public <A extends AbstractState<A>> AnalysisState<A> forwardSemanticsAux(
				InterproceduralAnalysis<A> interprocedural, AnalysisState<A> state,
				ExpressionSet[] params, StatementStore<A> expressions)
				throws SemanticException {
			return state.smallStepSemantics(new PushAny(GoFloat32Type.INSTANCE, getLocation()), original);
		}
	}
}
