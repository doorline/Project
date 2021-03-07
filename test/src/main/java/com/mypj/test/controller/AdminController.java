package com.mypj.test.controller;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mypj.test.service.AdminService;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	
//	IService service;
//	SqlSession sqlSession;
	
	@Inject
	AdminService adminService;
	
	//기능 upload(insert),list,delete,update(modify),uphit, detailView
	
	//리스트 화면 출력
	@RequestMapping("list")
	public String list(Model model) {

		List<ProductDTO> list = adminService.listAll();		
		model.addAllAttributes("dtos", list);
		
		return "/admin/list";
	}
	
	//업로드 화면 출력, 리스트에서 업로드 버튼을 누르면 나오는 화면
	@RequestMapping("uploadView")
	public String uploadView(Model model) {
		return "/admin/uploadView";
	}
	
	//uploadView에서 작성후 업로드 버튼을 누르면 실제로 db에 올라가는 서비스
	@RequestMapping("upload")
	public String upload(ProductDTO dto) throws Exception{

		adminService.upload(dto);
		return "redirect:/admin/list"; //또는 다른 화면
	}
	
	//수정을 위한 detailView
	@RequestMapping("detailView/{pCode}")
	public String detailView(Model model, HttpServletRequest request) {
		//url에 pcode 받아오기
		int pCode = Integer.parseInt(request.getParameter("pCode"));
		model.addAttribute("dto", adminService.productDetail(pCode));
		
		return "/admin/detailView";
	}
	//detailView에서 수정버튼 누르면 update되는 서비스
	@RequestMapping("modify/{pCode}")
	public String upload(ProductDTO dto) {		
		adminService.modify(dto);
		return "redirect:/admin/detailView/"+dto.getPcode(); //또는 다른 화면
	}
	
	//삭제는 list에서 삭제버튼 누르면 바로 실행
	@RequestMapping("delete")
	public String delete(HttpServletRequest request) {
		//url에서 pcode 받아오기
		int pCode = Integer.parseInt(request.getParameter("pCode"));
		adminService.delete(pCode);
		return "redirect:/admin/list"; //또는 다른 화면
	}
}
