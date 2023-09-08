package com.example.springdatajpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table
public class Student {
	
	@Id
	@Column
	private long id;
	@Column
	private String name;
	@Column
	private int testScore;
	

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
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	

}
