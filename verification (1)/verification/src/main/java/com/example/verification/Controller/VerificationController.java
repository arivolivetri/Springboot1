package com.example.verification.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.verification.Entity.EntityClass;
import com.example.verification.Service.VerficationService;

@RestController
@RequestMapping("/EntityClass")
public class VerificationController {

	@Autowired
	
	public VerficationService verificationservice;
	
	
	@PostMapping(value="/post")
	public ResponseEntity<?> createEntity(@RequestBody EntityClass entity) {
        try {
            EntityClass savedEntity = verificationservice.saveEntity(entity);
            return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            if (entity != null){
                return new ResponseEntity<>("Name must be unique", HttpStatus.BAD_REQUEST);
            } else {
                return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
            }
}
	}
}