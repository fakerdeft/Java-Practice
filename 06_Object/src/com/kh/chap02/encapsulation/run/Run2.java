package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student2;


public class Run2 {

	public static void main(String[] args) {
		
		/*
		 * 캡슐화 과정을 통해 완벽한 클래스의 형태를 갖추게 하자.
		 * 
		 * 캡슐화를 하지 않으면: 외부로부터 직접 접근이 가능하기 때문에 값이 변질되거나 
		 * 				  조회를 막지 못하는 일이 발생한다.
		 * -캡슐화 작업: 정보은닉 기술 중 하나로 데이터의 접근 제한을 원칙으로 하여
		 * 			외부로부터 직접 접근을 막는다.
		 * 			단, 간접적으로 접근할 수 있도록(대입, 조회)메소드를 작성해준다.
		 * -캡슐화 작업의 2단계: 1단계 - 필드 속성 숨기기(private) 
		 * 				   2단계 - 간접 접근을 할 수 있는 메소드 생성(getter/setter)
		 * 
		 * private- 접근제한자 중 해당 클래스 내에서만 접근이 가능하도록 하는 키워드
		 * getter- 필드에 값을 조회할 수 있는 메소드
		 * setter- 필드에 값을 대입할 수 있는 메소드
		 * -getter/setter 작성시 주의사항
		 * -모든 필드에 대해 작성해야 하며 이름은 낙타봉 표기법을 지켜야 한다. 
		 * 
		 */
		Student2 kim=new Student2();
		Student2 park=new Student2();
		Student2 choi=new Student2();
		
		
		//접근제한자 걸어놔서 안된다
//		kim.name="홍길동";//직접접근
		
		//간접접근으로 값 대입
//		kim.setName(객체에 넣고 싶은 이름);
		kim.setName("김철수");
		kim.setAge(50);
		kim.setGender('남');
		
//		System.out.println("이름: "+kim.getName());
//		System.out.println("나이: "+kim.getAge());
//		System.out.println("성별: "+kim.getGender()+"\n");
//		
//		System.out.printf("이름: %s\n나이: %d\n성별: %c\n",
//							kim.getName(),kim.getAge(),kim.getGender());
//	
//	
		park.setName("박보영");
		park.setAge(50);
		park.setGender('여');
//		
//		System.out.printf("\n이름: %s\n나이: %d\n성별: %c\n",
//				park.getName(),park.getAge(),park.getGender());
//		
//		
		choi.setName("홍길동");
		choi.setAge(50);
		choi.setGender('남');
//		
//		System.out.printf("\n이름: %s\n나이: %d\n성별: %c\n",
//				choi.getName(),choi.getAge(),choi.getGender());
//		
		kim.info();
		park.info();
		choi.info();
		
		System.out.println(kim.infomation());
		
	}

}

















































