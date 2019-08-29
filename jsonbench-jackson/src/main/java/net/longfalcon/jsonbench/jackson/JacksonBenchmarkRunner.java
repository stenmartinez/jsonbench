package net.longfalcon.jsonbench.jackson;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

/**
 * @author Sten Martinez
 */
public class JacksonBenchmarkRunner {
	public static void main(String[] args) throws Exception {
		org.openjdk.jmh.Main.main(args);
	}

	@Benchmark
	@Fork(value = 1, warmups = 1)
	@BenchmarkMode(Mode.Throughput)
	public void runBench(JacksonExecutionScope scope) {
		scope.jacksonBenchmark.exec();
	}
}
