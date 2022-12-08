package 실습문제10.추상클래스.controller;

import 실습문제10.추상클래스.model.vo.Animal;
import 실습문제10.추상클래스.model.vo.Cat;
import 실습문제10.추상클래스.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] arr=new Animal[5];
		
		arr[0]=new Dog("홍길동","골든 리트리버",50);
		arr[1]=new Cat("김길동","길냥이","길거리","검은색");
		arr[2]=new Dog("이길동","웰시코기",50);
		arr[3]=new Cat("최길동","사모예드","주인집","갈색");
		arr[4]=new Dog("박길동","시바견",50);
		
		for(int i=0;i<arr.length;i++) {
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i].speak();
			System.out.println();
		}
	}
}
