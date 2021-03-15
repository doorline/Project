package com.finalPj.testpj.controller;

import java.io.File;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.finalPj.testpj.dto.ProductDTO;
import com.finalPj.testpj.service.ProductService;


@Controller
@RequestMapping("/admin/*")
public class ProductController {
	
	@Inject
	ProductService productService;
	
	@Resource(name="uploadPath")
	private String uploadPath;
	
	//기능 upload(insert),list,delete,update(modify),uphit, detailView
	
	//리스트 화면 출력
	@RequestMapping("list")
	public String list(Model model) {

		model.addAttribute("dtos", productService.list());
		
		return "/admin/list2";
	}
	
	//업로드 화면 출력, 리스트에서 업로드 버튼을 누르면 나오는 화면
	@RequestMapping("uploadView")
	public String uploadView(Model model) {
		return "/admin/uploadView";
	}
	
	//uploadView에서 작성후 업로드 버튼을 누르면 실제로 db에 올라가는 서비스
	@RequestMapping(value="upload", method=RequestMethod.POST)
	public String upload(@ModelAttribute ProductDTO dto, MultipartFile file) throws Exception{
	
		
		String dName = file.getOriginalFilename();
		
		//임시 디렉토리에 사진을 저장
		File target = new File(uploadPath, dName);
		//위의 파일을 지정된 디렉토리로 복사
		FileCopyUtils.copy(file.getBytes(), target);
		
		dto.setdName(dName);
		
		productService.upload(dto);
		System.out.println(dto.getpName());
		System.out.println(dto.getpCode());//여기서 오류가나네 dto에는 pCode가 없어
		
		String pName = dto.getpName();
		dto.setpCode(productService.getPcode(pName));
		System.out.println(dto.getpCode());
		productService.dataUpload(dto);
		
		return "redirect:/admin/list"; //또는 다른 화면
	}
	
	//수정을 위한 detailView
	@RequestMapping("view")
	public String view(Model model, @RequestParam("pCode")int pCode) {
		//url에 pcode 받아오기
//		int pCode = Integer.parseInt(request.getParameter("pCode"));
		model.addAttribute("view", productService.view(pCode));
		//model.addAttribute("data", productService.getData(pCode));
		
		return "/admin/view";
	}
	//URL -> /admin/view/${pCode}
	//detailView에서 수정버튼 누르면 update되는 서비스
	@RequestMapping("modify")
	public String modify(ProductDTO dto) {		
		productService.modify(dto);
		productService.dataUpload(dto);
		return "redirect:/admin/view?pCode="+dto.getpCode(); //또는 다른 화면
	}
	
	//삭제는 list에서 삭제버튼 누르면 바로 실행
	@RequestMapping("delete")
	public String delete(@RequestParam("pCode")int pCode) {
		//메소드 파라미터에 어노테이션 쓰는걸로
		//url에서 pcode 받아오기
		//int pCode = Integer.parseInt(request.getParameter("pCode"));
		productService.delete(pCode);
		productService.dataDelete(pCode);
		return "redirect:/admin/list"; //또는 다른 화면
	}

}