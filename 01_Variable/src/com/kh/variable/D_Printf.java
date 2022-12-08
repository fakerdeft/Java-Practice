package com.kh.variable;

public class D_Printf {
	
	public void printfTest() {
		/*
		 * System.out.print()-> 값 출력만
		 * System.out.println()-> 값 출력 후 개행
		 * 
		 * System.out.printf("형식",값);
		 * -f:format
		 * -형식에 맞춰서 값 출력(줄바꿈x)
		 * ->문자열 안에 넣을 값들을 형식에 맞춰서 지정해줘야 한다.
		 * 
		 * 형식
		 * %d:정수
		 * %f:실수
		 * %c:문자
		 * %C:대문자
		 * %s:문자열
		 * %S:대문자열
		 */
		
		//정수 테스트
		int iNum1=10;
		int iNum2=20;
		
		System.out.println("println을 사용해서 출력한다면");
		System.out.println("iNum1의 값은? "+iNum1+"\niNum2의 값은? "+iNum2);
		
		System.out.println("\nprintf를 사용해서 출력한다면");
		System.out.printf("iNum1의 값은? %d\niNum2의 값은? %d\n\n",iNum1,iNum2);
		
		System.out.println("10+20을 출력");
		System.out.println("println을 사용한다면");
		System.out.println(iNum1+"+"+iNum2+"="+(iNum1+iNum2));
		
		System.out.println("\nprintf를 사용한다면");
		System.out.printf("%d+%d=%d\n\n",iNum1,iNum2,iNum1+iNum2);
		
		
		System.out.println("오른쪽 정렬");
		System.out.printf("%5d\n",iNum1); //%5d: 5칸의 공간 중 오른쪽 정렬
		System.out.println("왼쪽 정렬");
		System.out.printf("%-5d\n\n",iNum2); //%-5d: 5칸의 공간 중 왼쪽 정렬
		
		
		//실수 테스트
		double dnum=4.23456789;
		System.out.printf("dnum:%f\n",dnum);
		//%f: 소수점 아래 7번째 줄에서 반올림하여 6번째 자리까지만 표현.
		
		System.out.printf("dnum:%.1f\n\n",dnum); // %.1f소수점 아래 2번째 줄에서 반올림
		
		
		//문자와 문자열 테스트
		char ch='a';
		String str="Hello";
		
		System.out.printf("ch:%C\n",ch);
		System.out.printf("str:%S\n",str);
	}
}