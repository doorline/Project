package com.finalPj.testpj.dao;

import java.util.List;

import com.finalPj.testpj.dto.MemberDTO;

public interface MemberDAO {
	public boolean memberLogin(MemberDTO dto) throws Exception;

	public void memberJoin(MemberDTO dto) throws Exception;

	public MemberDTO memberDetail(String mid) throws Exception;

	public void memberEdit(MemberDTO dto) throws Exception;

	public void memberDelete(String mid) throws Exception;

	public List<MemberDTO> memberFindId(MemberDTO dto) throws Exception;

	public String memberFindPw(MemberDTO dto) throws Exception;

	public int idCheck(String mid) throws Exception;

}
