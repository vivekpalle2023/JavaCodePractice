package com.example.springweb;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex_ArrayList {

	public static void main(String args[]) {

		// List of Strings
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");

		System.out.println(l);

		// converting List to Array
		String[] s = l.toArray(new String[l.size()]);
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}

		// Array of Strings
		String[] a = { "C", "D" };

		// Convert Array of String to List
		List<String> b = new ArrayList<>();

		for (int j = 0; j < a.length; j++) {

			b.add(a[j]);
		}
		// clear all the elements
		b.clear(); 
		// adding the elements from another ArrayList
		b.addAll(l); 

		
		//Iteration
		Iterator<String> i = b.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}

}
