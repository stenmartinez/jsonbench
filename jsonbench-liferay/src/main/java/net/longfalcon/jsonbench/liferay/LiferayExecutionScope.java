package net.longfalcon.jsonbench.liferay;

import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

/**
 * @author Sten Martinez
 */
@State(Scope.Benchmark)
public class LiferayExecutionScope {

	public JSONFactoryBench jsonFactoryBench;

	@Setup(Level.Invocation)
	public void setup() {
		jsonFactoryBench = new JSONFactoryBench();
		jsonFactoryBench.init();
	}
}
