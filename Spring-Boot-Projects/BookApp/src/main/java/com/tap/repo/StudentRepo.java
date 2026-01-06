package com.tap.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.tap.entity.Student;

@Component
public interface StudentRepo extends CrudRepository<Student , Integer>{

}
