package com.mypj.test.dao;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mypj.test.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static String namespace="com.mypj.test.productMapper"; //Mapper의 namespace와 일치시킨다
	
	

	@Override
	public List<ProductDTO> list() {
		return sqlSession.selectList(namespace+".list");
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
	public void dataUpload(ProductDTO dto) {
		sqlSession.insert(namespace+".dataUpload", dto);
		
	}

	@Override
	public void dataModify(ProductDTO dto) {
		sqlSession.update(namespace+".dataModify", dto);
		
	}

	@Override
	public void dataDelete(int pCode) {
		sqlSession.delete(namespace+".dataDelete", pCode);
		
	}

//	@Override
//	public void dataUploadData(String dName, String dType, Date dUploadDate, int pCode, String kCode, String tCode) {
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("dName", dName);
//		sqlSession.update("product.insertData", map);
//		
//	}

}
