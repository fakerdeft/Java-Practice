package com.kh.variable;

public class C_Cast {
	/*
	 * 형변환: 값의 종류 즉, 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터 상에서 값을 처리하는 규칙
	 * 1.=(대입연산자)를 기준으로 해서 왼쪽 오른쪽은 같은 자료형이여야 한다.
	 * -즉 같은 자료형에 해당되는 값만 대입 가능함
	 * -자료형이 다른 경우 오른쪽을 바꿔서 대입해줘야 한다.
	 * 2. 같은 자료형끼리만 연산이 가능하다.
	 * -다른 자료형끼리 연산을 하고 싶다면 한 쪽은 형변환을 통해 자료형을 맞춰줘야 한다.
	 * 3. 연산의 결과물도 같은 자료형이여야 한다.
	 * 
	 * [표현법] (바꿀 자료형)값
	 * 형변환 연산자, cast연산자
	 * 
	 * 형변환의 종류
	 * 1. 자동 형변환: 자동으로 형변환이 진행된다. 작은 바이트->큰 바이트
	 * 2. 강제 형변환: 자동 형변환이 되지 않는 경우 진행. 직접 형변환 연산자를 이용해서
	 * 				형변환을 진행해야 한다. 큰 바이트->작은 바이트. 값 손실이 발생할 수 있다.
	 */
	
	public void AutoCasting() {
		// 1. int(4 byte)->double(8 byte)
		int i1 = 10;
		double d1 = /*(double)*/ i1;
		System.out.println("d1 = "+d1); //자동으로 형변환
		
		int i2 = 12;
		double d2 = 3.3;
		double result = /*(double)*/ i2+d2; //12+3.3->12.0+3.3
		System.out.println("result = "+result);
		
		// int(4 byte)->long(8 byte)
		int i3 = 1000;
		long l3 = i3; // 1000
		System.out.println("l3 = "+l3);
		
		long l4 = 2000; //L을 붙여주지 않아도 자동 형변환 되기 때문에 문제 x
		System.out.println("l4 = "+l4);
		
		//long(8 byte)->float(4 byte)
		//정수가 실수로 담길 때 큰 사이즈의 정수가 작은 사이즈의 실수에 대입이 가능하다.
		//4 byte인 float가 8 byte인 long형 보다 더 많은 수를 표현 가능하기 때문.
		long l5 = 1000000;
		float f5 = l5;
		System.out.println("f5 = "+f5);
		
		//char(2 byte)<->int(4 byte): 문자랑 int는 양방향 형변환 가능
		//아스키 코드표
		char ch = 65;
		System.out.println("ch = "+ch); // 'A'
		ch = 97;
		System.out.println("ch = "+ch); // 'a'
		int num = 'G';
		System.out.println("num = "+num);
		
		System.out.println('김');
		System.out.println((int)'김');
		
		//byte,short 간의 연산
		byte b1=1;
		byte b2=2;
		System.out.println(b1+b2); //결과 값이 int형 -> CPU가 처리하는 기본크기가 4byte
		
		byte b3=(byte)(b1+b2); // 강제 형변환을 하면 저장 가능
	}
	
	//강제 형변환: 큰 바이트-> 작은 바이트
	public void forceCasting() {
		//명시적 형변환 이라고도 한다.
		//(바꿀 자료형)값
		
		//1.double(8 byte)->float(4 byte)
		float f1 = 4.0f; // 반드시 f를 붙여줘야 한다.
		
		double d2=8.0;
		float f2=(float)d2;
		System.out.printf("f1 = %.1f, f2 = %.2f\n",f1,f2);
		
		//2.double(8 byte)->int(4 byte)
		double d3= 10.89;
		int i3=(int)d3;
		System.out.println("i3 : "+i3); //0.89부분은 손실
		
		int iNum=10;
		double dNum=5.89;
		System.out.println(iNum+dNum);
		
		int result=(int)(iNum+dNum);
		System.out.println("result = "+result);
		
	}
	
}