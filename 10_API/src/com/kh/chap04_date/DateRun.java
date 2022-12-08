package com.kh.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
			
		/*
		 * Date 클래스
		 * 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * java.util 패키지 안에 존재
		 * ->자바 개발 초창기에 만들어진 클래스라서 완성도가 낮음
		 * ->때문에 jdk버전이 올라가면서 많은 메소드가 deprecate(권장하지않음)처리 되었다.
		 * ->deprecate - 더이상 사용하지 않고 곧 사라질 메소드다 라는 경고 
		 * */
		//기본생성자를 이용해서 Date객체를 생성 ->현재 날짜 및 시간
		
		Date today = new Date();
		System.out.println("기본생성자 : "+today);
		
		//내가 원하는 날짜를 만들고싶다. 
		//year -1900을 해야함 기본이 year+1900이 되어있음 
		Date date1 = new Date(2022,7,29,15,30,00);
		System.out.println(date1);
		
		//month-1을 해야함 기본이 month+1 이 되어있음
		Date date2 = new Date(2022-1900,7-1,29,15,30,00);
		System.out.println(date2);
		
		//SimpleDateFormat 클래스를 이용해서 원하는 형식으로 뽑기
		
		SimpleDateFormat sdf = new SimpleDateFormat("우리의 종강일은 yyyy년 MM월 dd일 HH시 mm분 ss초 입니다. a");
		
		System.out.println(sdf.format(date2));
		
		Date date3 = new Date(2023-1900,1-1,12,18,20,00);
		
		System.out.println(sdf.format(date3));
		
	}

}
