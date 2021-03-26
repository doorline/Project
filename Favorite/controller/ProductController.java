package com.watching.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.watching.dto.ProductDTO;
import com.watching.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {
	
	@Inject
	ProductService service;
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	// 업로드
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public ModelAndView uploadForm () {
        
		ModelAndView mv = new ModelAndView();
		mv.setViewName("upload");
		
        return mv;
	}
	
	// 업로드
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String uploadSubmit (ProductDTO dto) {
	    
		MultipartFile uploadfile = dto.get();
		if (uploadfile != null) {
			String dName = uploadfile.getOriginalFilename();
			dto.setdName(dName);
			try {
				File data = new File(dName);
				uploadfile.transferTo(dName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	       return "redirect:/list";
		}
	
	// 목록
	@RequestMapping("/list")
	public void list(Model model) throws Exception {
		
		List<ProductDTO> list = null;
		list = service.list();
		
		model.addAttribute("list", list);
	}
	
	// 조회
	@RequestMapping("/view")
	public void view(@RequestParam("pCode") int pCode, Model model) throws Exception {
		
		ProductDTO dto = service.view(pCode);
		
		model.addAttribute("view", dto);
	}
	
	// 수정
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(ProductDTO dto) throws Exception {
		
		service.modify(dto);
		
		return "redirect:";
		
	}
	
	// 삭제
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("pCode")int pCode) throws Exception {
		
		service.delete(pCode);
		
		return "redirect:/admin/list";
	}
	
	// 조회수
	@RequestMapping(value="/uphit")
	public void uphit(@RequestParam("pCode")int pCode, Model model) throws Exception {
		
		ProductDTO dto = service.view(pCode);
		
		model.addAttribute("uphit", dto);
		
	}
	
	
	// 업로드, 수정, 삭제와 합칠 수도 있음
	// 데이터 업로드
	@RequestMapping(value="/dataUpload", method=RequestMethod.POST)
	public String dataUpload (MultipartFile dataUpload) {
			
		return "redirect:/admin/list";
			
	}
	
	// 데이터 수정
	@RequestMapping(value="/dataModify", method=RequestMethod.POST)
	public String dataModify(ProductDTO dto) throws Exception {
			
		service.dataModify(dto);
			
		return "redirect:";
			
	}
	
	// 데이터 삭제
	@RequestMapping(value="/dataDelete", method=RequestMethod.GET)
	public String dataDelete(@RequestParam("pCode")int pCode) throws Exception {
			
		service.dataDelete(pCode);
			
		return "redirect:/admin/list";
	}
	
}
