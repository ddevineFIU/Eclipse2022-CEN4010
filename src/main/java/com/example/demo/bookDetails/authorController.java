package com.example.demo.BookDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.objects.author;



@RestController
@Controller // This means that this class is a Controller
public class authorController {

	
	@Autowired
	private authorRespository authorRepository;

	@GetMapping(path = "/Author/Add") //Must Have 3 KEYS
	public @ResponseBody Iterable<author> getAllauthorsADD(String author, String biography, String publisher) {
	// This returns a JSON or XML with the Books	
		authorRepository.saveAndFlush(new author(author, biography, publisher));
		return authorRepository.findAll();
	}
	
}
