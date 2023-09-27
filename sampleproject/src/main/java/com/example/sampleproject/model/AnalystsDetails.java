package com.example.sampleproject.model;

import java.time.LocalDate;

public class AnalystsDetails {
	
	private int empid;
	private String empName;
	private String dateOfJoining;
	private String email;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AnalystsDetails(int empid,String empName,String dateOfJoining, String email )
	{
		this.empid=empid;
		this.empName=empName;
		this.dateOfJoining=dateOfJoining;
		this.email=email;
		
	}

}
