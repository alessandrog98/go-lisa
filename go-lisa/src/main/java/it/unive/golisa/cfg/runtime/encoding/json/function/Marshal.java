package it.unive.golisa.cfg.runtime.encoding.json.function;

import java.util.Collection;

import it.unive.golisa.analysis.taint.Clean;
import it.unive.golisa.analysis.taint.symbolic.JSONMarshalOperator;
import it.unive.golisa.cfg.expression.literal.GoTupleExpression;
import it.unive.golisa.cfg.type.composite.GoErrorType;
import it.unive.golisa.cfg.type.composite.GoInterfaceType;
import it.unive.golisa.cfg.type.composite.GoSliceType;
import it.unive.golisa.cfg.type.composite.GoTupleType;
import it.unive.golisa.checker.TaintChecker.HeapResolver;
import it.unive.lisa.analysis.AbstractState;
import it.unive.lisa.analysis.AnalysisState;
import it.unive.lisa.analysis.SemanticException;
import it.unive.lisa.analysis.StatementStore;
import it.unive.lisa.analysis.heap.HeapDomain;
import it.unive.lisa.analysis.value.TypeDomain;
import it.unive.lisa.analysis.value.ValueDomain;
import it.unive.lisa.interprocedural.InterproceduralAnalysis;
import it.unive.lisa.program.CodeUnit;
import it.unive.lisa.program.annotations.Annotations;
import it.unive.lisa.program.cfg.CFG;
import it.unive.lisa.program.cfg.CodeLocation;
import it.unive.lisa.program.cfg.CodeMemberDescriptor;
import it.unive.lisa.program.cfg.NativeCFG;
import it.unive.lisa.program.cfg.Parameter;
import it.unive.lisa.program.cfg.statement.Expression;
import it.unive.lisa.program.cfg.statement.PluggableStatement;
import it.unive.lisa.program.cfg.statement.Statement;
import it.unive.lisa.symbolic.SymbolicExpression;
import it.unive.lisa.symbolic.heap.HeapDereference;
import it.unive.lisa.symbolic.heap.HeapReference;
import it.unive.lisa.symbolic.heap.MemoryAllocation;
import it.unive.lisa.type.ReferenceType;
import it.unive.lisa.type.Type;
import it.unive.lisa.type.Untyped;

/**
 * func Marshal(v interface{}) ([]byte, error).
 * 
 * @author <a href="mailto:luca.olivieri@univr.it">Luca Olivieri</a>
 */
public class Marshal extends NativeCFG {

	/**
	 * Builds the native cfg.
	 * 
	 * @param location the location where this native cfg is defined
	 * @param jsonUnit the unit to which this native cfg belongs to
	 */
	public Marshal(CodeLocation location, CodeUnit jsonUnit) {
		super(new CodeMemberDescriptor(location, jsonUnit, false, "Marshal",
				GoTupleType.getTupleTypeOf(location, GoSliceType.getSliceOfBytes(),
						GoErrorType.INSTANCE),
				new Parameter(location, "v", GoInterfaceType.getEmptyInterface())),
				MarshalImpl.class);
	}

	/**
	 * The Marshal implementation.
	 * 
	 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
	 */
	public static class MarshalImpl extends it.unive.lisa.program.cfg.statement.UnaryExpression
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
		public static MarshalImpl build(CFG cfg, CodeLocation location, Expression... params) {
			return new MarshalImpl(cfg, location, params[0]);
		}

		/**
		 * Builds the pluggable statement.
		 * 
		 * @param cfg      the {@link CFG} where this pluggable statement lies
		 * @param location the location where this pluggable statement is
		 *                     defined
		 * @param expr     the expression
		 */
		public MarshalImpl(CFG cfg, CodeLocation location, Expression expr) {
			super(cfg, location, "MarshalImpl",
					GoTupleType.getTupleTypeOf(location, GoSliceType.getSliceOfBytes(),
							GoErrorType.INSTANCE),
					expr);
		}

		@Override
		public <A extends AbstractState<A, H, V, T>,
		H extends HeapDomain<H>,
		V extends ValueDomain<V>,
		T extends TypeDomain<T>> AnalysisState<A, H, V, T> unarySemantics(
				InterproceduralAnalysis<A, H, V, T> interprocedural, AnalysisState<A, H, V, T> state,
				SymbolicExpression expr, StatementStore<A, H, V, T> expressions) throws SemanticException {

			Type sliceOfBytes = GoSliceType.getSliceOfBytes();
			GoTupleType tupleType = GoTupleType.getTupleTypeOf(getLocation(), 
					new ReferenceType(sliceOfBytes), GoErrorType.INSTANCE);
			
			// Allocates the new heap allocation
			MemoryAllocation created = new MemoryAllocation(sliceOfBytes, expr.getCodeLocation(), new Annotations(), true);
			AnalysisState<A, H, V, T> allocState = state.smallStepSemantics(created, this);

			AnalysisState<A, H, V, T> result = state.bottom();
			for (SymbolicExpression allocId : allocState.getComputedExpressions()) {
				HeapReference ref = new HeapReference(new ReferenceType(sliceOfBytes), allocId, expr.getCodeLocation());
				HeapDereference deref = new HeapDereference(sliceOfBytes, ref, expr.getCodeLocation());
				AnalysisState<A, H, V, T> asg = allocState.bottom();
				
				// Retrieves all the identifiers reachable from expr
				Collection<SymbolicExpression> reachableIds = HeapResolver.resolve(allocState, expr, this);
				for (SymbolicExpression id : reachableIds) {
					HeapDereference derefId = new HeapDereference(Untyped.INSTANCE, id, expr.getCodeLocation());
					it.unive.lisa.symbolic.value.UnaryExpression unary = new it.unive.lisa.symbolic.value.UnaryExpression(Untyped.INSTANCE, derefId, JSONMarshalOperator.INSTANCE, getLocation());
					asg = asg.lub(allocState.assign(deref, unary, original));
				}
				
				result = result.lub(GoTupleExpression.allocateTupleExpression(asg, new Annotations(), this, getLocation(), tupleType, 
						ref,
						new Clean(GoErrorType.INSTANCE, getLocation())
						));
			}

			return result;
		}
	}
}
