package com.watching.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.watching.dto.ProductDTO;
import com.watching.service.ProductService;
import com.watching.vo.ProductImgVO;

@Controller
@RequestMapping("/admin")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService pService;
	
	private String imgAttachPath="resources/ProductImg/";
	private String vodAttachPath="resources/ProductVod/";
	
	@RequestMapping("/list")
	public String list(Model model, HttpServletRequest request,
					ProductDTO dto) throws Exception{
		
		model.addAttribute("dtos", pService.list());
		
		return "/admin/list";
	}
	//상세화면
	@RequestMapping("/view")
	public String view(Model model, @RequestParam("pId")int pId) throws Exception{
		
		model.addAttribute("dto", pService.view(pId));
		model.addAttribute("vo", pService.viewImg(pId));
		
		return "/admin/view";
	}
	
	@RequestMapping("/uploadView")
	public String uploadView(Model model, HttpServletRequest request) throws Exception{
		
		return "/admin/uploadView";
	}
	
	@PostMapping("/upload")
	public String upload(@ModelAttribute ProductDTO dto, HttpServletRequest request,
						@RequestParam("imgFile")MultipartFile imgFile, @RequestParam("vodFile")MultipartFile vodFile) throws Exception {
		logger.info("pName : "+dto.getpName());
		
		pService.upload(dto);
		//pId를 가져오는 코드를 작성해야함
		int pId = pService.getPId(dto.getpName());
		//이미지 및 영상 저장
		String rootPath = request.getSession().getServletContext().getRealPath("/");
		String pImg = imgFile(imgFile, rootPath);
		String pVod = vodFile(vodFile, rootPath);
		
		ProductImgVO vo = new ProductImgVO();
		vo.setpId(pId);
		vo.setpImg(pImg);
		vo.setpVod(pVod);
		
		pService.imgUpload(vo);
		pService.vodUpload(vo);		
		
		return "redirect:/admin/list";
	}
	//이미지 파일처리
	public String imgFile(MultipartFile imgFile, String rootPath) throws Exception {
		String originName = imgFile.getOriginalFilename();
		//랜덤명 생성
		UUID uuid = UUID.randomUUID();
		String pImgData = uuid.toString()+"_"+originName;
		File target = new File(rootPath+imgAttachPath+pImgData);
		FileCopyUtils.copy(imgFile.getBytes(), target);
		
		return pImgData;
	}
	//동영상 파일처리
	public String vodFile(MultipartFile vodFile, String rootPath) throws Exception {
		String originName = vodFile.getOriginalFilename();
		//랜덤명 생성
		UUID uuid = UUID.randomUUID();
		String pVodData = uuid.toString()+"_"+originName;
		File target = new File(rootPath+vodAttachPath+pVodData);
		FileCopyUtils.copy(vodFile.getBytes(), target);
		
		return pVodData;
	}
	
	@GetMapping("/modifyView")
	public String modifiView(Model model, @RequestParam("pId")int pId) throws Exception{
		model.addAttribute("dto", pService.view(pId));
		
		return "/admin/modifyView";
	}
	
	@RequestMapping("/modify")
	public String modify(@ModelAttribute ProductDTO dto) throws Exception{
		pService.modify(dto);
		return "redirect:/admin/view?pId="+dto.getpId();
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) throws Exception{
		String[] pIds = request.getParameterValues("pIdChk");
		for(String i : pIds) {
			pService.delete(i);
		}
		return "redirect:/admin/list";
	}
	
	

}
