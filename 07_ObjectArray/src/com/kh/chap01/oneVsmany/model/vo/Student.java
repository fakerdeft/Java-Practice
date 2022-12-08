package com.kh.chap01.oneVsmany.model.vo;

public class Student {
	
	//학생의 이름과 나이와 성별 필드
	//기본생성자+매개변수 다 있는 생성자
	//getter/setter 메소드
	//전체 정보 반환 메소드
	
	private String name;
	private int age;
	private String gender;
	
	public Student() {
		
	}
	public Student(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	public String info() {
		return "\n이름: "+name+"\n나이: "+age+"살\n성별: "+gender; 
	}
	
}
