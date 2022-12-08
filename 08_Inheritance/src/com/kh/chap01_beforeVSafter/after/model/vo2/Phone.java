package com.kh.chap01_beforeVSafter.after.model.vo2;

public abstract class Phone extends Object{
	
	public abstract void call();

	public void sms() {
		System.out.println("문자하기");
	}
	
	public abstract void camera();
	
	
}
