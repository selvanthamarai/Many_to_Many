package com.Books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
