package com.example.carrental.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.carrental.model.Vehicule;
//Connection à la db

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
	
	List<Vehicule> findByPlateNumber(int plateNumber);

}