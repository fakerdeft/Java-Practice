package com.kh.chap04.constructor.run;

import com.kh.chap04.constructor.model.vo.Book;

public class Run4Ex1 {
	
	public static void main(String[] args) {
	
	Book a = new Book("안녕","몰라","홍길동");
	System.out.println(a.info());
	
	Book b = new Book("안녕2","몰라","홍길동",20000,0.5);	
	System.out.println(b.info2());

	}
}
