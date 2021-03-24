package com.finalPj.testpj.service;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.finalPj.testpj.common.SearchVO;
import com.finalPj.testpj.dao.ProductDAO;
import com.finalPj.testpj.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Inject
	private ProductDAO pdao;

	@Override
	public List<ProductDTO> list(SearchVO vo) {
		return pdao.list(vo);
	}

	@Override
	public ProductDTO view(int pCode) {
		
		return pdao.view(pCode);
	}

	@Override
	public void upload(ProductDTO dto) {
		pdao.upload(dto);
		
	}

	@Override
	public void modify(ProductDTO dto) {
		pdao.modify(dto);
		
	}

	@Override
	public void delete(int pCode) {
		pdao.delete(pCode);
		
	}

	@Override
	public void uphit(int pCode) {
		pdao.uphit(pCode);
		
	}
	@Override
	public int getPcode(String pName) {
		return pdao.getPcode(pName);
	}

	@Override
	public int cntList(HashMap<String, String> searchMap) {
		return pdao.cntList(searchMap);
	}

}