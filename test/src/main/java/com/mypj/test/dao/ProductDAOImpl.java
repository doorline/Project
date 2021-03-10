package com.mypj.test.dao;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.mypj.test.dto.ProductDTO;

public class ProductDAOImpl implements ProductDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public void delete(int pCode) {
		sqlSession.delete("product.deleteProduct");

	}

	@Override
	public List<ProductDTO> listAll() {
		return sqlSession.selectList("product.listAll");
	}

	@Override
	public ProductDTO productDetail(int pCode) {
		
		return sqlSession.selectOne("product.productDetail");
	}

	@Override
	public void upload(ProductDTO dto) {
		sqlSession.insert("product.upload", dto);
		
	}

	@Override
	public void modify(ProductDTO dto) {
		sqlSession.update("product.modify", dto);
		
	}

	@Override
	public void uploadData(String dName, String dType, Date dUploadDate, int pCode, String kCode, String tCode) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("dName", dName);
		sqlSession.update("product.insertData", map);
		
	}

	@Override
	public void modifyData(String dName, String dType, Date dUploadDate, int pCode, String kCode, String tCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData(String dName, String dType, Date dUploadDate, int pCode, String kCode, String tCode) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public ProductDTO selectProductByPCode(int pCode) {
//		
//		return sqlSession.selectOne("admin.productDetail");
//	}

}
