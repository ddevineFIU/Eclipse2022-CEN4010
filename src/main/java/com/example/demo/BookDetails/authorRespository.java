package com.example.demo.BookDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bookSearch.book;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface authorRespository extends JpaRepository<book, Integer> {

	//List<author> findByauthorIgnoreCase(String genre);



}