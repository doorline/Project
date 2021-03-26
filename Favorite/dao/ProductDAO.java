package com.watching.dao;

import java.util.List;

import com.watching.dto.ProductDTO;

public interface ProductDAO {
	
	// 업로드
	public void upload(ProductDTO dto) throws Exception;
		
	// 리스트
	public List<ProductDTO> list() throws Exception;
					
	// 조회
	public ProductDTO view(int pCode) throws Exception;
				
	// 수정
	public void modify(ProductDTO dto) throws Exception;
				
	// 삭제
	public void delete(int pCode) throws Exception;
	
	// 조회수
	public void uphit(int pCode) throws Exception;
	
	// 데이터 업로드
	public void dataUpload(ProductDTO dto) throws Exception;
	
	// 데이터 수정
	public void dataModify(ProductDTO dto) throws Exception;
	
	// 데이터 삭제
	public void dataDelete(int pCode) throws Exception;

}
