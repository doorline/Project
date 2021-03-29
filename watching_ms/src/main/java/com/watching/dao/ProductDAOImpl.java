package com.watching.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.watching.dto.ProductDTO;
import com.watching.dto.SearchVO;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	private static final String nameSpace = "com.watching.mappers.productMapper";

	@Override
	public List<ProductDTO> list(SearchVO vo) throws Exception {
		return sqlSession.selectList(nameSpace+".list", vo);
	}

	@Override
	public ProductDTO view(int pCode) throws Exception {
		return sqlSession.selectOne(nameSpace+".view", pCode);
	}

	@Override
	public void upload(ProductDTO dto) throws Exception {
		sqlSession.insert(nameSpace+".upload", dto);

	}

	@Override
	public void modify(ProductDTO dto) throws Exception {
		sqlSession.update(nameSpace+".modify", dto);

	}

	@Override
	public void delete(int pCode) throws Exception {
		sqlSession.delete(nameSpace+".delete", pCode);	

	}

	@Override
	public void uphit(int pCode) throws Exception {
		sqlSession.update(nameSpace+".uphit", pCode);

	}

	@Override
	public int getPcode(String pName) throws Exception {
		return sqlSession.selectOne(nameSpace+".getPcode", pName);
	}

	@Override
	public int cntList(HashMap<String, String> searchMap) throws Exception {
		return sqlSession.selectOne(nameSpace+".cntList", searchMap);
	}

}
