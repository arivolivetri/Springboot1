package com.example.school.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.school.entity.SchoolMens;



@Repository

	public interface SchoolRepository extends CrudRepository<SchoolMens,UUID>
	{
		
	}


	

