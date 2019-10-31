
package com.Repo.JPA_DB.DMTI_Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "InsufficientFlag",
    "LocationCandidates",
    "SequenceId"
})
public class ResponseItem {

    @JsonProperty("InsufficientFlag")
    private Boolean insufficientFlag;
    @JsonProperty("LocationCandidates")
    private List<LocationCandidate> locationCandidates = new ArrayList<LocationCandidate>();
    @JsonProperty("SequenceId")
    private Object sequenceId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("InsufficientFlag")
    public Boolean getInsufficientFlag() {
        return insufficientFlag;
    }

    @JsonProperty("InsufficientFlag")
    public void setInsufficientFlag(Boolean insufficientFlag) {
        this.insufficientFlag = insufficientFlag;
    }

    public ResponseItem withInsufficientFlag(Boolean insufficientFlag) {
        this.insufficientFlag = insufficientFlag;
        return this;
    }

    @JsonProperty("LocationCandidates")
    public List<LocationCandidate> getLocationCandidates() {
        return locationCandidates;
    }

    @JsonProperty("LocationCandidates")
    public void setLocationCandidates(List<LocationCandidate> locationCandidates) {
        this.locationCandidates = locationCandidates;
    }

    public ResponseItem withLocationCandidates(List<LocationCandidate> locationCandidates) {
        this.locationCandidates = locationCandidates;
        return this;
    }

    @JsonProperty("SequenceId")
    public Object getSequenceId() {
        return sequenceId;
    }

    @JsonProperty("SequenceId")
    public void setSequenceId(Object sequenceId) {
        this.sequenceId = sequenceId;
    }

    public ResponseItem withSequenceId(Object sequenceId) {
        this.sequenceId = sequenceId;
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

    public ResponseItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(insufficientFlag).append(locationCandidates).append(sequenceId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseItem) == false) {
            return false;
        }
        ResponseItem rhs = ((ResponseItem) other);
        return new EqualsBuilder().append(insufficientFlag, rhs.insufficientFlag).append(locationCandidates, rhs.locationCandidates).append(sequenceId, rhs.sequenceId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
