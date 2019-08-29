package net.longfalcon.jsonbench.jackson.bind;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sten Martinez
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"result_type",
	"iso_language_code"
})
public class Metadata {

	@JsonProperty("result_type")
	private String resultType;
	@JsonProperty("iso_language_code")
	private String isoLanguageCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("result_type")
	public String getResultType() {
		return resultType;
	}

	@JsonProperty("result_type")
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	@JsonProperty("iso_language_code")
	public String getIsoLanguageCode() {
		return isoLanguageCode;
	}

	@JsonProperty("iso_language_code")
	public void setIsoLanguageCode(String isoLanguageCode) {
		this.isoLanguageCode = isoLanguageCode;
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
