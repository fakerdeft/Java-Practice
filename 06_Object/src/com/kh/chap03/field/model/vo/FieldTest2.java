package com.kh.chap03.field.model.vo;

public class FieldTest2 {
	//필드에서 사용하는 접근제한자 4가지
	/*
	 * (+)public: 어디서든(같은 패키지, 다른 패키지 모두) 접근 가능
	 * (#)protected: 상속관계와 같은 패키지내에서 접근 가능
	 * 			   :같은 패키지 내에서는 그냥 접근 가능
	 * 			   :만약 다른 패키지에 있다면 상속관계만 접근 가능
	 * (~)default: 같은 패키지 내에서는 접근 가능 생략도 가능
	 * (-)private: 해당 클래스 내에서만 접근 가능
	 * 
	 * 위에서 아래로 오면서 접근범위가 좁아진다.
	 */
	public String pub = "public";
	protected String pro="protected";
	String def= "default";
	private String pri="private";
	

}
























