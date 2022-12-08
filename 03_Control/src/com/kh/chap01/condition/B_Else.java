package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if-else문
	 * 
	 * [표현법]
	 * if(조건식){
	 * 		1번 코드
	 * }
	 * else{
	 * 		2번 코드
	 * }
	 * 
	 * ->조건식의 결과가 T일 경우 1번 코드 실행
	 * ->조건식의 결과가 F일 경우 2번 코드 실행
	 *
	 */
	static Scanner sc=new Scanner(System.in);
	
	public void method1(){
		//정수 입력 받아 양/음/0 판단
		System.out.println("정수 입력:");
		int n=sc.nextInt();
		
		if(n>0) {//양의 정수일 경우
			System.out.println("양의 정수");
		}
		else {//양의 정수가 아닐 경우
			if(n==0) {//0일 경우
				System.out.println("0");
			}
			else {//0이 아닐 경우
				System.out.println("음의 정수");
			}
		}

	}
	
	public void method2(){
		//주민번호 입력 받아 성별 판단
		//if-else문 활용
		System.out.println("주민번호 입력(-포함):");
		char c=sc.nextLine().charAt(7);//뒷자리 첫 번째 수
		
		if((c=='1')||(c=='3')) {//1 or 3인 경우
			System.out.println("남");
		}
		else {
			if(c!='2'&&c!='4') {//2 and 4아닌 경우
				System.out.println("잘못 입력");
			}
			else {//2 or 4인 경우
			System.out.println("여");
			}
		}
	}
	
	/*
	 * if-else if 문
	 * 
	 * [표현법]
	 * if(조건식1){
	 * 		1번 코드
	 * }
	 * else if(조건식2){
	 * 		2번 코드
	 * }
	 * else if(조건식3){
	 * 		3번 코드
	 * }
	 * ...
	 * else{
	 * 		앞에 있는 모든 조건들이 F일 경우 실행할 코드
	 * }
	 */
	
	public void method3() {
		//정수 입력 후 양/음/0 판별
		System.out.println("정수 입력:");
		int n =sc.nextInt();//정수 입력
		
		if(n>0) {//0보다 클 경우
			System.out.println("양의 정수");
		}
		else if(n<0) {//0보다 작을 경우
			System.out.println("음의 정수");
		}
		else {//둘 다 아닐 경우
			System.out.println("0");
		}
	}
	
	public void method4() {
		//나이 입력 받아 어린이,청소년,성인 판별
		//0~13: 어린이, 13~19: 청소년, 20~: 성인
		System.out.println("나이 입력:");
		int n=sc.nextInt();//나이 입력
		
		if(n>=0&&n<=13) {//0~13세 일 경우
			System.out.println("어린이");
		}
		else if(n>=14&&n<=19) {//14~19세 일 경우
			System.out.println("청소년");
		}
		else if(n>=20) {//20세 이상일 경우
			System.out.println("성인");
		}
		else {//음수일 경우
			System.out.println("잘못 입력");
		}
	}
	
}
