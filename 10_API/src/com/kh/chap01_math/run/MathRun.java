package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		
		//Math 클래스 
		//수학과 관련된 기능들을 제공한다.
		
		/*
		 * Math클래스의 특징
		 * -모든 필드와 메소드가 static으로 되어있다.
		 * -굳이 생성할 필요가 없어서 생성자가 private로 되어있다.
		 * -java.lang 패키지에 속해있음.
		 * */
		
		//필드
		//파이 - Math클래스 내에 상수필드로 정의되어있다.
		System.out.println("파이 : "+Math.PI);
		
		//메소드
		//메소드명(매개변수 타입):반환형
		//1.올림 ->Math.ceil(double) : 반환형 double
		double num1 = 4.349;
		System.out.println("올림 : "+Math.ceil(num1));//5.0
		
		//2.반올림 ->Math.round(double) : 반환형 long
		System.out.println("반올림 : "+Math.round(num1));//4
		
		//3.버림 ->Math.floor(double) : 반환형 double
		System.out.println("버림 : "+Math.floor(num1)); //4.0
		
		//4.절대값 ->Math.abs(int/double/long/float) :반환형 매개변수타입 그대로
		System.out.println("절대값 : "+Math.abs(-13)); //13
		
		//5.최솟값 ->Math.min(int,int) : 반환형 int
		System.out.println("최솟값 : "+Math.min(5, 10)); //5
		
		//6.최댓값 ->Math.max(int,int) : 반환형 int
		System.out.println("최댓값 : "+Math.max(5,10)); //10
		
		//7.제곱근(루트) ->Math.sqrt(double) : 반환형 double
		System.out.println("4의 제곱근 : "+Math.sqrt(4)); //2.0
		
		//8.제곱 ->Math.pow(double,double) : 반환형 double
		System.out.println("2의 10제곱 : "+Math.pow(2, 10)); //1024.0
		
		/* 모든게 다 static으로 되어있기 때문에 객체 생성없이 사용할 수 있다.
		 * -> 싱글톤 패턴
		 * (프로그램 실행과 동시에 메모리 영역에 올려놓고 재사용하는 개념)
		 * (객체 하나만으로 어디에서든지 가져다 쓸수있는 개념 - 공유의 성격이 강함)
		 * */
		
	}

}
