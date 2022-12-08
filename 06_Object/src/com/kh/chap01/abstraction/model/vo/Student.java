package com.kh.chap01.abstraction.model.vo;

public class Student {
	//학생들을 뽑을 설계도
	//내가 작성할 학생들의 공통적인 속성을 적고 정의하여 
	//객체가 생성될 때 메모리영역에 해당 속성의 크기를 할당받을 수 있도록
	//작업하는 공간
	/*
	 * public class Student{
	 *	//필드부
	 *	-내가 필요로 하는 속성을 선언하는 영역 - Student 클래스로
	 *		뽑을 객체가 가져야 하는 공통적인 속성
	 *
	 * 	//생성자부
	 * 	-내가 선언한 필드부 속성들을 초기화 하는 영역
	 * 	-필수!!
	 * 	-기본 생성자가 생략되어 있다.(jvm이 기본 생성자를 추가해줌)
	 * 	
	 * 
	 * 	//메소드부
	 * 	-내가 필요로 하는 기능들을 작성하는 영역- Student 클래스로
	 * 		생성할 객체가 가져야 하는 공통적인 기능
	 * }
	 * 
	 * 
	 * 
	 */
	
	//[필드부]
	//접근 제한자 자료형 변수명;
	
	//접근 제한자: 이 필드에 접근할 수 있는 범위를 설정하는 키워드
	//public>protected>default>private
	//어디서든 >   상속       >같은 패키지>나만 접근(클래스 내부에서만)
	
	
	//이름
	public String name;
	//나이
	public int age;
	//성별
	public char gender;
	
	//기본 생성자가 숨어있다. -만약에 내가 매개변수를 가지는 생성자를
	//	하나라도 작성하면 기본생성자 추가x (직접 생성해야함)
	
//	//숨어 있는 기본 생성자의 모습(jvm이 당연히 해줌)
//		단, 생성자 구문이 없을 때만
//	public Student() {
//		this.name=null;
//		this.age=0;
//		this.gender=' ';
//	}
	
}























