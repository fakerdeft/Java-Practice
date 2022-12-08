package com.kh.chap01.oneVsmany.model.vo;

public class Book {

	//도서명, 출판사, 저자명, 가격, 할인율
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book(){}
	//매개변수 생성자는 도서명, 출판사, 저자명 초기화 생성자
	public Book(String title,String publisher,String author) {
		this.title=title;
		this.publisher=publisher;
		this.author=author;
	}
	
	//전부 다 초기화 생성자
	public Book(String title, String publisher, String author,
				int price,double discountRate) {
		this(title,publisher,author);
		this.price=price;
		this.discountRate=discountRate;
	}
	
	//setter,getter
	public void setTitle(String title) {
		this.title=title;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate=discountRate;
	}

	
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	public String infomation() {
		return "\n책 제목: "+title+"\n출판사: "+publisher+"\n저자: "
				+author+"\n가격: "+price+"\n할인율: "+discountRate;
	}
	
	
}





















