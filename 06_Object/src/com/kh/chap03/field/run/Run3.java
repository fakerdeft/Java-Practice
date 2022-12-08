package com.kh.chap03.field.run;

import com.kh.chap03.field.model.vo.FieldTest1;
import com.kh.chap03.field.model.vo.FieldTest2;
import com.kh.chap03.field.model.vo.FieldTest3;

public class Run3 {
	public static void main(String[] args) {
		
		//FieldTest1
		FieldTest1 f1 =new FieldTest1();
		
		
		f1.test(50);;//test메소드 호출 시 num,local 지역변수가
						//메모리 영역에 할당
		//test메소드가 종료된 시점에 num과 local변수도 소멸
		
		f1=null; //더이상 아무것도 참조x
		//이때 f1이 가지고 있던 주소값에 대한 객체가 더이상 아무곳에서도 참조x
		//가비지 컬렉터가 소멸시킨다(메모리 관리)
		
		//FieldTest2
		FieldTest2 f2 =new FieldTest2();
	
		//다른 패키지일때는 public만 접근 가능
//		System.out.println(f2.pub);
//		System.out.println(f2.pro);
//		System.out.println(f2.def);
//		System.out.println(f2.pri);
		
		
		//FieldTest3 - 클래스변수(static)

		//객체 생성 코드 new FieldTest3();은 생략가능
		//어떠한 클래스에 있는 변수인지는 알아야 하기 때문에
		//클래스이름.스태틱변수 로 사용해야 함
		
		FieldTest3.sta="static 필드 아님";
		
		//수정도 잘 된다
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.NUM);
		
		//상수필드도 값을 변경할 수 없다
//		FieldTest3.NUM=10;
		
		System.out.println(FieldTest3.STR);
		
		//
//		FieldTest3.STR="헤헤헤";
		
		FieldTest3.test();
		
		System.out.println(Math.PI);
		
	}

}




























