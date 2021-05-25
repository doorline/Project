package com.watching.vo;

public class ProductVodVO {
	private int pId;
	private String pVod;
	
	public ProductVodVO() {}
	
	public ProductVodVO(int pId, String pVod) {
		super();
		this.pId = pId;
		this.pVod = pVod;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpVod() {
		return pVod;
	}

	public void setpVod(String pVod) {
		this.pVod = pVod;
	}
	
	
	

}
