package com.example.springweb;

import java.util.Set;
import java.util.HashSet;

public class Ex_HashSet {

	public static void main(String args[]) {

		Set<String> s = new HashSet<>();

		s.add("Morning");
		s.add("AfterNoon");
		s.add("Night");
		System.out.println(s);
		s.removeIf(b->b.contains("Morning"));	
		s.add("Morning");
		s.forEach(a -> System.out.println(a));
		
		int i=0;
		int j=i;
		j=i++ +j;
		System.out.println(i+ "-"+ j);
	}
}
