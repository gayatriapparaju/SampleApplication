package com.example.SampleApplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SampleApplication.Entity.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {

	
	
	
}
