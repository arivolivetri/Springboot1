package com.example.emailSpring.EmailService;

public interface Service {
	String sendSimpleMail(EmailDetails details);
	 
    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
