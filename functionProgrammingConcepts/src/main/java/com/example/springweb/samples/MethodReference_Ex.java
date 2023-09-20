package com.example.springweb.samples;

import java.util.List;
import java.util.ArrayList;
//import java.util.Iterator;

class FoodUtilLib {
	public static boolean isNonVeg(String foodItem) {
return foodItem.startsWith("non-");

}}



public class MethodReference_Ex {
	
	public static void main(String[] args) {
		

		
		List<String> menu=new ArrayList<>();
		
		menu.add("veg");
		menu.add("non-veg");
		menu.add("veg");
		menu.add("veg");
		menu.add("non-veg");
		menu.add("non-veg");
		
		//Imperative Style (Intention + Implementation) 
		
		//Iterator<String> iterator=menu.iterator();
		//while(iterator.hasNext()){
			//String menuNext=iterator.next();
			//if(menuNext.equals("non-veg")) {
				//iterator.remove();
			//}
					//}
		//System.out.println(menu);
	
	// List already have removeIf method
		//removeIf() method is already designed with Predicate interface as parameter. 
	
	//menu.removeIf(menuItem ->menuItem.equals("non-veg"));
		menu.removeIf(FoodUtilLib::isNonVeg); //method reference => using existing method as function
		
	System.out.println(menu);
	
	}
	

}
