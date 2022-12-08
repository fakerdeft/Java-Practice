package com.kh.chap01_beforeVSafter.after.model.vo2;

public class Pixel extends Phone{
	
	@Override
	public void call() {
		System.out.println("ai로 번역전화");
	}
	
	@Override
	public void camera() {
		System.out.println("ai로 찍은 사진 보정해주기");
	}
	
	
	public void heyGoogle() {
		System.out.println("헤이구글 점심메뉴 추천해줘");
	}
	
	
}
