package it.eng.opsi.service.connector.beans;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"outputId",
"title",
"type",
"language",
"description",
"content",
"contentType"
})
@Generated("jsonschema2pojo")
public class OutBean implements Serializable
{

/**
* 
* (Required)
*
*/
@JsonProperty("outputId")
private String outputId;
/**
*
* (Required)
*
*/
@JsonProperty("title")
private String title;
/**
*
* (Required)
*
*/
@JsonProperty("type")
private String type;
/**
*
* (Required)
*
*/
@JsonProperty("language")
private String language;
/**
*
* (Required)
*
*/
@JsonProperty("description")
private String description;
/**
*
* (Required)
*
*/
@JsonProperty("content")
private byte[] content;
/**
*
* (Required)
*
*/
@JsonProperty("contentType")
private String contentType;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
private final static long serialVersionUID = 970191780616960470L;

/**
*
* (Required)
*
*/
@JsonProperty("outputId")
public String getOutputId() {
return outputId;
}

/**
*
* (Required)
*
*/
@JsonProperty("outputId")
public void setOutputId(String outputId) {
this.outputId = outputId;
}

/**
*
* (Required)
*
*/
@JsonProperty("title")
public String getTitle() {
return title;
}

/**
*
* (Required)
*
*/
@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

/**
*
* (Required)
*
*/
@JsonProperty("type")
public String getType() {
return type;
}

/**
*
* (Required)
*
*/
@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

/**
*
* (Required)
*
*/
@JsonProperty("language")
public String getLanguage() {
return language;
}

/**
*
* (Required)
*
*/
@JsonProperty("language")
public void setLanguage(String language) {
this.language = language;
}

/**
*
* (Required)
*
*/
@JsonProperty("description")
public String getDescription() {
return description;
}

/**
*
* (Required)
*
*/
@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

/**
*
* (Required)
*
*/
@JsonProperty("content")
public byte[] getContent() {
return content;
}

/**
*
* (Required)
*
*/
@JsonProperty("content")
public void setContent(byte[] content) {
this.content = content;
}

/**
*
* (Required)
*
*/
@JsonProperty("contentType")
public String getContentType() {
return contentType;
}

/**
*
* (Required)
*
*/
@JsonProperty("contentType")
public void setContentType(String contentType) {
this.contentType = contentType;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(OutBean.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("outputId");
sb.append('=');
sb.append(((this.outputId == null)?"<null>":this.outputId));
sb.append(',');
sb.append("title");
sb.append('=');
sb.append(((this.title == null)?"<null>":this.title));
sb.append(',');
sb.append("type");
sb.append('=');
sb.append(((this.type == null)?"<null>":this.type));
sb.append(',');
sb.append("language");
sb.append('=');
sb.append(((this.language == null)?"<null>":this.language));
sb.append(',');
sb.append("description");
sb.append('=');
sb.append(((this.description == null)?"<null>":this.description));
sb.append(',');
sb.append("content");
sb.append('=');
sb.append(((this.content == null)?"<null>":this.content));
sb.append(',');
sb.append("contentType");
sb.append('=');
sb.append(((this.contentType == null)?"<null>":this.contentType));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

@Override
public int hashCode() {
int result = 1;
result = ((result* 31)+((this.outputId == null)? 0 :this.outputId.hashCode()));
result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
return result;
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof OutBean) == false) {
return false;
}
OutBean rhs = ((OutBean) other);
return (((((((((this.outputId == rhs.outputId)||((this.outputId!= null)&&this.outputId.equals(rhs.outputId)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))));
}

}
