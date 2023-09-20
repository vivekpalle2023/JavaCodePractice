package com.example.springweb.samples;

public interface I1 {
	public int Square(int a, int b);
	default int area_of_rectangle(int x, int y) {
		return x * y*30;	}
	static void show()
	{
		System.out.println("You are in the interface: I1");
	}
	
}
