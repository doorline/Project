package com.watching.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.watching.dao.ProductDAO;
import com.watching.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Inject
	private ProductDAO adao;


	@Override
	public void upload(ProductDTO dto) throws Exception {

		adao.upload(dto);
	}


	@Override
	public List<ProductDTO> list() throws Exception {

		return adao.list();
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
	public void dataUpload(ProductDTO dto) throws Exception {

		adao.dataUpload(dto);
	}


	@Override
	public void dataModify(ProductDTO dto) throws Exception {

		adao.dataModify(dto);
	}


	@Override
	public void dataDelete(int pCode) throws Exception {

		adao.dataDelete(pCode);
	}

}
