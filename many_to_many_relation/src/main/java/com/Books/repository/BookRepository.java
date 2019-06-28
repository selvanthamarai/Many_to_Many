package com.Books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.model.Books;

public interface BookRepository extends JpaRepository<Books, Long> {

}
