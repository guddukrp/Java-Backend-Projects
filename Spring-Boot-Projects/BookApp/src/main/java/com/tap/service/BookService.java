package com.tap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tap.entity.BookEntity;
import com.tap.entity.Student;
import com.tap.repo.BookRepo;
import com.tap.repo.StudentRepo;

@Component
public class BookService {

	@Autowired
	BookRepo br;
	
	@Autowired
	StudentRepo sr;
	
	public List<BookEntity> getAllBooks() {
		 List<BookEntity> list = (List<BookEntity>) br.findAll();
		 return list;
	}
	
	public List<Student> getAllStudents(){
		List<Student> list = (List<Student>)sr.findAll();

		return list;
	}
}
