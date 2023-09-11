package com.example.springweb;

import java.util.List;
import java.util.ArrayList;

class Student{
	
	String studentName;
	int rollNo;
	int age;
	
	Student(String studentName,int rollNo,int age){
		
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.age=age;
	}
	
}

public class Ex_ArrayList1 {
	
	public static void main(String[] args) {
		
		List<Student> s1=new ArrayList<>();
		s1.add(new Student("A",100,6));
		s1.add(new Student("C",102,8));
		s1.add(new Student("F",105,4));
		
		/* Iteration using Iterator
		 * Iterator<Student> I=s1.iterator();
		 * 
		 * while(I.hasNext()) { Student s=I.next(); System.out.println(s.studentName
		 * +" with roll no "+ s.rollNo+ " is of Age "+ s.age); }
		 */
		//Collections.sort((List<T>) s1); //not working
		
	
		//Inserting at position 1
		s1.add(1,new Student("B",101,7));
		
		List<Student> s2=new ArrayList<>();
		
		s2.add(new Student("D",103,9));
		s2.add(new Student("E",104,7));
		//Inserting another list at position 3
		s1.addAll(3,s2);
		
		//Remove If uses predicate function. Hence used Lambda expression
		s1.removeIf(a->a.studentName.contains("F"));	
		
		//s1.isEmpty() checks if the List is empty or not and returns boolean output
		if(!s1.isEmpty()) {
			//using forEach method and Lambda expression
		s1.forEach(a->
		{System.out.println(a.studentName +" with roll no "+ a.rollNo+ " is of Age "+ a.age);});
		}
	
		
	}

}
