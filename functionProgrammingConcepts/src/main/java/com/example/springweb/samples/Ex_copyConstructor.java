package com.example.springweb.samples;

public class Ex_copyConstructor {
	
	private int amount;
	private int id;
	
	public Ex_copyConstructor(int amount, int id ) {
		this.amount=amount;
		this.id=id;
	}
	public Ex_copyConstructor(Ex_copyConstructor c){
		this.amount=c.amount;
		this.id=c.id;

	}
		
	public static void main(String[] args) {
		Ex_copyConstructor cc=new Ex_copyConstructor(200,10);
		Ex_copyConstructor cc1=new Ex_copyConstructor(cc);
		
		System.out.println("Original - " + cc.id + " " +cc.amount);
		System.out.println("Copied - " + cc1.id + " " +cc1.amount);
		
	}

}
