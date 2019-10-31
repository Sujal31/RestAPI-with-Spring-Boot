
package com.Repo.JPA_DB.DMTI_Model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ChangeFlagSpecified",
    "Value"
})
public class StreetPreDirection {

    @JsonProperty("ChangeFlagSpecified")
    private Boolean changeFlagSpecified;
    @JsonProperty("Value")
    private Object value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ChangeFlagSpecified")
    public Boolean getChangeFlagSpecified() {
        return changeFlagSpecified;
    }

    @JsonProperty("ChangeFlagSpecified")
    public void setChangeFlagSpecified(Boolean changeFlagSpecified) {
        this.changeFlagSpecified = changeFlagSpecified;
    }

    public StreetPreDirection withChangeFlagSpecified(Boolean changeFlagSpecified) {
        this.changeFlagSpecified = changeFlagSpecified;
        return this;
    }

    @JsonProperty("Value")
    public Object getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Object value) {
        this.value = value;
    }

    public StreetPreDirection withValue(Object value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public StreetPreDirection withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(changeFlagSpecified).append(value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreetPreDirection) == false) {
            return false;
        }
        StreetPreDirection rhs = ((StreetPreDirection) other);
        return new EqualsBuilder().append(changeFlagSpecified, rhs.changeFlagSpecified).append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
