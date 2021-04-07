package com.sjw.mymember.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.sjw.mymember.dao.IMDao;

public class JoinService implements IMemberService{
	
	private SqlSession sqlSession=Constant.sqlSession;
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String iswithrew = request.getParameter("iswithrew");
		
		IMDao dao = sqlSession.getMapper(IMDao.class);
		dao.join(id,password,phone,iswithrew);
		System.out.println("join_ok");
	}

}
