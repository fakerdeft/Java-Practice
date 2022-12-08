package com.kh.chap05.method.controller;

public class MethodTest1 {

	/*
	 * 메소드: 입력을 가지고 어떤 일을 수행한 다음에 결과물을 내어놓는 것
	 * 		일반메소드와 메인메소드로 나뉜다.
	 * 
	 * [표현법]
	 * 접근제한자 예약어 반환형 메소드명(매개변수자료형 매개변수명,매개변수자료형 매개변수명.....){
	 * 		수행할 코드
	 * 
	 * 		return 반환값;
	 * }
	 * -생략 가능한 것: 예약어, 매개변수, 반환값(단 void일 경우)
	 * -반환형: 반환할 값의 자료형
	 * -호출할 때 넣는 값: 매개변수 자료형과 일치시켜서 넣어야 한다.
	 * 
	 */
	
	//1.매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수랑 반환값이 없는\n메소드입니다.");
		
		//1부터 10까지 모든 수를 더해서 출력하는 메소드
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//return 생략되어있음
		//jvm이 해준다
		
	}
	
	//반환값은 있고 매개변수는 없는 메소드
	public int method2() {
		System.out.println("반환값은 있고\n매개변수는 없는 메소드입니다.");
		//1부터 10까지 모든 수를 더해서 출력하는 메소드
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;
	}
	
	//반환값은 없고 매개변수는 있는 메소드
	public void method3(int a,int b) {
		//전달받은 a와 b를 곱해서 출력하고 싶다.
		System.out.println(a+" * "+b+" = "+(a*b));
	}
	
	//반환값 있고 매개변수도 있는 메소드
	public int method4(int a,int b) {
		
		return a*b;
	}
	
	
}//class





















