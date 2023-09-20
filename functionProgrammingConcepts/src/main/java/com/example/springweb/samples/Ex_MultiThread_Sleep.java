package com.example.springweb.samples;

public class Ex_MultiThread_Sleep extends Thread{
	
	public void run()
	{
		
	for(int i=1;i<5;i++) {
		
		try {
		
			Thread.sleep(2000); //whenever thread is went to sleep, then thread scheduler takes another thread
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		
	
		
		Ex_MultiThread_Sleep t1=new Ex_MultiThread_Sleep();
		Ex_MultiThread_Sleep t2=new Ex_MultiThread_Sleep();
		t1.start();
		t2.start();
		
		
	}
}
