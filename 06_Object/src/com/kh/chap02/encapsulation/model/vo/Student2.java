package com.kh.chap02.encapsulation.model.vo;

public class Student2 {
	
	//클래스의 구성
	
	//필드부 - 필드 == 전역 변수 == 멤버 변수 == 인스턴스 변수
	private String name;
	private int age;
	private char gender;
	
	//생성자부-작성하지 않으면 jvm이 기본생성자 넣어줌
	
	/*
	 * 메소드부
	 * 
	 * 접근제한자 반환형 메소드이름(매개변수){
	 * 		수행하고자 하는 코드;
	 * }
	 * 
	 * -접근제한자: 메소드를 호출할 수 있는 범위를 지정한다.
	 * -반환형: 메소드의 결과값의 자료형을 지정한다. 
	 * -void로 적으면 돌려줄 값이 없다, 반환할 값이 없다.
	 * -매개변수: 메소드 호출시 입력값으로 넣어주는 변수,
	 * 			해당 메소드 실행중에만 사용 가능한 변수(지역변수),
	 * 			생략가능
	 * 
	 * 메소드부-setter/getter 규칙
	 * -setter
	 * 1.setter 메소드는 접근 가능하도록 해야되기 때문에
	 * 		접근제한자를 public으로 작성한다.
	 * 2.set필드명으로 이름을 짓되 낙타봉 표기법을 지켜야한다.
	 * 	ex)setName, setAge,setGender ...
	 * 3.모든 필드에 대해서 다 작성해줘야 한다.
	 * 
	 * 
	 */
	
	//이름필드에 값을 대입할 수 있는 메소드
	//name필드에 전달받은 name값을 대입하기
//	접근제한자 반환형 메소드명(매개변수) {
//		
//	}
	public void setName(String name) {//매개변수 - 전달받을 값을 담아놓을 변수상자 준비
										//-이름은 보통 대입할 필드명과 일치 
		//생성된 객체 자신을 가리키는 키워드 this
		//필드명 앞에 항상 this를 붙여서 사용한다.
		//this안 붙이면 매개변수=매개변수;로 인식
		//특정 영역안에서는 영역변수(지역변수)가 우선권을
		//가지기 때문에 매개변수로 인식해버린다.
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	//데이터 조회하는 메소드 getter
	/*
	 * 규칙은 setter와 동일
	 * 1.getter메소드는 public 접근제한자 사용
	 * 2.get필드명으로 짓되 낙타봉 표기법을 지켜야한다.
	 * 3.모든 필드에 대해 다 작성해줘야 한다.
	 * 
	 */
	
	//이름을 조회할 수 있는 메소드
	//반환타입은 필드 타입과 일치
	public String getName() {
		
		//메소드를 호출한 곳으로 돌아가는데 name필드에 담긴
		//값을 들고 돌아간다.
		return name; //결과값==메소드 부분에 반환형과 타입이 일치해야 한다.
	
	}

	//나이
	public int getAge() {
		return age;
	}
	
	//성별
	public char getGender() {
		return gender;
	}
	
	//정보 출력 기능&정보 반환 기능
	public void info() {
		System.out.printf("\n이름: %s\n나이: %d\n성별: %c\n",
				name,age,gender);
	}
	
	public String infomation() {
		return name+"님의 나이는\n"+age+"살이고\n성별은"
				+gender+"자 입니다.";
	}//return은 한번에 하나만 가져간다.
	
}



































