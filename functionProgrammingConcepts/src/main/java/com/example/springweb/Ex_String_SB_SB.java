package com.example.springweb;

import java.util.List;
import java.util.ArrayList;

public class Ex_String_SB_SB {
	
	public static void main (String args[]) {
		
//Reverse entire String
		
StringBuffer SB=new StringBuffer("this is javatpoint");
System.out.println(SB.reverse());

//To upper case

String s1="this is javatpoint";
System.out.println(s1.toUpperCase());

//Reverse of words

int count=0;
int count1=0;
String a="India is my country";
StringBuffer sb1=new StringBuffer("");
List<Integer> b = new ArrayList<>();
b.add(0);
for(int i=0;i<a.length();i++) {
	
	 if(a.charAt(i)!=' ') {
		count++;		
	}
	 else if(a.charAt(i)==' ') {
		count1++;
		b.add(count);
	}
}
b.add(a.length()-count1);
System.out.println("Total no of words are " + b);

for(int j=0;j<b.size()-1;j++) {
	
	sb1.append(a.replaceAll("\\s","").substring(b.get(j),b.get(j+1))).reverse();}
	
}
	

}
