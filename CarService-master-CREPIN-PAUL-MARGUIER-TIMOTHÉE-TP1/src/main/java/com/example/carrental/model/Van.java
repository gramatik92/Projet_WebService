package com.example.carrental.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Van {
		
	private long id;
	private int maxWeight;
	
	public Van() {
		super();
	}

	public Van(int maxWeight) {
		super();
		this.maxWeight = maxWeight;
	}

	@Id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
}