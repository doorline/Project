package com.watching.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.watching.dto.AdminDTO;
import com.watching.dto.MemberDTO;


@Repository
public class AdminDAOImpl implements AdminDAO {

	@Inject
	SqlSession sqlSession;
	private static final String nameSpace = "com.watching.mapper.Admin";
	
	@Override
	public boolean loginCheck(AdminDTO adto) throws Exception {
		String aName = sqlSession.selectOne(nameSpace +".login_check", adto);
		// 조건식 ? true일때의 값 : false일때의 값
		return (aName == null) ? false : true;
	}

	@Override
	public void admin_member_forced_evictionCheck(MemberDTO mdto) throws Exception {
		sqlSession.delete(nameSpace+".admin_member_forced_evictionCheck", mdto);

	}

}
