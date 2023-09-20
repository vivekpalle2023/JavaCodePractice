package com.example.springweb.samples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.*;
	import java.util.stream.IntStream;
	import java.util.stream.Stream;


	class WorkDistribution{
		
		int mstCount;
		int astCount;
		int nstCount;
		String month;
		
		WorkDistribution(int mstCount, int astCount,int nstCount,String month){
			this.mstCount=mstCount;
			this.astCount=astCount;
			this.nstCount=nstCount;
			this.month=month;
		}
			
	}

public class Ex_StreamAPI {
	

	public static void main(String[] args) {
		
		List<WorkDistribution> wd=new ArrayList<>();
		wd.add(new WorkDistribution(100,200,150,"June"));
		wd.add(new WorkDistribution(100,109,150,"July"));
		wd.add(new WorkDistribution(300,500,200,"September"));
		
		List<String> wd1=wd.stream()
							.filter(a->a.mstCount>100)
								.map(b->b.month).collect(Collectors.toList());
		
			
			System.out.println("Ticket count greater than 100 in the month "+wd1);
			
			Stream.iterate(1,e->e+1)
				       .limit(5)
			       .forEach(System.out::println);
			
			wd.stream().filter(wd2 -> wd2.nstCount>140)
			.forEach(wd2->System.out.println("Ticket count greater than 140 in the month "+wd2.month));
	
			
			WorkDistribution wd3 = wd.stream().max((x,y)->x.nstCount>y.nstCount?1:-1).get();
			
			System.out.println(wd3.month);
			
			System.out.println(Math.round(2.4));
			int totalTicketCountPerMonth=0;
			for(WorkDistribution w: wd)
			{
				if(w.month.equals("September")) {
					
					totalTicketCountPerMonth=w.mstCount+w.astCount+w.nstCount;
					System.out.println("Total Ticket Count Per Month " + w.month+" "+ totalTicketCountPerMonth);
				}
				
			}
		 wd.stream().limit(2).forEach(w->System.out.println(w.month));
		 
		 wd.stream().skip(2).forEach(w->System.out.println(w.month));
		 
		 
	//Verifying the Palindrome for string
		 
		 StringBuilder str=new StringBuilder("1101");
		  String str1=str.toString();
		  str.reverse();
		   		 
		 System.out.println(str1.equals(str.toString()));
		 
		 if(str1.equals(str.toString()))
		 {
			 System.out.println("It is a Palindrome");
		 }
		 else {
			 System.out.println("Not a Palindrome");
		 }
		 
		 
		 //using sum in Array stream
		 int[] a= {2,10,3,7,1,6,1,10};

   int total=Arrays.stream(a).sum();
	
	 for (int i = 0; i < a.length; i++) { a[i] = total - a[i]; }
	
/*	 for(int i=0; i<total.length;i++) { System.out.println(total[i]); }
	*/

	  for(int j:a) { System.out.println(j); }
	 
   	 
 	System.out.println( Arrays.stream(a).max());
			
 	
 	  
		Stream<double[]> HackValue = IntStream.rangeClosed(1, 100)
 	    .boxed().flatMap(x ->IntStream.rangeClosed(x, 10)
 	    .mapToObj( 	    y -> new double[] {x,y, Math.sqrt(x * x + y * y)})
 	    .filter (s -> s[2] % 1 == 0));
 	 
	 	HackValue.limit(5).forEach(z-> System.out.println(z[0]+", " + " "+z[1] + " "+ z[2]));
	 	//z[0] + "" ,"" + z[1] + "", "" + z[2]
 	   }
 	

	}


