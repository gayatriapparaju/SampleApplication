package com.example.SampleApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SampleApplication.Entity.Dog;
import com.example.SampleApplication.Repository.DogRepository;

@Controller
public class DogController {
	
	
	@Autowired
	DogRepository dogRepository;
	
	
	/*
	 * @GetMapping("/") public String getAlltheRecords(Model m) { List<Dog> dogs =
	 * (List<Dog>) dogRepository.findAll(); System.out.println(dogs);
	 * m.addAttribute("dogs", dogs); return "index"; }
	 */
	
	

}
