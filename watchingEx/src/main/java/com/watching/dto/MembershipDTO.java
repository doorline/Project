package com.watching.dto;

public class MembershipDTO {
	
	private String msCode;
	private String msName;
	private int msPrice;
	
	public MembershipDTO() {};
	
	public MembershipDTO(String msCode, String msName, int msPrice) {
		super();
		this.msCode = msCode;
		this.msName = msName;
		this.msPrice = msPrice;
	}

	public String getMsCode() {
		return msCode;
	}
	public void setMsCode(String msCode) {
		this.msCode = msCode;
	}
	public String getMsName() {
		return msName;
	}
	public void setMsName(String msName) {
		this.msName = msName;
	}
	public int getMsPrice() {
		return msPrice;
	}
	public void setMsPrice(int msPrice) {
		this.msPrice = msPrice;
	}

	@Override
	public String toString() {
		return "MembershipDTO [msCode=" + msCode + ", msName=" + msName + ", msPrice=" + msPrice + "]";
	}
	
	
	

}
