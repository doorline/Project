package com.watching.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.watching.dto.FavoriteDTO;

@Service
public interface FavoriteService {
	
	// 찜리스트
	public List<FavoriteDTO> favlist(String mId) throws Exception;
		
	// 찜추가
	public void addfav(FavoriteDTO fdto) throws Exception;
		
	// 찜삭제
	public void deletefav(int fCode) throws Exception;

}
