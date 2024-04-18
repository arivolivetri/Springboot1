package com.example.verification.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.verification.Entity.EntityClass;

@Repository
public interface VerificationRepository extends CrudRepository<EntityClass, UUID> {
	EntityClass findByName(String name);
	}

