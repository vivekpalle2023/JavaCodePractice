package com.example.springdatajpa1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa1.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
