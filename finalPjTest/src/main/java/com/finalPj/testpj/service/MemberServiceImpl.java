package com.finalPj.testpj.service;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalPj.testpj.dao.MemberDAO;
import com.finalPj.testpj.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;
	private static Hashtable<String, String> loginMembers = new Hashtable<String, String>();

	// 회원가입
	@Override
	public void memberJoin(MemberDTO dto) throws Exception {
		dto.setmCode(dto.getmCode());
		dto.setmId(dto.getmId());
		dto.setmPw(dto.getmPw());
		dto.setmName(dto.getmName());
		dto.setmMemsDate(dto.getmMemsDate());
		dto.setMsCode(dto.getMsCode());
		dto.setmState(dto.getmState());
		dao.memberJoin(dto);
	}
	
	// 로그인
	@Override
	public boolean memberLogin(MemberDTO dto, HttpSession session) throws Exception {
		boolean isLogin = isLogin(dto.getmId());
		if (!isLogin) {
			boolean result = dao.memberLogin(dto);
			if (result) {
				setSession(session, dto);
			}
			return result;
		}
		return !isLogin;
	}

	// 로그아웃
	@Override
	public void memberLogout(HttpSession session) throws Exception {
		
		loginMembers.remove(session.getId());
		
		session.invalidate();
	}
	
	// 회원정보 보기
	@Override
	public MemberDTO memberDetail(String mId) throws Exception {
		return dao.memberDetail(mId);
	}

	// 회원정보 수정
	@Override
	public void memberEdit(MemberDTO dto) throws Exception {
		dao.memberEdit(dto);
	}

	// 회원 탈퇴
	@Override
	public void memberDelete(String mId, HttpSession session) throws Exception {
		session.invalidate();
		dao.memberDelete(mId);
	}

	// 로그인이 되어있는지 확인
	public boolean isLogin(String mId) {
		boolean isLogin = false;
		Enumeration<String> e = loginMembers.keys();
		String key = "";
		while (e.hasMoreElements()) {
			key = (String) e.nextElement();
			if (mId.equals(loginMembers.get(key)))
				isLogin = true;
		}
		return isLogin;
	}

	public  boolean isUsing(String sessionId) {
		boolean isUsing = false;
		
		 Enumeration<String> e = loginMembers.keys(); String key = ""; 
		 while (e.hasMoreElements()) { 
			 key = (String) e.nextElement(); 
			 if (sessionId.equals(loginMembers.get(key))) 
				 isUsing = true; 
			 } 
		 return isUsing; 
		 }

	public void setSession(HttpSession session, MemberDTO dto) {
		loginMembers.put(session.getId(), dto.getmId());
		session.setAttribute("mId", dto.getmId());
		session.setAttribute("dto", dto);
	}

	@Override
	public List<MemberDTO> memberFindId(MemberDTO dto) throws Exception {
		return dao.memberFindId(dto);
	}

	@Override
	public String memberFindPw(MemberDTO dto) throws Exception {
		return dao.memberFindPw(dto);
	}

	@Override
	public int idCheck(String mId) throws Exception {
		return dao.idCheck(mId);
	}

}
