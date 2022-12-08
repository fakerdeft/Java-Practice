package com.kh.chap02.loop;

import java.util.*;

public class A_For {
	static Scanner sc= new Scanner(System.in);
	/*
	 * for문
	 * 괄호 안의 반복을 지정하는 부분이 있고,
	 * 초기식,조건식,증감식 세 가지로 이루어진다.
	 * 각각의 식은 세미콜론으로 구분 되어 진다.
	 * 
	 * [표현법]
	 * for(초기식;조건식;증감식){//반복 횟수를 지정할 요소들
	 * 		반복하고자 하는 코드
	 * }
	 * ->초기식: 반복문이 시작될 떄 "초기에 단 한 번만 실행"될 구문
	 * 즉,반복문에서 사용할 변수를 선언하고 초기화하는 구문
	 * ex) int i=0;
	 * 
	 * ->조건식: 반복문이 실행될 조건을 작성하는 구문
	 * 조건식이 true일 경우 반복문 실행
	 * 조건식이 false일 경우 반복문을 멈추고 벗어난다.
	 * 보통 초기식에서 선언한 변수를 활용하여 조건식 작성.
	 * ex) i < 10;
	 * 
	 * ->증감식: 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 보통 초기식에서 선언된 변수를 활용하여 증감식 작성
	 * 이때 증감 연산자가 자주 사용된다.
	 * ex) i++
	 * 
	 * for문을 만나는 순간
	 * 초기식->조건식(조건검사)->true일 경우 문장 수행->증감식
	 * 	   ->조건식(조건검사)->true일 경우 문장 수행->증감식
	 * .....
	 *      ->false일 경우 반복문 탈출
	 */
	
	public void method1() {
//		//안녕하세요 5번 실행
//		for(int i=0;i<5;i++) {//i는 지역변수. for문 안에서만 사용 가능
//			System.out.println("안녕하세요");
//		}
//		
//		//미리 선언한 변수 활용
//		int a=0;
//		for(a=0; a<10; a++) {
//			System.out.println("Hi"+(a+1));
//		}
//		
//		//비추
//		for(a=1;a<=10;a++) {
//			System.out.println("hi");
//		}
//		
//		//i값 감소
//		for(int i=10;i>0;i--) {
//			System.out.println("zz"+(i));
//		}
		
//		//2씩 증가
//		for(int i=0; i<10;i+=2) {
//			System.out.println("hi"+i);
//		}
		
//		//2의 제곱으로 증가
//		for(int i=1; i<100; i*=2) {
//			System.out.println("hi"+i);
//		}
		
//		//증감식 표현
//		for(int i=1; i<10; i=i+1) {
//			System.out.println("hi"+i);
//		}
		
//		//증감식 없으면 무한반복
//		for(int i=1; i<10;) {
//			System.out.println("i");
//		}
		
//		//초기식 조건식도 없애기
		//조건식 부분이 true가 디폴트라서 무한반복
//		for(;;) {
//			
//		}
		
	}
	
	public void method2() {
		
//		//고정적인 문자열 말고 매번 달라지는 출력 결과를 도출해보자.
//		for(기준값;반복시키고자 하는 횟수;i++) {
//			System.out.println("i의 값은"+i);
//		}

//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
		
		//위의 표현법을 이용해서 문자열을 각 문자로 출력
		//문자열.charAt(인덱스위치);
		
		System.out.println("문자열에서 문자 추출하기");
		
		String str="Hello";
		
//		for(int i=0; i<5; i++) {
//			
//			System.out.println(i+""+str.charAt(i));
//		
//		}
	
		str="hi hello 안녕 반가워";
		
		
		//문자열.length(); : 현재 문자열 길이 알려줌
//		for(int i=0;i<str.length();i++) {
//			System.out.println(i+""+str.charAt(i));	
//		}

		System.out.println(str.length());
			
	}
	
	public void method3() {
		
		int b=0;
		
		//누적 합 구하기
		for(int i=1;i<11;i++) {
			
			b+=i;
			System.out.println("누적 합:"+b);
		}

		
		//1~10모두 더해서 출력
		for(int i=1;i<11;i++) {
			b+=i;
		}
		System.out.println("총합:"+b);

		
		//정수 입력 받아 입력 받은 수 까지 모두 더하기
		System.out.println("정수 입력:");
		int a= sc.nextInt();
		int c=0;
		for(int i=0;i<=a;i++) {
			c+=i;
		}
		System.out.println(c);
		
		
	}
	
	public void method4() {
		//정수를 입력받아 입력받은 수까지 중에서 짝수만 더하여 누적 합을 구해봅시다.
		System.out.println("정수 입력:");
		int a=sc.nextInt();		
		int b=0;
		
		for(int i=0;i<=a;i++) {
			if(i%2==0) {//증가하는 i가 짝수인 경우
				b+=i;
				System.out.println("i값:"+i);
				System.out.println("누적값:"+b);
			}
		}
		System.out.println("총:"+b);	
	}
	
	public void method5() {
		//구구단 
		//몇 단 출력인지 입력받아 구구단 출력
		System.out.println("원하는 단 입력:");
		int a=sc.nextInt();

		for(int i=1;i<=9;i++) {
			System.out.println(a+" x "+i+" = "+a*i);
		}
		
	}
	
	public void method6() {
		//입력된 수가 1~9사이의 정수일때만 구구단 실행
		//잘못된 숫자가 들어오면 경고문
		System.out.println("원하는 단 입력:");
		int a=sc.nextInt();
		
		if(1<=a&&a<=9) {
			for(int i=1;i<=9;i++) {
				System.out.println(a+" x "+i+" = "+a*i);
			}
		}
		else {
			System.out.println("잘못된 수 입니다.");
		}
	}
	
	public void method7() {
		//맨몸 스쿼트 15개씩 5세트를 해야 한다.
		for(int i=1;i<16;i++) {
			System.out.println("스쿼트 개수:"+i);
		}
		
		//스쿼트 한 세트를 5번 반복
		for(int i=1;i<6;i++) {
			System.out.println(i+"번째 세트");
			
			for(int j=1;j<16;j++) {
				System.out.println("스쿼트 개수:"+j);
			}
			
		}
	}
	
	public void method8() {
		//입력받은 단 부터 9단까지 출력
		System.out.println("원하는 단 입력:");
		int a=sc.nextInt();
		
		for(int j=a;j<=9;j++) {	
			System.out.println("====="+j+"단=====");
			for(int i=1;i<=9;i++) {
				System.out.println(j+"x"+i+"="+a*i);
			}
		}	
	}
	
	public void method9() {
//		*
//		**
//		***
//		****
//		*****
		for(int j=1;j<6;j++) {
			for(int i=6;i>j;i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
}