package com.sjw.homebook.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjw.homebook.service.Constant;
import com.sjw.homebook.service.HDeleteService;
import com.sjw.homebook.service.HListService;
import com.sjw.homebook.service.HModifyService;
import com.sjw.homebook.service.HModifyViewService;
import com.sjw.homebook.service.HWriteService;
import com.sjw.homebook.service.IHService;

@Controller
@RequestMapping("/homebook/*")
public class Hcontroller {
	
	IHService service;
	SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		Constant.sqlSession = this.sqlSession;
	}
	@RequestMapping("list")
	public String list(Model model, HttpSession session, HttpServletRequest request) {
		System.out.println("HList()");
		model.addAttribute("login_user", session);
		model.addAttribute("request", request);
		
		service = new HListService();
		service.execute(model);
		
		return "/homebook/hlist";
	}
	@RequestMapping("write_view")
	public String write_view(Model model) {
		System.out.println("Hwrite_view()");
		return "/homebook/hwrite_view";
	}
	@RequestMapping(value = "write",produces="text/plain; charset=UTF-8")
	public String write(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("Hwrite()");

		model.addAttribute("request", request);
		model.addAttribute("login_user", session);
		service = new HWriteService();
		service.execute(model);
		return "redirect:/homebook/hlist";
	}
	@RequestMapping("modify_view")
	public String modify_view(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("Hmodify_view()");
		model.addAttribute("request", request);
		model.addAttribute("login_user", session);
		service = new HModifyViewService();
		service.execute(model);
		return "/homebook/hmodify_view";
	}
	@RequestMapping("modify")
	public String modify(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("Hmodify()");

		model.addAttribute("request", request);
		model.addAttribute("login_user", session);
		service = new HModifyService();
		service.execute(model);
		return "redirect:/homebook/hlist";
	}
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, HttpSession session, Model model) {
		System.out.println("Hdelete()");
		
		model.addAttribute("login_user", session);
		model.addAttribute("request", request);
		service = new HDeleteService();
		service.execute(model);
		return "redirect:/homebook/hlist";
	}

}
