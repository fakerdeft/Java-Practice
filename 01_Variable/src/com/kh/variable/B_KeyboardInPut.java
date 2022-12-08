package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInPut {
	//사용자가 키보드로 입력한 값을 변수에 기록하는 방법
	
	public void InputTest() {
		/*
		 * 키보드로 사용자로부터 값을 입력받으려면?
		 * 자바에서 이미 제공하고 있는 java.util.Scanner 클래스를 사용하면 된다.
		 * Scanner 클래스에 있는 메소드(기능)을 사용한다.
		 */
		Scanner sc = new Scanner(System.in);
		//System.in -> 입력 받은 값들을 바이트 단위로 받겠다
		
		//사용자의 인적사항을 입력 받아 출력해보자
		//이름,나이,키,주소
		//입력받고자 하는 인적사항을 질문으로 유도
		System.out.println("당신의 이름은 무엇입니까? ");
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드
		//next(), nextLine()
		String name;
		
		name = sc.nextLine(); //사용자가 엔터를 입력할 때까지 대기
//		name = sc.next(); // 공백 이전까지
		System.out.println(name+"님 안녕하세요.");
			
		
		System.out.println("당신의 나이는 몇살입니까?");
		int age; 
		age = sc.nextInt(); //정수형을 입력 받는 메소드
		System.out.println("당신의 나이는 "+age+"살 이군요.");
				
		
		System.out.println("당신의 키는 몇입니까?");
		double height; 
		height = sc.nextDouble(); //실수형을 입력 받는 메소드
		sc.nextLine();
		System.out.println("당신의 키는 "+height+"cm 이군요.");
		
		
		System.out.println("당신이 사는 곳은 어디인가요?");
		String address = sc.nextLine(); //문자열 자료형을 엔터전까지 입력 받는 메소드
		//nextLine: 입력한 값+ 엔터를 누른 값까지 포함
		//나머지 메소드들은 엔터를 누른 값을 담지 않고 엔터가 버퍼에 남게 된다.
		//버퍼공간에 남아 있는 엔터를 nextLine()이 만나면 바로 입력 받아버리기 때문에
		//nextLine위에 다른 메소드를 혼용할 때 주의해서 nextLine으로
		//버퍼에 남아 있는 엔터를 없애주는 작업을 해야 한다.
		System.out.println("당신은 "+address+"에 사는 군요");
	}
	
	
	public void InputTest2() {
		//이름,나이,성별(M/F),주소
		Scanner sc = new Scanner(System.in);
		System.out.println("이름,나이,성별,주소를 \n순서대로 입력해주세요:");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
//		String gender = sc.nextLine();
		char gender = sc.nextLine().charAt(0); //지정한 순서의 문자 하나만 추출해내는 메소드
		String address = sc.nextLine();
		
		System.out.println("이름: "+name+"\n나이: "+age+"\n"
				+"성별: "+gender+"\n"+"주소: "+address);
		System.out.println("--------------------------------------");
		System.out.printf("이름: %s\n나이: %d\n성별: %C\n주소: %s",
				name,age,gender,address);
		
	}

}
