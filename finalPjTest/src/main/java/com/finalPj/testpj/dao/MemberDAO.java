package com.finalPj.testpj.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.finalPj.testpj.dto.MemberDTO;

public interface MemberDAO {
	// 회원가입
		public void memberJoin(MemberDTO dto) throws Exception;
		
		// 로그인
		public boolean memberLogin(MemberDTO dto) throws Exception;
		
		// 로그아웃
		public void memberLogout(HttpSession session) throws Exception;

		//
		public MemberDTO memberDetail(String mId) throws Exception;

		//
		public void memberEdit(MemberDTO dto) throws Exception;

		public void memberDelete(String mId) throws Exception;

		public List<MemberDTO> memberFindId(MemberDTO dto) throws Exception;

		public String memberFindPw(MemberDTO dto) throws Exception;

		public int idCheck(String mId) throws Exception;

}
