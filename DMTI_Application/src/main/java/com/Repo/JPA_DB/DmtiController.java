package com.Repo.JPA_DB;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.MatchesPattern;

import org.apache.tomcat.util.json.ParseException;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Repo.JPA_DB.DMTI_Model.Input;
import com.Repo.JPA_DB.DMTI_Model.LocationCandidate;
import com.Repo.JPA_DB.DMTI_Model.ResponseItem;

@RestController
public class DmtiController {
	
	@Autowired
	DmtiAction action;
		
	@RequestMapping(value="/dmti/retrievedata/{var}", method=RequestMethod.GET)
	public List<TngPropertyAddress> getAddress(@PathVariable("var") String var) throws Exception {
		List<TngPropertyAddress> data = new ArrayList<TngPropertyAddress>();
		
			try 
			{
				if(var.matches("\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}")) {
					System.out.println("if");
					data.add(action.findByUaid(var));
				}else{
					System.out.println("else");
					data.addAll(action.findByAddress(var));						
				};
			}
			catch (Exception e)
			{
				// TODO: handle exception
				throw new Exception("Search with '" +var+ "' not Found");
			}
		
			return data;
		
	}
	
	@RequestMapping(value="/dmti/populateAddress", method=RequestMethod.POST)
	public List<TngPropertyAddress> populateAddress(@RequestBody Input body ) throws JSONException, FileNotFoundException, ParseException
	{
		List<LocationCandidate> locCan =  new ArrayList<LocationCandidate>();
		List<TngPropertyAddress> data = new ArrayList<TngPropertyAddress>();
		//System.out.println( locCan.getResponseItems().get(0) );
		locCan  = body.getResponseItems().get(0).getLocationCandidates();
		
		for (LocationCandidate locationCandidate : locCan) {
			System.out.println(locCan.size());
			data.addAll(action.populateAddress(locationCandidate));
		} 
		return data;
		 
	}
	
	/*@RequestMapping(value="/dmti/validateAddress", method=RequestMethod.GET)
	public List<TngPropertyAddress> validateAddress(@RequestBody Input body)
	{
		List<LocationCandidate> locCan =  new ArrayList<LocationCandidate>();
		List<TngPropertyAddress> data = new ArrayList<TngPropertyAddress>();
		
		locCan = body.getResponseItems().get(0).getLocationCandidates();
		System.out.println(locCan);
		for (LocationCandidate locationCandidate : locCan) {
			System.out.println(locationCandidate);
			data.addAll(action.validateAddress(locationCandidate));
		}
		return data;
	}
	
	@RequestMapping(value="/dmti/retrieveById", method=RequestMethod.GET)
	public List<TngPropertyAddress> findByIdDmtiUaidAndIdDmtiUuaid(@RequestBody Input body ) throws JSONException, FileNotFoundException, ParseException
	{
		List<TngPropertyAddress> data = new ArrayList<TngPropertyAddress>();
		
		TngPropertyAddress a = action.findByTngPropertyAddressPKDmti_uaid(body.getResponseItems().get(0).getLocationCandidates().get(0));
		System.out.println( a );
		
		 data.add( a );
		 
		 return data;
	};*/

}
