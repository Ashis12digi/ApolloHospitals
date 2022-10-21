package com.example.demo.pojo;
	
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*; 
import javax.activation.*;  
	  
	public class MailSender  
	{  
	 public static void main(String [] args){  
	      String to = "ashmaity456@gmail.com";//change accordingly  
	      String from = "ashismaity813@gmail.com"; 
	      String host = "mail.smtp.port";//or IP address  
	  
	      final String username = "ashmaity456@gmail.com";
	      final String password = "yamazwqpxsysboyd";
	      //yamazwqpxsysboyd

	        
	     //Get the session object  
	      Properties properties = System.getProperties();
	      properties.put("mail.smtp.host", "smtp.gmail.com");  
	      properties.put("mail.smtp.port", "465");
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.socketFactory.port", "465");
	      properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	      Session session = Session.getInstance(properties,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });
	  
	     //compose the message  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	         message.setSubject("Ping");  
	         message.setText("Hello, this is example of sending email  ");  
	  
	         // Send message  
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	   }  
	}  