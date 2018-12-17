package com.example.carrental.repository;

import java.util.List;
import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.example.carrental.model.Rent;
//Connection à la db

public interface RentRepository extends CrudRepository<Rent, Long> {
	
	List<Rent> findByBeginRent(Date beginRent);

}