package com.watching.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.watching.dto.ProductDTO;
import com.watching.dto.SearchVO;


@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Inject
	private SqlSession sql;
	private static String namespace = "com.watching.mapper.Product";

	
	@Override
	public void upload(ProductDTO dto) throws Exception {
		
		sql.insert(namespace + ".upload", dto);

	}

	@Override
	public List<ProductDTO> list(SearchVO vo) throws Exception {
		
		return sql.selectList(namespace + ".list", vo);
	}

	@Override
	public ProductDTO view(int pCode) throws Exception {
		
		return sql.selectOne(namespace + ".view", pCode);
	}

	@Override
	public void modify(ProductDTO dto) throws Exception {

		sql.update(namespace + ".modify", dto);
	}

	@Override
	public void delete(int pCode) throws Exception {

		sql.delete(namespace + ".delete", pCode);
	}

	@Override
	public void uphit(int pCode) throws Exception {

		sql.delete(namespace + ".uphit", pCode);
	}

	@Override
	public int cntList(HashMap<String, String> searchMap) throws Exception {

		return sql.selectOne(namespace + ".cntList", searchMap);
	}

	@Override
	public int getPcode(String pName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}