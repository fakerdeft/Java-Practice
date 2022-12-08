package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Ex1;

public class RunEx {
	
	public static void main(String[] args) {
		
		//가수 또는 배우 클래스를 생성하여
		//속성 5가지를 작성하고
		//getter/setter 메소드를 만드시고
		//정보를 한번에 출력 또는 반환하는 메소드를 작성
		//가수 또는 배우 3명을 생성하고 출력
		
		Ex1 a =new Ex1();
		Ex1 b=new Ex1();
		Ex1 c=new Ex1();
		
		a.setName("홍길동");
		a.setAge(50);
		a.setGender('남');
		a.setHeight(300);
		a.setWeight(200);
		
		b.setName("김길동");
		b.setAge(60);
		b.setGender('여');
		b.setHeight(250);
		b.setWeight(190);
		
		c.setName("이길동");
		c.setAge(70);
		c.setGender('남');
		c.setHeight(350);
		c.setWeight(180);
		
		a.infomation();
		b.infomation();
		c.infomation();
		
		System.out.println(b.info());
	}

}










