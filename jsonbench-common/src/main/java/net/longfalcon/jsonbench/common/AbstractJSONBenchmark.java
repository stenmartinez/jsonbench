package net.longfalcon.jsonbench.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * @author Sten Martinez
 */
public abstract class AbstractJSONBenchmark {

	protected int tweets = 0;
	protected HashSet<String> uniqueUsers = new HashSet<>();

	public abstract void init();

	public abstract void exec();

	protected BufferedReader getJsonFileReader() throws IOException {
		File testFile = new File("files/twitter.json");

		if (testFile.exists() && !testFile.isDirectory()) {
			BufferedReader reader = new BufferedReader(new FileReader(testFile));

			return reader;
		} else {
			throw new IllegalStateException("File " + testFile.getAbsolutePath() + " is invalid" );
		}
	}
}
