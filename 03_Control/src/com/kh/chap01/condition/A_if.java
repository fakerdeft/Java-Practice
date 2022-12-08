package com.kh.chap01.condition;

import java.util.Scanner;

public class A_if {

	
//	단독 If문
//	
//	[표현법]
//	If(조건식) {
//		조건식이 true일 경우 실행할 코드
//	}
//	-조건식이 true의 결과가 나오면: 중괄호 안에 있는 코드를 실행한다.
//	-조건식 결과가 false가 나오면: 중괄호를 무시하고 건너 뛴다.
	
	
	public void method1() {
//	키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		
//		num>0?"양수다": num == 0 ? "0이다": "음수다"  ->3항연산자
		
		if(num>0) { //num이 양수인지 체크하는 조건식	
			System.out.println("양수다");
		
		}
		
		if(num==0) { //num이 0인지 체크하는 조건식	
			System.out.println("0이다");
		}
		
		if(num<0) {  //num이 음수인지 체크하는 조건식	
			System.out.println("음수다");
		}
		
	}
	
	static Scanner sc=new Scanner(System.in);
	
	public void method2(){
		//단독 if문으로 홀수와 짝수를 판별하는 조건문을 완성하시오.
				//사용자한테 정수를 입력받아 판별하시오.
				//짝수다 or 홀수다 를 출력해보세요.
				//양수인경우에만 출력될수있게 추가해주세요

//		if(num%2 == 0 && num>0) {
//			System.out.println("짝수다");
//		}
//	
//		if(num%2 != 0 && num>0) {
//			System.out.println("홀수다");			
//		}
//	
				
	//중첩 if문
	//결과는 동일
		System.out.println("정수 입력:");
		int num=sc.nextInt();//정수 입력
		
		if(num!=0) {//0이 아닐 경우
			if(num>0) {//0보다 클 경우
				System.out.println("양의 정수");
				if(num%2==0) {//짝수체크
					System.out.println("짝수");
				}
				if(num%2!=0) {//홀수체크
					System.out.println("홀수");
				}
			}
			else {//0보다 작을 경우
				System.out.println("음의 정수");
				if(num%2==0) {//짝수체크
					System.out.println("짝수");
				}
				if(num%2!=0) {//홀수체크
					System.out.println("홀수");
				}
			}
		}
		else{//0일 경우
			System.out.println("0");
		}
		System.out.println("끝");
	}
	
			
	public void method3() {//주민번호를 입력 받아 남자인지 여자인지 체크
		
		System.out.println("주민번호 입력(-포함):");
		char n = sc.nextLine().charAt(7);//주민번호 뒷자리 첫 번째 수
		
		if (n=='1'||n=='3') {// 1 or 3
			System.out.println("남");
		}
		if (n=='2'||n=='4') {// 2 or 4
			System.out.println("여");
		}
		if (n!='1'&&n!='2'&&n!='3'&&n!='4') {// 1,2,3,4 전부 아니면
			System.out.println("잘못 입력");
		}
	}
	
	
}