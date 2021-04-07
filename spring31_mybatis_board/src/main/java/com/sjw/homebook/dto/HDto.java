package com.sjw.homebook.dto;

import java.sql.Timestamp;

public class HDto {
	private int serialNo;
	private Timestamp day;
	private String section;
	private String accountTitle;
	private String remark;
	private int revenue;
	private int expense;
	private String mId;
	
	public HDto() {}
	
	public HDto(int serialNo, Timestamp day, String section, String accounTitle, String remark, int revenue,
			int expense, String mId) {
		this.serialNo = serialNo;
		this.day = day;
		this.section = section;
		this.accountTitle = accounTitle;
		this.remark = remark;
		this.revenue = revenue;
		this.expense = expense;
		this.mId = mId;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public Timestamp getDay() {
		return day;
	}
	public void setDay(Timestamp day) {
		this.day = day;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAccountTitle() {
		return accountTitle;
	}
	public void setAccountTitle(String accounTitle) {
		this.accountTitle = accounTitle;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	@Override
	public String toString() {
		return "HDto [serialNo=" + serialNo + ", day=" + day + ", section=" + section + ", accountTitle=" + accountTitle
				+ ", remark=" + remark + ", revenue=" + revenue + ", expense=" + expense + ", mId=" + mId + "]";
	}

}
