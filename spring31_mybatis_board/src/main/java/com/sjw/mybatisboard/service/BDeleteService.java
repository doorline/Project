package com.sjw.mybatisboard.service;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.sjw.mybatisboard.dao.BDao;
import com.sjw.mybatisboard.dto.BDto;

public class BDeleteService implements IBoarderService {
	private SqlSession sqlSession=Constant.sqlSession;
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int bid = Integer.parseInt(request.getParameter("bId"));
		BDao dao = sqlSession.getMapper(BDao.class);
		BDto dto = dao.contentView(bid);
		
		int bGroup = dto.getbGroup();
		int bStep = dto.getbStep();
		int countBgroup = dao.countBgroup(bGroup);
		System.out.println(bGroup);
		System.out.println(bStep);
		System.out.println(countBgroup);
		
		if(countBgroup >=2 && bStep == 0) {
			model.addAttribute("msg", 1);
		}else {
			dao.delete(bid);
			model.addAttribute("msg", 0);
		}
	}
}
