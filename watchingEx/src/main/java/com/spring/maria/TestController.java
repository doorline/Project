package com.spring.maria;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.watching.dto.MembershipDTO;
import com.watching.service.MembershipService;

@Controller
@RequestMapping("/")
public class TestController {
	
	@Inject
	MembershipService membershipService;
	
	@RequestMapping(value="test", method=RequestMethod.POST)
	public String test(Model model, HttpServletRequest request) {
		
		String msCode = request.getParameter("msCode");	
		List<MembershipDTO> list = membershipService.getMembership(msCode);
		
		if(list.size()>0) {
			model.addAttribute("rs", "Success_DB_Conncetion");
		}else {
			model.addAttribute("rs", "Fail");
		}
		
		return "testView";
	}
	

}
