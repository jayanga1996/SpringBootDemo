package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.repositary.AuthorRepositary;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorRepositary authorRepository;
	
	@PostMapping("/addaAuthor")
	private String addAuthor(@RequestBody Author author) {
		authorRepository.save(author);
		return "Author added";
	}
	
	@GetMapping("/author")
	private List<Author> getAuthor(){
		return authorRepository.findAll();
	}
	
	
	
}
