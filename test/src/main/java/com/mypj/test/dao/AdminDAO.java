package com.mypj.test.dao;

import java.util.List;
import com.mypj.test.dto.ProductDTO;

public interface AdminDAO {
	//관리자가 product를 CRUD하는 기능 작성
	
	//list
	public List<ProductDTO> productList();
	//상세페이지
	public ProductDTO productDetail(int pCode);
	//upload
	public void upload(ProductDTO dto);
	//modify
	public void modify(ProductDTO dto);
//	//수정을 위해 pCode로 정보를 받아옴 >> detail이 있어서 없어도 될거같음
//	public ProductDTO selectProductByPCode(int pCode);
	//delete
	public void delete(int pCode);
}
