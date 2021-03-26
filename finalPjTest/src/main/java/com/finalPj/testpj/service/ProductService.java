package com.finalPj.testpj.service;

import java.util.HashMap;
import java.util.List;

import com.finalPj.testpj.common.SearchVO;
import com.finalPj.testpj.dto.ProductDTO;


public interface ProductService {
	
	public List<ProductDTO> list(SearchVO vo) throws Exception;
	//상세페이지
	public ProductDTO view(int pCode) throws Exception;
	
	public void upload(ProductDTO dto) throws Exception;
	
	public void modify(ProductDTO dto) throws Exception;
	
	public void delete(int pCode) throws Exception;
	
	public void uphit(int pCode) throws Exception;
	
	public int getPcode(String pName) throws Exception;
	
	public int cntList(HashMap<String, String> searchMap) throws Exception;

}