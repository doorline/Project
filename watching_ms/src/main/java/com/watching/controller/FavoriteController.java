package com.watching.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.watching.dto.FavoriteDTO;
import com.watching.service.FavoriteService;

@Controller
@RequestMapping("/favorite/*")
public class FavoriteController {
	@Inject
	FavoriteService favsvc;
	
	// 찜리스트
	@RequestMapping(value="/favlist")
	public String favlist(Model model, HttpSession session) throws Exception {
		
		String mId = (String) session.getAttribute("mId");
		//Integer fCode = (Integer) session.getAttribute("fCode");
		
		List<FavoriteDTO> favlist = null;
		favlist = favsvc.favlist(mId);
		
		model.addAttribute("favlist", favlist);
			
		return "favorite/favlist";
		
	}
	
	// 찜추가
	@RequestMapping(value="/addfav", method=RequestMethod.POST)
	public String addfav(@ModelAttribute FavoriteDTO fdto, HttpSession session) throws Exception {

		String mId = (String) session.getAttribute("mId");
		fdto.setmId(mId);
		favsvc.addfav(fdto);
		
		return "favorite/favlist";
	}
	
	// 찜삭제
	@RequestMapping("deletefav")
	public String deletefav(@RequestParam int fCode) throws Exception {
		
		favsvc.deletefav(fCode);
		
		return "redirect:/favorite/favlist";
	}

}
