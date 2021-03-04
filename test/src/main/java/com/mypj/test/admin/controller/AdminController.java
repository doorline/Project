package com.mypj.test.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	
	IService service;
	SqlSession sqlSession;
	
	//기능 upload(insert),list,delete,update(modify),uphit, detailView
	
	//리스트 화면 출력
	@RequestMapping("list")
	public String list(Model model) {
		service = new adminListService();
		service.execute(model);
		return "/admin/list";
	}
	
	//업로드 화면 출력, 리스트에서 업로드 버튼을 누르면 나오는 화면
	@RequestMapping("uploadView")
	public String uploadView(Model model) {
		return "/admin/uploadView";
	}
	
	//uploadView에서 작성후 업로드 버튼을 누르면 실제로 db에 올라가는 서비스
	@RequestMapping("upload")
	public String upload(Model model, HttpServletRequest request) {
		//uploadView form에서 작성한 내용 request객체에 받아옴
		model.addAttribute("request", request);		
		service = new adminUploadService();
		service.execute(model);
		return "redirect:/admin/list"; //또는 다른 화면
	}
	
	//수정을 위한 detailView
	@RequestMapping("detailView")
	public String upload(Model model, HttpServletRequest request) {
		//url에 pcode 받아오기
		String pCode = request.getParameter("pCode");		
		model.addAttribute("pCode", pCode);		
		service = new adminDetailViewService();
		service.execute(model);
		
		return "/admin/detailView";
	}
	//detailView에서 수정버튼 누르면 update되는 서비스
	@RequestMapping("modify")
	public String upload(Model model, HttpServletRequest request) {
		//upload랑 비슷하게 작성
		model.addAttribute("request", request);		
		service = new adminModifyService();
		service.execute(model);
		return "redirect:/admin/list"; //또는 다른 화면
	}
	
	//삭제는 list에서 삭제버튼 누르면 바로 실행
	@RequestMapping("delete")
	public String upload(Model model, HttpServletRequest request) {
		//url에서 pcode 받아오기
		String pCode = request.getParameter("pCode");
		model.addAttribute("pCode", pCode);		
		service = new adminDeleteService();
		service.execute(model);
		return "redirect:/admin/list"; //또는 다른 화면
	}
}
