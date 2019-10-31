
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
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "UAID",
    "RDSID",
    "CI",
    "MDUFlag",
    "ResidentialFlag",
    "SubAddress",
    "StreetNumber",
    "StreetNumberSuffix",
    "StreetPreDirection",
    "StreetPreType",
    "StreetName",
    "StreetType",
    "StreetDirection",
    "PostalMunicipality",
    "PostalCode",
    "DA",
    "UsedMunicipalityAlias",
    "IsAsserted",
    "IsAssertedSpecified",
    "Score",
    "Coordinates",
    "AddressLine",
    "Municipality",
    "StateProvince",
    "Country"
})
@Component
public class LocationCandidate {

    @JsonProperty("Type")
    private String type;
    @JsonProperty("UAID")
    private String uAID;
    @JsonProperty("RDSID")
    private Integer rDSID;
    @JsonProperty("CI")
    private Double cI;
    @JsonProperty("MDUFlag")
    private Boolean mDUFlag;
    @JsonProperty("ResidentialFlag")
    private Integer residentialFlag;
    @JsonProperty("SubAddress")
    private SubAddress subAddress;
    @JsonProperty("StreetNumber")
    private StreetNumber streetNumber;
    @JsonProperty("StreetNumberSuffix")
    private StreetNumberSuffix streetNumberSuffix;
    @JsonProperty("StreetPreDirection")
    private StreetPreDirection streetPreDirection;
    @JsonProperty("StreetPreType")
    private StreetPreType streetPreType;
    @JsonProperty("StreetName")
    private StreetName streetName;
    @JsonProperty("StreetType")
    private StreetType streetType;
    @JsonProperty("StreetDirection")
    private StreetDirection streetDirection;
    @JsonProperty("PostalMunicipality")
    private PostalMunicipality postalMunicipality;
    @JsonProperty("PostalCode")
    private PostalCode postalCode;
    @JsonProperty("DA")
    private String dA;
    @JsonProperty("UsedMunicipalityAlias")
    private String usedMunicipalityAlias;
    @JsonProperty("IsAsserted")
    private Boolean isAsserted;
    @JsonProperty("IsAssertedSpecified")
    private Boolean isAssertedSpecified;
    @JsonProperty("Score")
    private Double score;
    @JsonProperty("Coordinates")
    private List<Coordinate> coordinates = new ArrayList<Coordinate>();
    @JsonProperty("AddressLine")
    private String addressLine;
    @JsonProperty("Municipality")
    private Municipality municipality;
    @JsonProperty("StateProvince")
    private StateProvince stateProvince;
    @JsonProperty("Country")
    private Country country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    public LocationCandidate withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("UAID")
    public String getUAID() {
        return uAID;
    }

    @JsonProperty("UAID")
    public void setUAID(String uAID) {
        this.uAID = uAID;
    }

    public LocationCandidate withUAID(String uAID) {
        this.uAID = uAID;
        return this;
    }

    @JsonProperty("RDSID")
    public Integer getRDSID() {
        return rDSID;
    }

    @JsonProperty("RDSID")
    public void setRDSID(Integer rDSID) {
        this.rDSID = rDSID;
    }

    public LocationCandidate withRDSID(Integer rDSID) {
        this.rDSID = rDSID;
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

    public LocationCandidate withCI(Double cI) {
        this.cI = cI;
        return this;
    }

    @JsonProperty("MDUFlag")
    public Boolean getMDUFlag() {
        return mDUFlag;
    }

    @JsonProperty("MDUFlag")
    public void setMDUFlag(Boolean mDUFlag) {
        this.mDUFlag = mDUFlag;
    }

    public LocationCandidate withMDUFlag(Boolean mDUFlag) {
        this.mDUFlag = mDUFlag;
        return this;
    }

    @JsonProperty("ResidentialFlag")
    public Integer getResidentialFlag() {
        return residentialFlag;
    }

    @JsonProperty("ResidentialFlag")
    public void setResidentialFlag(Integer residentialFlag) {
        this.residentialFlag = residentialFlag;
    }

    public LocationCandidate withResidentialFlag(Integer residentialFlag) {
        this.residentialFlag = residentialFlag;
        return this;
    }

    @JsonProperty("SubAddress")
    public SubAddress getSubAddress() {
        return subAddress;
    }

    @JsonProperty("SubAddress")
    public void setSubAddress(SubAddress subAddress) {
        this.subAddress = subAddress;
    }

    public LocationCandidate withSubAddress(SubAddress subAddress) {
        this.subAddress = subAddress;
        return this;
    }

    @JsonProperty("StreetNumber")
    public StreetNumber getStreetNumber() {
        return streetNumber;
    }

    @JsonProperty("StreetNumber")
    public void setStreetNumber(StreetNumber streetNumber) {
        this.streetNumber = streetNumber;
    }

    public LocationCandidate withStreetNumber(StreetNumber streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    @JsonProperty("StreetNumberSuffix")
    public StreetNumberSuffix getStreetNumberSuffix() {
        return streetNumberSuffix;
    }

    @JsonProperty("StreetNumberSuffix")
    public void setStreetNumberSuffix(StreetNumberSuffix streetNumberSuffix) {
        this.streetNumberSuffix = streetNumberSuffix;
    }

    public LocationCandidate withStreetNumberSuffix(StreetNumberSuffix streetNumberSuffix) {
        this.streetNumberSuffix = streetNumberSuffix;
        return this;
    }

    @JsonProperty("StreetPreDirection")
    public StreetPreDirection getStreetPreDirection() {
        return streetPreDirection;
    }

    @JsonProperty("StreetPreDirection")
    public void setStreetPreDirection(StreetPreDirection streetPreDirection) {
        this.streetPreDirection = streetPreDirection;
    }

    public LocationCandidate withStreetPreDirection(StreetPreDirection streetPreDirection) {
        this.streetPreDirection = streetPreDirection;
        return this;
    }

    @JsonProperty("StreetPreType")
    public StreetPreType getStreetPreType() {
        return streetPreType;
    }

    @JsonProperty("StreetPreType")
    public void setStreetPreType(StreetPreType streetPreType) {
        this.streetPreType = streetPreType;
    }

    public LocationCandidate withStreetPreType(StreetPreType streetPreType) {
        this.streetPreType = streetPreType;
        return this;
    }

    @JsonProperty("StreetName")
    public StreetName getStreetName() {
        return streetName;
    }

    @JsonProperty("StreetName")
    public void setStreetName(StreetName streetName) {
        this.streetName = streetName;
    }

    public LocationCandidate withStreetName(StreetName streetName) {
        this.streetName = streetName;
        return this;
    }

    @JsonProperty("StreetType")
    public StreetType getStreetType() {
        return streetType;
    }

    @JsonProperty("StreetType")
    public void setStreetType(StreetType streetType) {
        this.streetType = streetType;
    }

    public LocationCandidate withStreetType(StreetType streetType) {
        this.streetType = streetType;
        return this;
    }

    @JsonProperty("StreetDirection")
    public StreetDirection getStreetDirection() {
        return streetDirection;
    }

    @JsonProperty("StreetDirection")
    public void setStreetDirection(StreetDirection streetDirection) {
        this.streetDirection = streetDirection;
    }

    public LocationCandidate withStreetDirection(StreetDirection streetDirection) {
        this.streetDirection = streetDirection;
        return this;
    }

    @JsonProperty("PostalMunicipality")
    public PostalMunicipality getPostalMunicipality() {
        return postalMunicipality;
    }

    @JsonProperty("PostalMunicipality")
    public void setPostalMunicipality(PostalMunicipality postalMunicipality) {
        this.postalMunicipality = postalMunicipality;
    }

    public LocationCandidate withPostalMunicipality(PostalMunicipality postalMunicipality) {
        this.postalMunicipality = postalMunicipality;
        return this;
    }

    @JsonProperty("PostalCode")
    public PostalCode getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

    public LocationCandidate withPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @JsonProperty("DA")
    public String getDA() {
        return dA;
    }

    @JsonProperty("DA")
    public void setDA(String dA) {
        this.dA = dA;
    }

    public LocationCandidate withDA(String dA) {
        this.dA = dA;
        return this;
    }

    @JsonProperty("UsedMunicipalityAlias")
    public String getUsedMunicipalityAlias() {
        return usedMunicipalityAlias;
    }

    @JsonProperty("UsedMunicipalityAlias")
    public void setUsedMunicipalityAlias(String usedMunicipalityAlias) {
        this.usedMunicipalityAlias = usedMunicipalityAlias;
    }

    public LocationCandidate withUsedMunicipalityAlias(String usedMunicipalityAlias) {
        this.usedMunicipalityAlias = usedMunicipalityAlias;
        return this;
    }

    @JsonProperty("IsAsserted")
    public Boolean getIsAsserted() {
        return isAsserted;
    }

    @JsonProperty("IsAsserted")
    public void setIsAsserted(Boolean isAsserted) {
        this.isAsserted = isAsserted;
    }

    public LocationCandidate withIsAsserted(Boolean isAsserted) {
        this.isAsserted = isAsserted;
        return this;
    }

    @JsonProperty("IsAssertedSpecified")
    public Boolean getIsAssertedSpecified() {
        return isAssertedSpecified;
    }

    @JsonProperty("IsAssertedSpecified")
    public void setIsAssertedSpecified(Boolean isAssertedSpecified) {
        this.isAssertedSpecified = isAssertedSpecified;
    }

    public LocationCandidate withIsAssertedSpecified(Boolean isAssertedSpecified) {
        this.isAssertedSpecified = isAssertedSpecified;
        return this;
    }

    @JsonProperty("Score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("Score")
    public void setScore(Double score) {
        this.score = score;
    }

    public LocationCandidate withScore(Double score) {
        this.score = score;
        return this;
    }

    @JsonProperty("Coordinates")
    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    @JsonProperty("Coordinates")
    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public LocationCandidate withCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @JsonProperty("AddressLine")
    public String getAddressLine() {
        return addressLine;
    }

    @JsonProperty("AddressLine")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public LocationCandidate withAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    @JsonProperty("Municipality")
    public Municipality getMunicipality() {
        return municipality;
    }

    @JsonProperty("Municipality")
    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

    public LocationCandidate withMunicipality(Municipality municipality) {
        this.municipality = municipality;
        return this;
    }

    @JsonProperty("StateProvince")
    public StateProvince getStateProvince() {
        return stateProvince;
    }

    @JsonProperty("StateProvince")
    public void setStateProvince(StateProvince stateProvince) {
        this.stateProvince = stateProvince;
    }

    public LocationCandidate withStateProvince(StateProvince stateProvince) {
        this.stateProvince = stateProvince;
        return this;
    }

    @JsonProperty("Country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(Country country) {
        this.country = country;
    }

    public LocationCandidate withCountry(Country country) {
        this.country = country;
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

    public LocationCandidate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(uAID).append(rDSID).append(cI).append(mDUFlag).append(residentialFlag).append(subAddress).append(streetNumber).append(streetNumberSuffix).append(streetPreDirection).append(streetPreType).append(streetName).append(streetType).append(streetDirection).append(postalMunicipality).append(postalCode).append(dA).append(usedMunicipalityAlias).append(isAsserted).append(isAssertedSpecified).append(score).append(coordinates).append(addressLine).append(municipality).append(stateProvince).append(country).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationCandidate) == false) {
            return false;
        }
        LocationCandidate rhs = ((LocationCandidate) other);
        return new EqualsBuilder().append(type, rhs.type).append(uAID, rhs.uAID).append(rDSID, rhs.rDSID).append(cI, rhs.cI).append(mDUFlag, rhs.mDUFlag).append(residentialFlag, rhs.residentialFlag).append(subAddress, rhs.subAddress).append(streetNumber, rhs.streetNumber).append(streetNumberSuffix, rhs.streetNumberSuffix).append(streetPreDirection, rhs.streetPreDirection).append(streetPreType, rhs.streetPreType).append(streetName, rhs.streetName).append(streetType, rhs.streetType).append(streetDirection, rhs.streetDirection).append(postalMunicipality, rhs.postalMunicipality).append(postalCode, rhs.postalCode).append(dA, rhs.dA).append(usedMunicipalityAlias, rhs.usedMunicipalityAlias).append(isAsserted, rhs.isAsserted).append(isAssertedSpecified, rhs.isAssertedSpecified).append(score, rhs.score).append(coordinates, rhs.coordinates).append(addressLine, rhs.addressLine).append(municipality, rhs.municipality).append(stateProvince, rhs.stateProvince).append(country, rhs.country).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
