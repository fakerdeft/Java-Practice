package 실습문제10.인터페이스.controller;

import 실습문제10.인터페이스.model.vo.GalaxyNote9;
import 실습문제10.인터페이스.model.vo.Phone;
import 실습문제10.인터페이스.model.vo.V40;

public class PhoneController {
	
	private String[] result=new String[2];
	
	
	
	public String[] method() {
		
		Phone p1 = new V40();
		Phone p2 = new GalaxyNote9();
		
		Phone[] p = new Phone[2];
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		
		for(int i=0;i<result.length;i++) {
			if(p[i] instanceof GalaxyNote9){
				result[i]=((GalaxyNote9)p2).printInformation();
			}
			else if(p[i] instanceof V40) {
				result[i]=((V40)p1).printInformation();
			}
		}
		
		return result;
	}
}
