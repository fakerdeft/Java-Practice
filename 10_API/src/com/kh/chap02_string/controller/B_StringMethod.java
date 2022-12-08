package com.kh.chap02_string.controller;

public class B_StringMethod {
	
	public void method1() {
		//문자열과 관련된 유용한 메소드들
		
		String str1 = "hello WORld";
		
		//메소드명 (매개변수):반환형
		
		//1.문자열.charAt(int index): 반환형 char
		char ch = str1.charAt(6);
		
		System.out.println("ch : "+ch);
		
		//문자열.concat(String str):반환형 String
		//문자열과 전달받은 또다른 문자열을 하나로 합쳐서 리턴 ->문자열+str
		
		String rs = str1+"!!";
		
		String result = str1.concat("~~");
		
		System.out.println(rs);
		System.out.println(result);
	
		//문자열.length() : 반환형 int
		//-문자열 길이를 반환
		
		System.out.println(str1.length());
		
		//문자열.substring(int beginindex) :반환형 String
		//-문자열의 beginindex부터 문자열 끝까지를 추출해주는 메소드
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(5, 7));
	
		//문자열.replace(char old,char new) : 반환형 String
		//문자열에서 old에 넣은 문자를 new 문자로 변환해서 반환한다.
		String str2 = str1.replace('l','p');
		System.out.println(str2);
		
		//문자열.trim() : 반환형 String
		//-문자열의 앞뒤 공백을 제거해주는 메소드
		String str3 = "              www.n        aver.com        ";
		System.out.println("공백 제거 전 : "+str3);
		System.out.println("공백 제거 후 : "+str3.trim());
		
		//중간 공백도 제거하고싶다면
		System.out.println("중간 공백 제거 : "+str3.replace(" ",""));
		
		//문자열.toUpperCase : 반환형 String
		//문자열을 대문자로 변환 
		System.out.println("toUpperCase : "+str1.toUpperCase());
		//문자열.toLowerCase : 반환형 String
		//문자열을 소문자로 변환
		System.out.println("toLowerCase : "+str1.toLowerCase());
		
		//문자열.toCharArray() : 반환형 char[]
		//문자열의 각 인덱스 문자들을 char[] 배열에 넣어 배열 리턴
		char[] cArr = str1.toCharArray();
		
		for(int i=0; i<cArr.length;i++) {
			System.out.println(cArr[i]);
		}
		//문자 배열을 문자열로 변환하는 메소드
		//static valueOf(char[] c) : 반환형 String
		System.out.println(String.valueOf(cArr));
		
		String crs = String.valueOf(cArr); //문자열로 변환
		System.out.println(crs);
		
	}
	

}
