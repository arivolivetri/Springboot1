package com.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.entity.Student;
import com.onetomany.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping(value="/create")
	public Student createStudent(@RequestBody Student student)
	{
		studentservice.saveuser(student);
		
		return student;
		
	}
	

}
