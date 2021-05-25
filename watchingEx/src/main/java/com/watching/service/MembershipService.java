package com.watching.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.watching.dao.MembershipDAO;
import com.watching.dto.MembershipDTO;

@Repository
public class MembershipService {
	
	@Inject
	MembershipDAO membershipDAO;
	
	public List<MembershipDTO> getMembership(String msCode){
		return membershipDAO.getMembership(msCode);
	}

}
