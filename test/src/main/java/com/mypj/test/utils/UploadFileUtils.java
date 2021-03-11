package com.mypj.test.utils;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class UploadFileUtils {
	public static String fileUpload(String uploadPath, String fileName, byte[] fileData, String ymdPath) throws Exception{
		
		UUID uid = UUID.randomUUID();
		
		String newFileName = uid + "_"+ fileName;
		String imgPath = uploadPath + ymdPath;
		
		File target = new File(imgPath, newFileName);
		FileCopyUtils.copy(fileData, target);
		
		File image = new File(imgPath + File.separator + newFileName);
		
		return newFileName;
	}
	
	

}
