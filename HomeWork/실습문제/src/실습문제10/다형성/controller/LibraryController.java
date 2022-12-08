package 실습문제10.다형성.controller;

import 실습문제10.다형성.model.vo.AniBook;
import 실습문제10.다형성.model.vo.Book;
import 실습문제10.다형성.model.vo.CookBook;
import 실습문제10.다형성.model.vo.Member;

public class LibraryController {
	
	private Member mem=null;
	private Book[] bList = new Book[5];
	
	{
		bList[0]=new CookBook("백종원의 집밥","백종원","tvN",true);
		bList[1]=new AniBook("한번 더 해요","미티","원모어",19);
		bList[2]=new AniBook("루피의 원피스","루피","japan",12);
		bList[3]=new CookBook("이혜정의 얼마나 맛있게요","이혜정","문학",false);
		bList[4]=new CookBook("최현석 날 따라해봐","최현석","소금책",true);
	}
	
	public void insertMember(Member mem) {
		this.mem=mem;
	}
	
	public Member myInfo() {
	
		return mem;
	}
	
	public Book[] selectAll() {
		
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		
		Book[] b1 = new Book[5];
		
		int count=0;
		for(int i=0;i<b1.length;i++) {
			if(bList[i].getTitle().contains(keyword)) {
			b1[count]=bList[i];
			count++;
			}
		}
		return b1;
		
	}//public Book[] searchBook(String keyword)

	public int rentBook(int index) {
		
		AniBook[] ab = new AniBook[2];
		ab[0]=new AniBook("한번 더 해요","미티","원모어",19);
		ab[1]=new AniBook("루피의 원피스","루피","japan",12);
		
		CookBook[] cb=new CookBook[3];
		cb[0]=new CookBook("백종원의 집밥","백종원","tvN",true);
		cb[1]=new CookBook("이혜정의 얼마나 맛있게요","이혜정","문학",false);
		cb[2]=new CookBook("최현석 날 따라해봐","최현석","소금책",true);
		
		int result=0,c=0;
//		for(int i=0;i<bList.length;i++) {
//			if(i==index) {
				if(bList[index] instanceof AniBook) {
					if(bList[index]==ab[0])
						if(mem.getAge()<ab[0].getAccessAge()) {
							result=1;
						}
						else result=0;
					else {
						if(mem.getAge()<ab[1].getAccessAge()) {
							result= 1;
						}
						else result=0;
					}//else
				}//if
				
				else if(bList[index] instanceof CookBook) {
					switch(index) {
					case 0:
						if(cb[0].isCoupon()==true) {
							result=2;
							break;
						}
						result=0;
						break;
					case 3:
						if(cb[1].isCoupon()==true) {
							result=2;
							break;
						}
						result=0;
						break;
					case 4:
						if(cb[2].isCoupon()==true) {
							result=2;
							break;
						}
						result=0;
					}//switch
					
				}//else if(bList[i] instanceof CookBook)
				return result;
//			}//if(i==index)
//			
//		}//for(int i=0;i<bList.length;i++)
//		
		
	}//public int rentBook(int index)

	
	
}

























