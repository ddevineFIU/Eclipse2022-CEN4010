
package com.example.demo.bookSearch;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "book")
public class book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ISBN;

	private String author;

	private String bookname;

	private String genre;
	
	private Integer copiessold;

	public Integer getISBN() {
		return ISBN;
	}

	public void setISBN(Integer ISBN) {
		this.ISBN = ISBN;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		this.author = author;
	}

	public String getbookname() {
		return bookname;
	}

	public void setbookname(String bookname) {
		this.bookname = bookname;
	}

	public Integer getcopiessold() {
		return copiessold;
	}

	public void setCopiesSold(Integer copiessold) {
		this.copiessold = copiessold;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}