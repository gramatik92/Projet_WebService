package com.example.carrental.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {
		
	private long id;
	private String plateNumber;
	private Rent rent;
	
	public Car() {
		super();
	}

	public Car(String plateNumber) {
		super();
		this.plateNumber = plateNumber;
	}

	@Id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	@ManyToOne
	public Rent getRent() {
		return rent;
	}

	public void setRent(Rent rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Vehicule [rent=" + ", id=" + id + ", plateNumber=" + plateNumber + "]";
	}
	
}