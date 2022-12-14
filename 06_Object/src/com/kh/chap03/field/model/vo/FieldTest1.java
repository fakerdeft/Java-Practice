package com.kh.chap03.field.model.vo;
/*
 * 
 * 필드: 클래스를 구성하는 요소 중 하나
 * 클래스 내부지만 메소드 밖의 영역에 정의가 되는 전역 변수 개념
 * 어떠한 데이터를 저장하기 위한 역할 (변수)
 * 
 * 변수 구분
 * -전역 변수: 클래스 영역에 바로 선언하는 변수 클래스 내에서 어디든 사용 가능
 * -지역 변수: 클래스 영역 내의 어떤 특정 구역 (),{}에 선언한 변수->메소드,for문 등등
 * ex)for(int i=0; 조건식; 증감식){}->초기식에서 선언한 i도 지역변수
 * 		-때문에 영역을 벗어나면 i사용x
 * 
 * 1.전역 변수
 * -멤버 변수(인스턴드 변수, 필드)
 * 생성 시점: new 연산자를 통해 해당 객체를 생성하는 순간 heap영역에 메모리 할당
 * 소멸 시점: 객체가 소멸될 때 같이 소멸 - 가비지 컬렉터가 지워줄 때(더이상 아무곳에서도 참조하지 않을 때)
 * 
 * -클래스 변수(static): static이라는 키워드가 붙은 변수
 * 생성 시점: 프로그램이 실행됨과 동시에 static영역에 할당
 * -해당 객체가 생성이 되지 않아도 프로그램 실행시에 메모리 영역에 할당됨
 * 소멸 시점: 프로그램이 종료되면 소멸
 * 
 * 2.지역 변수
 * 생성 시점: 특정 영역(){} 실행 시 메모리 영역에 할당->stack 영역에 할당
 * 소멸 시점: 특정 영역 종료 시 소멸
 * 
 */
public class FieldTest1 {
	//멤버 변수(필드) 
		
	private int global; //전역 변수
		
	public void test(int num) {//test메소드 시작
								   //num도 지역 변수 개념
			
		int local=0;//지역 변수: 반드시 초기화를 해야 사용 가능
			
		System.out.println("멤버 변수"+global);
		System.out.println("test의 매개 변수"+num);
		System.out.println("test의 지역 변수"+local);
			
	}//test메소드 끝
		
	
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	