package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		
		Car c = new Car("씽씽이",550.5,"세단",4);
		Ship s = new Ship("파도",1111.55,"모터보트",2);
		Airplane a = new Airplane("보잉247",2221.45,"여객기",4,5);
		
		//toString()메소드는 원래 Object 클래스의 메소드이다.
		//기본적으로 모든 클래스는 Object를 상속받고있기 때문에 toString 메소드를
		//사용할 수 있었던것!! 
		//toString():해당 객체의 풀 경로(클래스명) +@ + 해당객체의 주소값 16진수 형태로 반환
		//우리가 객체를 사용할때 해당 정보를 원하는건 주소값이 아니고 객체 내부 필드값을 알고 싶으니
		//override 하여 재정의를 통해 객체필드값을 문자열로 돌려주게끔 작성하는것.
		
		System.out.println(c.toString());
		System.out.println(s.toString());
		System.out.println(a.toString());
		

	}

}
