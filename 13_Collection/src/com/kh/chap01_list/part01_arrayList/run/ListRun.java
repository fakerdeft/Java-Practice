package com.kh.chap01_list.part01_arrayList.run;

import java.util.*;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {
	/*
	 * 컬렉션 (Collection)
	 * 자료구조가 내장되어있는 클래스
	 * 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크" 이다
	 * -자료구조 : 데이터들을 효율적으로 다룰때 필요한 개념
	 * -프레임워크 : 효율적인 기능들이 이미 정의되어 있는 툴
	 * 
	 * 데이터들이 새롭게 추가되거나 삭제되거나 수정이 되는 기능(알고리즘)들이 이미 정의되어 있는 틀(컬렉션)
	 * -다량의 데이터들을 관리하고자 할때 배열을 가지고 사용하기엔 불편한 점들이 있어 
	 * -그 단점들을 보완한것이 컬렉션
	 * 
	 * 배열과 컬렉션의 차이점
	 * -배열의 단점
	 * 1.한 타입의 데이터들만 저장 가능
	 * 2.배열을 쓰고자 할때 먼저 크기를 지정해야한다.
	 * -한번 지정된 크기는 변경이 불가능 - 새로운값을 추가하고자 할때 크기를 벗어날 경우 새로운 크기의
	 *  배열을 생성한뒤 기존의 내용들을 복사하는 작업을 해야함
	 * 3.배열 중간위치에 새로운 데이터를 추가하거나 삭제하는 경우
	 *  기존의 값들을 땡겨주거나, 밀어주는 코드를 작성해야한다.
	 * 
	 * -컬렉션의 장점
	 * 1.기본적으로 여러타입의 데이터들을 저장 가능하다 - 같은 타입으로만 묶는것도 가능(제네릭설정)
	 * 2.크기에 제약이 없다.
	 * -굳이 크기지정을 하지 않아도 됨.
	 * -만약 크기지정을 했고 그 크기를 벗어나는 작업을 해도 알아서 늘어난다.
	 * 3.중간에 값을 추가하거나 삭제하는 경우에 값을 땡겨주거나 밀어주는 코드가 작성되어 있음
	 * 
	 * -방대한 데이터들을 담아만 두고 "조회"만 할 목적이라면 배열이 효율적
	 * -방대한 데이터들이 추가,삭제,수정될 경우의 목적이라면 컬렉션이 효율적이다.
	 * 
	 * 컬렉션의 종류(3가지 계열)
	 * -List 계열 : 담고자 하는 값만 저장 / 값 저장시 순서 유지(index) /중복값 허용 ex)ArrayList,Vector,...
	 * -Set 계열 : 담고자 하는 값만 저장 / 값 저장시 순서 유지X (index없음) / 중복값 허용X ex)HashSet,LinkedHashSet...
	 * -Map 계열 : 키(key) + 값(value)세트로 저장 / 값저장시 순서유지X (index없음) /중복키 불가능/중복값은 허용
	 *  ex)HashMap,HashTable,Properties...
	 * */

	public static void main(String[] args) {
		//ArrayList 선언 방법
		//[표현법]
		//ArrayList 객체이름 = new ArrayList(); - 크기지정 x
		//ArrayList 객체이름 = new ArrayList(크기); - 크기지정 o
		
		ArrayList list = new ArrayList(3); //3칸짜리 생성
		
		System.out.println(list);//비어있음
		//size(): 해당 리스트에 크기(담겨있는 개수)를 반환해주는 메소드
		System.out.println(list.size());
		//add(E e) : 해당 리스트의 끝에 매개변수로 전달한 값을 추가하는 메소드
		list.add(123); //int X Integer O
		list.add("사오육"); 
		list.add(true); //boolean X Boolean O
		list.add(5.5); // double X Double O
		//객체타입만 들어갈 수 있어서 기본형을 넣으면 자동으로 boxing된다 auto boxing(Wrapper클래스로)
		
		System.out.println(list);
		System.out.println(list.size());
		//remove(index i): 해당 리스트에 index번째 있는 데이터를 삭제하는 메소드
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(new Music("폴킴","비"));
		list.add(new Music("장범준","봄비"));
		
		System.out.println(list);
		System.out.println(list.size());
		
		//수정
		//set(int index E e) : 해당 리스트의 index에 있는 값을 전달한 e로 변경해주는 메소드
		list.set(2, new Music("에픽하이","우산"));
		System.out.println(list);
		
		//해당 인덱스에 있는 값 얻기
		//get(int index): 해당 리스트에 index에 있는 값을 반환하는 메소드
		System.out.println(list.get(3));
//		System.out.println(list.get(5));//없는 인덱스 접근하려고 하면 오류
		//해당 객체로 접근하는 get(index)+getter메소드
		System.out.println(((Music)list.get(0)).getSong());

		//리스트를 부분적으로만 추출
		//subList(int index1, int index2): 반환형 List
		//index1부터 index2까지의 데이터를 추출해서 새로운 리스트로 반환시켜주는 ㅁㅅㄷ
		List sub =list.subList(0,3);
			
		System.out.println(sub);
		System.out.println(list);
		
		//리스트+리스트
		//addAll(Collection c): 해당 리스트에 다른 컬렉션에 있는 데이터를 전부 추가해주는 ㅁㅅㄷ
		//iterator 반복자로 꺼내지기 때문에 다꺼내진 후에 접근불가(다 추가된 후)
		list.addAll(sub);//list맨 뒤에 sub를 붙이겠다
		System.out.println(sub);
		list.addAll(0,sub);//0번 인덱스부터 sub데이터에 넣겠다.
//		System.out.println(list);
		
		//리스트가 비어있는지 확인
		//isEmpty(): 리스트가 비어있는지 채워져있는지 물어보는 메소드
		System.out.println(list.isEmpty());//비어있으면 true/아니면false
		
		//전체삭제 메소드
		//clear(): 해당 리스트에 데이터를 전부 비워주는 ㅁㅅㄷ
		list.clear();
		System.out.println(list.isEmpty());
		
		
		
	}//main

}//class 






























