package com.watching.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/users")
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/login")
	public void login(String error, String logout, Model model) {
		logger.info("로그인페이지로 이동");
		logger.info("err : "+error);
		logger.info("logout : "+logout);
		if(error != null) {
			model.addAttribute("error","로그인실패");
		}
		if(logout != null) {
			model.addAttribute("logout","로그아웃");
		}
	}
	
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	public void doLogin(String error) {
		logger.info("doLogin");
		logger.info("err:"+error);
	}
	
	@GetMapping("/member")
	public void doMemberLogin() {
		logger.info("Member Login");
	}
	
	@GetMapping("/admin")
	public void doAdminLogin() {
		logger.info("Admin Login");
	}

}
