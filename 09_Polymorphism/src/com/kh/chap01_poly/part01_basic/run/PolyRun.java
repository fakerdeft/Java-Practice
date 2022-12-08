package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		/*
		 * 다형성
		 * 상속을 이용한 기술로 부모클래스로부터 상속받은 자식 클래스 타입의 객체를
		 * 부모 클래스 타입으로 형변환하여 한번에 다룰 수 있는 기술
		 * -부모클래스 타입의 객체배열을 생성하여 자식객체들을 한번에 다룰수도 있음.
		 * -부모타입 클래스 매개변수로 자식객체 마다 다른 작업을 할수도 있음.
		 * */
		
		//1.부모 타입 참조변수로 부모 객체를 다루는 경우
		System.out.println("1.부모타입 참조변수로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		p1.print();
//		p1.printChild1(); -자식기능은 사용할수없음
//		p1으로는 Parent타입에 있는 기능들만 접근 가능
		
		//2.자식 타입 참조변수로 자식 객체를 다루는 경우
		System.out.println("2.자식 타입 참조변수로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.print(); // 부모의 메소드를 재정의(Override)했기때문에 변경됨
		c1.printParent(); //자식은 부모의 기능도 사용할 수 있다.(상속받았기 때문)
		
		//3.부모 타입 참조변수로 자식 객체를 다루는 경우
		System.out.println("3.부모 타입 참조변수로 자식 객체를 다루는 경우");
		Parent p2 =/*(Parent)*/new Child1();//업캐스팅 (자동형변환)
		p2.print();
		p2.printParent();
//		p2.printChild1();
		
		//다운캐스팅
		((Child1)p2).printChild1();
		
		/*
		 * 클래스간의 형변환
		 * -상속구조일 경우에만 클래스간의 형변환이 가능하다.
		 * 1.UpCasting : 자동형변환 : 자식타입->부모타입 (생략가능)
		 * 2.DownCasting : 강제형변환 : 부모타입->자식타입 (생략불가능)
		 * 
		 * */
		
		//부모타입의 객체배열을 생성하여 자식 객체들을 다뤄보자.
		
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1,2,3);
		arr[1] = new Child1(4,5,6);
		arr[2] = new Child2(7,8,9);
		arr[3] = new Child2(10,11,12);
		
		System.out.println("--------객체배열 반복----------");
		for(int i=0; i<arr.length;i++) {
			arr[i].printParent();
		}
		
		System.out.println("-------오버라이딩된 print() 출력-----");
		
		for(int i=0; i<arr.length;i++) {
			arr[i].print();
		}
		p2.print();
		/*
		 * 동적바인딩
		 * -컴파일시점 : 정적바인딩으로 현재 주소값의 자료형의 클래스에 있는 메소드를 호출
		 * -런타임(실행)시점 : 동적바인딩으로 각각 자식클래스에 오버라이딩된 메소드가 있을 경우
		 *   		               해당 메소드가 실행된다
		 * */
		
		//instanceof 연산자 
		//A instanceof B - a가 b를 참조하고 있는지 확인하는 연산자
		//a가 b타입의 형태로 이루어져 있냐? 	
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] instanceof Child1) { //arr[i]번째에 담긴 객체가 Child1 타입이면 true
				System.out.println(i+"번째 인덱스에는 첫번째 자식이 있다.");
			}else if(arr[i] instanceof Child2) {
				System.out.println(i+"번째 인덱스에는 두번째 자식이 있다.");
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
