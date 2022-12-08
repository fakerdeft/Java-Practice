package com.kh.chap03_interface.model.vo;

/*
 * 
 * 인터페이스
 * [표현법]
 * 접근제한자 interface 인터페이스명{
 * 	상수필드 (생략가능)
 *  추상메소드 (생략가능)
 * }
 * 
 * -상수 필드와 추상 메소드만으로 이루어진 추상 클래스의 변형체
 * -인터페이스에서 필드는 무조건 상수필드만 가질 수 있다.
 * -인터페이스에서 메소드는 무조건 추상메소드만 가질 수 있음.
 * -무조건 구현해야 하는게 있을때 인터페이스에 틀만 만들어 두고 상속하게 된다. ->오버라이딩!
 * -인터페이스는 다중상속(구현)을 지원한다.
 * ->메소드가 겹쳐도 어차피 구현할때 달라지기 때문에.
 * -추상클래스보다 좀 더 강한 규칙성,강제성을 가진다.
 * 
 * 추상클래스와 인터페이스
 * 1. 공통점
 * -객체 생성은 안되나, 참조변수로서 사용가능(다형성 적용가능)
 * -상속(구현)하는 클래스에 추상메소드를 오버라이딩 하도록 강제한다.
 * 2. 차이점
 * -추상클래스 : 클래스 내에 필드,메소드 생성이 가능하고 추상메소드가 포함되어있거나 abstract 키워드를 통해 정의된다.
 * -인터페이스 : 모든 필드는 상수필드, 모든 메소드는 추상메소드로 정의해야한다.
 * -추상클래스는 추상클래스를 상속받아 기능을 이용하고 클래스를 확장하는 개념으로 사용한다면
 * -인터페이스는 클래스의 기능(메소드) 구현을 강제함으로써 규칙을 위해 사용한다.
 * 
 *  extends 와 implements
 * -클래스간의 상속관계 : 자식클래스명 extends 부모클래스명
 * -클래스와 인터페이스의 구현 관계 : 클래스명 implements 인터페이스명
 * -인터페이스간의 상속관계 : 자식인터페이스명 extends 부모인터페이스명1,부모인터페이스명2,....
 * 
 */

public interface Actor {
	
	//상수필드
	//인터페이스의 필드는 암묵적으로 public static final 이다.
	int NUM = 10;
	
	/*public static final*/String STR = "안녕";
	
	
	//추상메소드
	//인터페이스의 메소드는 암묵적으로 public abstract이다.
	public abstract void cry();
	
	/*public abstract*/void angry();
	
	void action();
	
	

}