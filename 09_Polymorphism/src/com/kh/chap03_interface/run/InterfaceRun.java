package com.kh.chap03_interface.run;

import com.kh.chap03_interface.model.vo.Actor;
import com.kh.chap03_interface.model.vo.Movie;
import com.kh.chap03_interface.model.vo.MovieActor;

public class InterfaceRun {

	public static void main(String[] args) {
		
//		Actor a = new Actor();
		MovieActor a = new MovieActor();
		Movie b = new MovieActor();
		Actor c = new MovieActor();
		
		//기능 제한을 할 수 있다.(부모타입참조변수로 활용하여) 
		a.action();
		a.angry();
		a.cry();
		a.mv();
		//클래스 상속을 통한 기능 
		a.getAge();
		a.getName();
		
		b.mv();
		
		c.action();
		c.cry();
		c.angry();
	
	}

}
