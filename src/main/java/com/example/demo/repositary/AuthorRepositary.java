package com.example.demo.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Author;

public interface AuthorRepositary extends MongoRepository<Author,Integer>{
	
}