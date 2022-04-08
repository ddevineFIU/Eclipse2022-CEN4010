package com.example.demo.BookDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Controller // This means that this class is a Controller
public class aurthorController {

	
	@Autowired
	private authorRespository authorRepository;

	@GetMapping(path = "/Authors")
	public @ResponseBody Iterable<author> getAllauthors(String author,int id) {
// This returns a JSON or XML with the Bookss
		
		
		authorRepository.saveAndFlush(new author(author,"test","test",id));
		return authorRepository.findAll();
	}
	
	@GetMapping(path = "/HelloWorld")
	public String HelloWorld() {
		return "Hello World";
	}

	
}
