package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	//상속 
	//매 클래스마다 중복된 필드,메소드들을 한 클래스에 정의해두고 
	//해당클래스를 상속하여 내용을 가져다 쓰는 개념
	
	//공통적인 필드
	protected String brand;	//	- brand : String // 브랜드명
	private String code;//	- code : String // 상품코드
	private String name;//	- name : String // 상품명
	private int price;//
	
	public Product() {
		super();
	}

	public Product(String brand, String code, String name, int price) {
		super();
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}

	
	
	
	
}
