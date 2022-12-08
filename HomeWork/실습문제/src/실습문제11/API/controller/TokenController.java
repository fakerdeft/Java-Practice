package 실습문제11.API.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {} //기본 생성자

	public String afterToken(String str) {//띄어쓰기 없애고 문자열 반환
		
		String result="";
		
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			result+=st.nextToken();
		}
		return result;
		
	}//afterToken(String str)
	
	public String firstCap(String input) {//첫 번째 글자 대문자로 바꾸고 문자열 반환
		
		String result="";
		
		String[] sArr=new String[input.length()];
		
		for(int i=0;i<sArr.length;i++) {
			sArr[i]=String.valueOf(input.charAt(i));
		}
		
		for(int i=0;i<sArr.length;i++) {
			if(i==0) {
				sArr[i]=String.valueOf(input.charAt(i)).toUpperCase();
			}
			result+=sArr[i];
		}
		return result;

	}//firstCap(String input)
	
	public int findChar(String input,char one) {//원하는 문자가 문자열에 몇 개 있는지 세고 개수 반환
		
		int count=0;
		
		for(int i=0;i<input.length();i++) {
			if(one==input.charAt(i)) {
				count++;
			}
		}	
		
		return count;
		
	}//findChar(String input,char one)
	
}//class TokenController
