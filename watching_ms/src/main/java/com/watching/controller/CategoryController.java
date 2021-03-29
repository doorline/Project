package com.watching.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.watching.dto.ProductDTO;
import com.watching.service.CategoryService;

@Controller
@RequestMapping("/Category")
public class CategoryController {
	
	@Inject
	CategoryService ctgService;

	
	@RequestMapping("/dms_dramalist")
	public String dms_dramalist(Model model) throws Exception{

		model.addAttribute("dms_dramalist", ctgService.dms_dramalist());
		
		return "/dms_dramalist";
	}
	
	@RequestMapping("/abr_dramalist")
	public String abr_dramalist(Model model) throws Exception{

		model.addAttribute("abr_dramalist", ctgService.abr_dramalist());
		
		return "/abr_dramalist";
	}
	
	@RequestMapping("/dms_filmlist")
	public void dms_filmlist(Model model) throws Exception{

		model.addAttribute("dms_filmlist", ctgService.dms_filmlist());
		
		//return "/dms_filmlist";
	}
	
	@RequestMapping("/abr_filmlist")
	public String abr_filmlist(Model model) throws Exception{

		model.addAttribute("abr_filmlist", ctgService.abr_filmlist());
		
		return "/abr_filmlist";
	}
	
	@RequestMapping(value="/listsearch", method=RequestMethod.GET)
	public void search(Model model, @RequestParam(value="keyword", required=false, defaultValue="")String keyword) throws Exception {
		
		ProductDTO product = new ProductDTO();
		
		List<ProductDTO> pdtlist = null; 
		pdtlist = ctgService.listsearch(product.getpName(), product.getpImg(), keyword);
		 
		model.addAttribute("pdtlist", pdtlist);
	}
	

}
