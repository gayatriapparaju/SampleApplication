package com.example.SampleApplication.Entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The persistent class for the "Appointlet_Info" database table.
 * 
 */
@Entity
@Table(name = "dog", schema = "test")
@AllArgsConstructor
@Data
public class Dog  {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;

  @Column(name = "name")
  private String name;
 
  @Column(name = "vaccinated")
  private Integer vaccinated;

  @Column(name = "isAlive")
  private Boolean isAlive;

  @Column(name = "city")
  private String city;
  
  public Dog() {
	  
  }

  
}
