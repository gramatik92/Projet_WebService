package com.example.carrental.repository;

import java.util.List;
import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.example.carrental.Car;
import com.example.carrental.model.Rent;
//Connection à la db

public interface CarRepository extends CrudRepository<Car, Long> {
	
	List<Car> findByPlateNumber(String plateNumber);

	Car saveAndFlush(Car car);

}