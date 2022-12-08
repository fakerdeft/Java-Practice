package 실습문제12.컬렉션.library.view;

import java.util.*;

import 실습문제12.컬렉션.library.controller.BookController;
import 실습문제12.컬렉션.library.model.vo.Book;

public class BookMenu {
	
	private Scanner sc= new Scanner(System.in);
	private BookController bc = new BookController();
	
	String title="",author="",genre="",keyword="";
	int price=0,category=0;

	public void mainMenu() {//메인메뉴
		
		System.out.println("===== Welcome KH Library =====");
		System.out.println();
		
		while(true) {
		System.out.println("=====***** 메인 메뉴 *****=====");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.println();
			System.out.println("메뉴 번호 입력:");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:insertBook();
				break;
			case 2:selectList();
				break;
			case 3:searchBook();
				break;
			case 4:deleteBook();
				break;
			case 5:ascBook();
				break;
			case 9:System.out.println("프로그램 종료");
				return;
			default:System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}//switch
			
		}//while
		
	}//mainMenu
	
	private void insertBook() {//새 도서 추가
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.println("도서 명: ");
		title=sc.nextLine();
		System.out.println("저자 명: ");
		author=sc.nextLine();
		System.out.println("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타");
		category=sc.nextInt();
		sc.nextLine();
		System.out.println("가격: ");
		price=sc.nextInt();
		sc.nextLine();
		
		switch(category) {
		case 1:genre="인문";
			break;
		case 2:genre="과학";
			break;
		case 3:genre="외국어";
			break;
		case 4:genre="기타";
			break;
		}
		
		Book bk = new Book(title,author,genre,price);
		
		bc.insertBook(bk);
		
	}//insertBook
	
	private void selectList() {//도서 전체 조회
		System.out.println("===== 도서 전체 조회 =====");
		ArrayList<Book> bookList= new ArrayList();
		bookList=bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}
		else {
			for(Book b: bookList) {
				System.out.println(b);
			}
		}
		
	}//selectList
	
	private void searchBook() {//도서 검색
		System.out.println("===== 도서 검색 =====");
		System.out.println("검색 키워드:");
		keyword=sc.nextLine();
		
		if(bc.searchBook(keyword)==null) {
			System.out.println("존재하는 도서가 없습니다.");
		}
		else {
				System.out.println(bc.searchBook(keyword));
		}
		
	}//searchBook
	
	private void deleteBook() {//도서 삭제
		System.out.println("===== 도서 삭제 =====");
		System.out.println("삭제 할 도서 명:");
		title=sc.nextLine();
		System.out.println("삭제 할 저자 명:");
		author=sc.nextLine();

		Book remove=bc.deleteBook(title, author);
		
		if(remove!=null) {
			System.out.println("성공적으로 삭제되었습니다.");
		}
		else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}//deleteBook

	private void ascBook() {//도서 명 오름차순 정렬
		System.out.println("1. 오름차순");
		System.out.println("2. 내림차순");
		int n=sc.nextInt();
		sc.nextLine();
		
		switch(n) {
		case 1:
			break;
		case 2:
			break;
		}
		
		if(bc.ascBook()==1) {
			System.out.println("정렬에 성공하였습니다.");
		}
		else {
			System.out.println("정렬에 실패하였습니다.");
		}
		
	}//ascBook

	



}//class
