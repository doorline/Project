package com.sjw.mymember.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

public class LogoutService implements IMemberService {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession) map.get("session");
		
		request.removeAttribute("login_result");
		session.removeAttribute("id");
		session.removeAttribute("login_user");
		session.removeAttribute("session");
		//session과 request가 비었는지 확인
		System.out.println(session.getAttributeNames());
		System.out.println(request.getAttributeNames());
		
		if(session.getAttribute("login_user") == null && session.getAttribute("session") == null) {
			System.out.println("logout_ok");
			model.addAttribute("rs", 1);
		}else {
			model.addAttribute("rs", 0);
		}
		//결과반환
		

	}

}
