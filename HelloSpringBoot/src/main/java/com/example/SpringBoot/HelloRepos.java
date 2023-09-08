package com.example.SpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepos extends JpaRepository<HelloEntity, Integer> {

}
