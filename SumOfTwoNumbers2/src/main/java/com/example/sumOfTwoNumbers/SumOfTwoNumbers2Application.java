package com.example.sumOfTwoNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.function.Predicate;



@SpringBootApplication
public class SumOfTwoNumbers2Application {

	public static void main(String[] args) {
   
		List<Apples> inventory=Arrays.asList(
					new Apples(80, "green"),
					new Apples(155, "green"),
					new Apples(120, "red")
				);
		
			
		System.out.println(filterApples(inventory, apple -> apple.getColor().equals("green") && apple.getWeight()==155));
		
	
	}
	
	public static List<Apples> filterApples(List<Apples> inventory, Predicate<Apples> greenApples){
		
		List<Apples> result=new ArrayList<>();
		
		for(Apples apple: inventory) {
			if(greenApples.test(apple)){
				result.add(apple);
			}
		}
		
		return result;		
	}
	

}




