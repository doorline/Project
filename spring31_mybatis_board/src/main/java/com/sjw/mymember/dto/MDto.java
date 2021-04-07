package com.sjw.mymember.dto;

import java.sql.Timestamp;

public class MDto {
	private int no;
	private String id;
	private Timestamp joindate;
	private String password;
	private String phone;
	private String iswithrew;
	
	public MDto() {}
	
	public MDto(int no, String id, Timestamp joindate, String password, String phone, String iswithrew) {
		super();
		this.no = no;
		this.id = id;
		this.joindate = joindate;
		this.password = password;
		this.phone = phone;
		this.iswithrew = iswithrew;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Timestamp getJoindate() {
		return joindate;
	}
	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIswithrew() {
		return iswithrew;
	}
	public void setIswithrew(String iswithrew) {
		this.iswithrew = iswithrew;
	}

	@Override
	public String toString() {
		return "MDto [no=" + no + ", id=" + id + ", joindate=" + joindate + ", password=" + password + ", phone="
				+ phone + ", iswithrew=" + iswithrew + "]";
	}
	
	
}
