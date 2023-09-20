package com.example.springweb.samples;

public class Sample_Interface implements I1, I2 {
	
	@Override
	public int Square(int a, int b) {
		return a * b;
	}

	@Override
	public double circle(int r) {
		return (3.14 * r * r);
	}

	@Override
	public int area_of_rectangle(int x, int y) {
		//
		return I1.super.area_of_rectangle(x, y);
	}

	public static void main(String[] args) {

		I2 i2 = new Sample_Interface();

		System.out.println(i2.area_of_rectangle(10, 20));

		Sample_Interface s = new Sample_Interface();

		System.out.println(s.area_of_rectangle(10, 20));

		I2.show();

		I1.show();

	}
}
