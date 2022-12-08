package 실습문제10.인터페이스.run;

import 실습문제10.인터페이스.controller.PhoneController;
import 실습문제10.인터페이스.model.vo.Phone;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		
		String[] str= new String[2];
		
		str[0]=pc.method()[0];
		str[1]=pc.method()[1];
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			System.out.println();
		}
	}

}
