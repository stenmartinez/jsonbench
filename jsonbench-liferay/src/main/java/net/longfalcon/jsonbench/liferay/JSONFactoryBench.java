package net.longfalcon.jsonbench.liferay;

import com.liferay.portal.json.JSONFactoryImpl;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;

import java.io.BufferedReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.longfalcon.jsonbench.common.AbstractJSONBenchmark;

/**
 * @author Sten Martinez
 */
public class JSONFactoryBench extends AbstractJSONBenchmark {

	private JSONFactory jsonFactory;

	private static final Logger LOGGER = LoggerFactory.getLogger(JSONFactoryBench.class);

	public static void main(String[] args) {
		JSONFactoryBench bench = new JSONFactoryBench();
		bench.init();
		bench.exec();

	}

	public void init() {
		jsonFactory = new JSONFactoryImpl();
	}

	public void exec() {

		try {
			JSONObject jsonObject = getJSONObject();
			parse(jsonObject);
		}
		catch (Exception e) {
			LOGGER.error(e.toString(), e);
		}

		LOGGER.debug("Total tweets: {}", tweets);
		LOGGER.debug("Unique Users: {}", uniqueUsers.size());
	}

	private JSONObject getJSONObject() throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader reader = getJsonFileReader();

		String line;
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
		}

		return jsonFactory.createJSONObject(stringBuilder.toString());
	}

	private void parse(JSONObject jsonObject) {
		JSONArray statusArray = jsonObject.getJSONArray("statuses");
		for (int i = 0; i < statusArray.length(); i++) {
			JSONObject object = statusArray.getJSONObject(i);
			this.tweets++;

			JSONObject userObject = object.getJSONObject("user");
			String userString = userObject.getString("id_str");
			this.uniqueUsers.add(userString);
		}
	}
}
