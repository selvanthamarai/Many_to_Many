package com.Books.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

private String name;


@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST,CascadeType.MERGE})
@JoinTable(name="person_likes",joinColumns= {@JoinColumn(name="person_id")},inverseJoinColumns= {@JoinColumn(name="books_bookId")})
private List<Books> books;



public List<Books> getBooks() {
	return books;
}

public void setBooks(List<Books> books) {
	this.books = books;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", books=" + books + "]";
}








}
