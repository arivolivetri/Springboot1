package com.validation.validation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.validation.Repository.ValidationRepository;
import com.validation.validation.entity.SelfEntity;

@Service
public class ValidationService {

	
	@Autowired
	private ValidationRepository ValidationRepository;
	
	public String saveuser(SelfEntity selfEntity) {
	     ValidationRepository.save(selfEntity);
	     return"create successfull";
	}
	public List<SelfEntity> getall() {
	    return  (List<SelfEntity>) ValidationRepository.findAll();
	
	}	
	public List<SelfEntity> searchAllselfEntitybyname( String name) {
	  
	return ValidationRepository.findAllByName(name);
}
	
}
