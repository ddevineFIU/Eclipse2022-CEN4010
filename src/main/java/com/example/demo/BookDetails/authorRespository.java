package com.example.demo.BookDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface authorRespository extends JpaRepository<author, Integer> {

	//List<author> findByauthorIgnoreCase(String genre);



}