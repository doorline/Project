package com.sjw.homebook.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.sjw.homebook.dao.IHDao;
import com.sjw.homebook.dto.HDto;

public class HListService implements IHService {
	
	private SqlSession sqlSession=Constant.sqlSession;
	private static final int MESSAGE_COUNT_PER_PAGE = 30;
	private String mId;
	public HListService() {}
	public HListService(String mId) {
		this.mId = mId;
	}
	
	
	@Override
	public void execute(Model model) {		
		IHDao dao = sqlSession.getMapper(IHDao.class);
		if(mId==null) {
			ArrayList<HDto> dtos = dao.listAll();
			model.addAttribute("list", dtos);
		}else {
			ArrayList<HDto> dtos = dao.list(mId);
			model.addAttribute("list", dtos);
		}

	}
//	//페이징 처리
	public  List<HDto> selectList(int a,int z) throws SQLException{
		IHDao dao = sqlSession.getMapper(IHDao.class);
		ArrayList<HDto> dtos = null;
		if(mId==null) {
			dtos = dao.listAll();
		}else {
			dtos = dao.list(mId);
		}
		return dtos.subList(a-1,z);
	}
	public HMessageListView getMessageListView(int pageNumber) throws SQLException{
		int currentPageNumber = pageNumber;
		IHDao dao = sqlSession.getMapper(IHDao.class);
		int messageTotalCount = dao.list(mId).size();
		List<HDto> messageList = null;
		int firstRow =0;
		int endRow =0;
		if(messageTotalCount>0){
			firstRow = (pageNumber-1)*MESSAGE_COUNT_PER_PAGE+1;
			endRow = firstRow+MESSAGE_COUNT_PER_PAGE-1;
			if(endRow>messageTotalCount)endRow=messageTotalCount;
			messageList =selectList(firstRow,endRow);
		}else{
			currentPageNumber =0;
			messageList = Collections.emptyList();
		}
		return new HMessageListView(messageList,messageTotalCount,currentPageNumber,MESSAGE_COUNT_PER_PAGE,firstRow,endRow);
	}

}
