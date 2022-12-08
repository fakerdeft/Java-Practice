package com.kh.chap01.oneVsmany.run;
import java.util.Scanner;

import com.kh.chap01.oneVsmany.model.vo.Student;
public class SRun {

	public static void main(String[] args) {
		//객체배열과 반복문 이용
		//학생의 이름,나이,성별 입력받아
		//학생3명을 만들어보시오.
		//생성 후 해당 학생의 정보 출력
		
		Scanner sc= new Scanner(System.in);
		
		Student[] s1= new Student[3];
		
		
		for(int i=0;i<s1.length;i++) {
			
			System.out.println("이름 입력:");
			String s=sc.nextLine();
			System.out.println("나이 입력:");
			int n=sc.nextInt();
			System.out.println("성별 입력:");
			sc.nextLine();
			String c=sc.nextLine();
			
			s1[i]=new Student(s,n,c);
			System.out.println();
		}
		System.out.println(s1[0].info());
		System.out.println(s1[1].info());
		System.out.println(s1[2].info());
		
		
		System.out.println();
		System.out.println("원하는 학생을 입력:");
		String ss=sc.nextLine();
		for(int i=0;i<s1.length;i++) {
			if(ss.equals(s1[i].getName())) {
				System.out.println(s1[i].getName()
						+"은 "+s1[i].getAge()+"살 입니다.");
			break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
