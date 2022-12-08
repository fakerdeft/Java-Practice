package com.kh.chap04.constructor.run;

import com.kh.chap04.constructor.model.vo.User;

public class Run4 {

	public static void main(String[] args) {
		
		//기본생성자를 통해서 객체 생성
		User a = new User();
		
		a.setUserId("id1");
		a.setUserPw("pw1");
		a.setUserName("홍길동");
		a.setGender('남');
		a.setAge(50);

		System.out.println(a.infomation());
		
		//매개변수를 이용한 생성자로 생성
//		User u2=new User("뽀로로","bororo","bororo123");
		
//		System.out.println(u2.infomation());
		
		//해당하는 생성자 1,2로 2명 만들기
		User k1=new User("id1","pw1","홍길동",50,'남');
		System.out.println(k1.infomation());
		
		User k2=new User("id2","pw2","김길동",60,'여');
		System.out.println(k2.infomation());
		
		k2.setAge(21);
		
		System.out.println(k2.infomation());
	
	}
	

}




































