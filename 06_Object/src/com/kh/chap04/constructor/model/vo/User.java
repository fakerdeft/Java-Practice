package com.kh.chap04.constructor.model.vo;

public class User {
	//필드부
	//회원 아이디, 비번, 이름, 나이, 성별
	private String userId;
	private String userPw;
	private String userName;
	private int age;
	private char gender;
	
	//생성자부
	/*
	 * 생성자: 클래스 이름과 동일하게 작성하고 리턴 자료형(반환형)이 없는 메소드
	 * 		객체가 생성될 때 호출되는 메소드 ex) new xxx();
	 * [표현법]
	 * public 클래스명(매개변수(생략가능)){
	 * 		해당 생성자를 통해 객체 생성시 실행하고자 하는 코드
	 * }
	 * #메소드 형식과 차이점#
	 * 접근제한자 반환형 메소드명(매개변수(생략가능)){
	 * 		코드
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성하기 위한 목적
	 * 2. 객체를 생성뿐만 아니라 매개변수로 전달된 값들로 필드값을 초기화 하기 위한 목적.
	 * 
	 * 생성자의 종류
	 * 1.매개변수가 없는 생성자 -> 기본생성자
	 * 2.매개변수가 있는 생성자 -> 두 개 차이: 필드에 값을 초기화 할 수 있냐 없냐의 차이
	 * 
	 * 생성자 작성시 주의사항
	 * 1.반드시 이름은 클래스이름을 사용
	 * 2.반환형이 존재x (메소드와의 차이점)
	 * 3.생성자가 여러개 생성이 가능하지만 매개변수가 중복되면 안됨 -> "오버로딩" 개념
	 * 4.매개변수 생성자를 명시적으로 작성하게 되면 JVM이 기본생성자를 생성x(별도로 기본생성자 작성해야함)
	 * 5.매개변수 생성자를 사용한다고 해도 기본적으로 기본생성자를 작성하자
	 */
	public User() {
		//기본생성자 (매개변수가 없는 생성자)
		/*
		 * 단지 객체를 생성할 목적으로 사용->메모리 공간이 할당될때
		 * 기본생성자를 생략하여도 오류가 나지 않음(jvm이 생성해주기 때문)
		 * 단, 매개변수 생성자가 하나라도 존재할 경우 기본생성자를 작성하지
		 * 않은 채로 객체를 생성하려고 하면 오류남
		 */
		System.out.println("기본생성자입니다.");
		
		
	}
	
	
	//매개변수가 있는 생성자 - 아이디, 비밀번호, 이름을 대입하면서 생성하고자 하는 생성자

	//2.필드 전부를 다 넣으면서 생성할 수 있는 생성자
	public User(String userId,String userPw, String userName,
			int age,char gender) {
		this.userId=userId;
		this.userPw=userPw;
		this.userName=userName;
		this.age=age;
		this.gender=gender;
	}
	
	
	

	//메소드부
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;		
	}
	public String infomation() {
		return "\n"+userName+" 회원의 아이디는 "+userId+"\n비밀번호는 "+userPw
				+"\n나이는 "+age+"살\n성별은 "+gender+"자 입니다.";
	}
}
































