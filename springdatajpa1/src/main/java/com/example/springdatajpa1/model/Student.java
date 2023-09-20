package com.example.springdatajpa1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	
	@Id
	private long Id;
	private String name;
	private int testScore;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	


}
