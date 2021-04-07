package com.sjw.mymember.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.sjw.mymember.dao.IMDao;

public class WithdrawalService implements IMemberService {
	
	private SqlSession sqlSession = Constant.sqlSession;
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession) map.get("session");
		
		String id = (String) session.getAttribute("id");
		IMDao dao = sqlSession.getMapper(IMDao.class);
		dao.withdrawal(id);
		
		String withdrawal_check = dao.userSelected(id).getIswithrew();
		if(withdrawal_check.equals("Joined")) {
			System.out.println("withrawal_ok");
			model.addAttribute("rs", 0);
		}else {
			model.addAttribute("rs", 1);
		}

	}

}
