package com.kh.chap01_beforeVSafter.after.model.vo2;

public class Iphone extends Phone{
	
	@Override
	public void call() {
		System.out.println("감성전화걸기");
	}
	@Override
	public void camera() {
		System.out.println("감성샷찍기");
	}
	
	
	public void siri() {
		System.out.println("시리야 저녁메뉴추천해줘");
	}

}
