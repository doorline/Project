package com.mypj.test.service;

import java.util.List;

import com.mypj.test.dao.ProductDTO;

public interface AdminService {
	//CRUD 기능을 추상메소드로 작성<-정작 메소드 실행내용은 dao에 있음
	//작품 목록 출력
	public List<ProductDTO> listAll();
	//상세페이지
	public ProductDTO productDetail(int pCode);
	//upload
	public void upload(ProductDTO dto);
	//modify
	public void modify(ProductDTO dto);
	//delete
	public void delete(int pCode);
}
