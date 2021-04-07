package com.watching.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.watching.dao.CategoryDAO;
import com.watching.dto.ListSearchVO;
import com.watching.dto.ProductDTO;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Inject
	private CategoryDAO cdao;

	@Override
	public List<ProductDTO> dms_dramalist() throws Exception {
		
		return cdao.dms_dramalist();
	}

	@Override
	public List<ProductDTO> abr_dramalist() throws Exception {
		
		return cdao.abr_dramalist();
	}

	@Override
	public List<ProductDTO> dms_filmlist() throws Exception {
		
		return cdao.dms_filmlist();
	}

	@Override
	public List<ProductDTO> abr_filmlist() throws Exception {
		
		return cdao.abr_filmlist();
	}
	
	@Override
	public ProductDTO vodplay(int pCode) throws Exception {

		return cdao.vodplay(pCode);
	}

	@Override
	public List<ProductDTO> listsearch(String listkeyword) throws Exception {

		return cdao.listsearch(listkeyword);
	}

	@Override
	public int countSearch(ListSearchVO vo) throws Exception {
		
		return cdao.countSearch(vo);
	}

}
