package com.example.springweb;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.*;

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
		wd.add(new WorkDistribution(200,100,80,"August"));
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
			
		
	}

}
