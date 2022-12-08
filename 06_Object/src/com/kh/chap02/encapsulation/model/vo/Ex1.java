package com.kh.chap02.encapsulation.model.vo;

public class Ex1 {
	
	private String name; //이름
	private int age; //나이
	private char gender; //성별
	private int height; //키
	private int	weight; //몸무게
	
	
	public void setName(String name){
		
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void infomation() {
		System.out.printf("이름: %s\n나이: %d\n성별: %c\n키: %d\n몸무게: %d\n\n",
				name,age,gender,height,weight);
	}
	
	public String info() {
		return "이름: "+name+"\n나이: "+age+"\n성별: "
				+gender+"\n키: "+height+"\n몸무게: "+weight;
	}
	
	
	
	
	
	

}
