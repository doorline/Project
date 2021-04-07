package com.sjw.homebook.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.sjw.homebook.dao.IHDao;

public class HDeleteService implements IHService {
	private SqlSession sqlSession=Constant.sqlSession;
	@Override
	public void execute(Model model) {
		System.out.println("HdeleteService");
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		int serialNo =Integer.parseInt(request.getParameter("no"));
		System.out.println(serialNo);
		
		IHDao dao = sqlSession.getMapper(IHDao.class);
		dao.delete(serialNo);
	}

}
