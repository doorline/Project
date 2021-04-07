package com.sjw.homebook.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.sjw.homebook.dao.IHDao;
import com.sjw.homebook.dto.HDto;

public class HModifyViewService implements IHService {
	private SqlSession sqlSession=Constant.sqlSession;
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession) map.get("login_user");
		IHDao dao = sqlSession.getMapper(IHDao.class);
		
		int serialNo = Integer.parseInt(request.getParameter("no"));
		HDto dto = dao.modifyView(serialNo);
		
		session.setAttribute("modifyView", dto);

	}

}
