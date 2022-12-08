package com.kh.chap03_map.part01_hashMap.model.vo;
public class Snack {
	
	private String taste;
	private int price;
	public Snack() {
		super();
	}
	public Snack(String taste,int price) {
		super();
		this.price = price;
		this.taste = taste;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Snack [taste=" + taste + ", price=" + price + "]";
	}
	
	
	
}