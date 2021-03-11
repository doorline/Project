package com.finalPj.testpj.dto;

import java.sql.Timestamp;

public class ProductDTO {
	private int pCode;
	private String kCode;
	private String tCode;
	private String pName;
	private String aId;
	private int pUphit;
	
	//dName, dType, dUploadDate에 대한 DTO 추가
	private String dName;
	private String dType;
	private Timestamp dUploadDate;
	
	
	public ProductDTO(int pCode, String kCode, String tCode, String pName, String aId, int pUphit, String dName,
			String dType, Timestamp dUploadDate) {
		super();
		this.pCode = pCode;
		this.kCode = kCode;
		this.tCode = tCode;
		this.pName = pName;
		this.aId = aId;
		this.pUphit = pUphit;
		this.dName = dName;
		this.dType = dType;
		this.dUploadDate = dUploadDate;
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
	public Timestamp getdUploadDate() {
		return dUploadDate;
	}
	public void setdUploadDate(Timestamp dUploadDate) {
		this.dUploadDate = dUploadDate;
	}

	@Override
	public String toString() {
		return "ProductDTO [pCode=" + pCode + ", kCode=" + kCode + ", tCode=" + tCode + ", pName=" + pName + ", aId="
				+ aId + ", pUphit=" + pUphit + ", dName=" + dName + ", dType=" + dType + ", dUploadDate=" + dUploadDate
				+ "]";
	}
	

}
