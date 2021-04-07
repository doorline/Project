package com.watching.dao;

import java.util.List;

import com.watching.dto.ListSearchVO;
import com.watching.dto.ProductDTO;

public interface CategoryDAO {
	
	// 국내드라마 리스트
	public List<ProductDTO> dms_dramalist() throws Exception;
		
	// 해외드라마 리스트
	public List<ProductDTO> abr_dramalist() throws Exception;
			
	// 국내영화 리스트
	public List<ProductDTO> dms_filmlist() throws Exception;
			
	// 해외영화 리스트
	public List<ProductDTO> abr_filmlist() throws Exception;
	
	// 동영상 플레이
	public ProductDTO vodplay(int pCode) throws Exception;
	
	// 검색
	public List<ProductDTO> listsearch(String listkeyword) throws Exception;
	
	// 검색 결과 개수
	public int countSearch(ListSearchVO vo) throws Exception;
	
}
