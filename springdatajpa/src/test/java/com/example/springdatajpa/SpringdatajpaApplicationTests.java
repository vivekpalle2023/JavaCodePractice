package com.example.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdatajpa.entities.Student;
import com.example.springdatajpa.repos.StudentRepository;


@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
    StudentRepository repository;
	
	@Test
	void testSaveStudent() {
		
		repository.save(new Student());
		
		Student student=new Student();
			
		student.setId(1l);
		
		student.setName("Siddu");
		
		student.setTestScore(101);
		
	    repository.save(student);
		
		student.setId(2l);
		
		student.setName("DKS");
		
		student.setTestScore(150);
		
	    repository.save(student);
		
	    //BY INDEX using findAll() method
	   
	    // To retrieve details of ID : 1
		
	   Student savedstudent1=repository.findAll().get(1);
		
		  System.out.println("My ID is "+ savedstudent1.getId()+ " and my name is " + savedstudent1.getName()+
    		             ". I got "+ savedstudent1.getTestScore() +" score in this Assembly election.");
		  

	       // To update name details of Id : 1
		  
		  if(savedstudent1.getName()=="Siddu") {
			  savedstudent1.setName("Kharga");
			  repository.save(savedstudent1);
			  System.out.println("My name is update to "+savedstudent1.getName());
	    	}
	    			   
	        ///To delete ID= details
  		
				repository.deleteById(2l);
				
				Student afterdeletion= repository.findAll().get(1);
				
			    System.out.println("You all are deleted. I am the CM: " + afterdeletion.getName());
		
	}

}
