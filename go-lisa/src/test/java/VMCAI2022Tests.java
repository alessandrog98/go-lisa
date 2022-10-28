import static it.unive.lisa.LiSAFactory.getDefaultFor;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import it.unive.golisa.analysis.composition.RelTarsis;
import it.unive.golisa.frontend.GoFrontEnd;
import it.unive.lisa.AnalysisException;
import it.unive.lisa.AnalysisSetupException;
import it.unive.lisa.LiSA;
import it.unive.lisa.LiSAConfiguration;
import it.unive.lisa.analysis.AbstractState;
import it.unive.lisa.analysis.heap.HeapDomain;
import it.unive.lisa.analysis.types.InferredTypes;
import it.unive.lisa.interprocedural.ContextBasedAnalysis;
import it.unive.lisa.interprocedural.RecursionFreeToken;
import it.unive.lisa.interprocedural.callgraph.RTACallGraph;
import it.unive.lisa.program.Program;

@Ignore
public class VMCAI2022Tests {
	private String tmpDir = "go-outputs/vmcai2022";
	private String sourcePath = "go-testcases/vmcai2022/";

	@Test
	public void codotaTest() throws IOException, AnalysisSetupException {
		Program program = GoFrontEnd.processFile(sourcePath + "codota.go");

		LiSAConfiguration conf = new LiSAConfiguration();
		conf.setJsonOutput(true)

				.setAbstractState(getDefaultFor(AbstractState.class, getDefaultFor(HeapDomain.class), new RelTarsis(),
						new InferredTypes()))
				.setSerializeResults(true)
				.setCallGraph(new RTACallGraph())
				.setInterproceduralAnalysis(new ContextBasedAnalysis<>(RecursionFreeToken.getSingleton()))
				.setWorkdir(tmpDir);

		LiSA lisa = new LiSA(conf);
		try {
			lisa.run(program);
		} catch (AnalysisException e) {
			System.err.println(e);
			fail("Analysis terminated with errors");
		}
	}

	@Test
	public void commonLangTest() throws IOException, AnalysisSetupException {
		Program program = GoFrontEnd.processFile(sourcePath + "common-lang.go");

		LiSAConfiguration conf = new LiSAConfiguration();
		conf.setJsonOutput(true)

				.setAbstractState(getDefaultFor(AbstractState.class, getDefaultFor(HeapDomain.class), new RelTarsis(),
						new InferredTypes()))
				.setSerializeResults(true)
				.setWorkdir(tmpDir);

		LiSA lisa = new LiSA(conf);
		try {
			lisa.run(program);
		} catch (AnalysisException e) {
			System.err.println(e);
			fail("Analysis terminated with errors");
		}
	}

	@Test
	public void icalpTestCases() throws IOException, AnalysisSetupException {
		Program program = GoFrontEnd.processFile(sourcePath + "vmcai2022-testcases.go");

		LiSAConfiguration conf = new LiSAConfiguration();
		conf.setJsonOutput(true)
				.setAbstractState(getDefaultFor(AbstractState.class, getDefaultFor(HeapDomain.class), new RelTarsis(),
						new InferredTypes()))
				.setSerializeResults(true)
				.setWorkdir(tmpDir);

		LiSA lisa = new LiSA(conf);
		try {
			lisa.run(program);
		} catch (AnalysisException e) {
			System.err.println(e);
			fail("Analysis terminated with errors");
		}
	}
}
