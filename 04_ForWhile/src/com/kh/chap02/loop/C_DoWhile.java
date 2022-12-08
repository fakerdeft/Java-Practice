package com.kh.chap02.loop;

public class C_DoWhile {
	/*
	 * do-while문
	 * 조건에 관계 없이 최초 1회 실행됨
	 * ->while(false)여도 실행됨
	 * 
	 * [표현법]
	 * 초기식; <-필수x
	 * do{
	 *  실행할 구문
	 * }while(조건식);
	 * 
	 * -while문과 do-while문의 차이점
	 * -while문은 처음 실행시에도 조건식을 확인하고 true일 경우만 실행
	 * -do-while문은 무조건 처음 1회 실행
	 */

	public void method1() {
		//조건 맞지 않아도 1번 실행
		int n=1;
		
		do {
			System.out.println("ㄹㅇ?");
		}while(n==0);
		
	}
	
	public void method2() {
		int i=1;
		do {
			System.out.println("i"+i++);
		}while(i<5);
	}
	
	
}