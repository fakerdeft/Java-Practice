package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{
//	private String brand;	//	- brand : String // 브랜드명
//	private String code;//	- code : String // 상품코드
//	private String name;//	- name : String // 상품명
//	private int price;//	- price : int // 상품가격
	
	//부모로부터 상속받을 부분은 기술하지 않음
	private boolean allInOne;//	- allInOne : boolean // 일체여부

	public Desktop() {
		super();
	}
	//매개변수 생성자로 부모클래스에 있는 필드까지 초기화해서 사용하고 싶다면 
	
	public Desktop(String brand,String code,String name,int price,boolean allInOne) {
		/*
		 * 부모클래스에 있는 필드를 초기화 하는 방법 3가지
		 * 1.부모클래스의 필드 접근제한자를 protected로 변경후 super.필드로 접근 및 초기화
		 * 2.부모클래스의 setter메소드를 이용하는 방법
		 * 3.부모클래스의 매개변수 생성자를 이용하는 방법 - 주로 이 방법으로 초기화 한다.
		 * */
//		방법1-부모클래스의 필드 접근제한자를 protected로 변경후 직접접근
//		super.brand = brand; 
//		방법2-부모클래스의 setter메소드로 필드 초기화 
//		super.setBrand(brand);
//		super.setCode(code);
//		super.setName(name);
//		super.setPrice(price);
		
//		방법3-부모클래스의 매개변수 생성자로 초기화하는 방법
		super(brand,code,name,price);
		this.allInOne=allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		return "Desktop "+super.toString()+", allInOne=" + allInOne + "]";
	}
	
	
	
	
	
	
	
}
