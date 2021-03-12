package com.finalPj.testpj.service;

import java.util.List;

import com.finalPj.testpj.dto.ProductDTO;


public interface ProductService {
	
	public List<ProductDTO> list();
	//상세페이지
	public ProductDTO view(int pCode);
	
	public void upload(ProductDTO dto);
	
	public void modify(ProductDTO dto);
	
	public void delete(int pCode);
	
	public void uphit(int pCode);
	
	//파일 crud
	public void dataUpload(ProductDTO dto);
	public void dataModify(ProductDTO dto);
	public void dataDelete(int pCode);

}