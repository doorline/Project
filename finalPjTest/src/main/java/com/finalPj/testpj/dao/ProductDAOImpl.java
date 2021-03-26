package com.finalPj.testpj.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.finalPj.testpj.common.SearchVO;
import com.finalPj.testpj.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static String namespace="com.finalPj.testpj.productMapper"; //

	@Override
	public List<ProductDTO> list(SearchVO vo) throws Exception{
		
		return sqlSession.selectList(namespace+".list", vo);
	}

	@Override
	public ProductDTO view(int pCode) throws Exception{
		
		return sqlSession.selectOne(namespace+".view", pCode);
	}

	@Override
	public void upload(ProductDTO dto) throws Exception{
		sqlSession.insert(namespace+".upload", dto);
		
	}

	@Override
	public void modify(ProductDTO dto) throws Exception{
		sqlSession.update(namespace+".modify", dto);
		
	}

	@Override
	public void delete(int pCode) throws Exception{
		sqlSession.delete(namespace+".delete", pCode);	
		
	}

	@Override
	public void uphit(int pCode) throws Exception{
		sqlSession.update(namespace+".uphit", pCode);
		
	}

	@Override
	public int getPcode(String pName) throws Exception{
		return sqlSession.selectOne(namespace+".getPcode", pName);
	}

	@Override
	public int cntList(HashMap<String, String> searchMap) throws Exception{
		return sqlSession.selectOne(namespace+".cntList", searchMap);
	}

}