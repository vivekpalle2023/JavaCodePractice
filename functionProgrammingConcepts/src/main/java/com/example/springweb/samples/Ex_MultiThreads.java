package com.example.springweb.samples;

public class Ex_MultiThreads implements Runnable //Functional Interface
{
	
	public void run() {
		
		System.out.println("Thread is running");
	}
	
	public static void main(String args[]) {
		
		Runnable r1=new Ex_MultiThreads(); //up casting
		Thread t1=new Thread(r1,"Thread 1"); //Thread constructor - Passing runnable object and Thread name as string value
		System.out.println(t1.getName() + " is " + t1.getState());
		t1.start();
		System.out.println(t1.getName() + " is " +t1.getState());
		r1.run();
		System.out.println("Alpha");
		
		
		
	}

}
