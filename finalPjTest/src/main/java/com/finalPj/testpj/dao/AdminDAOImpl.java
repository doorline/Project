package com.finalPj.testpj.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.finalPj.testpj.dto.AdminDTO;
import com.finalPj.testpj.dto.MemberDTO;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Inject
	SqlSession sqlSession;
	private static final String nameSpace = "com.finalPj.testpj.adminMapper";
	
	@Override
	public boolean loginCheck(AdminDTO dto) throws Exception {
		String aName = sqlSession.selectOne(nameSpace +".login_check", dto);
		// 조건식 ? true일때의 값 : false일때의 값
		return (aName == null) ? false : true;
	}

	@Override
	public void admin_member_forced_evictionCheck(MemberDTO dto) throws Exception {
		sqlSession.delete(nameSpace +".admin_member_forced_evictionCheck", dto);

	}

}
