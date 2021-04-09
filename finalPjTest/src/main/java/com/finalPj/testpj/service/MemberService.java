package com.finalPj.testpj.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.finalPj.testpj.dto.MemberDTO;

public interface MemberService {
	
	// 회원가입
	public void memberJoin(MemberDTO dto) throws Exception;
		
	// 로그인
	public boolean memberLogin(MemberDTO dto, HttpSession session) throws Exception;

	// 로그아웃
	public void memberLogout(HttpSession session) throws Exception;
		
	// 회원정보 보기
	public MemberDTO memberDetail(String mId) throws Exception;

	// 회원정보 수정
	public void memberEdit(MemberDTO dto) throws Exception;

	// 회원 탈퇴
	public void memberDelete(String mId, HttpSession session) throws Exception;

	public List<MemberDTO> memberFindId(MemberDTO dto) throws Exception;

	public String memberFindPw(MemberDTO dto) throws Exception;

	public int idCheck(String mId) throws Exception;

}
