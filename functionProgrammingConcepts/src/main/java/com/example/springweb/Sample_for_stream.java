package com.example.springweb;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Sample_for_stream {
	static int f = 2;
	static final int b=6;
	static final int c=3;
	static final int d=5;
	static final int e=9;
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
	
		a.add(b);
		a.add(c);
		a.add(f);
		a.add(d);
		a.add(e);
		
		//Sample_for_stream s=new Sample_for_stream();
		//s.Sample_for_stream1();
		
		System.out.println(a.stream().map(b-> b*3).collect(Collectors.toList()));
			
	}
	public void Sample_for_stream1(){
	f=100;
	System.out.println(f);
	}
	


}
