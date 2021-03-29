package com.finalPj.testpj.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalPj.testpj.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	private static final String nameSpace = "com.finalPj.testpj.memberMapper";

	@Override
	public boolean memberLogin(MemberDTO dto) throws Exception {
		String mname = sqlSession.selectOne(nameSpace + ".memberLogin", dto);
		return (mname == null) ? false : true;
	}

	@Override
	public void memberJoin(MemberDTO dto) throws Exception {
		sqlSession.insert(nameSpace + ".memberJoin", dto);

	}

	@Override
	public MemberDTO memberDetail(String mid) throws Exception {
		return sqlSession.selectOne(nameSpace + ".memberDetail", mid);
	}

	@Override
	public void memberEdit(MemberDTO dto) throws Exception {
		sqlSession.update(nameSpace + ".memberEdit", dto);

	}

	@Override
	public void memberDelete(String mid) throws Exception {
		sqlSession.delete(nameSpace + ".memberDelete", mid);

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
	public int idCheck(String mid) throws Exception {
		return sqlSession.selectOne(nameSpace + ".idCheck", mid);
	}

}
