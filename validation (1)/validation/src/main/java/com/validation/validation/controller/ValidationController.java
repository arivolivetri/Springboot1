	package com.validation.validation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.validation.Service.ValidationService;
import com.validation.validation.entity.SelfEntity;

@RestController
@RequestMapping("/SelfEntity")
public class ValidationController {
     
	@Autowired
	public ValidationService ValidationService;
	
	@PostMapping(value="/create")
	public SelfEntity createSelfEntity(@RequestBody SelfEntity selfEntity)
	{
		ValidationService.saveuser(selfEntity);
		
		return selfEntity;
			
	}
	
	@GetMapping(value="/getall")
	public List<SelfEntity> getalluser()
	{
		
		
		return ValidationService.getall();		
	}
	

	@GetMapping(value="/search/{name}")
	public List<SelfEntity> searchSelfEntitybyname(@PathVariable("name")String name)
	{
		
		
		return ValidationService.searchAllselfEntitybyname(name);		
	}
	
}
