package com.finalPj.testpj.dao;

import com.finalPj.testpj.dto.AdminDTO;
import com.finalPj.testpj.dto.MemberDTO;

public interface AdminDAO {
	
	boolean loginCheck(AdminDTO adto) throws Exception; // 로그인을 체크하는 메소드

	void admin_member_forced_evictionCheck(MemberDTO mdto) throws Exception;

}
