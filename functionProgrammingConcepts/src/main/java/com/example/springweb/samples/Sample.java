package com.example.springweb.samples;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.TreeMap;



public class Sample {
	
	public static TreeMap<String, String> AssigningShift(int x, List<String> y){
		
        int morning=1;
        int afternoon=2;
        int night=2;
        int intialCount=0;
		TreeMap<String, String> assigningShift=new TreeMap<String, String>(); 

		while(intialCount<x) {
			
			while(morning!=0){
				assigningShift.put(y.get(intialCount), "Morning");
                 morning--;
				intialCount++;
			}
			while(afternoon!=0){
				assigningShift.put(y.get(intialCount), "AfterNoon");
				afternoon--;
				intialCount++;
			}
			while(night!=0){
				assigningShift.put(y.get(intialCount), "Night");
				night--;
				intialCount++;
			}
		
			}
		return assigningShift;
		
	}
	
	public static void main(String[] args) { 
	
	
		List<String> a=new ArrayList<>();
		a.add("Swaroop");
		a.add("Pavan");
		a.add("Sateesh");
		a.add("Firoz");
		a.add("Sindhuja");
		int count=a.size();
      
	 
		for(Map.Entry m:  AssigningShift(count,a).entrySet()) {
		System.out.println(m.getKey()+" - "+m.getValue()+ " Shift");
		} 
	}

}

