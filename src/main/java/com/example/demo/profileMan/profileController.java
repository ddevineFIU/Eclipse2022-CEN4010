// DO NOT FUCKING TOUCH 

package com.example.demo.profileMan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.objects.book;
import com.example.demo.objects.user;

@RestController
@Controller // This means that this class is a Controller
public class profileController {

	@Autowired // This means to get the bean called BooksRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private profileRepository profileRepository;

	@GetMapping(path = "/profile/credit")
	public String getCreditcardsByuser(@RequestParam String user) {
		List<user> list = profileRepository.findByname(user);
		String creditCards = "List of cards\n";
		for (int i = 0; i < list.size(); i++) {
			creditCards += "Credit card "  + i + ": " + list.get(0).getCreditcard();
		}

		return creditCards;

	}

}