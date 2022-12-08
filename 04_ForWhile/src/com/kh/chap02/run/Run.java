package com.kh.chap02.run;

import com.kh.chap02.loop.A_For;
import com.kh.chap02.loop.B_While;
import com.kh.chap02.loop.C_DoWhile;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 반복문
		 * 프로그램의 흐름을 제어하는 제어문 중 하나
		 * 어떤 실행 구문을 반복적으로 수행시켜줌
		 * 
		 * 반복문의 분류
		 * 1. for문
		 * 2. while문 계열 - while문, do-while문
		 */
		
		A_For a= new A_For();
		B_While b=new B_While();
		C_DoWhile c=new C_DoWhile();
		
//		a.method9();
//		b.method3();
		c.method2();
		
		
		
		
	}

}