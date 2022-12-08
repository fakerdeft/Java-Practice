package 실습문제11.API.view;

import java.util.Scanner;

import 실습문제11.API.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private TokenController tc = new TokenController();
			
	public void mainMenu() {//메인 메뉴
		
		int a=0;
		while(a!=10) {//무한 반복
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			
			switch(sc.nextInt()) {
			case 1:tokenMenu();
				break;
			case 2:inputMenu();
				break;
			case 3:System.out.println("프로그램을 종료합니다");
				a=10;
				break;
			default:System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}//switch
			
		}//while(a!=10)
		
	}//mainMenu()
	
	public void tokenMenu() {//토큰 처리 전,처리 후,모두 대문자로 변환 출력
		
		String str = "J a v a P r o g r a m ";
		
		System.out.println("토큰 처리 전 글자:"+str);
		System.out.println("토큰 처리 전 개수:"+str.length());
		System.out.println("토큰 처리 후 글자:"+tc.afterToken(str));
		System.out.println("토큰 처리 후 개수:"+tc.afterToken(str).length());
		System.out.println("모두 대문자로 변환:"+tc.afterToken(str).toUpperCase());
		System.out.println();
		
	}//tokenMenu()
	
	public void inputMenu() {//첫 글자 대문자와 찾을 문자 몇 개 있는지 출력
		String input="";
		char one=0;
		
		System.out.println("문자열을 입력하세요:");
		sc.nextLine();
		input=sc.nextLine();
		System.out.println("첫 글자 대문자: "+tc.firstCap(input));
		
		System.out.println("찾을 문자 하나를 입력:");
		one=sc.nextLine().charAt(0);
		System.out.println(one+" 문자가 들어간 개수: "+tc.findChar(input, one));
		
		System.out.println();
		
	}//inputMenu()


}//class TokenMenu











