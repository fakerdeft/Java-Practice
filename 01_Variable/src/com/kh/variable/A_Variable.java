package com.kh.variable;

public class A_Variable {

	// 변수의 필요성
	// 시급*근무시간*근무일수 메소드
	public void calPay() {
		
		System.out.println("-----변수 사용 전-----");
		System.out.println("시급: 9160원");
		System.out.println("근무시간: 6시간");
		System.out.println("근무일수: 5일");
		
		// 월급: 시급*근무시간*근무일수
		// 김철수: 00000원
		// 문자열은 "" 쌍따옴표로 묶어서 처리한다.
		// 자바에서 +는 값과 값을 붙이는 역할을 한다.(덧셈과 붙이는 역할)
		// *는 자바에서 곱셈을 의미하는 기호
		// 문자열에 +연산을 하면 문자열로 합쳐진다.
		// 따라서 문자열 사이에 숫자 계신삭을 넣고자 한다면 ()를 통해 우선순위를 정해줄 것
		
		System.out.println("김철수: " + (9160*6*5) + "원");
		System.out.println("홍길동: " + (9160*6*5) + "원");
		System.out.println("김구름: " + (9160*6*5) + "원\n");
		
		System.out.println("-----변수 사용 후-----");
		
		// 각각 시급과 근무시간과 근무일수라는 변수를 만들고 값을 대입한다.
		int pay = 9500; // 시급
		int time = 8; // 근무시간
		int day = 5; // 근무일수
		// 자바에서  =표시는 대입을 의미한다.
		
		System.out.println("시급: "+pay+"원");
		System.out.println("근무시간: "+time+"시간");
		System.out.println("근무일수: "+day+"일");
		System.out.println("김철수: " + pay*time*day + "원");
		System.out.println("홍길동: " + pay*time*day + "원");
		System.out.println("김구름: " + pay*time*day + "원");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여하기 위해 사용 - 가독성 높여준다.
		 * 2. 단 한 번 값을 기록하고 필요할 때마다 계속 사용할 수 있다. - 재사용성을 높여준다.
		 * 3. 가독성+재사용성=유지보수 용이
		 */
	}
	
	// 변수의 선언
	public void declarevariable() {
		/*
		 * 변수의 선언
		 * ->값을 기록하기 위한 변수를 메모리 공간에 확보하겠다. 값을 담을 상자를 만들겠다.
		 * [표현법] 자료형 번수 이름;
		 *  
		 * 변수를 선언할 때 주의사항
		 * 1. 변수 이름은 항상 소문자로 시작(낙타봉표기법 지키기-단어와 단어 사이 첫 글자 대문자)
		 * 2. 같은 영역 (){} 안에서는 동일한 변수명 사용 불가
		 * 3. 해당 영역에 선언된 변수는 그 해당 영역에서만 사용 가능
		 * ->다른 메소드에서는 사용 불가(지역변수 개념)
		 */
//		3번예시
//		System.out.println("시급: " + pay);
		
//		1. 논리형 자료형(논리값: true/false)
		boolean isTrue; // 선언
		boolean isFalse;
		
		isTrue=true; // 1 byte
//		isFalse = false; 
		isFalse = 3+1>9; // 3+1이 9보다 큰가요? 거짓(False)
		
		System.out.println("isTrue: "+isTrue);
		System.out.println("isTrue: "+isFalse);
		
//		2. 숫자형 자료형
//		2-1. 정수형: 사이즈에 따라 저장할 수 있는 값의 범위가 다르다.
		byte bNum; // 1 byte
		short sNum; // 2 byte
		int iNum; // 4 byte - 정수 자료형 중에 기본형(default)
		long lNum; // 8 byte
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8l; // long자료형은 숫자 뒤에 l 또는 L을 붙여서 long자료형임을 알게 한다.
		
//		2-2. 실수형: 사이즈에 따라서 저장할 수 있는 소수점의 개수가 다르다.
		float fNum; // 4 byte - 소수점을 7개까지 표현
		double dNum; // 8 byte - 소수점을 15개까지 표현 (기본형)
		
		fNum = 4.0f; // 반드시 f를 숫자 뒤에 붙여준다.
		dNum = 8.12123456;
		
//		3. 문자형 자료형
		char ch; // 2 byte 
		
		ch = 'a'; // 문자 하나는 반드시 '' 홑따옴표 안에 넣어야 한다.
		
//		4. 문자열형: 참조자료형 - 주솟값을 담고 있음.
		String str;
		
		str = "abc"; // 문자열은 반드시 "" 쌍따옴표 안에 넣어야 한다.
		
//		출력문의 종류
//		print() - 줄바꿈 x
//		println() - 줄바꿈 o
//		printf() - 출력할 형태를 지정하여 출력할 수 있는 기능(메소드), 줄바꿈 x
//		System.out.printf(format(문자열), args(변수))
		
		//printf를 사용해서 형식을 지정하여 출력해보기
		System.out.printf("isTrue의 값은 %b \n",isTrue);
		System.out.printf("isFalse의 값은 %b \n", isFalse);
		System.out.printf("bNum의 값은 %d \n", bNum);
		System.out.printf("sNum의 값은 %d \n", sNum);
		System.out.printf("iNum의 값은 %d \n", iNum);
		System.out.printf("lNum의 값은 %d \n", lNum);
		System.out.printf("fNum의 값은 %.2f\ndNum의 값은 %.8f\n", fNum,dNum);
		
//		%b = 논리 자료형을 위한 포맷
//		%d = 정수 자료형을 위한 포맷
//		%f = 실수 자료형을 위한 포맷
//		%.1f = 실수 자료형의 소수점을 1번째까지만 출력하는 포맷
		
		System.out.printf("ch의 값은 %c\n", ch);
		System.out.printf("str의 값은 %s\n", str);
		
		System.out.printf("ch대문자 %C\n", ch);
		System.out.printf("str대문자 %S\n", str);
		
	}
	
	//상수: 변하지 않는 수
	//[표현법] final 자료형 상수이름;
	public void constant() {
		//변수 이용 시
		int age = 20;
		System.out.println("나이는 "+age);
		
		age=21;
		System.out.println("나이는 "+age);
		
		age=22;
		System.out.println("나이는 "+age);
		
		//상수 이용 시 - 항상 대문자로
		final int AGE = 20;
		System.out.println("상수 AGE는 "+AGE);
		
//		AGE=21; 한 번 기록된 값을 변경할 수 없기 때문에 고정된 값을 사용하고자 할 때 선언한다.
		System.out.println(Math.PI);
		
	}
	
	

}