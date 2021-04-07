package com.sjw.homebook.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.sjw.homebook.dao.IHDao;

public class HModifyService implements IHService {
	private SqlSession sqlSession=Constant.sqlSession;
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession) map.get("login_user");
		
		IHDao dao = sqlSession.getMapper(IHDao.class);
		int serialNo = Integer.parseInt(request.getParameter("no"));
		
		String timeFormat = request.getParameter("day");
		LocalDateTime ldt = LocalDateTime.parse(timeFormat);//, "yyyy-mm-dd xx tt:MM");
		Timestamp day = Timestamp.valueOf(ldt);
				
		String section = request.getParameter("section");
		String accountTitle = request.getParameter("accountTitle");
		String remark = request.getParameter("remark");
		int revenue = Integer.parseInt(request.getParameter("revenue"));
		int expense = Integer.parseInt(request.getParameter("expense"));
		String mid = request.getParameter("mid");
		
		//확인
		System.out.println(serialNo);
		System.out.println(day);
		System.out.println(section);
		System.out.println(accountTitle);
		System.out.println(remark);
		System.out.println(revenue);
		System.out.println(expense);
		System.out.println(mid);
		
		dao.modify(serialNo, day, section, accountTitle, remark, revenue, expense, mid);
		

	}

}
