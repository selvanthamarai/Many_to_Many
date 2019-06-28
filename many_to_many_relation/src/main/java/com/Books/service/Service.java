package com.Books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Books.model.Books;
import com.Books.model.Person;
import com.Books.repository.BookRepository;
import com.Books.repository.PersonRepository;

@Component
public class Service {

	@Autowired
	PersonRepository rep;
	@Autowired
	BookRepository reposit;
	
	
	public Books addsDetail(Books D) {
		return reposit.save(D);
		
	}
	public Person addDetail(Person C) {
		return rep.save(C);
		
	}
	
	
}
