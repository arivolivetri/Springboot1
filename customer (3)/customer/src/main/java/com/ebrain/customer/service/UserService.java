package com.ebrain.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebrain.customer.entity.User;
import com.ebrain.customer.repository.UserRepository;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;

public void saveuser(User user) {
	userRepository.save(user);
}



	
}
