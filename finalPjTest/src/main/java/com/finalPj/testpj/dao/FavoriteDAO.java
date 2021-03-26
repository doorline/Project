package com.finalPj.testpj.dao;

import java.util.List;

import com.finalPj.testpj.dto.FavoriteDTO;

public interface FavoriteDAO {
	
	// 찜리스트
	public List<FavoriteDTO> favlist(String mId) throws Exception;
	
	// 찜추가
	public void addfav(FavoriteDTO fdto) throws Exception;
	
	// 찜삭제
	public void deletefav(int fCode) throws Exception;

}
