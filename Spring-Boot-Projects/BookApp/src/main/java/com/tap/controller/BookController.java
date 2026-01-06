package com.tap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.entity.BookEntity;
import com.tap.entity.Student;
import com.tap.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bs;
	
	@GetMapping("/books")
	public List<BookEntity> getAllBooks(){
		
		return bs.getAllBooks();
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return bs.getAllStudents();
	}
}
