package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {
	private String brand;	//	- brand : String // 브랜드명
	private String code;//	- code : String // 상품코드
	private String name;//	- name : String // 상품명
	private int price;//	- price : int // 상품가격
	private int inch;
	
	public Tv() {
		super();
	}

	public Tv(String brand, String code, String name, int price, int inch) {
		super();
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.inch = inch;
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

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", code=" + code + ", name=" + name + ", price=" + price + ", inch=" + inch + "]";
	}
	
	
}
