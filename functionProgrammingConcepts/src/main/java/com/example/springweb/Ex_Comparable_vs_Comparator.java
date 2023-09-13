package com.example.springweb;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class Ex_Comparable_vs_Comparator {
	
	public static void main(String args[]) {
		
		List<Student> l=new ArrayList<>();
		
		l.add(new Student("X",200,2));
		l.add(new Student("B",100,4));
		l.add(new Student("M",300,6));
		
		Comparator<Student> cm= (Student i, Student j) -> (i.rollNo>j.rollNo) ? 1:-1;
		
		Collections.sort(l,cm);
	
		for(Student s: l) {
		
		System.out.println(s.studentName + " "+ s.rollNo+ " "+ s.age );
		}
		
	}

}
