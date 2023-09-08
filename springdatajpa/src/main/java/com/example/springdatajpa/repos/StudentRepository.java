package com.example.springdatajpa.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.springdatajpa.entities.Student;

/*JpaRepository class will automatically provide us all CRUD operations 
when we use this interface on other classes */

public interface StudentRepository extends JpaRepository<Student,Long>{

}
