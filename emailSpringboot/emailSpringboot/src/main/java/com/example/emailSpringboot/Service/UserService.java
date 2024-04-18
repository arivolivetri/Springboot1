package com.example.emailSpringboot.Service;
import org.springframework.stereotype.Service;

import com.example.emailSpringboot.Entity.EmailEntity;
@Service
public interface UserService {
 
	public String sendsimpleMail(EmailEntity details);
	
	public String sendmailWithAttachment(EmailEntity details);

	
	
}
