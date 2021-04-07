package com.sjw.mymember.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sjw.mymember.service.Constant;
import com.sjw.mymember.service.IMemberService;
import com.sjw.mymember.service.JoinService;
import com.sjw.mymember.service.LoginService;
import com.sjw.mymember.service.LogoutService;
import com.sjw.mymember.service.WithdrawalService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	IMemberService service;
	
	SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		Constant.sqlSession = this.sqlSession;
	}
	
	@RequestMapping("join_view")
	public String join_view(Model model) {
		System.out.println("join_view()");
		return "/member/join_view";
	}
	
	@RequestMapping(value = "join", method=RequestMethod.POST)
	public String join(HttpServletRequest request, Model model) {
		System.out.println("join()");

		model.addAttribute("request", request);
		service = new JoinService();
		service.execute(model);
		return "redirect:/member/login_view";
	}
	
	@RequestMapping("login_view")
	public String login_view(Model model) {
		System.out.println("login_view()");
		return "/member/login_view";
	}
	
	@RequestMapping(value = "login", method=RequestMethod.POST)
	public String login(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("login()");

		model.addAttribute("request", request);
		model.addAttribute("session", session);
		service = new LoginService();
		service.execute(model);
		return "/member/login_result_view";
	}
	
	@RequestMapping(value = "logout")
	public String logout(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("logout()");

		model.addAttribute("request", request);
		model.addAttribute("session", session);
		service = new LogoutService();
		service.execute(model);

		return "redirect:/member/logout_result_view";
	}
	@RequestMapping(value = "logout_result_view")
	public void logout_result_view(HttpServletRequest request, HttpSession session, Model model) {
		
		System.out.println("logout_result_view()");
		model.addAttribute("request", request);
	}
	
	@RequestMapping(value = "withdrawal")
	public String withdrawal(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("withdrawal()");

		model.addAttribute("request", request);
		model.addAttribute("session", session);
		service = new WithdrawalService();
		service.execute(model);
		return "redirect:/member/withdrawal_result_view";
	}
	@RequestMapping(value = "withdrawal_result_view")
	public void withdrawal_result_view(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("withdrawal_result_view()");

		model.addAttribute("request", request);
		model.addAttribute("session", session);
		logout(request,session,model);
	}
	
	
}
