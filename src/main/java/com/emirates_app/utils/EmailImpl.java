package com.emirates_app.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailImpl implements Email {
	@Autowired
	JavaMailSender sender;

	@Override
	public void emailSend(String to, String sub, String text) {
		SimpleMailMessage s = new SimpleMailMessage();
		s.setTo(to);
		s.setSubject(sub);
		s.setText(text);

		sender.send(s);

	}

}
