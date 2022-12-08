package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * 증감 연산자: 단항 연산자로써 한번에 1씩 증가 또는 감소하는 연산자
	 * ->위치에 따라 먼저 연산을 할 것인지 나중에 할 것인지 달라진다.
	 * 
	 * [표현법]
	 * ++: 값을 1씩 증가시키는 연산자 
	 * --: 값을 1씩 감소시키는 연산자
	 * 
	 * 연산자의 위치
	 * 전위 연산) ++값, --값: 먼저 1을 증가 또는 감소하고 나머지 연산 수행
	 * 후위 연산) 값++, 값--: 다른 연산을 먼저 처리 후에 값을 증가 또는 감소
	 * 
	 */

	public void method1() {// 후위 연산
		
		int num = 10;
		System.out.println("num의 값은: "+num);
		
		num++; // num이라고 하는 변수에 +1
		System.out.println("num의 값은: "+num);
		
		num--; // num에 -1
		System.out.println("num의 값은: "+num);
		
		System.out.println("num의 값은 무엇일까요? : "+num++); // 10
		System.out.println("지금 num의 값은: "+num); // 11
	}
	
	public void method2(){// 후위 연산
		
		int a=10,b=a++;
		System.out.println("a의 값은: "+a); // 11
		System.out.println("b의 값은: "+b); // 10
		//후위 연산이기 때문에
		//b라는 변수에 a값을 먼저 대입후에 a에 증감연산이 행해진다.
		
		int c=20,d=c--;
		System.out.println("c의 값은: "+c); // 19
		System.out.println("d의 값은: "+d); // 20
	}
	
	public void method3() {// 전위 연산
		int a =10,b=++a;
		System.out.println("a: "+a); // 11
		System.out.println("b: "+b); // 11
		
		System.out.println("a: "+ ++a); // 12
	}
	
	public void method4() {// 후위 연산
		int num1=20,result=num1++ *3;
		System.out.println("num1 : "+num1);
		System.out.println("result : "+result);
		
		//전위 연산
		int num2=20,result2=++num2*3;
		System.out.println("num2 : "+num2);
		System.out.println("result2 : "+result2);
	}
	
}