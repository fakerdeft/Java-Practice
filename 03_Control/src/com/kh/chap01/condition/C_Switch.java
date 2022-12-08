package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	/*
	 * switch문 
	 * [표현법] switch(아래에 기술할 값들과 동등비교를 할 대상)
	 * { case 값1: 실행할 코드1 // 대상=값1 T일 경우 실행 
	 * break; //switch 탈출 
	 * case 값2: 실행할 코드2 // 대상=값2 T일 경우 실행 
	 * break; //switch 탈출
	 * ...
	 * 
	 * default: 실행할 코드; //case 모두 F일 경우 실행 }
	 * 
	 * switch문과 if문 차이점 if(조건식)->조건식을 복잡하게 기술 가능, 값의 범위 제시 가능 
	 * switch(대상자)->조건식 X,확실한 값의 조건만 기술 가능(동등비교만 수행)
	 */
	
	static Scanner sc = new Scanner(System.in);

	public void method1() {
		// 홀 짝 판별
		System.out.println("정수 입력:");
		int n = sc.nextInt(); // 정수 입력
		int r = n % 2; // 0:짝수, 1:홀수

		switch (r) {
		
		case 0: // 짝수일 경우
			System.out.println("짝수");
			break;

		case 1: // 홀수일 경우
			System.out.println("홀수");
			break;
		}
	}

	public void method2() {
		// 주민번호 입력 받아 성별 판별
		System.out.println("주민번호 입력(-포함):");
		char c = sc.nextLine().charAt(7); // 뒷자리 첫 번째 수

		switch (c) {

		case 49:
		case 51:
			System.out.println("남");
			break;

		case 50:
		case 52:
			System.out.println("여");
			break;

		default:
			System.out.println("잘못 입력");
		}
	}

	public void method3() {
		// 과일 이름 입력 받아 가격 출력
		// 사과:1000원, 귤:500원, 수박:12000원
		System.out.println("과일 이름 입력:");
		String s = sc.nextLine();
		int p = 0;

		switch (s) {
		
		case "사과":
			p = 1000;
			break;
			
		case "귤":
			p = 500;
			break;
			
		case "수박":
			p = 12000;
			break;
			
		default:
			System.out.println("잘못 입력");
			return; // 나를 호출한 영역으로 돌아간다
		// return: 현재 실행하고 있는 메소드를 벗어나서 호출한 곳으로 돌아간다
		}
		System.out.printf("%s의 가격은 %d원 입니다.", s, p);
	}
	
	public void method4() {
		//문자열 비교는 equals메소드를 사용해야 한다
		System.out.println("아이디:");
		String id=sc.nextLine();
		System.out.println("비밀번호:");
		String pw=sc.nextLine();
		
		//회원가입 되어있는 정보
		String id2="user01";
		String pw2="pass01";
		
		if(id.equals(id2)&&pw.equals(pw2)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		
//		System.out.println(System.identityHashCode(id2));
//		System.out.println(System.identityHashCode(pw2));
		
		/*
		 * 기본 자료형은 == != 처럼 동일비교 가능
		 * 참조 자료형은 동일 비교 불가능
		 * 참조 자료형은 객체의 주소값이 담겨있기 때문
		 * 그래서 참조 자료형끼리의 비교는 .equals로 해야함
		 * [표현법] 문자열.equals("비교 문자열");
		 * 결과값은 T/F
		 */
	}

}