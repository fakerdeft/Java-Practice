package 실습문제10.다형성.view;

import java.util.Scanner;

import 실습문제10.다형성.controller.LibraryController;
import 실습문제10.다형성.model.vo.Book;
import 실습문제10.다형성.model.vo.Member;

public class LibraryMenu {
	
	private LibraryController lc= new LibraryController();
	private Scanner sc=new Scanner(System.in);
	
	String name="",keyword="";
	int age=0,index=0;
	char gender=0;
	
	public void mainMenu() {//메인 메뉴+마이페이지
		
		System.out.println("이름:");
		name=sc.nextLine();
		System.out.println("나이:");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("성별:");
		gender=sc.nextLine().charAt(0);
		
		Member mem = new Member(name,age,gender);
		
		lc.insertMember(mem);
		
		int a=0;
		while(a!=10) {
			System.out.println();
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호:");
			
			switch(sc.nextInt()) {
			case 1: System.out.println(lc.myInfo().toString());
				break;
			case 2: selectAll();
				break;
			case 3: searchBook();
				break;
			case 4: rentBook();
				break;
			case 9:System.out.println("프로그램을 종료합니다.");
				a=10;
				break;
			default:System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
			}//switch
			
		}//while
		
	}//public void mainMenu()

	public void selectAll() {//도서 전체 조회
		
		for(int i=0;i<lc.selectAll().length;i++) {
			System.out.println(i+"번도서: "+lc.selectAll()[i].toString());
		}//for
		
	}//public void selectAll()

	public void searchBook() {//도서 검색
		sc.nextLine();
		System.out.println("검색할 제목 키워드: ");
		keyword=sc.nextLine();
		lc.searchBook(keyword);
		for(int i=0;i<lc.searchBook(keyword).length;i++) {
			if(lc.searchBook(keyword)[i]!=null)
			System.out.println(lc.searchBook(keyword)[i].toString());
		}
	}//public void searchBook()
	
	public void rentBook() {//도서 대여
		for(int i=0;i<lc.selectAll().length;i++) {
			System.out.println(i+"번도서: "+lc.selectAll()[i].toString());
		}//for
		System.out.println("대여할 도서 번호 선택:");
		index=sc.nextInt();
		sc.nextLine();
		lc.rentBook(index);
		
		switch (lc.rentBook(index)) {
		case 0:System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:System.out.println("성공적으로 대여되었습니다.\n요리학원 쿠폰이 발급되었으니\n"
				+ "마이페이지에서 확인하세요.");
		
		}//switch
		
	}//public void rentBook()
	
}//public class LibraryMenu
