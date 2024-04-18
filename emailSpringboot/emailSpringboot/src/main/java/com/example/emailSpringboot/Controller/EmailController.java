package com.example.emailSpringboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emailSpringboot.Entity.EmailEntity;
import com.example.emailSpringboot.Service.UserService;

@RestController
@RequestMapping("/EmailEntity")
public class EmailController {
	
@Autowired 
private UserService userservice;

@PostMapping("/mail")
public String mail(@RequestBody EmailEntity details)
{
	 
	String status = userservice.sendsimpleMail(details);

 return status;
}

@PostMapping("/sendMailWithAttachment")
public String sendMailWithAttachment(@RequestBody EmailEntity details)
{
    String status = userservice.sendmailWithAttachment(details);

   
	return status;
}
}
