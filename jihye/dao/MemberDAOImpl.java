package com.watching.dao;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.watching.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession sqlSession;
	
	private static final String nameSpace = "com.watching.mapper.Member";

	// 회원가입
	@Override
	public void memberJoin(MemberDTO dto) throws Exception {
		sqlSession.insert(nameSpace + ".memberJoin", dto);
	}
	
	// 로그인
	@Override
	public boolean memberLogin(MemberDTO dto) throws Exception {
		String mName = sqlSession.selectOne(nameSpace + ".memberLogin", dto);
		return (mName == null) ? false : true;
	}

	// 로그아웃
	@Override
	public void memberLogout(HttpSession session) throws Exception {
		sqlSession.insert(nameSpace + ".memberLogout", session);
		
	}
	
	@Override
	public MemberDTO memberDetail(String mId) throws Exception {
		return sqlSession.selectOne(nameSpace + ".memberDetail", mId);
	}

	@Override
	public void memberEdit(MemberDTO dto) throws Exception {
		sqlSession.update(nameSpace + ".memberEdit", dto);
	}

	@Override
	public void memberDelete(String mId) throws Exception {
		sqlSession.delete(nameSpace + ".memberDelete", mId);
	}

	@Override
	public List<MemberDTO> memberFindId(MemberDTO dto) throws Exception {
		return sqlSession.selectList(nameSpace + ".memberFindId", dto);
	}

	@Override
	public String memberFindPw(MemberDTO dto) throws Exception {
		return sqlSession.selectOne(nameSpace + ".memberFindPw", dto);
	}

	@Override
	public int idCheck(String mId) throws Exception {
		return sqlSession.selectOne(nameSpace + ".idCheck", mId);
	}

}
