package com.family.Family.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.family.Family.entity.Daughter;

@Repository
public interface FamilyRepository  extends CrudRepository<Daughter, String>{

}
