package com.example.springweb.samples;

public interface I2 {
	public double circle(int r);
	default int area_of_rectangle(int x, int y) {
		return x * y*10;}
	
	static void show()
	{
		System.out.println("You are in the interface: I2");
	}
	
}
