package net.longfalcon.jsonbench.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.longfalcon.jsonbench.common.AbstractJSONBenchmark;

/**
 * @author Sten Martinez
 * Tree-map based benchmark
 */
public class JacksonBenchmark extends AbstractJSONBenchmark {
	private ObjectMapper objectMapper;

	private static final Logger LOGGER = LoggerFactory.getLogger(JacksonBenchmark.class);

	public static void main(String[] args) {
		JacksonBenchmark bench = new JacksonBenchmark();
		bench.init();
		bench.exec();

	}

	public void init() {
		objectMapper = new ObjectMapper();
	}

	public void exec() {
		try {
			JsonNode root = objectMapper.readTree(getJsonFileReader());
			parse(root);
		}
		catch (Exception e) {
			LOGGER.error(e.toString(), e);
		}

		LOGGER.debug("Total tweets: {}", tweets);
		LOGGER.debug("Unique Users: {}", uniqueUsers.size());
	}

	private void parse(JsonNode rootNode) throws IOException {

		JsonNode statusArray = rootNode.get("statuses");
		statusArray.forEach(jsonNode -> {
			this.tweets++;

			JsonNode userNode = jsonNode.get("user");
			String userString = userNode.get("id_str").asText();
			this.uniqueUsers.add(userString);
		});
	}
}
