package com.example.demo.wishList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller // This means that this class is a Controller
public class wishController {
	
	
	  final String DB_URL = "jdbc:mysql://localhost:3306/book";
	    final String USER = "root";
	    final String PASS = "Lillia69$";
	
	    @GetMapping(path = "/inputWishList")
	public @ResponseBody String getAllwish(String user , int isbn) {

		
		return wishListInput(user,isbn);

	}
	
	
	
	@GetMapping(path = "/createWishList")
	public @ResponseBody String createWishList(String user) {

		// This returns a JSON or XML with the Books
		
		

		return createTable(user);

	}
	
	
	
	private String wishListInput(String user, int isbn) {
		
		
		
        try {
        	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			//INSERT INTO austin (id)
			//VALUES(1)
			  String sql = "INSERT INTO "+ user + " (id) VALUES("+ isbn+ ")"; 

	         stmt.executeUpdate(sql);
			
	         return "Wish list was added";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        return "Wish list not added";
		
		
	}
	
	private String createTable(String user) {
		
		
	    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();

		      ) {		 
	    	
	    if(	conn.getMetaData().getTables(null, null, user, null) != null    ) {
	    	
	    
	    	
	    	
		          String sql = "CREATE TABLE "+ user+ " " +
		                   "(id INTEGER not NULL);"; 

		         stmt.executeUpdate(sql);
		         return "table was created";
	    }
	    return "table was already created";
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
	    return "table was not created error";
	}
	
	
	
}
