package com.example.springweb.samples;

import java.io.IOException;



class Child extends Parent {
	public void A() throws ArithmeticException{
		int i=10;
		try{
		int j=i/0;}
		catch(ArithmeticException e){
			System.out.println("Method A Math exception");
		}
		System.out.println("In Child, Method A");
		
	}
	public void B(){
		System.out.println("In Child, Method B");
	}
}

class Parent 
{
	public void A() throws IOException {
		System.out.println("In Parent, Method A ");
		//throw new IOException("Method A exception");

	}
	public void C()
	{
		System.out.println("In Parent, Method C ");
	}
}

public class Ex_Inheritance {
	public static void main(String args[]) throws IOException {

		Parent p = new Child(); // upCasting
		p.A();
		Child c=(Child)p;
		c.B();
	}
}
