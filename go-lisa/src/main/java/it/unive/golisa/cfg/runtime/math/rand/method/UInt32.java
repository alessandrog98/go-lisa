package it.unive.golisa.cfg.runtime.math.rand.method;

import it.unive.golisa.cfg.runtime.math.rand.type.Rand;
import it.unive.golisa.cfg.type.numeric.unsigned.GoUInt32Type;
import it.unive.lisa.analysis.AbstractState;
import it.unive.lisa.analysis.AnalysisState;
import it.unive.lisa.analysis.SemanticException;
import it.unive.lisa.analysis.StatementStore;
import it.unive.lisa.interprocedural.InterproceduralAnalysis;
import it.unive.lisa.program.CompilationUnit;
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
import it.unive.lisa.symbolic.value.PushAny;

/**
 * func (r *Rand) Uint32() uint32.
 * 
 * @author <a href="mailto:luca.olivieri@univr.it">Luca Olivieri</a>
 */
public class UInt32 extends NativeCFG {

	/**
	 * Builds the native cfg.
	 * 
	 * @param location the location where this native cfg is defined
	 * @param randUnit the unit to which this native cfg belongs to
	 */
	public UInt32(CodeLocation location, CompilationUnit randUnit) {
		super(new CodeMemberDescriptor(location, randUnit, true, "Uint32", GoUInt32Type.INSTANCE,
				new Parameter(location, "this", Rand.getRandType(randUnit.getProgram()))),
				UInt32Impl.class);
	}

	/**
	 * The UInt32 implementation.
	 * 
	 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
	 */
	public static class UInt32Impl extends UnaryExpression
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
		public static UInt32Impl build(CFG cfg, CodeLocation location, Expression... params) {
			return new UInt32Impl(cfg, location, params[0]);
		}

		/**
		 * Builds the pluggable statement.
		 * 
		 * @param cfg      the {@link CFG} where this pluggable statement lies
		 * @param location the location where this pluggable statement is
		 *                     defined
		 * @param expr     the expression
		 */
		public UInt32Impl(CFG cfg, CodeLocation location, Expression expr) {
			super(cfg, location, "Uint32Impl", GoUInt32Type.INSTANCE, expr);
		}

		@Override
		public <A extends AbstractState<A>> AnalysisState<A> fwdUnarySemantics(
				InterproceduralAnalysis<A> interprocedural, AnalysisState<A> state,
				SymbolicExpression expr, StatementStore<A> expressions) throws SemanticException {
			return state.smallStepSemantics(new PushAny(GoUInt32Type.INSTANCE, getLocation()), original);
		}
	}
}
