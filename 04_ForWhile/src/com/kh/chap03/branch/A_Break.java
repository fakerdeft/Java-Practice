package com.kh.chap03.branch;
import java.util.Scanner;
public class A_Break {

	/*
	 * break;: break문을 만나는 순간 가장 가까운 반복문 탈출
	 * 
	 * 주의)switch문의 break은 switch만 빠져나감
	 * 
	 */
	static Scanner sc=new Scanner(System.in);
	
	public void method1() {
		//매번 사용자에게 문자열 입력 받고
		//해당 문자열 길이 출력
		//exit입력하면 탈출
		String str="";
		
		while(true) {
			System.out.println("문자열 입력:");
			str=sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println("문자열 길이:"+str.length());
		}
		
		System.out.println("종료");
	}
	
	public void method2() {
		//매번 숫자 입력받음
		//음수 입력하면 종료
		
		int a=0;
		while(true) {
			System.out.println("숫자 입력:");
			a=sc.nextInt();
			
			if(a<0) {
				break;
			}
			System.out.println(a);
		}
		System.out.println("종료");
	}
}