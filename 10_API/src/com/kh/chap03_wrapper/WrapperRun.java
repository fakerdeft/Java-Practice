package com.kh.chap03_wrapper;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * Wrapper클래스
		 * -기본자료형을 객체로 포장해주는 클래스들을 래퍼클래스라고 한다.
		 * 
		 * 기본자료형      			Wrapper클래스
		 * boolean				Boolean
		 * char					Character
		 * byte					Byte
		 * short				Short
		 * int					Integer
		 * long					Long
		 * float				Float
		 * double				Double
		 * */
		
		int num1 = 10;
		int num2 = 15;
		
		//Wrapper 클래스로 변환하여 메소드를 사용해보자.
		//기본자료형에서 Wrapper 클래스 자료형으로 변환하는것을 Boxing
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		//a.compareTo(b) : a가 b보다 크면 1 반환 b가 크면 -1반환 같으면 0을 반환한다.
		System.out.println(i1.compareTo(i2));
		
		//
		num1 = i1; // 클래스 자료형 -> 기본자료형 (Unboxing)
		int num3 = i2; 
		
		System.out.println("num1 :"+num1+" num3 :"+num3);
		
		
		//기본자료형 <-->String
		String str1 = "10"; //int 형으로
		String str2 = "15.0"; //double 형으로 
		
		System.out.println((str1+str2));
		
		//1.String형을 기본자료형으로 파싱한다.
		//[표현법] 해당Wrapper클래스이름.parseXXX(변환할문자열);
		int i = Integer.parseInt(str1); // "10" -> 10
		double d = Double.parseDouble(str2); //"15.0" -> 15.0
		
		System.out.println(i+d); //25.0
		
		//2.기본자료형을 String형으로
		//->String.valueOf(변환할기본자료형값):반환형 String
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		System.out.println((strI+strD));
		
	}
}
