package com.mypj.test.dto;

public class ProductDTO {
	public int pCode;
	public String kCode;
	public String tCode;
	public String pName;
	public String aId;
	public int pUphit;
	
	//dName, dType, dUploadDate에 대한 DTO 추가
	
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
