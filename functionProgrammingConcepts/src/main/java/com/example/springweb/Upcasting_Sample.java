package com.example.springweb;

interface A{
	
	public void show1();
	
}



public class Upcasting_Sample implements A {
	
	public void show1() {
		System.out.println("A");
	}
	
	public void show2() {
		System.out.println("Upcasting_Sample");
	}

	public static void main(String args[]) {
		A obj=new Upcasting_Sample(); //up casting
		obj.show1();
		
		Upcasting_Sample obj1=(Upcasting_Sample)obj; //down casting
		obj1.show2();
		
	}

}
