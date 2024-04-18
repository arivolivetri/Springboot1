package com.example.Student.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Entity.Student;
import com.example.Student.StudentRepository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	 private StudentRepository StudentRepository;
	 
	public void saveuser(Student student) {
	
		StudentRepository.save(student);
	}
	

}
