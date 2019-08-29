package net.longfalcon.jsonbench.gson;

import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

/**
 * @author Sten Martinez
 */
@State(Scope.Benchmark)
public class GsonExecutionScope {
	public GsonBenchmark gsonBenchmark;

	@Setup(Level.Invocation)
	public void setup() {
		gsonBenchmark = new GsonBenchmark();
		gsonBenchmark.init();
	}
}
