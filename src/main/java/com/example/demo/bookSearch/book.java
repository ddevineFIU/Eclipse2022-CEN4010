// DO NOT FUCKING TOUCH 
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
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private Integer isbn;

	private String author;

	private String bookname;
	
	//
	private String bookdescrip;
	
	private Float price;
    //
	
	private String genre;
	
	//
	private String publisher;
	
	private Integer yearpublished;
	//
	
	private Integer copiessold;
	
	//
	public book() {

	}
	public book(Integer isbn, String author, String bookname, String bookdescrip, Float price,
            String genre, String publisher, Integer yearpublished, Integer copiessold) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.bookname = bookname;
		this.bookdescrip = bookdescrip;
		this.price = price;
		this.genre = genre;
		this.publisher = publisher;
		this.yearpublished = yearpublished;
		this.copiessold = copiessold;
	}

	public String getBook() {
		return bookname;
	}

	public void setBook(String bookname) {
		this.bookname = bookname;
	}
	//
	
	public Integer getisbn() {
		return isbn;
	}

	public void setisbn(Integer isbn) {
		this.isbn = isbn;
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
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getYearpublished() {
		return yearpublished;
	}

	public void setYearpublished(Integer yearpublished) {
		this.yearpublished = yearpublished;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getBookdescrip() {
		return bookdescrip;
	}

	public void setBookdescrip(String bookdescrip) {
		this.bookdescrip = bookdescrip;
	}
	
	

}