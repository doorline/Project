package com.finalPj.testpj.dao;

import java.util.List;

import com.finalPj.testpj.common.PagingVO;
import com.finalPj.testpj.dto.ProductDTO;


public interface ProductDAO {
	
	public List<ProductDTO> list(PagingVO vo);
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
	public int getPcode(String pName);
	//페이징처리
	public int cntList();
}