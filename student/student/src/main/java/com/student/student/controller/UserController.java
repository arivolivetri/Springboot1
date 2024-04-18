package com.student.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.student.Service.UserService;
import com.student.student.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	  public UserService userservice;
	
	@PostMapping(value="/create")
	public User createuser(@RequestBody User user)
	{
		userservice.saveuser(user);
		
		return user;
		
	}
}
