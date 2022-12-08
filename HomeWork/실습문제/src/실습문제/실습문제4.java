package 실습문제;

import java.util.*;

public class 실습문제4 {

	public Scanner sc=new Scanner(System.in);
	
////////////////////////////////////////////////////////////////	
	public void method1() {//실습문제1
		System.out.println("정수 입력:");
		int a=sc.nextInt();
		
		if(a>=1) {
			for(int i=1;i<=a;i++) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
/////////////////////////////////////////////////////////////////	
	public void method2() {//실습문제2
		
		for(;;) {
			System.out.println("정수 입력:");
			int a=sc.nextInt();
		
			if(a>=1) {
				for(int i=1;i<=a;i++) {
					System.out.println(i);
				}
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		}
		
	}
///////////////////////////////////////////////////////////////////
	public void method3() {//실습문제3
		
			System.out.println("정수 입력:");
			int a=sc.nextInt();
		
			if(a>=1) {
				for(int i=a;i>=1;i--) {
					System.out.println(i);
				}
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
	}
//////////////////////////////////////////////////////////////////	
	public void method4() {//실습문제4
		
		while(true) {
			System.out.println("정수 입력:");
			int a=sc.nextInt();
		
			if(a>=1) {
				for(int i=1;i<=a;i++) {
					System.out.println(i);
				}
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		}
		
	}
///////////////////////////////////////////////////////////////////	
	public void method5() {//실습문제5
		
		System.out.println("정수 입력:");
		int a=sc.nextInt();
		int b=0;
		
		for(int i=1;i<a;i++) {
			b+=i;
			System.out.println(i+" + ");
		}
		System.out.println(a+" = "+b);
		
	}
///////////////////////////////////////////////////////////////////	
	public void method6() {//실습문제6
		
		System.out.println("두 개의 정수 입력:");
		int a=sc.nextInt();
		int b=sc.nextInt();
	
		System.out.println("첫 번째 정수:"+a);
		System.out.println("두 번째 정수:"+b);
	
		if(a>=1&&b>=1) {
			if(a>b) {
				for(int i=a;i<=b;i++) {
					System.out.println(i);
				}
			}
			else{
				for(int i=b;i<=a;i++) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("1이상의 숫자만 입력하세요.\n");
		}
		
	}

///////////////////////////////////////////////////////////////////	
	public void method7() {//실습문제7
		
		for(;;) {
			System.out.println("두 개의 정수 입력:");
			int a=sc.nextInt();
			int b=sc.nextInt();

			System.out.println("첫 번째 정수:"+a);
			System.out.println("두 번째 정수:"+b);
		
			if(a>=1&&b>=1) {
				for(int i=a;i<=b;i++) {
					System.out.println(i);
				}
				break;
			}
			else {
				System.out.println("1이상의 숫자만 입력하세요.\n");
			}
		}
		
	}
///////////////////////////////////////////////////////////////////	
	public void method8() {//실습문제8
	
		System.out.println("원하는 단 입력(2~9):");
		int a=sc.nextInt();
		
		System.out.println("====="+a+"단=====");
		
		for(int i=1;i<=9;i++) {
			System.out.println(a+"x"+i+"="+a*i);
		}
		
	}
///////////////////////////////////////////////////////////////////
	public void method9() {//실습문제9
		
		System.out.println("원하는 단 입력(2~9):");
		int a=sc.nextInt();
		if(a>=2&&a<=9) {
			for(int j=a;j<=9;j++) {
				System.out.println("====="+j+"단=====");
				for(int i=1;i<=9;i++) {
					System.out.println(j+"x"+i+"="+a*i);
				}
			}
		}
		else {
			System.out.println("2~9사이의 숫자만 입력하세요.");
		}
	}
////////////////////////////////////////////////////////////////////
	public void method10() {//실습문제10
		
		while(true) {
			System.out.println("원하는 단 입력(2~9):");
			int a=sc.nextInt();
			
			if(a>=2&&a<=9) {
			for(int j=a;j<=9;j++) {
					System.out.println("====="+j+"단=====");
					for(int i=1;i<=9;i++) {
						System.out.println(j+"x"+i+"="+a*i);
					}
				}
				break;
			}
			else {
				System.out.println("2~9사이의 숫자만 입력하세요.");
			}
		}
		
	}
////////////////////////////////////////////////////////////////////
	public void method11() {//실습문제11
		
		System.out.println("초항, 공차 입력:");
		int a=sc.nextInt(); //초항 
		int d=sc.nextInt(); //공차
		
		System.out.println("초항:"+a+"\n공차:"+d);
		
		for(int i=1;i<11;i++) {
			
			int b=(a+(i-1)*d); //등차수열
			System.out.println(b);
		}
		
	}
////////////////////////////////////////////////////////////////////
	public void method12() {//실습문제12
		
		while(true) {
			System.out.println("\n정수 두 개와 연산자를 \n입력하세요."
					+ "\n(연산자에 exit입력 시 종료):");
			int a=sc.nextInt(); //정수1
			int b=sc.nextInt(); //정수2
			sc.nextLine();
			String s=sc.nextLine(); //연산자
			
			System.out.println("연산자(+,-,*,%,/): "+s
					+ "\n정수1: "+a+"\n정수2: "+b); //입력 결과 출력
			
			int t=0; //계산결과 초기화
			
			if(s.equals("+")||s.equals("-")||s.equals("%")
					||s.equals("*")||s.equals("/")||s.equals("exit"))
			{// (+,-,*,/,%) 입력 된 경우	
				switch(s) { // 각 연산별 계산
			
				case "+":
					t=a+b;
					break;				
				case "-":
					t=a-b;
					break;					
				case "*":
					t=a*b;
					break;				
				case "%":
					t=a%b;
					break;			
				case "/":
					if(s.equals("/")&&b==0) {//나눗셈인데 정수2가 0인 경우
						System.out.println("0으로 나눌 수 없습니다.\n다시 입력하세요:");
						break;
					}
					else{//정수2가 0이 아닌 경우
						t=a/b;
					}
					break;
					
				case"exit":	//exit 입력				
					System.out.println("프로그램을 종료합니다.");
					return;
				}
				System.out.println(a+s+b+"="+t); //계산 결과
			}//switch
			else {//다른 연산자가 입력된 경우		
				System.out.println("없는 연산자입니다.\n다시 입력하세요:");					
			}//if
			
		}//while
		
		
	}//method

	
}//class
