package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicView;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MVC패턴 적용한 음악 관리 프로그램
		//M: Model 데이터 관리 역할(model.vo -값을 담는 공간,model.dao-값 접근 및 처리)
		//V: View 사용자가 보는 화면 처리(입출력) -> 이 이외의 입출력문 사용 자제
		//C: Controller 사용자가 화면을 통해 요청한 데이터값을 받아 가공처리하고 결과 리턴
		
		new MusicView().mainMenu();
		
		
		
		
	}

}
