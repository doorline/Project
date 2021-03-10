package com.mypj.test.controller;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypj.test.dto.ProductDTO;
import com.mypj.test.service.ProductService;

@Controller
@RequestMapping("/admin/*")
public class ProductController {
	
//	IService service;
//	SqlSession sqlSession;
	
	@Inject
	ProductService productService;
	
	//기능 upload(insert),list,delete,update(modify),uphit, detailView
	
	//리스트 화면 출력
	@RequestMapping("list")
	public String list(Model model) {

		List<ProductDTO> list = productService.listAll();		
		model.addAttribute("dtos", list);
		
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
		//파일 업로드를 위해 dto에서 내용가져오기
		String dName = dto.getpName();
		String dType = dto.getdType();
		Date dUploadDate = dto.getdUploadDate();
		
		productService.upload(dto);
		//productService
		return "redirect:/admin/list"; //또는 다른 화면
	}
	
	//수정을 위한 detailView
	@RequestMapping("detailView")
	public String detailView(Model model, HttpServletRequest request) {
		//url에 pcode 받아오기
		int pCode = Integer.parseInt(request.getParameter("pCode"));
		model.addAttribute("dto", productService.productDetail(pCode));
		
		return "/admin/detailView";
	}
	//detailView에서 수정버튼 누르면 update되는 서비스
	@RequestMapping("modify")
	public String modify(ProductDTO dto) {		
		productService.modify(dto);
		return "redirect:/admin/detailView/"+dto.getpCode(); //또는 다른 화면
	}
	
	//삭제는 list에서 삭제버튼 누르면 바로 실행
	@RequestMapping("delete")
	public String delete(HttpServletRequest request) {
		//메소드 파라미터에 어노테이션 쓰는걸로
		//url에서 pcode 받아오기
		int pCode = Integer.parseInt(request.getParameter("pCode"));
		productService.delete(pCode);
		return "redirect:/admin/list"; //또는 다른 화면
	}
}
