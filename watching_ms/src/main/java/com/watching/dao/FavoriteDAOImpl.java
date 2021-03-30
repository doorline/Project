package com.watching.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.watching.dto.FavoriteDTO;

@Repository
public class FavoriteDAOImpl implements FavoriteDAO{
	

	@Inject
	private SqlSession sqlSession;
	private static String namespace = "com.watching.mappers.favoriteMapper";

	@Override
	public List<FavoriteDTO> favlist(String mId) throws Exception {
		return sqlSession.selectList(namespace + ".favlist", mId);
	}

	@Override
	public void addfav(FavoriteDTO fdto) throws Exception {
		sqlSession.insert(namespace + ".addfav", fdto);
		
	}

	@Override
	public void deletefav(int fCode) throws Exception {
		sqlSession.delete(namespace + ".deletefav", fCode);
		
	}

}
