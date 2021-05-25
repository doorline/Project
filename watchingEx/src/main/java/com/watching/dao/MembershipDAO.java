package com.watching.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.watching.dto.MembershipDTO;

@Repository
public class MembershipDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	public List<MembershipDTO> getMembership(String msCode){
		return sqlSession.selectList("com.watching.membership.getMembership", msCode);
	}
}
