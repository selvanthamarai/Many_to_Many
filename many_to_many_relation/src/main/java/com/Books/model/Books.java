package com.Books.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Books {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookId;
	
	@Column(name = "bookName")
	private String bookName;
	
	
	

	@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="person_likes",joinColumns= {@JoinColumn(name="person_id")},inverseJoinColumns= {@JoinColumn(name="books_bookId")})
	private List<Person> person;
	


	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", person=" + person + "]";
	}

	
	
}
