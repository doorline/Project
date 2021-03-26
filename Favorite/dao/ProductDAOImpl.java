package com.watching.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.watching.dto.ProductDTO;


@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Inject
	private SqlSession sql;
	private static String namespace = "com.project.Mapper.Product";

	
	@Override
	public void upload(ProductDTO dto) throws Exception {
		
		sql.insert(namespace + ".upload", dto);

	}

	@Override
	public List<ProductDTO> list() throws Exception {
		
		return sql.selectList(namespace + ".list");
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
	public void dataUpload(ProductDTO dto) throws Exception {
	
		sql.insert(namespace + ".dataUpload", dto);
	}

	@Override
	public void dataModify(ProductDTO dto) throws Exception {

		sql.update(namespace + ".dataModify", dto);
	}

	@Override
	public void dataDelete(int pCode) throws Exception {

		sql.delete(namespace + ".dataDelete", pCode);
	}

}
