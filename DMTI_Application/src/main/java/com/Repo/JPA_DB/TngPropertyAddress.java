package com.Repo.JPA_DB;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="tng_property_address")
@NamedQuery(name="TngPropertyAddress.findAll", query="SELECT t FROM TngPropertyAddress t")
public class TngPropertyAddress implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@EmbeddedId	
	private TngPropertyAddressPK id;

	private String address;

	private String city;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="dmti_maf_id")
	private int dmtiMafId;

	@Column(name="dmti_rds_id")
	private int dmtiRdsId;

	private Timestamp last_updated;

	private BigDecimal latitude;

	private BigDecimal longitude;

	@Column(name="multi_dwelling_unit")
	private int multiDwellingUnit;

	@Column(name="nas_pauid")
	private String nasPauid;

	@Column(name="nas_property_address_id")
	private int nasPropertyAddressId;

	@Column(name="position_determination_code")
	private int positionDeterminationCode;

	@Column(name="postal_code")
	private String postalCode;

	@Column(name="primary_use")
	private int primaryUse;

	private String province;

	@Column(name="street_direction")
	private String streetDirection;

	@Column(name="street_name")
	private String streetName;

	@Column(name="street_num_suffix")
	private String streetNumSuffix;

	@Column(name="street_number")
	private int streetNumber;

	@Column(name="street_pre_direction")
	private String streetPreDirection;

	@Column(name="street_pre_type")
	private String streetPreType;

	@Column(name="street_type")
	private String streetType;

	@Column(name="unit_corroborative_index")
	private int unitCorroborativeIndex;

	@Column(name="unit_number")
	private String unitNumber;

	@Column(name="unit_type")
	private String unitType;

	public TngPropertyAddress() {
	}

	public TngPropertyAddressPK getId() {
		return this.id;
	}

	public void setId(TngPropertyAddressPK id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getDmtiMafId() {
		return this.dmtiMafId;
	}

	public void setDmtiMafId(int dmtiMafId) {
		this.dmtiMafId = dmtiMafId;
	}

	public int getDmtiRdsId() {
		return this.dmtiRdsId;
	}

	public void setDmtiRdsId(int dmtiRdsId) {
		this.dmtiRdsId = dmtiRdsId;
	}

	public Timestamp getLast_updated() {
		return this.last_updated;
	}

	public void setLast_updated(Timestamp last_updated) {
		this.last_updated = last_updated;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public int getMultiDwellingUnit() {
		return this.multiDwellingUnit;
	}

	public void setMultiDwellingUnit(int multiDwellingUnit) {
		this.multiDwellingUnit = multiDwellingUnit;
	}

	public String getNasPauid() {
		return this.nasPauid;
	}

	public void setNasPauid(String nasPauid) {
		this.nasPauid = nasPauid;
	}

	public int getNasPropertyAddressId() {
		return this.nasPropertyAddressId;
	}

	public void setNasPropertyAddressId(int nasPropertyAddressId) {
		this.nasPropertyAddressId = nasPropertyAddressId;
	}

	public int getPositionDeterminationCode() {
		return this.positionDeterminationCode;
	}

	public void setPositionDeterminationCode(int positionDeterminationCode) {
		this.positionDeterminationCode = positionDeterminationCode;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getPrimaryUse() {
		return this.primaryUse;
	}

	public void setPrimaryUse(int primaryUse) {
		this.primaryUse = primaryUse;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreetDirection() {
		return this.streetDirection;
	}

	public void setStreetDirection(String streetDirection) {
		this.streetDirection = streetDirection;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetNumSuffix() {
		return this.streetNumSuffix;
	}

	public void setStreetNumSuffix(String streetNumSuffix) {
		this.streetNumSuffix = streetNumSuffix;
	}

	public int getStreetNumber() {
		return this.streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetPreDirection() {
		return this.streetPreDirection;
	}

	public void setStreetPreDirection(String streetPreDirection) {
		this.streetPreDirection = streetPreDirection;
	}

	public String getStreetPreType() {
		return this.streetPreType;
	}

	public void setStreetPreType(String streetPreType) {
		this.streetPreType = streetPreType;
	}

	public String getStreetType() {
		return this.streetType;
	}

	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}

	public int getUnitCorroborativeIndex() {
		return this.unitCorroborativeIndex;
	}

	public void setUnitCorroborativeIndex(int unitCorroborativeIndex) {
		this.unitCorroborativeIndex = unitCorroborativeIndex;
	}

	public String getUnitNumber() {
		return this.unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getUnitType() {
		return this.unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}



}
