package com.finalPj.testpj.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.finalPj.testpj.dto.FavoriteDTO;

@Repository
public class FavoriteDAOImpl implements FavoriteDAO {
	
	@Inject
	private SqlSession sql;
	private static String namespace = "com.finalPj.testpj.Favorite";

	// 찜리스트
	@Override
	public List<FavoriteDTO> favlist(String mId) throws Exception {
		
		return sql.selectList(namespace + ".favlist", mId);
	}

	// 찜추가
	@Override
	public void addfav(FavoriteDTO fdto) throws Exception {
		
		sql.insert(namespace + ".addfav", fdto);
		
	}

	// 찜삭제
	@Override
	public void deletefav(int fCode) throws Exception {
		
		sql.delete(namespace + ".deletefav", fCode);
	}

}
