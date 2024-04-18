package com.validation.validation.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.validation.validation.entity.SelfEntity;

@Repository
public interface ValidationRepository extends CrudRepository<SelfEntity, UUID>{
 
	public List<SelfEntity>findAllByName(String name);
	
}

	