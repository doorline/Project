package com.watching.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.watching.dto.MemberDTO;

public interface MemberService {
	
	public boolean memberLogin(MemberDTO dto, HttpSession session) throws Exception;

	public void memberJoin(MemberDTO dto) throws Exception;

	public MemberDTO memberDetail(String mid) throws Exception;

	public void memberEdit(MemberDTO dto) throws Exception;

	public void memberDelete(String mid, HttpSession session) throws Exception;

	public void memberLogout(HttpSession session) throws Exception;

	public List<MemberDTO> memberFindId(MemberDTO dto) throws Exception;

	public String memberFindPw(MemberDTO dto) throws Exception;

	public int idCheck(String mid) throws Exception;

}
