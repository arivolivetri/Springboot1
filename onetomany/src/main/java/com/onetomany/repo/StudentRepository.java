package com.onetomany.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	
}
