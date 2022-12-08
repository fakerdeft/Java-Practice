package com.kh.chap02_abstract.model.vo;

//상속받은 추상클래스에 있는 추상메소드를 구현하고 싶지 않다면 
//abstract로 추상클래스화 시키면 된다
public abstract class Galaxy extends Phone{
	
	public void bixbi() {
		System.out.println("헤이빅스비");
	}
	
	public abstract void samsungPay();
	
	
}