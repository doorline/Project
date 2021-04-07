package com.sjw.homebook.dao;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.sjw.homebook.dto.HDto;

public interface IHDao {
	public void write(Timestamp day, String section, String accounTitle, String remark, int revenue,
			int expense, String mId);
	public ArrayList<HDto> list(String mId);
	public ArrayList<HDto> listAll();
	public void modify(int serialNo, Timestamp day, String section, String accounTitle, String remark, int revenue,
			int expense, String mId);
	public HDto modifyView(int serialNo);
	public void delete(int serialNo);

}
