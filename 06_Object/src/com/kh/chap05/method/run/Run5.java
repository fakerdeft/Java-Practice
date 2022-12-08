package com.kh.chap05.method.run;

import com.kh.chap05.method.controller.MethodTest2;
import com.kh.chap05.method.controller.OverloadingTest;

public class Run5 {

	public static void main(String[] args) {
//		MethodTest1 mt1 =new MethodTest1();
//		
//		mt1.method1();
//		
//		mt1.method2();
//		int a= mt1.method2();
//		System.out.println(a);//담아놓고 출력
//		System.out.println(mt1.method2());//바로출력
//		
//		mt1.method3(3, 3);
//
//		System.out.println(mt1.method4(3, 5));
		
//		MethodTest2 mt2 = new MethodTest2();
//		static 키워드를 붙였기 때문에 객체 생성 없이 메소드 사용 ㄱㄴ
		//반환값,매개변수 둘 다 없는 메소드
		MethodTest2.method1();
		
		MethodTest2.method2("반환값 x 매개변수 o 메소드");
		
		System.out.println(MethodTest2.method3());
		
		System.out.println(
				MethodTest2.method4("반환값 o 매개변수 o 메소드"));
		
		OverloadingTest ot =new OverloadingTest();
		ot.test();
		int sum= ot.test(5,5,10);
		System.out.println(sum);
		
		ot.test("이거 반복",5);
		ot.test(100,200);
		
	}
}
