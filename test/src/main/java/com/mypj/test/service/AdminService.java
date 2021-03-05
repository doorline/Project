package com.mypj.test.service;

import java.util.List;

public interface AdminService {
	//CRUD 기능을 추상메소드로 작성<-정작 메소드 실행내용은 dao에 있음
	//작품 목록 출력
	public List<ProductVO> listAll();
}
