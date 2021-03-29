package com.watching.dao;

import com.watching.dto.AdminDTO;
import com.watching.dto.MemberDTO;

public interface AdminDAO {
	
	boolean loginCheck(AdminDTO dto) throws Exception; // 로그인을 체크하는 메소드

	void admin_member_forced_evictionCheck(MemberDTO dto) throws Exception;
}
