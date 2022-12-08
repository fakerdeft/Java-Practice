package com.kh.chap03.branch;
import java.util.Scanner;

public class B_Continue {
	/*
	 * continue:반복문 안에서만 사용하는 구문
	 * continue를 만나면 뒤에 있는 구문 실행x
	 * for문은 증감식으로 while문은 조건식으로 이동
	 * 
	 */
	static Scanner sc=new Scanner(System.in);
	
	public void method1() {
		//1~10중 홀수만 출력
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {//짝수일 때
				continue;
			}//아래 구문을 무시함
			
			System.out.println("숫자 출력: "+i);
		}
	}
	
	public void method2() {
		//1부터 100까지 총 합계 구하는데
		//6의 배수만 제외하고 더하기
		int a=0;
		for(int i=1;i<101;i++) {
			if(i%6==0) {
				continue;
			}
			a+=i;
		}
		System.out.println(a);
	}
	
	public void method3() {
		//구구단 출력
		//4의 배수단만 빼고 출력하기
		//2~9단까지

		for(int i=2;i<=9;i++) {
			if(i%4==0) {
				continue;
			}
			
			System.out.println("====="+i+"단=====");
			
			for(int j=1;j<=9;j++) {
				
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}

}