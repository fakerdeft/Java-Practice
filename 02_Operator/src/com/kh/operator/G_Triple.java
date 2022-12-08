package com.kh.operator;
import java.util.Scanner;
public class G_Triple {
	
	/*
	 * 삼항 연산자: 피연산자가 3개-> 값 3개와 연산자 1개로 이루어진다.
	 * 
	 * 조건식: 결과값에 따라서 연산을 처리하는 방식
	 * -> 결과값이 참일 경우 식1을 처리
	 * -> 결과값이 거짓일 경우 식2를 처리
	 * 
	 * [표현법]
	 * 조건식 ? 식1 : 식2 ;
	 * 조건식 참 -> 식1 , 거짓-> 식2
	 * 
	 * ex) 10>5 ? num++ : num--;
	 * 
	 */
	
	static Scanner sc=new Scanner(System.in);
	
	public void method1() {
		//사용자가 입력한 값이 양수인지 아닌지 판별 후 그에 맞는 결과를 출력
		System.out.println("정수 입력: ");
		int n=sc.nextInt();
		
		//결과값이 문자열로 나올 수 있도록 작성
		String result=(n>0)?"양수입니다.":"양수가 아닙니다.";
		System.out.println(result);	
	}
	
	public void method2() {
		//짝수인지 홀수인지 판별해서 짝수입니다or홀수입니다 문자열 출력
		System.out.println("정수 입력: ");
		int n=sc.nextInt();
		String result=(n%2==0)?"짝수입니다":"홀수입니다";
		System.out.println(result);
	}
	
	public void method3() {
		//영문자 하나 입력 받아 대소문자 판단
		System.out.println("문자 입력: ");
		char c=sc.nextLine().charAt(0);
		String result=(c>='a'&& c<='z')?"소문자입니다":"대문자입니다";
		//알파벳도 숫자처럼 크기비교 가능
		System.out.println(result);
	}
	
	public void method4() {
		//정수값이 양수인지 0인지 음수인지 판별해보기
		System.out.println("정수 입력: ");
		int n=sc.nextInt();
		String result=(n>0)?"양수입니다":((n==0)?"0입니다":"음수입니다");
		System.out.println(result);
	}
}
