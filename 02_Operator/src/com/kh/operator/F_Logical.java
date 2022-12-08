package com.kh.operator;
import java.util.Scanner;

public class F_Logical {
	
	/*
	 * 논리 연산자: 이항 연산자, 두 개의 논리값을 연산하는 연산자
	 * 
	 * [표현법] 논리값 논리 연산자 논리값 -> 결과값도 논리값
	 * 
	 * 종류
	 * AND 연산자 : 논리값&&논리값
	 * ->왼쪽 오른쪽 모두 true여야 결과값이 true
	 * 
	 * OR 연산자 : 논리값||논리값
	 * ->왼쪽 또는 오른쪽 중 하나만 true여도 결과값 true
	 */
	
	static Scanner sc = new Scanner(System.in);

	public void method1() {//AND 연산자
		//사용자가 입력한 값이 양수이면서 짝수인지 확인해보기
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean result=(num>0)&&(num%2==0);
		//&& : ~이면서, ~이고
		System.out.println("입력한 값이\n양수이면서 짝수인가요? \n"
				+result);
		
		//사용자가 입력한 값이 음수이면서 홀수인지 확인해보기
		
		boolean result2=(num<0)&&(num%2!=0);
		System.out.println("\n입력한 값이\n음수이면서 홀수인가요? \n"
				+result2);
		
		//입력한 정수 값이 1이상 100이하인지 확인
		boolean result3=(1<=num)&&(num<=100);
		System.out.println("\n입력한 값이 1이상 100이하인가요? \n"
				+result3);
		
	}
	
	
	public void method2() {//OR 연산자
		//사용자가 입력한 값이 M 또는 m인지 확인
		//당신은 남자입니까? t/f
		
		System.out.println("문자 입력: ");
		char c= sc.nextLine().charAt(0);		
		boolean result=(c=='M')||(c=='m');
//		String c2=sc.nextLine();
//		boolean result2=(c2.equals("M"))||(c2.equals("n"));
//		문자열(String) 비교는 .equals	
		System.out.println("입력한 값이 M 또는 m 인가요? \n"
				+result);
		System.out.println("남자입니까? \n"+result);
	}
	
	public void method3() {
		int num=10;
		boolean result = false && (num>0);
		//dead code: 어차피 f라서 뒤의 비교 연산 구문이 실행x
		System.out.println(result);
		
		boolean result2 = false || (num>0);
		System.out.println(result2);
	}

}
