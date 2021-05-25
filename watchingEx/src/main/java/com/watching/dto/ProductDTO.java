
package com.watching.dto;

import java.util.Date;

public class ProductDTO {
	private int pId;
	private Date pUDate;
	private String pName;
	private String cId;
	private String tId;
	private int pUphit;
	
	public ProductDTO() {}
	
	public ProductDTO(int pId, Date pUDate, String pName, String cId, String tId, int pUphit) {
		super();
		this.pId = pId;
		this.pUDate = pUDate;
		this.pName = pName;
		this.cId = cId;
		this.tId = tId;
		this.pUphit = pUphit;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public Date getpUDate() {
		return pUDate;
	}

	public void setpUDate(Date pUDate) {
		this.pUDate = pUDate;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public int getpUphit() {
		return pUphit;
	}

	public void setpUphit(int pUphit) {
		this.pUphit = pUphit;
	}

	@Override
	public String toString() {
		return "ProductDTO [pId=" + pId + ", pUDate=" + pUDate + ", pName=" + pName + ", cId=" + cId + ", tId=" + tId
				+ ", pUphit=" + pUphit + "]";
	}
	
}
