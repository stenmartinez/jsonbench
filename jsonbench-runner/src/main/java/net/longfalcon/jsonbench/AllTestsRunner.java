package net.longfalcon.jsonbench;

import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import net.longfalcon.jsonbench.gson.GsonBenchmarkRunner;
import net.longfalcon.jsonbench.jackson.JacksonBenchmarkRunner;
import net.longfalcon.jsonbench.liferay.LiferayBenchmarkRunner;

/**
 * @author Sten Martinez
 */
public class AllTestsRunner {

	public static void main(String[] args) throws RunnerException {
		Options options = new OptionsBuilder()
			.include(LiferayBenchmarkRunner.class.getSimpleName())
			.include(JacksonBenchmarkRunner.class.getSimpleName())
			.include(GsonBenchmarkRunner.class.getSimpleName())
            .addProfiler(GCProfiler.class)
			.build();

		new Runner(options).run();
	}
}
