package com.example.demo.wishList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller // This means that this class is a Controller
public class wishController {
	
	@Autowired
	private wishRespository wishRepository;
	
	@GetMapping(path = "/wishlist")
	public @ResponseBody Iterable<wishList> getAllwish(int ISBN, String bookName,String username) {

		// This returns a JSON or XML with the Books
		wishRepository.saveAndFlush(new wishList(ISBN,bookName,username));
		return wishRepository.findAll();

	}
	
}
