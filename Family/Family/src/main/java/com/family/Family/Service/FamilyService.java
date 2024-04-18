package com.family.Family.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.Family.Repository.FamilyRepository;
import com.family.Family.entity.Daughter;

@Service
public class FamilyService {

	@Autowired
	private  FamilyRepository familyRepository;
	
		public void saveuser(Daughter Daughter)
		{
			
		}
	
}
