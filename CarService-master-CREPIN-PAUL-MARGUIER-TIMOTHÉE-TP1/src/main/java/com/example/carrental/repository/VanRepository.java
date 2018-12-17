package com.example.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.carrental.model.Van;

// Connection à la db
public interface VanRepository extends CrudRepository<Van, Long> {
	
	List<Van> findByMaxWeight(int maxWeight);

}
