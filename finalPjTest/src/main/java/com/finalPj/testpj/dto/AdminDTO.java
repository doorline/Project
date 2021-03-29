package com.finalPj.testpj.dto;

public class AdminDTO {
	public String aid;
	public String apw;
	public String aname;
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getApw() {
		return apw;
	}
	public void setApw(String apw) {
		this.apw = apw;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "AdminDTO [aid=" + aid + ", apw=" + apw + ", aname=" + aname + "]";
	}

}
