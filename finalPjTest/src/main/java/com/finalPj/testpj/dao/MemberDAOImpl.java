package com.finalPj.testpj.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.finalPj.testpj.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static String namespace = "com.finalPj.testpj.memberMapper";

	@Override
	public boolean memberLogin(MemberDTO dto) throws Exception {
		String mname = sqlSession.selectOne(namespace + ".memberLogin", dto);
		System.out.println(mname);
		return  (mname == null) ? false : true;
	}

	@Override
	public void memberJoin(MemberDTO dto) throws Exception {
		sqlSession.insert(namespace + ".memberJoin", dto);

	}

	@Override
	public MemberDTO memberDetail(String mid) throws Exception {
		return sqlSession.selectOne(namespace + ".memberDetail", mid);
	}

	@Override
	public void memberEdit(MemberDTO dto) throws Exception {
		sqlSession.update(namespace + ".memberEdit", dto);

	}

	@Override
	public void memberDelete(String mid) throws Exception {
		sqlSession.delete(namespace + ".memberDelete", mid);

	}

	@Override
	public List<MemberDTO> memberFindId(MemberDTO dto) throws Exception {
		return sqlSession.selectList(namespace + ".memberFindId", dto);
	}

	@Override
	public String memberFindPw(MemberDTO dto) throws Exception {
		return sqlSession.selectOne(namespace + ".memberFindPw", dto);
	}

	@Override
	public int idCheck(String mid) throws Exception {
		return sqlSession.selectOne(namespace + ".idCheck", mid);
	}

}
