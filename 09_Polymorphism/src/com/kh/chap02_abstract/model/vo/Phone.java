package com.kh.chap02_abstract.model.vo;

/*
 * 추상 클래스
 * [표현법]
 * 접근제한자 abstract class 클래스명{
 * }
 * abstract라는 예약어를 사용해서 정의해야한다.
 * 미완성 클래스기 때문에 객체 생성 불가. (부모클래스의 역할로 다형성은 적용가능)
 * 
 * 추상클래스 : 일반필드 + 일반메소드 + 추상메소드(생략가능)
 * -단 추상메소드가 굳이 없어도 추상클래스로 정의할 수 있음.
 * -개발자 재량에 따라 해당 클래스가 아직 구체적이지 않은 상태라고 판단된다면 추상클래스로 정의
 * -기술적으로 판단했을시 객체 생성이 되어선 안된다고 생각할때 추상클래스로 정의
 * */
public abstract class Phone{
	
	private int num;
	
	//추상메소드는 몸통을 가질 수 없음 
	//[표현법]
	//접근제한자 abstract 반환형 메소드이름();
	public abstract void call();
	/*
	 * 추상메소드
	 * 몸통부가 존재하지 않는 미완성 메소드
	 * abstract라는 키워드를 이용해서 작성해야한다.
	 * 
	 * 미완성 메소드가 하나라도 포함되는 순간 해당 클래스는 미완성 클래스(추상클래스)가 된다.
	 * 해당 클래스 앞에도 abstract 키워드를 붙여서 추상클래스로 만들어야한다.
	 * 
	 * */

	public void sms() {
		System.out.println("문자하기");
	}
	
	public abstract void camera();
	
}
