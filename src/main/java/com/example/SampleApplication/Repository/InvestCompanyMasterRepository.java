package com.example.SampleApplication.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SampleApplication.Entity.InvestCompanyMaster;

@Repository
public interface InvestCompanyMasterRepository extends CrudRepository<InvestCompanyMaster, String> {

	List<InvestCompanyMaster> findByRicTicker(String rickTicker);
	
	 InvestCompanyMaster findByCompanyId(Integer companyId);
	
	List<InvestCompanyMaster> findByUniverseId(Integer universeId);
	
	
	
}
