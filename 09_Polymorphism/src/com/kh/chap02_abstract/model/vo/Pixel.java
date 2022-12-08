package com.kh.chap02_abstract.model.vo;

public class Pixel extends Galaxy{

	@Override
	public void samsungPay() {
		System.out.println("픽셀의 삼성페이");
	}

	@Override
	public void call() {
		System.out.println("픽셀전화걸기");
	}

	@Override
	public void camera() {
		System.out.println("픽셀 카메라");
	}
	
	
}
