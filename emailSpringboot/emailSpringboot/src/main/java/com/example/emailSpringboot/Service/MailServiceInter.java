package com.example.emailSpringboot.Service;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.emailSpringboot.Entity.EmailEntity;



@Service
public  class MailServiceInter implements UserService {
	@Autowired
    private JavaMailSender javamailsender;
@Value ("${spring.mail.username}")private String sender;

	@Override
		public String sendsimpleMail(EmailEntity details) {
		try {
			SimpleMailMessage mailmessage=new SimpleMailMessage();
			mailmessage.setFrom(sender);
            mailmessage.setTo(details.getRecipient());
            mailmessage.setText(details.getBody());
            mailmessage.setSubject(details.getSubject());
 
            // Sending the mail
            javamailsender.send(mailmessage);
            return "Mail Sent Successfully...";
		
		
		}
		catch (Exception e) {
            return "Error while Sending Mail";
		
		}
	}

	/*@Override
	public String sendmailWithAttachment(EmailEntity details) {
		
		MimeMessage mimeMessage= javamailsender.createMimeMessage();
		
		MimeMessageHelper mimeMessageHelper;
   try {
    	 
        // Setting multipart as true for attachments to
        // be send
        mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setFrom(sender);
        mimeMessageHelper.setTo(details.getRecipient());
        mimeMessageHelper.setText(details.getBody());
        mimeMessageHelper.setSubject( details.getSubject());
        
        FileSystemResource file = new FileSystemResource(new File(details.getAttachment()));

  //  FileSystemResource file1 = null;
	mimeMessageHelper.addAttachment(file.getFilename(), file);

    // Sending the mail
    javamailsender.send(mimeMessage);
    return "Mail sent Successfully";
		
		
	}
	
    catch(Exception e) {
    	 e.printStackTrace();
        // Display message when exception occurred
        return "Error while sending mail!!!";
    }

	 
}*/
	@Override
	public String sendmailWithAttachment(EmailEntity details) {
	    try {
	        MimeMessage mimeMessage = javamailsender.createMimeMessage();
	        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
	        mimeMessageHelper.setFrom(sender);
	        mimeMessageHelper.setTo(details.getRecipient());
	        mimeMessageHelper.setText(details.getBody());
	        mimeMessageHelper.setSubject(details.getSubject());
	        
	        String attachmentPath = details.getAttachment();
	        if (attachmentPath != null) {
	            FileSystemResource file = new FileSystemResource(new File(attachmentPath));
	            mimeMessageHelper.addAttachment(file.getFilename(), file);
	        }

	        javamailsender.send(mimeMessage);
	        return "Mail sent Successfully";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "Error while sending mail!!!";
	    }
	}

}


