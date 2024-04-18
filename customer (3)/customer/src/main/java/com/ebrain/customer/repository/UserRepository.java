package com.ebrain.customer.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebrain.customer.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,UUID> {

}
