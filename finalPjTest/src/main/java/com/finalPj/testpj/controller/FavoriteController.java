package com.finalPj.testpj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finalPj.testpj.dto.FavoriteDTO;
import com.finalPj.testpj.dto.ProductDTO;
import com.finalPj.testpj.service.FavoriteService;
import com.finalPj.testpj.service.ProductService;

@Controller
@RequestMapping("/favorite/*")
public class FavoriteController {
	
	@Inject
	FavoriteService favsvc;
	
	@Inject
	ProductService psvc;
	
	// 찜리스트
	@RequestMapping(value="/favlist")
	public ModelAndView favlist(ModelAndView mav, HttpSession session) throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		String mId = (String) session.getAttribute("mId");
		
		List<FavoriteDTO> favlist = favsvc.favlist(mId);
		
		map.put("favlist", favlist);
		
		mav.setViewName("favorite/favlist");
		mav.addObject("map", map);
	
		return mav;

	}
	
	// 찜추가
	@RequestMapping("addfav")
	public String addfav(@ModelAttribute FavoriteDTO fdto, Model model, HttpSession session,
						HttpServletRequest request) throws Exception {
		
	    String mId = (String)session.getAttribute("mId");
	    model.addAttribute("mId", mId);	
	    fdto.setmId(mId);	   
	    //찜 중복확인
	   	int fRes = favsvc.favCheck(fdto.getpCode());
	   	//이전화면으로 돌아가기
	   	String referer = request.getHeader("Referer");
	    
	   	if(fRes == 0) {
	    	favsvc.addfav(fdto);
	    	
	    	ProductDTO pdto = psvc.view(fdto.getpCode());	  	
	    	
	    	model.addAttribute("pdto", pdto);    
	    }
	   	model.addAttribute("referer", referer);
	   	model.addAttribute("fRes",fRes);
	    

		return "/favorite/addFavCheck";
	}
		
	// 찜삭제
	@RequestMapping("deletefav")
	public String deletefav(@RequestParam int fCode) throws Exception {
		
		favsvc.deletefav(fCode);
		
		return "redirect:/favorite/favlist";
	}
}
