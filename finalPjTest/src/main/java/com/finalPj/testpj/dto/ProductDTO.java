package com.finalPj.testpj.dto;

import java.sql.Timestamp;

public class ProductDTO {
	private int pCode;
	private String kCode;
	private String tCode;
	private String pName;
	private String aId;
	private int pUphit;
	
	//product와 data 테이블 합침
	private String pImg;
	private Timestamp pUploadDate;
	
	public ProductDTO() {}

	public ProductDTO(int pCode, String kCode, String tCode, String pName, String aId, int pUphit, String pImg,
			Timestamp pUploadDate) {
		super();
		this.pCode = pCode;
		this.kCode = kCode;
		this.tCode = tCode;
		this.pName = pName;
		this.aId = aId;
		this.pUphit = pUphit;
		this.pImg = pImg;
		this.pUploadDate = pUploadDate;
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

	public String getpImg() {
		return pImg;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	public Timestamp getpUploadDate() {
		return pUploadDate;
	}

	public void setpUploadDate(Timestamp pUploadDate) {
		this.pUploadDate = pUploadDate;
	}

	@Override
	public String toString() {
		return "ProductDTO [pCode=" + pCode + ", kCode=" + kCode + ", tCode=" + tCode + ", pName=" + pName + ", aId="
				+ aId + ", pUphit=" + pUphit + ", pImg=" + pImg + ", pUploadDate=" + pUploadDate + "]";
	}

}