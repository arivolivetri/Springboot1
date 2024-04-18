package com.example.school.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.Repository.SchoolRepository;
import com.example.school.entity.SchoolMens;



@Service
public class SchoolService {

	
	@Autowired
	private SchoolRepository SchoolRepository;

	public void saveuser(SchoolMens schoolMens) {
		SchoolRepository.save(schoolMens);
	}
	

	
}
