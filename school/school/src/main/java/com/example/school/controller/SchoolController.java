package com.example.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.Service.SchoolService;
import com.example.school.entity.SchoolMens;

@RestController
@RequestMapping("/SchoolMens")
public class SchoolController {
	@Autowired
	private SchoolService SchoolService;
	
	@PostMapping(value="/create")
	
	private SchoolMens createSchoolMens(@RequestBody SchoolMens SchoolMens)
	{
		SchoolService.saveuser(SchoolMens);
		
		return SchoolMens;
		
	}

}
