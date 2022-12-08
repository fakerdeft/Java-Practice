package com.kh.operator;
import java.util.Scanner;
public class A_Arithmetic {
	
	
//	 산술 연산자 - 이항 연산자로써 연산 방법, 우선순위가 일반 수학 산술이랑 동일하다.
//	 
//	 +:덧셈
//	 -:뺄셈
//	 *:곱셈
//	 /:나눗셈
//	 %:모듈러(modular) 나머지 값을 구하는 연산자
	 
	public void method1() {
		
		int num1=10;
		int num2=3;
		System.out.println("num1 + num2 = "+(num1+num2));
		System.out.println("num1 - num2 = "+(num1-num2)); 
		// 뺄셈의 경우 문자열과 먼저 더해진 후에 문자열에 뺄셈을 하려고 하기 때문에 오류
		
		System.out.println("num1 * num2 = "+(num1*num2));
		System.out.println("num1 / num2 = "+(num1/num2));
		System.out.println("num1 % num2 = "+(num1%num2));
		
//	    0으로 나누기 x
//		System.out.println(10/0);
//		System.out.println(10%0);
		
		double d1 = 35; //35.0
		double d2 = 10; //10.0
		
		System.out.println("\nd1 + d2 = "+(d1+d2));
		System.out.println("d1 - d2 = "+(d1-d2));
		System.out.println("d1 * d2 = "+(d1*d2));
		System.out.println("d1 / d2 = "+(d1/d2));
		System.out.println("d1 % d2 = "+(d1%d2));
		
	}
	
	public void methodCandy() { // 개인에게 사탕을 나눠 주는 메소드
		//인원수와 사탕수를 입력 받아 1인당 가질 수 있는 사탕의 개수와 남은 사탕의 개수를 구해보자
		
		Scanner sc= new Scanner(System.in);
		System.out.println("인원 수를 입력하세요");
		int sup = sc.nextInt();
		sc.nextLine();
		
		System.out.println("사탕 수를 입력하세요");
		int can = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("1인당 가질 수 있는 사탕의 개수: %d\n남은 사탕의 개수: %d",
				can/sup,can%sup);
		
	}

}