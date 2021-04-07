package com.sjw.mymember.dao;

import com.sjw.mymember.dto.MDto;

public interface IMDao {
	public void join(String id, String password, String phone, String iswithrew);
	public MDto login(String id, String password);
	public void withdrawal(String id);
	public MDto userSelected(String id);

}
