package it.unive.golisa.cfg.runtime.bytes.type;

import it.unive.golisa.cfg.runtime.bytes.function.Bytes;
import it.unive.golisa.cfg.type.composite.GoStructType;
import it.unive.golisa.golang.util.GoLangUtils;
import it.unive.lisa.program.ClassUnit;
import it.unive.lisa.program.CompilationUnit;
import it.unive.lisa.program.Program;
import it.unive.lisa.type.Type;
import it.unive.lisa.type.Untyped;

/**
 * A Duration represents the elapsed time between two instants as an int64
 * nanosecond count. The representation limits the largest representable
 * duration to approximately 290 years.
 * 
 * @link https://pkg.go.dev/time#Duration type Duration int64
 * 
 * @author <a href="mailto:vincenzo.arceri@unipr.it">Vincenzo Arceri</a>
 */
public class Buffer extends GoStructType {

	/**
	 * Unique instance of the Buffer type.
	 */
	private static Buffer INSTANCE;

	private Buffer(String name, CompilationUnit unit) {
		super(name, unit);
	}

	@Override
	public boolean canBeAssignedTo(Type other) {
		return other instanceof Buffer || other.isUntyped();
	}

	@Override
	public Type commonSupertype(Type other) {
		if (other instanceof Buffer || other.isUntyped())
			return other;
		return Untyped.INSTANCE;
	}

	@Override
	public String toString() {
		return "bytes.Buffer";
	}

	@Override
	public boolean equals(Object other) {
		return this == other;
	}

	@Override
	public int hashCode() {
		return System.identityHashCode(this);
	}

	/**
	 * Yields the {@link Buffer} type.
	 * 
	 * @param program the program to which this type belongs
	 * 
	 * @return the {@link Buffer} type
	 */
	public static Buffer getBufferType(Program program) {
		if (INSTANCE == null) {
			ClassUnit bufferUnit = new ClassUnit(GoLangUtils.GO_RUNTIME_SOURCECODE_LOCATION, program, "Buffer", false);
			INSTANCE = new Buffer("Buffer", bufferUnit);
			return INSTANCE;
		}

		return INSTANCE;
	}

	/**
	 * Registers the methods of Buffer type.
	 */
	public static void registerMethods() {
		CompilationUnit bufferUnit = INSTANCE.getUnit();
		bufferUnit.addInstanceCodeMember(new Bytes(GoLangUtils.GO_RUNTIME_SOURCECODE_LOCATION, bufferUnit));
	}
}
