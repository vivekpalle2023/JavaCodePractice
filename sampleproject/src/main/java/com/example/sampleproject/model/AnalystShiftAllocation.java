package com.example.sampleproject.model;

public class AnalystShiftAllocation {
	
	private int apacTickets;
	private int eocTickets;
	private int aocTickets;
	private int noOfAnalysts;
	
	public int getNoOfAnalysts() {
		return noOfAnalysts;
	}
	public void setNoOfAnalysts(int noOfAnalysts) {
		this.noOfAnalysts = noOfAnalysts;
	}
	
	public AnalystShiftAllocation(int apacTickets,int eocTickets,int aocTickets,int noOfAnalysts)
	{
		this.apacTickets=apacTickets;
		this.eocTickets=eocTickets;
		this.aocTickets=aocTickets;
		this.noOfAnalysts=noOfAnalysts;
	}
	public int getApacTickets() {
		return apacTickets;
	}
	public void setApacTickets(int apacTickets) {
		this.apacTickets = apacTickets;
	}
	public int getEocTickets() {
		return eocTickets;
	}
	public void setEocTickets(int eocTickets) {
		this.eocTickets = eocTickets;
	}
	public int getAocTickets() {
		return aocTickets;
	}
	public void setAocTickets(int aocTickets) {
		this.aocTickets = aocTickets;
	}

}
