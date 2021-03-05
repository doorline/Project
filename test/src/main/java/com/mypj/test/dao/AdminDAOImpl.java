package com.mypj.test.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public class AdminDAOImpl implements AdminDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public void delete(int pCode) {
		sqlSession.delete("admin.deleteProduct");

	}

	@Override
	public List<ProductDTO> productList() {
		return sqlSession.selectList("admin.listAll);
	}

	@Override
	public ProductDTO productDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void upload(ProductDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(ProductDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductDTO selectProductByPCode(int pCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
