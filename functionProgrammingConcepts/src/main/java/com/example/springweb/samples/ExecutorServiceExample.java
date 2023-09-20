package com.example.springweb.samples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {

		// Example 1
		// executorService object having pool of 2 threads
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
	  
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.shutdown();

		// Example 2
		// Create Single thread Execute service and execute

		ExecutorService e1 = Executors.newSingleThreadExecutor();
		e1.execute(() -> {
			System.out.println("Single Thread Started");
			for (int i = 0; i < 100; i++) {
				System.out.println(" " + i);
			}
			System.out.println("Single Thread Ended ");
		});

		// It block any other tasks to queue up in Executor Service
		e1.shutdown();

		// Example 3
		// Using Submit method

		ExecutorService e2 = Executors.newSingleThreadExecutor();
		// submit takes runnable and returns future object which is later used to check
		// the status of runnable whether it is executed or not
		e2.submit(() -> {
			System.out.println("Using Submit method.. ");
		});
		e2.shutdown();

	}
}
