package net.longfalcon.jsonbench.jackson.bind;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"urls"
})
public class Description {

	@JsonProperty("urls")
	private List<Object> urls = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("urls")
	public List<Object> getUrls() {
		return urls;
	}

	@JsonProperty("urls")
	public void setUrls(List<Object> urls) {
		this.urls = urls;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
