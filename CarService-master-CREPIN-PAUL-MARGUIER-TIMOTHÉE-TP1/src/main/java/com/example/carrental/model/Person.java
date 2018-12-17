package com.example.carrental.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Person {
	
	private long id;
	private String name;
	private Rent rent;
	
	private List<Rent> rents = new ArrayList<Rent>();
	
	public Person() {
		super();
	}

	public Person(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@OneToMany(mappedBy="person", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Rent> getRent() {
		return rents;
	}

	public void setRent(List<Rent> rents) {
		this.rents = rents;
	}

	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
