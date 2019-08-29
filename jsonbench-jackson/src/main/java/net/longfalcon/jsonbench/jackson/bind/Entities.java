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

/**
 * @author Sten Martinez
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"description",
	"hashtags",
	"symbols",
	"urls",
	"user_mentions"
})
public class Entities {

	@JsonProperty("description")
	private Description description;
	@JsonProperty("hashtags")
	private List<Object> hashtags = null;
	@JsonProperty("symbols")
	private List<Object> symbols = null;
	@JsonProperty("urls")
	private List<Object> urls = null;
	@JsonProperty("user_mentions")
	private List<UserMention> userMentions = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("hashtags")
	public List<Object> getHashtags() {
		return hashtags;
	}

	@JsonProperty("hashtags")
	public void setHashtags(List<Object> hashtags) {
		this.hashtags = hashtags;
	}

	@JsonProperty("symbols")
	public List<Object> getSymbols() {
		return symbols;
	}

	@JsonProperty("symbols")
	public void setSymbols(List<Object> symbols) {
		this.symbols = symbols;
	}

	@JsonProperty("urls")
	public List<Object> getUrls() {
		return urls;
	}

	@JsonProperty("urls")
	public void setUrls(List<Object> urls) {
		this.urls = urls;
	}

	@JsonProperty("user_mentions")
	public List<UserMention> getUserMentions() {
		return userMentions;
	}

	@JsonProperty("user_mentions")
	public void setUserMentions(List<UserMention> userMentions) {
		this.userMentions = userMentions;
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
