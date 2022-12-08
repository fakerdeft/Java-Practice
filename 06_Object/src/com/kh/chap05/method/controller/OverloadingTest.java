package com.kh.chap05.method.controller;

public class OverloadingTest {
	
	/*
	 * 메소드 오버로딩
	 * -한 클래스 안에 같은 메소드 명으로 여러 메소드들을 정의할 수 있는 방법
	 * -매개변수의 자료형의 개수,순서,종류가 다 다르게 작성되어야 한다.
	 * -단, 매개변수명,접근제한자,반환형은 메소드 오버로딩에 영향을 주지 않는다.
	 */
	
	//메소드의 이름은 test로 통일
	
	public void test() {
		//오버로딩이 잘 되어 있는 대표적인 메소드
		System.out.println("안녕하세요");
		System.out.println(5);
		System.out.println(true);
	}
	public void test(int a) {
		System.out.println(a+"을 출력하는 test");
	}
	public void test(int a,int b) {
		System.out.println("덧셈 메소드");
		System.out.println((a+b)+"을 출력하는 test");
	}
	public void test(String a,int b) {
		System.out.println("문자열 반복 메소드");
		for(int i=0; i<b; i++) {
			System.out.println(a);
		}
	}
	public int test(int a,int b,int c) {
		System.out.println("숫자 세 개를 더해주는 메소드");
		return a+b+c;
	}
	
	//오류-매개변수 타입과 개수가 같기 때문에 오류
	//매개변수명이 아닌 타입or개수를 다르게 해줘야함
//	public void test(int age,String name) {
//		System.out.println(age+name+"을 출력하는 test");
//	}
	
	//반환형은 메소드 오버로딩에 영향을 끼치지 않는다
//	public String test(String a,int b) {
//		System.out.println(a+b+"를 출력하는 test");
//	}
	
	//접근제한자도 영향 x
//	private int test(String a,int b) {
//		return ;
//	}
	
	/*
	
	총 정리-메소드 오버로딩은 오직 매개변수의 개수와 타입을 기준으로 적용된다.
		-접근제한자나 반환형을 다르게 해도 의미 없다.
	
	*/	

}























