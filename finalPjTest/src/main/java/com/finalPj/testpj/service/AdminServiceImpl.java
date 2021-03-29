package com.finalPj.testpj.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.finalPj.testpj.dao.AdminDAO;
import com.finalPj.testpj.dto.AdminDTO;
import com.finalPj.testpj.dto.MemberDTO;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Inject    //dao를 호출하기때문에 의존성을 주입한다.
    AdminDAO admindao;

	@Override
	public boolean loginCheck(AdminDTO dto, HttpSession session) throws Exception {
		
		return false;
	}

	@Override
	public void admin_member_forced_evictionCheck(MemberDTO dto) throws Exception {
		

	}

}
