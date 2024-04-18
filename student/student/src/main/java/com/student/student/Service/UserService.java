package com.student.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student.UserRepository.UserRepository;
import com.student.student.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;
	
		public void saveuser(User user) {
			userrepository.save(user);
		}
	}
	


	