package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
	private MailSender mailSender;
	
	public void sendMail(String toAddress, String fromAddress,
				String subject, String msgBody) {
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom(fromAddress); //보낸이
		smm.setTo(toAddress);	//받는 이 
		smm.setSubject(subject);
		smm.setText(msgBody);
		
		mailSender.send(smm); //메일이간다
	}
}
