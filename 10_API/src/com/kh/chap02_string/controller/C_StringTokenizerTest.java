package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	//문자열을 문자열 배열로 분리시키는 방법
	//1.구분자를 제시해서 해당 문자열을 분리시키는 방법 ->배열이용
	//2.분리된 각각의 문자열들을 토큰으로 취급하는 방법 ->토큰이용
	
	String str ="Java,Oracle,JDBC,HTML,CSS,JavaScript,Servlet,Spring";
	
	public void method1() {
		//문자열.split(String 구분자) : 반환형 String[]
		String[] arr = str.split(",");
		
		
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//향상된 for문 : 초기식,조건식,증감식이 필요없다
		//for each문
		//[표현법] for(값을 받아줄 타입 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션){}
		//출력만 가능 / 변경 불가 - 모든 데이터를 순차적으로 접근하고자 할때 사용 
		for(String a : arr) {//배열 또는 컬렉션의 끝까지 돌아간다.
			//순차적으로 접근되며 접근한 항목이 선언한 변수에 담기는 개념 
			System.out.println(a);
		}
	}
	
	public void method2() {
		//각각의 문자열을 토큰으로 처리
		//java.util.StringTokenizer클래스를 이용하는 방법
		//[표현법] StringTokenizer stn = new StringTokenizer(분리시키고자하는 문자열,구분자);
		//객체생성
		StringTokenizer stn = new StringTokenizer(str,",");
		String[] arr= new String[10];
		System.out.println("분리시키고자하는 문자열 : "+str);
		System.out.println("분리된 문자열의 개수 : "+stn.countTokens());
		//countTokens() : 분리된 문자열의 개수를 반환하는 메소드.
		
		
		//실제로 분리된 내용을 뽑고 싶다면?
//		System.out.println(stn.nextToken());
//		System.out.println(stn.countTokens());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.countTokens());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.countTokens());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.countTokens());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.countTokens());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.countTokens());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken()); //8번째
//		System.out.println(stn.nextToken()); //9번째
		//(0 8) (1 7)  (2 6) (3 5)  
		for(int i=0; i<stn.countTokens();i++) {
			System.out.println("i :"+i+" count :"+stn.countTokens());
			
			System.out.println(stn.nextToken());
		}
		
//		while(stn.hasMoreTokens()) { //stn 공간에 남아있는 토큰이 있다면 true 없다면 false 반환하는 메소드
//			System.out.println(stn.nextToken());
//		}
		
		
		
	}

}
