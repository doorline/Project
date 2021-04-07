package com.sjw.homebook.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.sjw.homebook.dao.IHDao;
import com.sjw.homebook.service.Constant;


public class HWriteService implements IHService {
	private SqlSession sqlSession=Constant.sqlSession;
	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession) map.get("login_user");

		String timeFormat = request.getParameter("day");
		LocalDateTime ldt = LocalDateTime.parse(timeFormat);//, "yyyy-mm-dd xx tt:MM");
		Timestamp day = Timestamp.valueOf(ldt);
		
		String section = request.getParameter("section");
		String accountTitle = request.getParameter("accountTitle");
		String remark = request.getParameter("remark");
		int revenue = Integer.parseInt(request.getParameter("revenue"));
		int expense = Integer.parseInt(request.getParameter("expense"));
		String mid = request.getParameter("mid");
		
		
		IHDao dao = sqlSession.getMapper(IHDao.class);
		dao.write(day, section, accountTitle, remark, revenue, expense, mid);
		

	}

}
