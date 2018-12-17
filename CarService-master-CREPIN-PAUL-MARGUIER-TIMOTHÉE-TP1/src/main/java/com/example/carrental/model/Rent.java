package com.example.carrental.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;


@Entity
public class Rent {
	
	private long id;
	private Date beginRent;
	private Date endRent;
	private Person person;
	
	private List<Vehicule> vehicules = new ArrayList<Vehicule>();
	
	public Rent() {
		super();
	}

	public Rent(Date beginRent, Date endRent, long id) {
		super();
		this.beginRent = beginRent ;
		this.endRent = endRent ;
		this.id = id;
		
	}
	
	@OneToMany(mappedBy="vehicules", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Vehicule> getVehicule() {
		return vehicules;
	}

	public void setVehicule(List<Vehicule> rents) {
		this.vehicules = rents;
	}

	
	@ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getBeginRent() {
		return beginRent;
	}
	public void setBeginRent(Date date) {
		this.beginRent = date;
	}
	public Date getEndRent() {
		return endRent;
	}
	public void setEndRent(Date date) {
		this.endRent = date;
	}
}
