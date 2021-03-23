package com.finalPj.testpj.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.finalPj.testpj.common.PagingVO;
import com.finalPj.testpj.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static String namespace="com.finalPj.testpj.productMapper"; //

	@Override
	public List<ProductDTO> list(PagingVO vo) {
		
		return sqlSession.selectList(namespace+".list", vo);
	}

	@Override
	public ProductDTO view(int pCode) {
		
		return sqlSession.selectOne(namespace+".view", pCode);
	}

	@Override
	public void upload(ProductDTO dto) {
		sqlSession.insert(namespace+".upload", dto);
		
	}

	@Override
	public void modify(ProductDTO dto) {
		sqlSession.update(namespace+".modify", dto);
		
	}

	@Override
	public void delete(int pCode) {
		sqlSession.delete(namespace+".delete", pCode);	
		
	}

	@Override
	public void uphit(int pCode) {
		sqlSession.update(namespace+".uphit", pCode);
		
	}

	@Override
	public int getPcode(String pName) {
		return sqlSession.selectOne(namespace+".getPcode", pName);
	}

	@Override
	public int cntList() {
		return sqlSession.selectOne(namespace+".cntList");
	}


}