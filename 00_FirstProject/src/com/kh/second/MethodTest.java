package com.kh.second;
// 패키지명은 항상 소문자로 작성

public class MethodTest {

	public static void main(String[] args) {
		System.out.println("메인 메소드 실행 중!");
		methodA();
		System.out.println("돌아왔나?");
	}
	
	public static void methodA() {
		System.out.println("메소드 A 실행 중!");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("메소드 B 실행 중!");
		methodC();
	}
	
	public static void methodC() {
		System.out.println("메소드 C 실행 중!");
		// methodA(); <- 무한루프에 빠진다
	}
}