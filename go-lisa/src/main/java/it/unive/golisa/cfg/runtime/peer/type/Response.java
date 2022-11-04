package it.unive.golisa.cfg.runtime.peer.type;

import it.unive.golisa.cfg.type.composite.GoStructType;
import it.unive.golisa.golang.util.GoLangUtils;
import it.unive.lisa.program.ClassUnit;
import it.unive.lisa.program.CompilationUnit;
import it.unive.lisa.program.Program;

/**
 * A Response type.
 * 
 * @link https://pkg.go.dev/github.com/hyperledger/fabric-protos-go/peer#Response
 * 
 * @author <a href="mailto:luca.olivieri@univr.it">Luca Olivieri</a>
 */
public class Response extends GoStructType {

	/**
	 * Unique instance of Response type.
	 */
	private static Response INSTANCE;

	private Response(CompilationUnit unit) {
		super("Response", unit);
	}

	/**
	 * Yields the {@link Response} type.
	 * 
	 * @param program the program to which this type belongs
	 * 
	 * @return the {@link Response} type
	 */
	public static Response getResponseType(Program program) {
		if (INSTANCE == null) {
			ClassUnit randUnit = new ClassUnit(GoLangUtils.GO_RUNTIME_SOURCECODE_LOCATION, program, "Response", false);
			INSTANCE = new Response(randUnit);
		}

		return INSTANCE;
	}

	@Override
	public String toString() {
		return "pb.Response";
	}

	@Override
	public boolean equals(Object other) {
		return this == other;
	}

	@Override
	public int hashCode() {
		return System.identityHashCode(this);
	}
}
