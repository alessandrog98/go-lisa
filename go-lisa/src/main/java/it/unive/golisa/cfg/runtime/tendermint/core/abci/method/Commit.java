package it.unive.golisa.cfg.runtime.tendermint.core.abci.method;

import it.unive.golisa.cfg.runtime.tendermint.core.abci.type.BaseApplication;
import it.unive.golisa.cfg.runtime.tendermint.core.abci.type.ResponseCommit;
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
 * func (BaseApplication) Commit() ResponseCommit.
 * 
 * @link https://pkg.go.dev/github.com/tendermint/tendermint/abci/types#BaseApplication.Commit
 * 
 * @author <a href="mailto:luca.olivieri@univr.it">Luca Olivieri</a>
 */
public class Commit extends NativeCFG {

	/**
	 * Builds the native cfg.
	 * 
	 * @param location the location where this native cfg is defined
	 * @param abciUnit the unit to which this native cfg belongs to
	 */
	public Commit(CodeLocation location, CompilationUnit abciUnit) {
		super(new CodeMemberDescriptor(location, abciUnit, true, "EndBlock",
				ResponseCommit.getRequestEndBlockType(abciUnit.getProgram()),
				new Parameter(location, "this", BaseApplication.etBaseApplicationType(abciUnit.getProgram()))),
				CommitImpl.class);
	}

	/**
	 * The {@link Commit} implementation.
	 * 
	 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
	 */
	public static class CommitImpl extends UnaryExpression
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
		public static CommitImpl build(CFG cfg, CodeLocation location, Expression... params) {
			return new CommitImpl(cfg, location, params[0]);
		}

		/**
		 * Builds the pluggable statement.
		 * 
		 * @param cfg      the {@link CFG} where this pluggable statement lies
		 * @param location the location where this pluggable statement is
		 *                     defined
		 * @param expr     the expression
		 */
		public CommitImpl(CFG cfg, CodeLocation location, Expression expr) {
			super(cfg, location, "CommitImpl", ResponseCommit.getRequestEndBlockType(null), expr);
		}

		@Override
		public <A extends AbstractState<A>> AnalysisState<A> fwdUnarySemantics(
				InterproceduralAnalysis<A> interprocedural, AnalysisState<A> state,
				SymbolicExpression expr, StatementStore<A> expressions) throws SemanticException {
			return state.smallStepSemantics(new PushAny(ResponseCommit.getRequestEndBlockType(null), getLocation()),
					original);
		}
	}
}
