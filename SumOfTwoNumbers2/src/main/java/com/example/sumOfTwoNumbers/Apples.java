package com.example.sumOfTwoNumbers;

public class Apples {
	
	

	private int weight=0;
	private String color="";
	
	public Apples(int weight, String color) {
		this.weight = weight;
		this.color = color;
	}



	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Apples [weight=" + weight + ", color=" + color + "]";
	}

}
