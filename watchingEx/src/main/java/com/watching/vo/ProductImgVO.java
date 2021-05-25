package com.watching.vo;

public class ProductImgVO {
	private int pId;
	private String pImg;
	private String pVod;
	
	public ProductImgVO() {}
	
	public ProductImgVO(int pId, String pImg, String pVod) {
		super();
		this.pId = pId;
		this.pImg = pImg;
		this.pVod = pVod;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpImg() {
		return pImg;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	public String getpVod() {
		return pVod;
	}

	public void setpVod(String pVod) {
		this.pVod = pVod;
	}
	
	
	

}
