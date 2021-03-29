package com.watching.dto;

public class FavoriteDTO {
	private int fCode;
	private String mId;
	private int pCode;
	private String pName;
	private String pImg;

	
	public FavoriteDTO() {}


	public FavoriteDTO(int fCode, String mId, int pCode, String pName, String pImg) {
		super();
		this.fCode = fCode;
		this.mId = mId;
		this.pCode = pCode;
		this.pName = pName;
		this.pImg = pImg;
	}


	public int getfCode() {
		return fCode;
	}


	public void setfCode(int fCode) {
		this.fCode = fCode;
	}


	public String getmId() {
		return mId;
	}


	public void setmId(String mId) {
		this.mId = mId;
	}


	public int getpCode() {
		return pCode;
	}


	public void setpCode(int pCode) {
		this.pCode = pCode;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public String getpImg() {
		return pImg;
	}


	public void setpImg(String pImg) {
		this.pImg = pImg;
	}


	@Override
	public String toString() {
		return "FavoriteDTO [fCode=" + fCode + ", mId=" + mId + ", pCode=" + pCode + ", pName=" + pName + ", pImg=" + pImg + "]";
	}

}
