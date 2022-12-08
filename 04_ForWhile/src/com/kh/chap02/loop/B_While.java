package com.kh.chap02.loop;

public class B_While {
	
	/*
	 * while문
	 * 괄호 안에 조건이 t일 경우 해당 구문 반복 실행
	 * 조건식에 t적으면 무한반복
	 * [표현법]
	 * 초기식; <-필수x
	 * while(조건식){
	 * 반복하고자 하는 구문
	 * 증감식; <-필수x
	 * }
	 * 
	 * 초기식 지정
	 * while문 만나는 순간
	 * 조건식 검사->t일 경우 실행->증감식 없다면->계속t반복
	 * 조건식 검사->f일 경우 탈출
	 */
	
	
	public void method1() {
		
		//초기식
		int i=0;
		
		while(i<5) {
			System.out.println("반복");
			i++;
		}
		
//		//무한반복
//		while(true) {
//			System.out.println("반복");
//		}
		
//		//감소
//		i=5;
//		while(i>0) {
//			System.out.println("i:"+i);
//			i--;
//		}
//		
//		//2씩 증가하는 복합대입연산자 활용
//		i=0;
//		while(i<10) {
//			System.out.println("i:"+i);
//			i+=2;
//		}
}
	
	public void method2() {
		//1~100 짝수더하기
		//누적값
		int i=0;
		int a=0;
		while(i<101) {
			a+=i;
			i+=2;
		}
		System.out.println(a);
			
		}
	
	public void method3() {
		//1~100 홀수더하기
		int i=1;
		int a=0;
		while(i<=100) {
			a+=i;
			i+=2;
		}
		System.out.println(a);
	}
	
}