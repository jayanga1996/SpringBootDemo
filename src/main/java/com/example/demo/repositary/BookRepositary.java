package com.example.demo.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Book;

public interface BookRepositary extends MongoRepository<Book,Integer>{

}

