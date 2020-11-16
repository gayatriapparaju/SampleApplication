package com.example.SampleApplication.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SampleApplication.Entity.Dog;
import com.example.SampleApplication.Entity.InvestCompanyMaster;
import com.example.SampleApplication.Repository.DogRepository;
import com.example.SampleApplication.Repository.InvestCompanyMasterRepository;

@Controller
public class InvestCompanyMasterController {
	
	
	
	
	@Autowired
	InvestCompanyMasterRepository investCompanyMasterRepository;
	
	
	
	@GetMapping("/")
	public String fetch() {
		return "search_tr";
	}
	
	@GetMapping("/login")
	public String fetchLoginPage() {
		return "login";
	}

	
	@GetMapping("/error")
	public String fetchErrorPage() {
		return "errorPage";
	}
	
	
	@GetMapping("/records")
	public String fetchRecords(Model m, @RequestParam("identifier") String identifier,
			@RequestParam("search_value") String search_value) {
		try {
			List<InvestCompanyMaster> records = new ArrayList<>();

			records = fetchAll(identifier, search_value, records);
			if (!CollectionUtils.isEmpty(records)) {				
				m.addAttribute("records", records);
				m.addAttribute("search_value", search_value);
				m.addAttribute("identifier", identifier);
			}
			return "search_tr";
		} catch (Exception e) {
			return "errorPage";
		}

	}

	private List<InvestCompanyMaster> fetchAll(String identifier, String search_value,
			List<InvestCompanyMaster> records) {
		if (StringUtils.equalsIgnoreCase(identifier, "universeId")) {
			InvestCompanyMaster master = investCompanyMasterRepository.findByCompanyId(Integer.valueOf(search_value));
			if (master != null) {
				records.add(master);
			}
		} else if (StringUtils.equalsIgnoreCase(identifier, "companyId")) {
			records = investCompanyMasterRepository.findByUniverseId(Integer.valueOf(search_value));
		} else if (StringUtils.equalsIgnoreCase(identifier, "ricTicker")) {
			records = investCompanyMasterRepository.findByRicTicker(search_value);

		}
		return records;
	}
	
	
	@PostMapping("/disable")
	public String disableRecords(Model m, @RequestParam("companyId") String companyId,
			 @RequestParam("identifier") String identifier,
				@RequestParam("search_value") String search_value) {
		try {
			InvestCompanyMaster investCompanyMaster = investCompanyMasterRepository
					.findByCompanyId(Integer.valueOf(companyId));
			investCompanyMaster.setActiveFlag(Boolean.FALSE);
			investCompanyMasterRepository.save(investCompanyMaster);
			
			return "redirect:/records?identifier="+identifier+"&search_value="+search_value;
		} catch (Exception e) {
			return "errorPage";
		}
		
	}
	
	
	

}
