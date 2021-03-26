package com.watching.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.watching.dto.ProductDTO;


@Service
public interface CategoryService {
	
	// 국내드라마 리스트
	public List<ProductDTO> dms_dramalist() throws Exception;
		
	// 해외드라마 리스트
	public List<ProductDTO> abr_dramalist() throws Exception;
				
	// 국내영화 리스트
	public List<ProductDTO> dms_filmlist() throws Exception;
				
	// 해외영화 리스트
	public List<ProductDTO> abr_filmlist() throws Exception;
	
	// 검색
	public List<ProductDTO> listsearch(String pName, String pImg, String keyword) throws Exception;
	
}
