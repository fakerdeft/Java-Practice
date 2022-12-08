package com.kh.chap02_abstract.model.vo;

//미완성 클래스인 Phone을 상속받으면 해당 클래스에 존재하는 미완성 메소드들을 완성(구현)시켜야한다.
//또는 상속받은 클래스조차 abstract로 추상클래스로 만들어 그 클래스를 상속받는 자식 클래스가 구현하면 된다.
public class Iphone extends Phone{

	@Override
	public void call() {
		System.out.println("감성진 전화걸기");
	}

	@Override
	public void camera() {
		System.out.println("아이폰의 후면카메라로 기죽이기");
	}
	

}
