package com.mypj.test.dao;

public interface AdminDAO {
	//관리자가 product를 CRUD하는 기능 작성
	
	//list
	public List<ProductDTO> productList();
	//상세페이지
	public ProductDTO productDetail();
	//upload
	public void upload(ProductDTO dto);
	//modify
	public void modify(ProductDTO dto);
	//수정을 위해 pCode로 정보를 받아옴
	public ProductDTO selectProductByPCode(int pCode);
	//delete
	public void delete(int pCode);
}
