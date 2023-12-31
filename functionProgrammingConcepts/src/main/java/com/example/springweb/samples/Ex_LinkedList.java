package com.example.springweb.samples;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

class Employee {

	String name;
	String id;

	Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

}

public class Ex_LinkedList {

	public static void main(String args[]) {

		//Array of objects
		//Employee[] employeeArray = {new Employee("Vivek", "1"), new Employee( "Sree", "2" ), new Employee( "Ivan", "3" ) };
		
		// 2d Array
		String[][] employeeArray= {{"Vivek", "1"},{"Sree", "2"},{"Ivan", "3" }};
		
		List<Employee> fL = new LinkedList<>(); // upCasting
		// LinkedList<Employee> ll= (LinkedList<Employee>)fL; //downCasting

		// employeeArray.length - row length
		// employeeArray[0].length - column length

		String name_temp = " ";
		String id_temp = " ";

		// Traversing to assign value of Array to LinkedList
		for (int i = 0; i < employeeArray.length; i++) // rows
		{
			for (int j = 0; j < employeeArray[i].length; j++) // columns
			{
				if (j == 0) {
					name_temp = employeeArray[i][j];
				} else {
					id_temp = employeeArray[i][j];
				}
			}
			fL.add(new Employee(name_temp, id_temp));
		}

		// using Iterator Interface and iterator() method from List Interface
		Iterator<Employee> i = fL.iterator();
		while (i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.name + "'s id is " + e.id);
		}

		LinkedList<Employee> ll = (LinkedList<Employee>) fL;

		ll.addFirst(new Employee("Aplha", "4"));
		ll.addFirst(new Employee("Vivek", "1"));
		
		//similarly addLast()method
	
		ll.removeFirstOccurrence(new Employee("Vivek", "1"));
		
		// using forEach method and Lambda expression
		ll.forEach(a -> {
			System.out.println(a.name + " " + a.id);
		});

	}
}


