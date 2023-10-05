package com.example.springweb.samples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;



public class Ex_ArrayList2 {


	
	public static int[] removeTheElement(int[] arr, int index) {

		int[] removedArrayOfNums = new int[arr.length-1];
        
		for (int i = 0,k=0; i < arr.length; i++) {
			if (i == index) {continue;} 
			else {removedArrayOfNums[k++] = arr[i];}
		}
		return removedArrayOfNums;
	}

	public static void main(String[] args) {

		int[] arrayOfNums = { 25, 56, 21, 65, 92, 76 };
		
		arrayOfNums=Ex_ArrayList2.removeTheElement(arrayOfNums, 3);
		
		System.out.println(Arrays.toString(arrayOfNums));
		 LocalDateTime dt=LocalDateTime.of ( 2014, 7, 31, 1, 1);
		 dt.plusDays (30) ; 
		 dt.plusMonths (1) ;
		 System.out.print (dt.format(DateTimeFormatter.ISO_DATE ) ); 
		 
		 StringBuilder sb = new StringBuilder(5); String s = ""; if (sb.equals(s)) { System.out.println("Match 1"); } else if (sb.toString().equals(s.toString())) { System.out.println("Match 2"); } else { System.out.println("No Match"); }
		 { LocalDate date = LocalDate.of(2012, 1, 30); date.plusDays (10); System.out.println (date); } 
		  
	}
}



