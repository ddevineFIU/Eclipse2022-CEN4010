package com.example.demo.wishList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "wishlist")

public class wishList {

	@Id	
	private int isbn;
	
	private String bookName;
	
	private String username;
	
	public wishList() {
		
	}
	public wishList(int isbn, String bookName, String username) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.username = username;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
	
