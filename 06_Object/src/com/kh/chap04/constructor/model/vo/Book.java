package com.kh.chap04.constructor.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		System.out.println("기본생성자 입니다.");
	}
	
	public Book(String title,String publisher,String author) {
		
		this(title,publisher,author,20000,0.5);
	}

	public Book(String title,String publisher,String author
			,int price,double discountRate) {
		
		this.title=title;
		this.publisher=publisher;
		this.author=author;
		this.price=price;
		this.discountRate=discountRate;
	}
	public String info() {
		return "\n책 제목: "+title+"\n출판사: "+publisher+"\n저자: "
				+author;
	}
	
	public String info2() {
		return "\n책 제목: "+title+"\n출판사: "+publisher+"\n저자: "
				+author+"\n가격: "+price+"\n할인율: "+discountRate;
	}
	
	
}
