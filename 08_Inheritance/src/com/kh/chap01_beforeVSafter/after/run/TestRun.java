package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo2.Galaxy;
import com.kh.chap01_beforeVSafter.after.model.vo2.Iphone;
import com.kh.chap01_beforeVSafter.after.model.vo2.Phone;
import com.kh.chap01_beforeVSafter.after.model.vo2.Pixel;

public class TestRun {

	public static void main(String[] args) {
		
		//다형성
		Phone ip12 = new Iphone();
		
		
		Iphone ip13 = new Iphone();
		Galaxy g21 = new Galaxy();
		Pixel px = new Pixel();
		
		
//		ip13.call();
//		g21.call();
		
//		ip13.sms();
//		g21.sms();
//		px.sms();
//
//		ip13.camera();
//		g21.camera();
//		px.camera();
//		
//		ip13.siri();
//		g21.bixbi();
//		px.heyGoogle();
		
		
		
	}

}
