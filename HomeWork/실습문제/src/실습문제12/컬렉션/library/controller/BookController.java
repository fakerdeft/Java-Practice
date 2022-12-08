package 실습문제12.컬렉션.library.controller;

import java.util.*;

import 실습문제12.컬렉션.library.model.vo.Book;

public class BookController {
	
	private ArrayList<Book> list = new ArrayList<>();

	public BookController() {//기본생성자
		super();
		
		//초기 값 4개 추가
		
		list.add(new Book("자바의 정석", "남궁  성", "기타", 20000)); 
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000)); 
		list.add(new Book("대화의  기술", "강보람", "인문", 17500)); 
		list.add(new Book("암  정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {//책 list에 추가
		list.add(bk);
	}
	
	public ArrayList selectList() {//책 list의 주소 값 반환
		
		return list;
	}
	
	public ArrayList searchBook(String keyword) {//검색 결과 리스트 반환
		ArrayList searchList = new ArrayList();
		
		int count=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
				count++;
			}
		}
		if(count==0) {
			searchList=null;
		}
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {//도서 삭제
		
		Book removeBook = new Book();
		removeBook=null;
		
		for(int i=0;i<list.size();i++) {
			if((list.get(i).getTitle().equals(title))
					&&(list.get(i).getAuthor().equals(author))) {
				removeBook=list.get(i);
				list.remove(i);
				break;
			}
		
		}
		return removeBook;	
	}
	
	public int ascBook() {//도서 오름차순 정렬
		int count=0,out=0;
		while(out!=1) {
				for(int i=1;i<list.size();i++) {
					if(String.valueOf(list.get(i-1).getTitle().charAt(0))
							.compareTo(String.valueOf(list.get(i).getTitle().charAt(0)))>0) {

						ArrayList<Book> list2=new ArrayList<>();
						
						list2.add(0, list.get(i));
						list.set(i, list.get(i-1));
						list.set(i-1, list2.get(0));
						count++;
					}
					
					if(i==(list.size())-1) {
						if(count==0) {
							out=1;
						}
					}
					if(i==(list.size())-1) {
						count=0;
					}
				}
		}
		return 1;

		
	}//askBook

}
