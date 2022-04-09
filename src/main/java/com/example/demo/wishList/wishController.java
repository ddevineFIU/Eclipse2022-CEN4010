package com.example.demo.wishList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bookDetails.author;
import com.example.demo.bookDetails.authorRespository;

@RestController
@Controller // This means that this class is a Controller
public class wishController {
	
	@Autowired
	private wishRespository wishRepository;
	
	@GetMapping(path = "/wishlist")
	public @ResponseBody Iterable<wishList> getAllwish(String author,int id) {
// This returns a JSON or XML with the Books
	
	
		wishRepository.saveAndFlush(new author(author,"test","test",id));
		return wishRepository.findAll();
	
	
	
	}
	
	
	//testing wishlist controller
	@GetMapping(path = "/HelloWorld")
	public String HelloWorld() {
		return "Hello World";
	}
	
	
	
}
