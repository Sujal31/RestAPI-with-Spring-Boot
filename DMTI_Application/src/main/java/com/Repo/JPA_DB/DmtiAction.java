package com.Repo.JPA_DB;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.Repo.JPA_DB.DMTI_Model.LocationCandidate;
import com.Repo.JPA_DB.DMTI_Model.ResponseItem;
import com.mysql.cj.protocol.NetworkResources;

@Component
public class DmtiAction {
	
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date dateobj = new Date();
	java.sql.Timestamp time = new java.sql.Timestamp(System.currentTimeMillis());
	
	
	@Autowired
	DmtiRepo repo;
	LocationCandidate lc ;
	
	
	//Checks the Uaid in local DB and if data is already present it updates or if no data than it inserts 
	public List<TngPropertyAddress> populateAddress(final LocationCandidate locCan) throws JSONException  {
		TngPropertyAddressPK tngpk = new TngPropertyAddressPK() ;
		TngPropertyAddress tng = new TngPropertyAddress() ;
			try {
				
				//System.out.println(locCan.getUAID());
				tngpk.setDmtiUaid(locCan.getUAID());
				if(locCan.getSubAddress().getUUAID()==null) {
					tngpk.setDmtiUuaid("");
				}else {
					tngpk.setDmtiUuaid(locCan.getSubAddress().getUUAID());
				}
				tng.setId(tngpk);
				tng.setAddress(locCan.getAddressLine());
				tng.setCity(locCan.getMunicipality().getValue().toString());
				tng.setCreatedDate(dateobj);
				tng.setDmtiMafId(0);
				tng.setDmtiRdsId(0);
				tng.setLast_updated(time);
				tng.setLatitude(new BigDecimal(locCan.getCoordinates().get(0).getLat()));
				tng.setLongitude(new BigDecimal(locCan.getCoordinates().get(0).getLon()));
				tng.setMultiDwellingUnit(0);
				tng.setNasPauid("");
				tng.setNasPropertyAddressId(0);
				tng.setPositionDeterminationCode(locCan.getCoordinates().get(0).getPDC());
				tng.setPostalCode(locCan.getPostalCode().getValue());
				tng.setPrimaryUse(0);
				tng.setProvince(locCan.getStateProvince().getValue().toString());
				//tng.setStreetDirection(locCan.getStreetDirection().getValue().toString());
				if(locCan.getStreetDirection().getValue()==null) {
					tng.setStreetDirection(null);
				}else {
					tng.setStreetDirection(locCan.getStreetDirection().getValue().toString());
				}
				
				tng.setStreetName(locCan.getStreetName().getValue());
				if(locCan.getStreetNumberSuffix().getValue()==null) {
					tng.setStreetNumSuffix(null);
				}else {
					tng.setStreetNumSuffix(locCan.getStreetNumberSuffix().getValue().toString());
				}
								
				tng.setStreetNumber(locCan.getStreetNumber().getValue());
				
				if(locCan.getStreetPreDirection().getValue()==null) {
					tng.setStreetPreDirection(null);
				}else {
					tng.setStreetPreDirection(locCan.getStreetPreDirection().getValue().toString());
				}
				
				if(locCan.getStreetPreType().getValue()==null) {
					tng.setStreetPreType(null);
				}else {
					tng.setStreetPreType(locCan.getStreetPreType().getValue().toString());
				}
				
				if(locCan.getStreetType().getValue()==null) {
					tng.setStreetType(null);
				}else {
					tng.setStreetType(locCan.getStreetType().getValue().toString());
				}
				tng.setUnitCorroborativeIndex(0);
				tng.setUnitNumber(null);
				tng.setUnitType(null);
				
				repo.save(tng);	
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Unable to save data please try again");
			}
			
			return repo.findByAddress(locCan.getAddressLine());	
		
	}

	
	public List<TngPropertyAddress> validateAddress(LocationCandidate locationCandidate) {
		List<TngPropertyAddress> data = new ArrayList<TngPropertyAddress>();
		
		if(repo.findByAddress(locationCandidate.getAddressLine()).isEmpty()) {
			data.add(null);
		}else {
			data.addAll(repo.findByAddress(locationCandidate.getAddressLine()));
		}
		return data;
	}

	
	public TngPropertyAddress findByTngPropertyAddressPKDmti_uaid(LocationCandidate locationCandidate) {
		// TODO Auto-generated method stub
		//return repo.findByTngPropertyAddressPKDmti_uaid(locationCandidate.getUAID().toString());
		TngPropertyAddressPK tngpk = new TngPropertyAddressPK() ;	
		tngpk.setDmtiUaid(locationCandidate.getUAID());
		if(locationCandidate.getSubAddress().getUUAID()==null) {
			tngpk.setDmtiUuaid("");
		}else {
			tngpk.setDmtiUuaid(locationCandidate.getSubAddress().getUUAID());
		}
		
		Optional<TngPropertyAddress> aa = repo.findById(tngpk );
		return aa.ofNullable(aa.get()).orElseGet(null); 
	}
	
	
	/***************************************************************************************************************/
	
	
	public TngPropertyAddress findByUaid(String uaid) {
		// TODO Auto-generated method stub
		//return repo.findByTngPropertyAddressPKDmti_uaid(locationCandidate.getUAID().toString());
		TngPropertyAddressPK tngpk = new TngPropertyAddressPK() ;	
		tngpk.setDmtiUaid(uaid);
		tngpk.setDmtiUuaid("");
		
		Optional<TngPropertyAddress> aa = repo.findById(tngpk );
		return aa.ofNullable(aa.get()).orElseGet(null); 
	}
	
	public List<TngPropertyAddress> findByAddress(String address) {
		List<TngPropertyAddress> data = new ArrayList<TngPropertyAddress>();
			
			data.addAll(repo.findByAddress(address));
			
			
		
		return data;
	}
	
	

	
	
}