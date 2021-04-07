package com.sjw.mybatisboard;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sjw.mybatisboard.service.BContentService;
import com.sjw.mybatisboard.service.BDeleteService;
import com.sjw.mybatisboard.service.BListService;
import com.sjw.mybatisboard.service.BModifyService;
import com.sjw.mybatisboard.service.BReplyService;
import com.sjw.mybatisboard.service.BReplyViewService;
import com.sjw.mybatisboard.service.BUpHitService;
import com.sjw.mybatisboard.service.BWriteService;
import com.sjw.mybatisboard.service.Constant;
import com.sjw.mybatisboard.service.IBoarderService;


@Controller // DispatcherServlet Context 가 사용할 컨트롤러임을 알림
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	IBoarderService service;
	SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		// 혹 다른쪽에서 필요하면 사용하려고 임의의 클래스에 템플릿을 지정했음
		Constant.sqlSession = this.sqlSession;
	}
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		model.addAttribute("locale", locale);
		return "/home";
	}	

}
