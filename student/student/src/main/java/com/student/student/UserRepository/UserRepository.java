package com.student.student.UserRepository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.student.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User,UUID> {

}
