package com.kh.chap01_list.part01_arrayList.run;

import java.util.*;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class GenericRun {

	public static void main(String[] args) {
		
		/*
		 * 제네릭(Generic) <E>
		 * 컬렉션 안에서 다룰 타입들을 미리 지정해주는 역할->명시적으로 <Music>,<String>...
		 * 객체의 형변환 필요x
		 * ->내가 사용하고싶은 타입만 사용가능
		 * 
		 * 만약에 제네릭을 제시<Music> (E=Music)
		 * VS
		 * 별도의 제네릭 제시 없이 컬렉션 객체 생성 시 (E==Object)
		 * 다양한 타입의 값이 담길 수 있다.
		 * 
		 * 제네릭을 쓰는 이유
		 * 1.저장할 타입의 제한을 두기 위해서
		 * 2.매번 형변환 하는 절차를 없애기 위해.
		 * 
		 * [표현법]
		 * ArrayList<제네릭> 리스트명 = new ArrayList<제네릭>();
		 * ArrayList<제네릭> 리스트명 = new ArrayList<>(); - 뒤에 제네릭 생략ㄱㄴ
		 */
		
		ArrayList<Music> list= new ArrayList<>();
		ArrayList<String> slist= new ArrayList<String>();
		ArrayList<Integer> ilist = new ArrayList<>();
		ArrayList<Double> dlist = new ArrayList<>();
		
		list.add(new Music("비","태양을 피하는 방법"));
		
		System.out.println(list);
		
//		list.add(123);
//		타입을 지정해줬기 때문에 강제형변환 할 필요가 없음
		System.out.println(list.get(0).getSong());

	}

}






























