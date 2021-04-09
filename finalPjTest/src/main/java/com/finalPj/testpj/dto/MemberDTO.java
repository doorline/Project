package com.finalPj.testpj.dto;

import java.sql.Date;

public class MemberDTO {
	public String mId;
	public long mCode;
	public String mPw;
	public Date mMemsDate;
	public String mState;
	public long msCode;
	public String mName;
	
	public MemberDTO() {}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public long getmCode() {
		return mCode;
	}

	public void setmCode(long mCode) {
		this.mCode = mCode;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public Date getmMemsDate() {
		return mMemsDate;
	}

	public void setmMemsDate(Date mMemsDate) {
		this.mMemsDate = mMemsDate;
	}

	public String getmState() {
		return mState;
	}

	public void setmState(String mState) {
		this.mState = mState;
	}

	public long getMsCode() {
		return msCode;
	}

	public void setMsCode(long msCode) {
		this.msCode = msCode;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	@Override
	public String toString() {
		return "MemberDTO [mId=" + mId + ", mCode=" + mCode + ", mPw=" + mPw + ", mMemsdate=" + mMemsDate + ", mState="
				+ mState + ", msCode=" + msCode + ", mName=" + mName + "]";
	}


}
