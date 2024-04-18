package com.example.verification.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.example.verification.Entity.EntityClass;
import com.example.verification.Repository.VerificationRepository;

@Service
public class VerficationService {
	
	@Autowired
	
	public VerificationRepository verificationRepository;
	
	
		public EntityClass saveEntity(EntityClass entity) {
	        try {
	            return verificationRepository.save(entity);
	        } catch (DataIntegrityViolationException e) {
	            // Handle unique constraint violation (duplicate name)
	            return null;
	        }
	}}

