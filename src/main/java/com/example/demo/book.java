package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class book {
    @Id
    @GeneratedValue
    private  int id;
    private String bookname;
    private int author;
	public book(int id, String bookname, int author) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
	}

   
}