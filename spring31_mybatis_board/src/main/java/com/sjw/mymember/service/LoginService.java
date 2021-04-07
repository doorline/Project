package com.sjw.mymember.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.sjw.mymember.dao.IMDao;
import com.sjw.mymember.dto.MDto;

public class LoginService implements IMemberService{

	private SqlSession sqlSession = Constant.sqlSession;
	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession) map.get("session");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		IMDao dao = sqlSession.getMapper(IMDao.class);
		MDto dto = dao.login(id, password);
		String withdrawal = dto.getIswithrew();
		System.out.println(dto);
		if(dto == null || withdrawal.equals("Withdrawal")) {
			model.addAttribute("login_result",null);
		}else {	
			session.setAttribute("id",dto.getId());
			session.setAttribute("login_user", dto);
			
			model.addAttribute("session", session);
			model.addAttribute("login_result", dto);
		}
		
		
	}

}
