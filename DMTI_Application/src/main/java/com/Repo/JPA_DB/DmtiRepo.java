package com.Repo.JPA_DB;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/*@RepositoryRestResource(collectionResourceRel="login", path="login")*/
@Repository
public interface DmtiRepo extends JpaRepository<TngPropertyAddress, TngPropertyAddressPK>{
	
	
	public List<TngPropertyAddress> findByAddress(String address);

	//public List<TngPropertyAddress> findByCity(String city);

}

