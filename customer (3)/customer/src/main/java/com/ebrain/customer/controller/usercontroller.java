package com.ebrain.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebrain.customer.entity.User;
import com.ebrain.customer.service.UserService;


@RestController
@RequestMapping("/user")
public class usercontroller {
	@Autowired
	private UserService userservice;
	
	@PostMapping(value="/create")
	public User createuser(@RequestBody User user) {
		userservice.saveuser(user);
		
	return user;
	}
	}
	
	
	
	



