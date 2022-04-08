// DO NOT FUCKING TOUCH 

package com.example.demo.bookSearch;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface bookRespository extends JpaRepository<book, Integer> {

	List<book> findBygenreIgnoreCase(String genre);
	
	List<book> findByAuthor(String author);	
	
	//example search
	List<book> findByisbn(Integer isbn);

	List<book> findBycopiessold(Integer copiessold);

}