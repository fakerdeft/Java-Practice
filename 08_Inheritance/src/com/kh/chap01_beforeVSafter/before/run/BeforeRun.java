package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {

		Desktop d = new Desktop("LG","d-11","짱빠른컴퓨터",1500000,true);
		Tv t = new Tv("samsung","t-55","너무좋은티비",2000000,50);
		SmartPhone s = new SmartPhone("apple","s-123","아이폰55",5500000,"SKT");
		
		System.out.println(d/*toString()*/);
		System.out.println(t/*toString()*/);
		System.out.println(s.toString());
		
		
	}

}
