package net.longfalcon.jsonbench.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
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
		URL testFile = AbstractJSONBenchmark.class.getResource("twitter.json");

		try {
			return new BufferedReader(new InputStreamReader(testFile.openStream()));
		} catch (Exception e) {
			throw new IllegalStateException("File " + testFile.getFile() + " is invalid" );
		}
	}
}
