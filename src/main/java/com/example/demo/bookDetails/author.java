package com.example.demo.bookDetails;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "author")
public class author {

	@Id
	private int authorid;
	
	private String author;
	
	private String biography;
	
	private String publisher;

	
	
	public author() {
		
	}
	public author(String author, String biography, String publisher, int authorid) {
		super();
		this.authorid = authorid;
		this.author = author;
		this.biography = biography;
		this.publisher = publisher;
	}

	
	
	public int getAuthorId() {
		return authorid;
	}
	public void setAuthorId(int authorId) {
		this.authorid = authorId;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	
	
}