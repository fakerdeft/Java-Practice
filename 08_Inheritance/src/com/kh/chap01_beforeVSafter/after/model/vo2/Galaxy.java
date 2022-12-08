package com.kh.chap01_beforeVSafter.after.model.vo2;

public class Galaxy extends Phone{
	//*어노테이션 : 어떠한 능력을 갖는 주석과도 같은 개념
	
	//이 메소드가 오버라이딩 되었다는것을 표시하는 어노테이션
	@Override
	public void call() {
		System.out.println("녹음하면서 전화걸기");
	}
	@Override
	public void camera() {
		System.out.println("20배 광학줌 카메라로 찍기");
	}
	
	public void bixbi() {
		System.out.println("헤이 빅스비");
	}
}
