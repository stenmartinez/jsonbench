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
	"metadata",
	"created_at",
	"id",
	"id_str",
	"text",
	"source",
	"truncated",
	"in_reply_to_status_id",
	"in_reply_to_status_id_str",
	"in_reply_to_user_id",
	"in_reply_to_user_id_str",
	"in_reply_to_screen_name",
	"user",
	"geo",
	"coordinates",
	"place",
	"contributors",
	"retweet_count",
	"favorite_count",
	"entities",
	"favorited",
	"retweeted",
	"lang"
})
public class Status {
	@JsonProperty("metadata")
	private Metadata metadata;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("id_str")
	private String idStr;
	@JsonProperty("text")
	private String text;
	@JsonProperty("source")
	private String source;
	@JsonProperty("truncated")
	private Boolean truncated;
	@JsonProperty("in_reply_to_status_id")
	private Object inReplyToStatusId;
	@JsonProperty("in_reply_to_status_id_str")
	private Object inReplyToStatusIdStr;
	@JsonProperty("in_reply_to_user_id")
	private Integer inReplyToUserId;
	@JsonProperty("in_reply_to_user_id_str")
	private String inReplyToUserIdStr;
	@JsonProperty("in_reply_to_screen_name")
	private String inReplyToScreenName;
	@JsonProperty("user")
	private User user;
	@JsonProperty("geo")
	private Object geo;
	@JsonProperty("coordinates")
	private Object coordinates;
	@JsonProperty("place")
	private Object place;
	@JsonProperty("contributors")
	private Object contributors;
	@JsonProperty("retweet_count")
	private Integer retweetCount;
	@JsonProperty("favorite_count")
	private Integer favoriteCount;
	@JsonProperty("entities")
	private Entities entities;
	@JsonProperty("favorited")
	private Boolean favorited;
	@JsonProperty("retweeted")
	private Boolean retweeted;
	@JsonProperty("lang")
	private String lang;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("metadata")
	public Metadata getMetadata() {
		return metadata;
	}

	@JsonProperty("metadata")
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("id_str")
	public String getIdStr() {
		return idStr;
	}

	@JsonProperty("id_str")
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("truncated")
	public Boolean getTruncated() {
		return truncated;
	}

	@JsonProperty("truncated")
	public void setTruncated(Boolean truncated) {
		this.truncated = truncated;
	}

	@JsonProperty("in_reply_to_status_id")
	public Object getInReplyToStatusId() {
		return inReplyToStatusId;
	}

	@JsonProperty("in_reply_to_status_id")
	public void setInReplyToStatusId(Object inReplyToStatusId) {
		this.inReplyToStatusId = inReplyToStatusId;
	}

	@JsonProperty("in_reply_to_status_id_str")
	public Object getInReplyToStatusIdStr() {
		return inReplyToStatusIdStr;
	}

	@JsonProperty("in_reply_to_status_id_str")
	public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
		this.inReplyToStatusIdStr = inReplyToStatusIdStr;
	}

	@JsonProperty("in_reply_to_user_id")
	public Integer getInReplyToUserId() {
		return inReplyToUserId;
	}

	@JsonProperty("in_reply_to_user_id")
	public void setInReplyToUserId(Integer inReplyToUserId) {
		this.inReplyToUserId = inReplyToUserId;
	}

	@JsonProperty("in_reply_to_user_id_str")
	public String getInReplyToUserIdStr() {
		return inReplyToUserIdStr;
	}

	@JsonProperty("in_reply_to_user_id_str")
	public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
		this.inReplyToUserIdStr = inReplyToUserIdStr;
	}

	@JsonProperty("in_reply_to_screen_name")
	public String getInReplyToScreenName() {
		return inReplyToScreenName;
	}

	@JsonProperty("in_reply_to_screen_name")
	public void setInReplyToScreenName(String inReplyToScreenName) {
		this.inReplyToScreenName = inReplyToScreenName;
	}

	@JsonProperty("user")
	public User getUser() {
		return user;
	}

	@JsonProperty("user")
	public void setUser(User user) {
		this.user = user;
	}

	@JsonProperty("geo")
	public Object getGeo() {
		return geo;
	}

	@JsonProperty("geo")
	public void setGeo(Object geo) {
		this.geo = geo;
	}

	@JsonProperty("coordinates")
	public Object getCoordinates() {
		return coordinates;
	}

	@JsonProperty("coordinates")
	public void setCoordinates(Object coordinates) {
		this.coordinates = coordinates;
	}

	@JsonProperty("place")
	public Object getPlace() {
		return place;
	}

	@JsonProperty("place")
	public void setPlace(Object place) {
		this.place = place;
	}

	@JsonProperty("contributors")
	public Object getContributors() {
		return contributors;
	}

	@JsonProperty("contributors")
	public void setContributors(Object contributors) {
		this.contributors = contributors;
	}

	@JsonProperty("retweet_count")
	public Integer getRetweetCount() {
		return retweetCount;
	}

	@JsonProperty("retweet_count")
	public void setRetweetCount(Integer retweetCount) {
		this.retweetCount = retweetCount;
	}

	@JsonProperty("favorite_count")
	public Integer getFavoriteCount() {
		return favoriteCount;
	}

	@JsonProperty("favorite_count")
	public void setFavoriteCount(Integer favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	@JsonProperty("entities")
	public Entities getEntities() {
		return entities;
	}

	@JsonProperty("entities")
	public void setEntities(Entities entities) {
		this.entities = entities;
	}

	@JsonProperty("favorited")
	public Boolean getFavorited() {
		return favorited;
	}

	@JsonProperty("favorited")
	public void setFavorited(Boolean favorited) {
		this.favorited = favorited;
	}

	@JsonProperty("retweeted")
	public Boolean getRetweeted() {
		return retweeted;
	}

	@JsonProperty("retweeted")
	public void setRetweeted(Boolean retweeted) {
		this.retweeted = retweeted;
	}

	@JsonProperty("lang")
	public String getLang() {
		return lang;
	}

	@JsonProperty("lang")
	public void setLang(String lang) {
		this.lang = lang;
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
