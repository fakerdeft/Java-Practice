package com.kh.chap01.oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
//		Book b1= new Book();
//		
//		System.out.println(b1.infomation());
//		
//		Book b2= new Book("자바의 정석","자바출판사",
//				"남궁성");
//		
//		System.out.println(b2.infomation());
//		
//		Book b3= new Book("나미아 잡화점의 기적",
//				"잡화점출판사","히가시노 게이고",23000,5.5);
//
//		System.out.println(b3.infomation());
		
		//도서 정보를 입력받아서 도서들의 정보를 출력해주는
		//프로그램 만들기
		//책3권 정보 입력받겠다고 가정
		//각각 객체는 따로 관리할 수 있게 생성
		//사용자로부터 스캐너를 통해 정보 입력받기
		//값을 넣어서 객체를 생성
		//3개의 객체 생성, 마지막에 3권 다 출력
		
		//검색할 책 제목 입력 받고 해당하는 책의 가격 알려주는
		//작업까지
		Book b4=new Book();
		Book b5=new Book();
		Book b6=new Book();
	
		b4.setTitle(sc.nextLine());
		b4.setPublisher(sc.nextLine());
		b4.setAuthor(sc.nextLine());
		b4.setPrice(sc.nextInt());
		sc.nextLine();
		b4.setDiscountRate(sc.nextDouble());
		sc.nextLine();
		
		b5.setTitle(sc.nextLine());
		b5.setPublisher(sc.nextLine());
		b5.setAuthor(sc.nextLine());
		b5.setPrice(sc.nextInt());
		sc.nextLine();
		b5.setDiscountRate(sc.nextDouble());
		sc.nextLine();
		
		b6.setTitle(sc.nextLine());
		b6.setPublisher(sc.nextLine());
		b6.setAuthor(sc.nextLine());
		b6.setPrice(sc.nextInt());
		sc.nextLine();
		b6.setDiscountRate(sc.nextDouble());
		sc.nextLine();
		
		System.out.println(b4.infomation());
		System.out.println(b5.infomation());
		System.out.println(b6.infomation());
		
		
		String[] s1= {b4.getTitle(),b5.getTitle(),
				b6.getTitle()};
		
		int[] s2= {b4.getPrice(),b5.getPrice(),
				b6.getPrice()};
		
		System.out.println("\n원하는 책 제목 검색:");
		String s3=sc.nextLine();
		for(int i=0;i<s1.length;i++) {
			if(s3.equals(s1[i])) {
				System.out.println(s1[i]+
				" 가격은 "+s2[i]+"원 입니다.");
				break;
			}
			
		}//for(int i=0;i<s1.length;i++)

		
	}//main메소드
	
}//class























