package net.longfalcon.jsonbench.jackson;

import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

/**
 * @author Sten Martinez
 */
@State(Scope.Benchmark)
public class JacksonExecutionScope {
	public JacksonBenchmark jacksonBenchmark;

	@Setup(Level.Invocation)
	public void setup() {
		jacksonBenchmark = new JacksonBenchmark();
		jacksonBenchmark.init();
	}
}
