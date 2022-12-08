package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
	
		//HashSet
		//값만 저장,index 개념x 중복x
		//[표현법]HashSet 객체이름 = new HashSet();
		
		//문자열
		HashSet<String> hs= new HashSet<>();
		//값 추가
		//add()
		hs.add("안녕하세요");
		hs.add("반갑습니다");
		hs.add(new String("오늘 날씨가 안좋네요"));
		hs.add("반갑습니다");
		hs.add(new String("오늘 날씨가 안좋네요"));
		
		System.out.println(hs);//저장 순서 유지x 중복x
		
		//크기 구하기
		System.out.println(hs.size());
		
		//값 삭제
		hs.remove("안녕하세요");
		System.out.println(hs);
		
		//모든 값 삭제
		hs.clear();
		System.out.println(hs);
		
		//student객체
		HashSet<Student>shs=new HashSet<>();
		
		shs.add(new Student("a",20,100));
		shs.add(new Student("b",33,90));
		shs.add(new Student("c",16,50));

		System.out.println(shs);
		shs.add(new Student("a",20,100));
		System.out.println(shs);
		
		//중복제거가 되지 않음
		//왜 그럴까 - 동일객체로 판별되지 않았기 때문에
		//HashSet은 값이 추가될 때마다 equals메소드와 hashCode메소드로 비교하여
		//서로 같은지 다른지를 판별해서 같으면 동일하다고 판별하고 등록x
		
		//equals(): Object의 메소드로 현재 객체의 주소값을 비교하여 
		//같으면 true 다르면 false
		
		//hashCode(): Object의 메소드로 현재 객체의 주소값을 해쉬화+10진수화해서 반환
		
		//equals() 메소드와 hashCode()메소드 모두 true를 반환하게 된다면
		//동일객체로 판단하고 중복저장 불가
		
		//객체의 세 필드값이 모두 일치하고 true/hashCode: 세 필드값으로 해쉬코드를 만들어서
		//반환해서 true만들기
		
		System.out.println("==============");
		//HashSet에 들어 있는 값들 출력해보기
		
		//1. 반복문 -> for each문 - 인덱스 개념이 없기 때문에 인덱스 활용 for문 사용 불가
		for(Student s: shs) {
			System.out.println(s);
		}
		
		System.out.println("==============");
		//2. HashSet에 있는 데이터를 ArrayList 옮겨담고 인덱스를 활용해서 출력
		
		//1단계 - ArrayList 생성
		//2단계 - addAll()메소드 사용
		//또는 1+2 합쳐서 하기 - ArrayList생성시 매개변수로 set 넣기
		//ArrayList<Student> list = new ArrayList<>(shs);
		//3단계 - for문을 통해서 인덱스접근 및 출력
		
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(shs);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<Student> list2 = new ArrayList<>(shs);
		
		System.out.println("===1+2단계 통합===");
		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println();
		System.out.println("===Iterator===");
		//3. Iterator(반복자)-HashSet클래스에서 제공
		Iterator<Student> it = shs.iterator();
		
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		//NoSuchElementException 예외발생 - 더이상 접근 요소 없음
		System.out.println(it.next());
		*/
		
		while(it.hasNext()) {//더 접근할 요소가 있다면 true 없으면 false
			System.out.println(it.next());
		}
		
		//iterator 메소드: List와 Set계열에서만 사용 가능한 메소드
		//Map에서는 직접호출 불가
		
		
	}

}















