package com.kh.chap03_interface.model.vo;

//클래스 상속은 extends / interface 구현은 implements 
public class MovieActor extends Person implements Actor,Movie{

	@Override
	public void mv() {
		System.out.println("영화찍기");
	}

	@Override
	public void cry() {
		System.out.println("눈물연기");
	}

	@Override
	public void angry() {
		System.out.println("화난연기");
	}

	@Override
	public void action() {
		System.out.println("액션연기");
	}

}
