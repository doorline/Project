package com.watching.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.watching.dto.MemberDTO;
import com.watching.service.MemberService;


@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;

	// 로그인 페이지
	@RequestMapping("/loginPage")
	public String memberLoginPage() {
		return "/member/MemberLogin";
	}  

	// 로그인
	@RequestMapping("/login")
	public ModelAndView userLogin(@ModelAttribute MemberDTO dto, HttpSession session) throws Exception {
		boolean result = service.memberLogin(dto, session);
		ModelAndView mav = new ModelAndView();
		if (result == true) {
			mav.setViewName("redirect:/main_after");
		} else {
			mav.setViewName("/member/MemberLogin");
		}
		return mav;
	}

	// 회원가입 페이지
	@RequestMapping("/joinPage")
	public String memberJoinPage() {
		return "/member/MemberJoin";
	} 
	
	// 회원가입
	@RequestMapping("/join") 
	public String memberJoin(@ModelAttribute MemberDTO dto) throws Exception {
		 service.memberJoin(dto); 
		 
		 return "redirect:/"; 
	} 
	
	// 아이디 중복 검사
	@RequestMapping("/idCheck")
	public void idCheck(@RequestParam String mId, HttpServletResponse res) throws Exception {
		int result = 0;
		if (service.idCheck(mId) != 0) {
			result = 1;
		}
		res.getWriter().print(result);
	}

	// 회원 정보
	@RequestMapping("/detail") 
	public ModelAndView memberDetail(@RequestParam String mId) throws Exception { 
		
		ModelAndView mav = new
		 ModelAndView(); mav.setViewName("/member/MemberDetail");
		 mav.addObject("memberDetail", service.memberDetail(mId)); 
		 return mav; 
		 }
	
	// 정보 수정 페이지 
	@RequestMapping("/editPage") 
	public ModelAndView memberEditPage(@RequestParam String mId) throws Exception { 
		ModelAndView mav = new ModelAndView(); 
		mav.setViewName("/member/MemberEdit");
		mav.addObject("memberEdit", service.memberDetail(mId)); 
		return mav; 
	} 
	
	 // 정보 수정
	 @RequestMapping("/edit") public String memberEdit(@ModelAttribute MemberDTO dto)
	 throws Exception { service.memberEdit(dto); 
	 return "redirect:/member/detail?mid="
	 + dto.getmId();
	 } 
	 
	 // 회원 삭제 
	 @RequestMapping("delete")
	 public String memberDelete(@RequestParam String mId, HttpSession session) throws Exception {
	 service.memberDelete(mId, session);
	 return "redirect:/member/loginPage"; 
	 } 
	 
	 // 로그아웃
	 @RequestMapping("/logout") 
	 public String memberLogout(HttpSession session) throws Exception { 
		 service.memberLogout(session); 
		 return "redirect:/"; 
	 }
	 
	 // 회원 정보 찾기 페이지 
	 @RequestMapping("/findPage")
	 public String memberFindPage() { 
		 return "/member/MemberFind"; 
	 } 
	 
	 // 아이디 찾기 페이지
	 @RequestMapping("/findIdPage") public String memberFindIdPage() { 
		 return "/member/MemberFindId"; 
	 } 
	 
	 // 비밀번호 찾기 페이지 
	 @RequestMapping("/findPwPage") public
	 String memberFindPwPage() { 
	 return "/member/MemberFindPw"; 
	 } 
	 
	 // 아이디 찾기
	 @RequestMapping("/findId") 
	 public ModelAndView memberFindId(@ModelAttribute MemberDTO dto) throws Exception { 
		 ModelAndView mav = new ModelAndView();
		 List<MemberDTO> memberList = service.memberFindId(dto);
	 System.out.println(memberList); 
	 mav.setViewName("/member/Membermid");
	 mav.addObject("memberFindId", memberList); 
	 return mav; 
	 } 
	 
	 // 비밀번호 찾기
	 @RequestMapping("/findPw") 
	 public ModelAndView memberFindPw(@ModelAttribute MemberDTO dto) throws Exception { 
		 ModelAndView mav = new ModelAndView(); 
		 String mpw = service.memberFindPw(dto); mav.setViewName("/member/MemberPw");
		 mav.addObject("memberFindPw", mpw); 
		 return mav; } 

		 
}