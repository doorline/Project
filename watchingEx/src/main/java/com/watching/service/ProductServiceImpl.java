package com.watching.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.watching.dao.ProductDAO;
import com.watching.dto.ProductDTO;
import com.watching.vo.ProductImgVO;

@Service
public class ProductServiceImpl implements ProductService {

	@Inject
	private ProductDAO pdao;
	
	@Override
	public List<ProductDTO> list() throws Exception {
		
		return pdao.list();
	}

	@Override
	public ProductDTO view(int pId) throws Exception {
		
		return pdao.view(pId);
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
	public void delete(String pId) throws Exception {
		pdao.delete(pId);

	}

	@Override
	public void uphit(int pId) throws Exception {
		pdao.uphit(pId);

	}

	@Override
	public void imgUpload(ProductImgVO vo) throws Exception {
		pdao.imgUpload(vo);
		
	}

	@Override
	public void vodUpload(ProductImgVO vo) throws Exception {
		pdao.vodUpload(vo);
		
	}

	@Override
	public int getPId(String pName) throws Exception {
		return pdao.getPId(pName);
	}

	@Override
	public ProductImgVO viewImg(int pId) throws Exception {
		return pdao.viewImg(pId);
	}

}
