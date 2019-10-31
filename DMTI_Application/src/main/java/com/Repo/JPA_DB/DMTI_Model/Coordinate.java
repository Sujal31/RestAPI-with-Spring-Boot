
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
    "Lat",
    "Lon",
    "CoordinateType",
    "AddressPointType",
    "AddressPointTypeSpecified",
    "LegacyPDC",
    "PMC",
    "PDC"
})
public class Coordinate {

    @JsonProperty("Lat")
    private Double lat;
    @JsonProperty("Lon")
    private Double lon;
    @JsonProperty("CoordinateType")
    private Integer coordinateType;
    @JsonProperty("AddressPointType")
    private Integer addressPointType;
    @JsonProperty("AddressPointTypeSpecified")
    private Boolean addressPointTypeSpecified;
    @JsonProperty("LegacyPDC")
    private Integer legacyPDC;
    @JsonProperty("PMC")
    private Integer pMC;
    @JsonProperty("PDC")
    private Integer pDC;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("Lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Coordinate withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    @JsonProperty("Lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("Lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Coordinate withLon(Double lon) {
        this.lon = lon;
        return this;
    }

    @JsonProperty("CoordinateType")
    public Integer getCoordinateType() {
        return coordinateType;
    }

    @JsonProperty("CoordinateType")
    public void setCoordinateType(Integer coordinateType) {
        this.coordinateType = coordinateType;
    }

    public Coordinate withCoordinateType(Integer coordinateType) {
        this.coordinateType = coordinateType;
        return this;
    }

    @JsonProperty("AddressPointType")
    public Integer getAddressPointType() {
        return addressPointType;
    }

    @JsonProperty("AddressPointType")
    public void setAddressPointType(Integer addressPointType) {
        this.addressPointType = addressPointType;
    }

    public Coordinate withAddressPointType(Integer addressPointType) {
        this.addressPointType = addressPointType;
        return this;
    }

    @JsonProperty("AddressPointTypeSpecified")
    public Boolean getAddressPointTypeSpecified() {
        return addressPointTypeSpecified;
    }

    @JsonProperty("AddressPointTypeSpecified")
    public void setAddressPointTypeSpecified(Boolean addressPointTypeSpecified) {
        this.addressPointTypeSpecified = addressPointTypeSpecified;
    }

    public Coordinate withAddressPointTypeSpecified(Boolean addressPointTypeSpecified) {
        this.addressPointTypeSpecified = addressPointTypeSpecified;
        return this;
    }

    @JsonProperty("LegacyPDC")
    public Integer getLegacyPDC() {
        return legacyPDC;
    }

    @JsonProperty("LegacyPDC")
    public void setLegacyPDC(Integer legacyPDC) {
        this.legacyPDC = legacyPDC;
    }

    public Coordinate withLegacyPDC(Integer legacyPDC) {
        this.legacyPDC = legacyPDC;
        return this;
    }

    @JsonProperty("PMC")
    public Integer getPMC() {
        return pMC;
    }

    @JsonProperty("PMC")
    public void setPMC(Integer pMC) {
        this.pMC = pMC;
    }

    public Coordinate withPMC(Integer pMC) {
        this.pMC = pMC;
        return this;
    }

    @JsonProperty("PDC")
    public Integer getPDC() {
        return pDC;
    }

    @JsonProperty("PDC")
    public void setPDC(Integer pDC) {
        this.pDC = pDC;
    }

    public Coordinate withPDC(Integer pDC) {
        this.pDC = pDC;
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

    public Coordinate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lat).append(lon).append(coordinateType).append(addressPointType).append(addressPointTypeSpecified).append(legacyPDC).append(pMC).append(pDC).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Coordinate) == false) {
            return false;
        }
        Coordinate rhs = ((Coordinate) other);
        return new EqualsBuilder().append(lat, rhs.lat).append(lon, rhs.lon).append(coordinateType, rhs.coordinateType).append(addressPointType, rhs.addressPointType).append(addressPointTypeSpecified, rhs.addressPointTypeSpecified).append(legacyPDC, rhs.legacyPDC).append(pMC, rhs.pMC).append(pDC, rhs.pDC).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
