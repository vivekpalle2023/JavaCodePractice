package com.example.springweb.samples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

public class Ex_DateTimeAPI {
	public static void main(String[] args) {
		
		//Todays date
		LocalDate d=LocalDate.now();
	
		LocalDate yesterday=d.minusDays(1);
		LocalDate tomorrow=d.plusDays(2);
			System.out.println(" Today - " + d+
		              "\n Yesterday - " + yesterday+ 
		                "\n Tomorrow - "+ tomorrow);
			
       LocalDate d2=LocalDate.of(1989, 07, 31);
       System.out.println(d2.isLeapYear());
       
       //Combining Date and Time
       LocalDateTime dateTime=d2.atTime(1,23,10);
       System.out.println(dateTime);
       
       //converting Date to String
       String str=d.format(DateTimeFormatter.ISO_DATE);
       System.out.println(str);
       
       //converting String to Date
       String s2="2019-01-01";
       LocalDate d3=LocalDate.parse(s2);
       System.out.println(d3);
       
       System.out.println(d.getDayOfMonth());
              
       //To find Week Number -
       
       LocalDate date = LocalDate.now();  
       // Set the week start day to Monday  
       WeekFields weekFields = WeekFields.of(Locale.getDefault());  
       int weekNumber = date.get(weekFields.weekOfWeekBasedYear());  
       System.out.println("Week number: " + weekNumber);  
		
		
	}
}
