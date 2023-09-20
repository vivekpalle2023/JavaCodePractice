package com.example.springweb.samples;

class Task extends Thread {

	int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("\n Task-" + number + " Started ");

		for (int i = number * 100; i < number * 100 + 99; i++) 
			System.out.print(i + " ");
		
		System.out.println("\n Task-" + number + " Done \n");

	}
}
