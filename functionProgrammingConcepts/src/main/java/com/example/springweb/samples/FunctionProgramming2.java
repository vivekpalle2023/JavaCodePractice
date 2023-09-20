package com.example.springweb.samples;

import java.util.function.BiConsumer;
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
	BiConsumer<Integer,Integer> biConsumer= (x,y)-> System.out.println(x+y);
	
	//no Input values are passed but returns output;
	Supplier<String> supplier = () -> "Vivek" + " Sreelekha" ;
	
	//Will take same dataType as input and return same dataType as output
	//Will take only String as input and returns String as output
	
	UnaryOperator<Integer> unaryOperator= y -> {if(y==1) {y=100;}return y;} ;
	
	//if Lambda expression need to work with primitive data types instead of Objects then try below
	
	IntBinaryOperator intBinaryOperator=(n1,n2)-> n1+n2;
	biConsumer.accept(20, 25);
	
	
	System.out.println(function.apply("Vivek"));
	System.out.println(biFunction.apply("Vivek",20));
	consumer.accept("Sreelekha");
	System.out.println(supplier.get());
	System.out.println(unaryOperator.apply(1));
	System.out.println(intBinaryOperator.applyAsInt(20,30));
}	

}
