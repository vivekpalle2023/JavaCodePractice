package com.example.springdatajpa1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.notNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdatajpa1.model.Student;
import com.example.springdatajpa1.repos.StudentRepository;


@SpringBootTest
class Springdatajpa1ApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	void testSaveStudents() {
	
		Student s1=new Student();
		s1.setId(1l);
		s1.setName("Vivek");
		s1.setTestScore(200);
		repository.save(s1);
		
		Student savedStudent=repository.findById(1l).get();
	
		assertEquals(savedStudent.getId(), 1l);
		
		
	}




}

