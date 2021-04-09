package com.finalPj.testpj.service;

import javax.servlet.http.HttpSession;

import com.finalPj.testpj.dto.AdminDTO;
import com.finalPj.testpj.dto.MemberDTO;

public interface AdminService {
	//관리자 로그인을 체크하는 메소드
	boolean loginCheck(AdminDTO adto, HttpSession session) throws Exception;
			
	//강제탈퇴 시킬때 해당 회원이 있는지 체크하는 메소드
	void admin_member_forced_evictionCheck(MemberDTO mdto) throws Exception;


}
