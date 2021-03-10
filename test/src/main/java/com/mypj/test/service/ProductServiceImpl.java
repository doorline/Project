package com.mypj.test.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mypj.test.dao.ProductDAO;
import com.mypj.test.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Inject
	private ProductDAO pdao;
	
	@Override
	public List<ProductDTO> list() {
		
		return pdao.list();
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
	public void dataUpload(ProductDTO dto) {
		pdao.dataUpload(dto);

	}

	@Override
	public void dataModify(ProductDTO dto) {
		pdao.dataModify(dto);

	}

	@Override
	public void dataDelete(int pCode) {
		pdao.dataDelete(pCode);

	}

}
