package net.longfalcon.jsonbench.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.longfalcon.jsonbench.common.AbstractJSONBenchmark;

/**
 * @author Sten Martinez
 */
public class GsonBenchmark extends AbstractJSONBenchmark {
	private JsonParser jsonParser;

	private static final Logger LOGGER = LoggerFactory.getLogger(GsonBenchmark.class);

	public static void main(String[] args) {
		GsonBenchmark bench = new GsonBenchmark();
		bench.init();
		bench.exec();

	}

	public void init() {
		jsonParser = new JsonParser();
	}

	public void exec() {
		try {
			JsonElement root = jsonParser.parse(getJsonFileReader());
			parse(root);
		}
		catch (Exception e) {
			LOGGER.error(e.toString(), e);
		}

		LOGGER.debug("Total tweets: {}", tweets);
		LOGGER.debug("Unique Users: {}", uniqueUsers.size());
	}

	private void parse(JsonElement rootElement) throws IOException {

		JsonArray statusArray = rootElement.getAsJsonObject().getAsJsonArray("statuses");
		statusArray.forEach(jsonElement -> {
			this.tweets++;

			JsonObject userObject = jsonElement.getAsJsonObject().getAsJsonObject("user");
			String userString = userObject.get("id_str").getAsString();
			this.uniqueUsers.add(userString);
		});
	}
}
