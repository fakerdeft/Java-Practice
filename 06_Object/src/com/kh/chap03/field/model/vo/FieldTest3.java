package com.kh.chap03.field.model.vo;

//클래스 변수(static)와 상수필드(static final)에 대해 배워보자
public class FieldTest3 {
	//필드
	//[표현법] 접근제한자 예약어(생략가능) 자료형 필드명;
	
	public static String sta="static 필드";
	public String pub="그냥 퍼블릭";
	
	
	//생성 시점: 프로그램이 실행됨과 동시에 static영역 메모리에 할당된다.
	//소멸 시점: 프로그램 종료시 소멸
	
	//static은 공유의 개념이 강하다
	//프로그램이 실행됨과 동시에 공유해서 사용하고자 하는 값을 변수에 담아 사용한다.
	
	//상수필드
	//[표현법]
//	public static final 자료형 상수명 = "초기화값";
//	한 번 지정한 값을 고정해서 사용하기 위한 필드. 그래서 꼭 선언과 동시에 초기화를 해야함
//	고정된 값을 공유해서 사용하겠다 라는 개념의 필드.
//	상수필드 또한 상수처럼 대문자를 이용하여 작성하여야 한다.
	
	public static final int NUM = 5;

	public final static String STR="상수필드"; //순서 바꿔도 됨
	
	public static void test() {
		System.out.println("스태틱 메소드 잘 실행되나요");
	}
	
	
	
}

























