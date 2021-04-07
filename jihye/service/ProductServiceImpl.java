package com.watching.service;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.watching.dao.ProductDAO;
import com.watching.dto.ProductDTO;
import com.watching.dto.SearchVO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Inject
	private ProductDAO adao;


	@Override
	public void upload(ProductDTO dto) throws Exception {

		adao.upload(dto);
	}


	@Override
	public List<ProductDTO> list(SearchVO vo) throws Exception {

		return adao.list(vo);
	}


	@Override
	public ProductDTO view(int pCode) throws Exception {

		return adao.view(pCode);
	}


	@Override
	public void modify(ProductDTO dto) throws Exception {

		adao.modify(dto);
	}


	@Override
	public void delete(int pCode) throws Exception {

		adao.delete(pCode);
	}


	@Override
	public void uphit(int pCode) throws Exception {
		
		adao.uphit(pCode);
	}

	@Override
	public int cntList(HashMap<String, String> searchMap) throws Exception {
		
		return adao.cntList(searchMap);
	}


	@Override
	public int getPcode(String pName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}