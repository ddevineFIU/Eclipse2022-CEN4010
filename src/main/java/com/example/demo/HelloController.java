package com.example.demo;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
	
	
	

    @Autowired
    private BookService service;

    @GetMapping("/")
    private APIResponse<List<book>> getProducts() {
        List<book> allProducts = service.findAllBooks();
       return new APIResponse<>(allProducts.size(),allProducts);
    }
}