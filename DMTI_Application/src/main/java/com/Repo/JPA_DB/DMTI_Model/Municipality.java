
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
    "ChangeFlag",
    "ChangeFlagSpecified",
    "Value"
})
public class Municipality {

    @JsonProperty("ChangeFlag")
    private Integer changeFlag;
    @JsonProperty("ChangeFlagSpecified")
    private Boolean changeFlagSpecified;
    @JsonProperty("Value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ChangeFlag")
    public Integer getChangeFlag() {
        return changeFlag;
    }

    @JsonProperty("ChangeFlag")
    public void setChangeFlag(Integer changeFlag) {
        this.changeFlag = changeFlag;
    }

    public Municipality withChangeFlag(Integer changeFlag) {
        this.changeFlag = changeFlag;
        return this;
    }

    @JsonProperty("ChangeFlagSpecified")
    public Boolean getChangeFlagSpecified() {
        return changeFlagSpecified;
    }

    @JsonProperty("ChangeFlagSpecified")
    public void setChangeFlagSpecified(Boolean changeFlagSpecified) {
        this.changeFlagSpecified = changeFlagSpecified;
    }

    public Municipality withChangeFlagSpecified(Boolean changeFlagSpecified) {
        this.changeFlagSpecified = changeFlagSpecified;
        return this;
    }

    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    public Municipality withValue(String value) {
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

    public Municipality withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(changeFlag).append(changeFlagSpecified).append(value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Municipality) == false) {
            return false;
        }
        Municipality rhs = ((Municipality) other);
        return new EqualsBuilder().append(changeFlag, rhs.changeFlag).append(changeFlagSpecified, rhs.changeFlagSpecified).append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
