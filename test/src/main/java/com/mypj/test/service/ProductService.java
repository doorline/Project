package com.mypj.test.service;

import java.util.List;

import com.mypj.test.dto.ProductDTO;

public interface ProductService {
	//CRUD 기능을 추상메소드로 작성<-정작 메소드 실행내용은 dao에 있음
	//작품 목록 출력
	public List<ProductDTO> list();
	//상세페이지
	public ProductDTO view(int pCode);
	//upload
	public void upload(ProductDTO dto);
	//modify
	public void modify(ProductDTO dto);
	//delete
	public void delete(int pCode);
	//uphit
	public void uphit(int pCode);
	
	//파일 crud
	public void dataUpload(ProductDTO dto);
	public void dataModify(ProductDTO dto);
	public void dataDelete(int pCode);
}
