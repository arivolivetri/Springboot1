package com.example.emailSpringboot.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailEntity {

	private String recipient;
	private  String body;
	private String subject;
	private String Attachment;
	
		
	}

