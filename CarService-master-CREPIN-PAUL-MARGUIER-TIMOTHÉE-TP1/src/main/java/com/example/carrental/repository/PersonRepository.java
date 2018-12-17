package com.example.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.carrental.model.Person;
import com.example.carrental.model.Vehicule;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
	List<Vehicule> findByName(String name);

}