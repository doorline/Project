package com.watching.dto;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

public class ProductDTO {
	
	private int pCode;
	private int kCode;
	private int tCode;
	private String pName;
	private int pUphit;
	private String aId;
	private String dName;
	private String dType;
	private Timestamp dUploadDate;
	private MultipartFile dUploadfile;
	
	
	public ProductDTO() {}

	
}