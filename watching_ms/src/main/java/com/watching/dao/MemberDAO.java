package com.watching.dao;

import java.util.List;

import com.watching.dto.MemberDTO;

//기본 메소드 세팅
public interface MemberDAO {
	public boolean memberLogin(MemberDTO dto) throws Exception;

	public void memberJoin(MemberDTO dto) throws Exception;

	public MemberDTO memberDetail(String mid) throws Exception;

	public void memberEdit(MemberDTO dto) throws Exception;

	public void memberDelete(String id) throws Exception;

	public List<MemberDTO> memberFindId(MemberDTO dto) throws Exception;

	public String memberFindPw(MemberDTO dto) throws Exception;

	public int idCheck(String mid) throws Exception;

}