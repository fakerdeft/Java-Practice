package com.kh.chap05.method.controller;

public class MethodTest2 {
	//static 메소드 만들기
	
	//1.반환값 x 매개변수 x 메소드
	public static void method1() {
		System.out.println("반환값 x 매개변수 x 메소드.");
	}
	//2.반환값 x 매개변수 o
	public static void method2(String str) {
		System.out.println(str);
	}
	//3.반환값 o 매개변수 x
	public static String method3() {
		return "반환값 o 매개변수 x";
	}
	//4.반환값 o 매개변수 o
	public static String method4(String str) {
		System.out.println(str+"입니다");
		return "이건 반환값";
	}
	
}
