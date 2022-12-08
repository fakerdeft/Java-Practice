package com.kh.chap02_abstract.run;

import com.kh.chap02_abstract.model.vo.Iphone;
import com.kh.chap02_abstract.model.vo.Phone;
import com.kh.chap02_abstract.model.vo.Pixel;

public class AbstractRun {

	public static void main(String[] args) {
		
		//추상 클래스는 미완성이라는 의미기 때문에 객체 생성을 할 수 없다.
		//Phone p = new Phone();
		
//		Galaxy g = new Galaxy();
		
		Pixel p = new Pixel();
		
		p.bixbi();
		p.call();
		p.camera();
		p.samsungPay();
		p.sms();
		
		//추상클래스인 부모클래스는 객체 생성은 안되지만.
//		Phone p2 = new Phone(); 
		//다형성을 적용시켜 자식객체 주소를 참조시킬순 있다.
		Phone p2 = new Pixel();
		
		p2.call();
		p2.camera();
		p2.sms();
		
//		부모타입의 기능이 아니기때문에 접근할 수 없음.
//		p2.bixbi();
//		p2.samsungPay();
//		접근하고자 한다면?? - 다운캐스팅
		((Pixel)p2).bixbi();
		((Pixel)p2).samsungPay();
		
		Phone[] pArr = new Phone[3];
		
		pArr[0]= new Pixel();
		pArr[1]= new Iphone();
	
	}
}
