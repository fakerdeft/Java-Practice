package com.kh.chap01.oneVsmany.run;

import com.kh.chap01.oneVsmany.model.vo.Book;
import java.util.*;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		//객체 배열 선언 및 할당
		//[표현법]
		//클래스명[] 객체배열명= new 클래스명[크기];
		Book[] arr = new Book[3];//b1,b2,b3==arr[0],arr[1],arr[2]
		//arr[0]=new Book(); == b1==new Book();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("책 제목: ");
			String title=sc.nextLine();
			System.out.println("출판사: ");
			String pub = sc.nextLine();
			System.out.println("저자: ");
			String author=sc.nextLine();
			System.out.println("가격: ");
			int price=sc.nextInt();
			System.out.println("할인율: ");
			double dis=sc.nextDouble();
			sc.nextLine();
			
			arr[i]=new Book(title,pub,author,
					price,dis);
		}
		
		//출력
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].infomation());
		}
		
		//가격조회
		System.out.println("검색할 책 제목: ");
		String sT=sc.nextLine();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getTitle().equals(sT)) {
				System.out.println(arr[i].getPrice());
			}
		}
		
	}

}




















