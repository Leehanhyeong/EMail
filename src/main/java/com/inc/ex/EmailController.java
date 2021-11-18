package com.inc.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.service.MailService;

@Controller
public class EmailController {
	
	@Autowired
	private MailService mailService;
	
	
	//DB작업이 필요한 만큼의 DAO들 선언해야 함
	@RequestMapping("/sendMail")
	public ModelAndView sendEmail(String id, String email) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		//비밀번호 변경이면 salt값 구한다.
		
		//임시비밀번호 만든다. 
		
		//임시비밀번호를 DB에 저장
		//기타등등
		
		//메일 보낸다.
		String fromAddr = "rndurdk2@gmail.com";
		String subject = "[테스트]알림 메일입니다.";
		
		String body = "안녕하세요?\r\n인크레파스입니다.\r\n SMTP테스트 메일입니다.";
		mailService.sendMail(email, fromAddr, subject, body);
		mv.setViewName("/");
		return mv;
	}
	
	
	
	
	
}
