package com.example.springweb;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionProgrammingConceptsApplication{

	public static void main(String[] args) {
		SpringApplication.run(FunctionProgrammingConceptsApplication.class, args);
		
			
		List<Integer> numbers=Arrays.asList(new Integer[]{20,13,16,11});
		
		//Name Local Inner class
		//class GetEvenNumberLogic implements Predicate<Integer>{
			//@Override
			//public boolean test(Integer number) {
            //return number%2==0;
			//}
			 //}

         //Predicate<Integer> isEven=new GetEvenNumberLogic();
         
         //Anonymous inner class
         
       //  Predicate<Integer> isOdd = new Predicate<Integer>(){
        	// @Override
  			//public boolean test(Integer number) {
            // return number%2!=0;
 			//}
 			// };
         
         Predicate<Integer> isEven1= n->n%2==0;
     	
		System.out.println("Numbers are " +getEvenNumbers(numbers, isEven1/*isEven,isOdd*/));
			
	}
	
	public static List<Integer> getEvenNumbers(List<Integer> numbers, Predicate<Integer> p1
			/*Predicate<Integer> p , Predicate<Integer> isOdd
*/){
		
		List<Integer> result=new ArrayList<>();
		//List<Integer> result1=new ArrayList<>();
		for(int number: numbers) {
			if(p1.test(number)) {
				result.add(number);
			}
			//else if(isOdd.test(number)) {
				//result1.add(number);
			//}
		}
		return result; 
		//return result1;
			
	}

}
