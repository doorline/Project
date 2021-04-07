package com.watching.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.watching.service.CategoryService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Inject
	CategoryService ctgService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		model.addAttribute("locale", locale);
		return "main_before"; //home
	}
	
	@RequestMapping(value = "/main_after")
	public void main(Locale locale, Model model, HttpServletRequest request) throws Exception {
		model.addAttribute("locale", locale);
		
		model.addAttribute("dms_dramalist", ctgService.dms_dramalist());
		model.addAttribute("abr_dramalist", ctgService.abr_dramalist());
		model.addAttribute("dms_filmlist", ctgService.dms_filmlist());
		model.addAttribute("abr_filmlist", ctgService.abr_filmlist());
		
		//return "main_after";
	}
	
	@RequestMapping(value = "/msinfo", method = RequestMethod.GET)
	public void msinfo(Locale locale, Model model, HttpServletRequest request) {
		model.addAttribute("locale", locale);
	}
	
}
