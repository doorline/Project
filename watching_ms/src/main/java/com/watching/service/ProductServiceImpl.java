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
	private ProductDAO pdao;

	@Override
	public List<ProductDTO> list(SearchVO vo) throws Exception {
		return pdao.list(vo);
	}

	@Override
	public ProductDTO view(int pCode) throws Exception {
		return pdao.view(pCode);
	}

	@Override
	public void upload(ProductDTO dto) throws Exception {
		pdao.upload(dto);
	}

	@Override
	public void modify(ProductDTO dto) throws Exception {
		pdao.modify(dto);

	}

	@Override
	public void delete(int pCode) throws Exception {
		pdao.delete(pCode);

	}

	@Override
	public void uphit(int pCode) throws Exception {
		pdao.uphit(pCode);

	}

	@Override
	public int getPcode(String pName) throws Exception {
		return pdao.getPcode(pName);
	}

	@Override
	public int cntList(HashMap<String, String> searchMap) throws Exception {
		return pdao.cntList(searchMap);
	}

}
