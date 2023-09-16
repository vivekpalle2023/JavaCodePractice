package com.example.sampleproject.model;

public class ShiftDivision {
	
	private int morningShiftTicketCount;
	private int afterNoonShiftTicketCount;
	private int nightShiftTicketCount;
	private int noOfAnalysts;
	public int getMorningShiftTicketCount() {
		return morningShiftTicketCount;
	}
	public void setMorningShiftTicketCount(int morningShiftTicketCount) {
		this.morningShiftTicketCount = morningShiftTicketCount;
	}
	public int getAfterNoonShiftTicketCount() {
		return afterNoonShiftTicketCount;
	}
	public void setAfterNoonShiftTicketCount(int afterNoonShiftTicketCount) {
		this.afterNoonShiftTicketCount = afterNoonShiftTicketCount;
	}
	public int getNightShiftTicketCount() {
		return nightShiftTicketCount;
	}
	public void setNightShiftTicketCount(int nightShiftTicketCount) {
		this.nightShiftTicketCount = nightShiftTicketCount;
	}
	public int getNoOfAnalysts() {
		return noOfAnalysts;
	}
	public void setNoOfAnalysts(int noOfAnalysts) {
		this.noOfAnalysts = noOfAnalysts;
	}
	
	public ShiftDivision(int morningShiftTicketCount,int afterNoonShiftTicketCount,int nightShiftTicketCount,int noOfAnalysts)
	{
		this.morningShiftTicketCount=morningShiftTicketCount;
		this.afterNoonShiftTicketCount=afterNoonShiftTicketCount;
		this.nightShiftTicketCount=nightShiftTicketCount;
		this.noOfAnalysts=noOfAnalysts;
	}

}
