package com.sjw.mybatisboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sjw.mybatisboard.service.Constant;
import com.sjw.mybatisboard.service.BContentService;
import com.sjw.mybatisboard.service.BDeleteService;
import com.sjw.mybatisboard.service.BListService;
import com.sjw.mybatisboard.service.BModifyService;
import com.sjw.mybatisboard.service.BReplyService;
import com.sjw.mybatisboard.service.BReplyViewService;
import com.sjw.mybatisboard.service.BUpHitService;
import com.sjw.mybatisboard.service.BWriteService;
import com.sjw.mybatisboard.service.IBoarderService;

@Controller
@RequestMapping("/board/*")
public class BController {
	
	IBoarderService service;
	SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		Constant.sqlSession = this.sqlSession;
	}
	
	@RequestMapping("list")
	public String list(Model model,  HttpSession session, HttpServletRequest request) {
		System.out.println("list()");
		model.addAttribute("login_user", session);
		model.addAttribute("request", request);
		
		service = new BListService();
		service.execute(model);
		return "/board/blist";
	}

	@RequestMapping("write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		return "/board/write_view";
	}

	@RequestMapping(value = "write",produces="text/plain; charset=UTF-8")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");

		model.addAttribute("request", request);
		service = new BWriteService();
		service.execute(model);
		return "redirect:/board/list";
	}

	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");

		model.addAttribute("request", request);
		service = new BContentService();
		service.execute(model);

		return "/board/content_view";
	}

	@RequestMapping(method = RequestMethod.POST, value = "modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify()");

		model.addAttribute("request", request);
		service = new BModifyService();
		service.execute(model);
		return "redirect:/board/list";
	}

	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view()");

		model.addAttribute("request", request);
		service = new BReplyViewService();
		service.execute(model);

		return "/board/reply_view";
	}

	@RequestMapping("reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");

		model.addAttribute("request", request);
		service = new BReplyService();
		service.execute(model);
		return "redirect:/board/list";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");

		model.addAttribute("request", request);
		service = new BDeleteService();
		service.execute(model);
		return "redirect:/board/delete_rs";
	}
	@RequestMapping("delete_rs")
	public void delete_rs(HttpServletRequest request, Model model) {
		System.out.println("delete_rs()");
		model.addAttribute("request", request);
		//return "redirect:/board/list";
	}
	@RequestMapping("upHit")
	public void upHit(HttpServletRequest request,Model model) {
		System.out.println("upHit()");

		model.addAttribute("request", request);
		service = new BUpHitService();
		service.execute(model);
		//return "redirect:content_view";
	}
}
