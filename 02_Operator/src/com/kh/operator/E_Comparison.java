package com.kh.operator;

public class E_Comparison {
	
	/*
	 * 비교 연산자(관계 연산자)
	 * 두 개의 값을 비교하는 이항 연산자
	 * 비교 연산을 한 결과는 true / false
	 * 특정 조건을 제시할 수 있는 조건문에서 쓰인다.
	 * 
	 * 종류
	 * 1. 대소비교
	 * a<b: a가 b보다 작다
	 * a>b: a가 b보다 크다
	 * a<=b: a가 b보다 작거나 같다
	 * a>=b: a가 b보다 크거나 같다
	 * 
	 * 2. 동등비교
	 * a==b: a와 b가 일치
	 * a!=b: a와 b가 일치x
	 * 
	 * 
	 */
	public void method1() {
		
		int a=10,b=25;
		System.out.println("a<b: "+(a<b));
		//비교 연산보다 산술 연산이 우선순위가 더 높아서 괄호를 줘야함
		System.out.println("a<=b: "+(a<=b));
		System.out.println("a>b: "+(a>b));
		System.out.println("a>=b: "+(a>=b));
		
		System.out.println("a==b: "+(a==b));
		System.out.println("a!=b: "+(a!=b));
		
		//산술+비교 연산
		System.out.println("a-b<0: "+(a-b<0));
		
		//어떠한 값을 2로 나누었을때 나머지 1->홀, 나머지 0-> 짝
		System.out.println("a가 짝수입니까?: "+(a%2==0));
		System.out.println("b가 홀수입니까?: "+(b%2!=0));
		
	}
}
