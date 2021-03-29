package com.watching.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.watching.dto.AdminDTO;
import com.watching.dto.MemberDTO;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Inject
	SqlSession sqlSession;
	private static final String nameSpace = "com.watching.mappers.adminmapper";

	@Override
	public boolean loginCheck(AdminDTO dto) throws Exception {
		String aname = sqlSession.selectOne(nameSpace +".login_check", dto);

		// 조건식 ? true일때의 값 : false일때의 값
		return (aname == null) ? false : true;
	}

	@Override
	public void admin_member_forced_evictionCheck(MemberDTO dto) throws Exception {
		sqlSession.delete(nameSpace +".admin_member_forced_evictionCheck", dto);
	}

}
