package com.kh.operator;

public class C_Compound {
	
	
//	복합 대입 연산자: 다른 산술 연산자랑 대입 연산자
//	+=
//	-=
//	*=
//	/=
//	%=
	
//	예시) a+=3; -> a=a+3;
	
	public void method1() {
		
		int num=12;
		System.out.println("현재 num: "+num);
		num=num+3;
		System.out.println("+3 num: "+num);
		num+=3;
		System.out.println("+3 num: "+num);
		num-=3;
		System.out.println("-3 num: "+num);
		num*=3;
		System.out.println("X3 num: "+num);
		num/=3;
		System.out.println("/3 num: "+num);
		num%=3;
		System.out.println("%3 num: "+num);
		
	}
	
}
