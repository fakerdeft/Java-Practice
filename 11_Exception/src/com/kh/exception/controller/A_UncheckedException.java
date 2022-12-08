package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * RuntimeException
	 * 프로그램 실행 시 발생되는 예외들
	 * 
	 * RuntimeException의 자식 클래스들
	 * -ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
	 * -ArithmeticException : 나누기 연산시 0으로 나눌때 발생하는 예외
	 * -NullPointerException : 주소값 참조시 null을 참조하려고 했을 경우 발생하는 예외
	 * -ClassCastException : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * -NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 예외
	 * 
	 * 예외발생을 예측하여 조건문으로 처리도 가능하다.
	 * 
	 * */
	
	public void method1() {
		//사용자에게 두개의 정수값을 입력받아서 나눗셈 결과 출력
		Scanner sc =new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력 :");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 :");
		int num2 = sc.nextInt();
		//0으로 나누었을때 나는 예외 
		
		//0으로 나누려고하면 실행하지 않으면 된다 
//		if(num2!=0) {
//			System.out.println("나눗셈 결과 : "+(num1/num2));
//		}else {
//			System.out.println("0으로는 못나눠요 ");
//		}
//		System.out.println("프로그램 종료");
	
	//방법2. 예외처리 구문으로 해결
	//예외가 발생했을 경우 실행할 내용을 정의해두는것
	/*
	 * try~catch문
	 * [표현법]
	 * try{
	 * 		예외가 발생할만한 구문
	 * }catch(발생할 예외클래스명 변수명){
	 * 	   해당 예외가 발생했을때 실행할 구문
	 * }
	 * 
	 * */
	
		
		try {
			System.out.println("나눗셈 결과 : "+(num1/num2));
		}catch(ArithmeticException e) {
			e.printStackTrace();//오류를 띄워주는 메소드
			//개발단계나 테스트단계에서만 사용하고 배포했을땐 없애야함
			System.out.println("예외처리 완료 ㅋ");
			System.out.println("0으로 나누지 좀 마세요 ");
		}
	
		System.out.println("프로그램 종료");
	 
	}
	
	//다중 catch블록 
	public void method2() {
		//처리해야할 예외가 여러개일 경우 사용
		//주의사항으로는 범위가 작은것부터 써야한다.(자식부터)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수만 입력 (0제외) :");
		try {
		int num = sc.nextInt();
		System.out.println("정수만 입력 (0제외) :");
		int num2 = sc.nextInt();
		
		System.out.println("나눗셈 결과 : "+(num/num2));
		}catch(InputMismatchException e) { //정수가 아닌 다른타입을 입력했을때
			System.out.println("정수만 입력하라니까 ");
		}catch(ArithmeticException e) {//0으로 나누려고 했을때
			System.out.println("0으로는 나눌수가 없어요 왜그러세요");
		}
		
		System.out.println("프로그램 종료");
	}
	
	public void method3() {
		//배열 활용
		//배열의 크기를 음수로 지정했을때 나는 예외 - 배열의 크기는 음수가 될수 없습니다
		//배열의 잘못된 인덱스에 접근하려는 예외 - 배열의 크기를 벗어났습니다
		//잘못된 타입을 입력하려했을때 나는 예외  - 배열의 크기는 정수로 입력하셔야 합니다 
		
		//사용자한테 배열의 크기를 입력받아보고 더 큰 범위에 인덱스에 접근해서 예외를 발생시켜봅시다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 정하세요 양수인 정수만 입력하세요 ");
		int size=0;
		try {
		size = sc.nextInt();
		System.out.println("접근하고자 하는 인덱스를 입력하세요");
		int num=sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println(arr[num]);
		
		}
//		catch(RuntimeException e) { //다형성 적용
//			//위에 있는 exception들의 조상인 RuntimeException으로
//			//한번에 처리
//			System.out.println("하나로 잡기");
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기는 "+size+"입니다. 인덱스를 벗나셨어요.");
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기는 음수로 설정할 수 없습니다 양수를 입력해주세요.");
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력할 수 있습니다 다른 타입은 안돼요.");
		}catch(Exception e) {
			System.out.println("잡기");
		}
		
		/*
		 * 다형성을 이용하여 부모타입의 예외로 한번에 처리한다면
		 * 소스코드가 간결해지지만 부모타입으로 한번에 처리하는 방식만 가능하다.
		 * 예외에 따라서 처리할 수 없음 
		 * 자식타입 예외보다 부모타입 예외가 위에 있다면 자식타입에 접근할 수 없게 되기 때문에
		 * 컴파일 에러가 난다. 순서를 지켜줘야함.
		 * 
		 * */
		System.out.println("프로그램 종료");
	}
}
