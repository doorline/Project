package com.watching.service;

import java.util.List;

import com.watching.dto.ProductDTO;
import com.watching.vo.ProductImgVO;

public interface ProductService {
		//리스트
		public List<ProductDTO> list() throws Exception;
		//조회
		public ProductDTO view(int pId) throws Exception; 
		//업로드 
		public void upload(ProductDTO dto) throws Exception;
		//수정
		public void modify(ProductDTO dto) throws Exception;
		//삭제
		public void delete(String pId) throws Exception;
		//조회수
		public void uphit(int pId) throws Exception;
		//이미지 업로드
		public void imgUpload(ProductImgVO vo) throws Exception;
		//동영상 업로드
		public void vodUpload(ProductImgVO vo) throws Exception;
		
		//페이징처리
		//public int cntList(HashMap<String, String> searchMap) throws Exception;


}
