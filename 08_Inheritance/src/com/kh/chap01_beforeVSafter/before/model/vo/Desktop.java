package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop{
	
		private String brand;	//	- brand : String // 브랜드명
		private String code;//	- code : String // 상품코드
		private String name;//	- name : String // 상품명
		private int price;//	- price : int // 상품가격
		private boolean allInOne;//	- allInOne : boolean // 일체여부
		
		public Desktop() {
			//아무것도 상속받지 않았음에도 super();가 나오는 이유
			//-모든 클래스는 최상위 클래스인 Object 클래스를 상속받고 있는 구조로 이루어져있기 때문
			super();
		}

		public Desktop(String brand, String code, String name, int price, boolean allInOne) {
			super();
			this.brand = brand;
			this.code = code;
			this.name = name;
			this.price = price;
			this.allInOne = allInOne;
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

		public boolean isAllInOne() {
			return allInOne;
		}

		public void setAllInOne(boolean allInOne) {
			this.allInOne = allInOne;
		}

		//alt + shift + s
		
		
		
		
		
		
			
			
}
