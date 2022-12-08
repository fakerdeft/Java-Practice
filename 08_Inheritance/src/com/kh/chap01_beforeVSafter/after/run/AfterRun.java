package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("삼성","s-22","갤럭시21",1200000,"skt");
		Tv t = new Tv("LG","t-55","어쩔티비",2200000,70);
		Desktop d = new Desktop("apple","d123-44","맥북14인치",1500000,false);
		
		System.out.println(s.toString());
		System.out.println(t.toString());
		System.out.println(d.toString());
		
		/* 상속의 특징
		 * -클래스간의 상속은 다중 상속이 불가능하다.(단일 상속만 가능)
		 * -명시되어있지는 않지만 모든 클래스는 Object클래스의 후손이다.
		 * ->때문에 Object클래스의 메소드를 사용할 수 있음.
		 * ->만약 Object클래스의 메소드 기능이 마음에들지 않는다면 재정의해서 사용할 수도 있음
		 * 
		 * 상속의 장점 
		 * 중복코드를 공통적으로 관리하기때문에 새로운 코드를 작성하거나 수정할때 용이하다.
		 * -보다 적은 양의 코드로 새 클래스를 작성할 수 있음.
		 * -프로그램의 생산성과 유지보수에 크게 기여하는 기능.
		 * 
		 * */
		

	}

}
