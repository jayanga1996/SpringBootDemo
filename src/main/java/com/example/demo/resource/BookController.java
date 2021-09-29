package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repositary.BookRepositary;

@RestController
public class BookController {

	@Autowired
	private BookRepositary repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Added book with id "+ book.getId();
	}
	
	@GetMapping("/books")
	public List<Book> getBook(){
		return repository.findAll();
	}
	
	@GetMapping("books/{id}")
	public Optional<Book> getBookbyId(@PathVariable int id) {
		return repository.findById(id);
	}
	
}