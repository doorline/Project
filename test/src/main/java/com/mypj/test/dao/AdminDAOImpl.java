package com.mypj.test.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.mypj.test.dto.ProductDTO;

public class AdminDAOImpl implements AdminDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public void delete(int pCode) {
		sqlSession.delete("admin.deleteProduct");

	}

	@Override
	public List<ProductDTO> listAll() {
		return sqlSession.selectList("admin.listAll");
	}

	@Override
	public ProductDTO productDetail(int pCode) {
		
		return sqlSession.selectOne("admin.productDetail");
	}

	@Override
	public void upload(ProductDTO dto) {
		sqlSession.insert("admin.upload", dto);
		
	}

	@Override
	public void modify(ProductDTO dto) {
		sqlSession.update("admin.modify", dto);
		
	}

//	@Override
//	public ProductDTO selectProductByPCode(int pCode) {
//		
//		return sqlSession.selectOne("admin.productDetail");
//	}

}
