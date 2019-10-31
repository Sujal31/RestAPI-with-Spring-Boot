
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
    "UUAID",
    "CI",
    "SubAddressType",
    "SubAddressName",
    "SubAddressNumber",
    "IsInferred",
    "IsInferredSpecified"
})
public class SubAddress {

    @JsonProperty("UUAID")
    private String uUAID;
    @JsonProperty("CI")
    private Double cI;
    @JsonProperty("SubAddressType")
    private SubAddressType subAddressType;
    @JsonProperty("SubAddressName")
    private Object subAddressName;
    @JsonProperty("SubAddressNumber")
    private SubAddressNumber subAddressNumber;
    @JsonProperty("IsInferred")
    private Boolean isInferred;
    @JsonProperty("IsInferredSpecified")
    private Boolean isInferredSpecified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("UUAID")
    public String getUUAID() {
        return uUAID;
    }

    @JsonProperty("UUAID")
    public void setUUAID(String uUAID) {
        this.uUAID = uUAID;
    }

    public SubAddress withUUAID(String uUAID) {
        this.uUAID = uUAID;
        return this;
    }

    @JsonProperty("CI")
    public Double getCI() {
        return cI;
    }

    @JsonProperty("CI")
    public void setCI(Double cI) {
        this.cI = cI;
    }

    public SubAddress withCI(Double cI) {
        this.cI = cI;
        return this;
    }

    @JsonProperty("SubAddressType")
    public SubAddressType getSubAddressType() {
        return subAddressType;
    }

    @JsonProperty("SubAddressType")
    public void setSubAddressType(SubAddressType subAddressType) {
        this.subAddressType = subAddressType;
    }

    public SubAddress withSubAddressType(SubAddressType subAddressType) {
        this.subAddressType = subAddressType;
        return this;
    }

    @JsonProperty("SubAddressName")
    public Object getSubAddressName() {
        return subAddressName;
    }

    @JsonProperty("SubAddressName")
    public void setSubAddressName(Object subAddressName) {
        this.subAddressName = subAddressName;
    }

    public SubAddress withSubAddressName(Object subAddressName) {
        this.subAddressName = subAddressName;
        return this;
    }

    @JsonProperty("SubAddressNumber")
    public SubAddressNumber getSubAddressNumber() {
        return subAddressNumber;
    }

    @JsonProperty("SubAddressNumber")
    public void setSubAddressNumber(SubAddressNumber subAddressNumber) {
        this.subAddressNumber = subAddressNumber;
    }

    public SubAddress withSubAddressNumber(SubAddressNumber subAddressNumber) {
        this.subAddressNumber = subAddressNumber;
        return this;
    }

    @JsonProperty("IsInferred")
    public Boolean getIsInferred() {
        return isInferred;
    }

    @JsonProperty("IsInferred")
    public void setIsInferred(Boolean isInferred) {
        this.isInferred = isInferred;
    }

    public SubAddress withIsInferred(Boolean isInferred) {
        this.isInferred = isInferred;
        return this;
    }

    @JsonProperty("IsInferredSpecified")
    public Boolean getIsInferredSpecified() {
        return isInferredSpecified;
    }

    @JsonProperty("IsInferredSpecified")
    public void setIsInferredSpecified(Boolean isInferredSpecified) {
        this.isInferredSpecified = isInferredSpecified;
    }

    public SubAddress withIsInferredSpecified(Boolean isInferredSpecified) {
        this.isInferredSpecified = isInferredSpecified;
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

    public SubAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uUAID).append(cI).append(subAddressType).append(subAddressName).append(subAddressNumber).append(isInferred).append(isInferredSpecified).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubAddress) == false) {
            return false;
        }
        SubAddress rhs = ((SubAddress) other);
        return new EqualsBuilder().append(uUAID, rhs.uUAID).append(cI, rhs.cI).append(subAddressType, rhs.subAddressType).append(subAddressName, rhs.subAddressName).append(subAddressNumber, rhs.subAddressNumber).append(isInferred, rhs.isInferred).append(isInferredSpecified, rhs.isInferredSpecified).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
