package com.finalPj.testpj.dto;

public class AdminDTO {
	public String aId;
	public String aPw;
	public String aName;
	
	
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
	}
	public String getaPw() {
		return aPw;
	}
	public void setaPw(String aPw) {
		this.aPw = aPw;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	
	
	@Override
	public String toString() {
		return "AdminDTO [aId=" + aId + ", aPw=" + aPw + ", aName=" + aName + "]";
	}

}
