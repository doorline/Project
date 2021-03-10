package com.mypj.test.dto;

import java.sql.Date;


public class ProductDTO {
	public int pCode;
	public String kCode;
	public String tCode;
	public String pName;
	public String aId;
	public int pUphit;
	
	//dName, dType, dUploadDate에 대한 DTO 추가
	public String dName;
	public String dType;
	public Date dUploadDate;
	
	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdType() {
		return dType;
	}

	public void setdType(String dType) {
		this.dType = dType;
	}

	public Date getdUploadDate() {
		return dUploadDate;
	}

	public void setdUploadDate(Date dUploadDate) {
		this.dUploadDate = dUploadDate;
	}

	@Override
	public String toString() {
		return "AdminDTO [pCode=" + pCode + ", kCode=" + kCode + ", tCode=" + tCode + ", pName=" + pName + ", aId="
				+ aId + ", pUphit=" + pUphit + "]";
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public String getkCode() {
		return kCode;
	}

	public void setkCode(String kCode) {
		this.kCode = kCode;
	}

	public String gettCode() {
		return tCode;
	}

	public void settCode(String tCode) {
		this.tCode = tCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public int getpUphit() {
		return pUphit;
	}

	public void setpUphit(int pUphit) {
		this.pUphit = pUphit;
	}
	
}
