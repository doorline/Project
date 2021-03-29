package com.watching.dao;

import java.util.HashMap;
import java.util.List;

import com.watching.dto.ProductDTO;
import com.watching.dto.SearchVO;

public interface ProductDAO {
		//리스트
		public List<ProductDTO> list(SearchVO vo) throws Exception;
		//조회
		public ProductDTO view(int pCode) throws Exception;
		//업로드
		public void upload(ProductDTO dto) throws Exception;
		//수정
		public void modify(ProductDTO dto) throws Exception;
		//삭제
		public void delete(int pCode) throws Exception;
		//조회수
		public void uphit(int pCode) throws Exception;
		public int getPcode(String pName) throws Exception;
		//페이징처리
		public int cntList(HashMap<String, String> searchMap) throws Exception;

}
