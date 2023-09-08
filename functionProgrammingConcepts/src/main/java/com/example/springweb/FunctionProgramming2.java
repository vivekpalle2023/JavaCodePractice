package com.example.springweb;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;



public class FunctionProgramming2 {

public static void main(String[] args) {
	
	Function<String,Integer> function=(s)-> 10+s.length();
	
	BiFunction<String,Integer,Integer> biFunction=(a,b) -> a.length() + b;
	
	//void return type, hence you cannot return any values
	Consumer<String> consumer= x -> System.out.println(x.length()*10);
	
	//no Input values are passed but returns output;
	Supplier<String> supplier = () -> "Vivek" + " Sreelekha" ;
	
	//Will take only String as input and returns String as output
	
	UnaryOperator<String> unaryOperator= y -> {if(y.equals("Vivek")) {return "Sreelekha";}
	return y;} ;
	
	//if Lambda expression need to work with primitive data types instead of Objects then try below
	
	IntBinaryOperator intBinaryOperator=(n1,n2)-> n1+n2;
	
	
	
	System.out.println(function.apply("Vivek"));
	System.out.println(biFunction.apply("Vivek",20));
	consumer.accept("Sreelekha");
	System.out.println(supplier.get());
	System.out.println(unaryOperator.apply("Aariv"));
	System.out.println(intBinaryOperator.applyAsInt(20,30));
}	

}
