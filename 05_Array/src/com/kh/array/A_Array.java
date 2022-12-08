package com.kh.array;
import java.util.*;
public class A_Array {
	
	static Scanner sc=new Scanner(System.in);
	
	public void method1() {
		
		
		/*
		 * 배열로 여러가지 수 다루기
		 * [표현법]
		 * 
		 *  1)자료형[] 배열명;
		 *  2)자료형 배열명[];
		 */
		
		int a;
		int[] arr;
		int arr2[];
		
		/*
		 * 배열 할당
		 * 배열을 몇칸짜리로 만들지 작성하는 부분
		 * 지정한 크기만큼 선언한 자료형 크기의 방들이 생성된다.
		 * 
		 * [표현법]
		 * 배열이름 = new 자료형[배열크기];
		 * 
		 */
		
		arr = new int[3];
		arr2 = new int[5];
		
		//배열선언과 할당 동시에 하기
		int[] arr3 =new int[10];//참조자료형은 new 연산자를 통해 할당 받기
		
		System.out.println(arr3);
		
		//배열 인덱스에 값 담아보기
		/*
		 * [표현법]
		 * 배열이름[인덱스]=넣을 값;
		 * 
		 */
		
		arr3[0]=1;
		arr3[1]=5;
		arr3[2]=10;
		arr3[5]=15;
		
		//주소값만 보여준다
		System.out.println(arr3);
		//실제 값이 담긴 곳을 확인하려면 해당 인덱스를 지정해줘야한다
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);  
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);  
		System.out.println(arr3[5]);
		
		//배열의 장점:반복문 활용 가능
		System.out.println("=====================");  
		//반복문을 활용하여 배열에 담긴 값을 출력
		//배열.length 배열의 크기
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);  
		}
		
		//반복문을 활용하여 배열에 값을 대입해보자
		for(int i=0; i<arr3.length;i++) {
			arr3[i]=i+1;
		}
		System.out.println("=========================");  
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);  
		}
		
	}
	
	public void method2() {
//		int[] n1; //배열 선언
//		n1=new int[3];	 //배열 할당 //생성된 배열의 크기는 변하지 않는다
//		
//		n1[0]=1;
//		n1[1]=20;
//		n1[2]=30;
//			
//		n1[3]=50; //문법 오류x 실제로 없는 위치를 참조하려고 했기 때문에 오류
//		for(int i=0; i<n1.length;i++) {
//			System.out.println(n1[i]);
//		}
//		
		
		//문자 배열 만들기
		char[] c=new char[4];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		//반복문을 이용해서 문자 배열 출력하기
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	public void method3() {
		//정수형 배열 3칸에 각각 10 20 30을 넣고 출력해보자
		//반복문 활용
		
		int[] n=new int[3];
		
//		n[0]=10;
//		n[1]=20;
//		n[2]=30;
		
		for(int i=0;i<n.length;i++) {
			n[i]=(i+1)*10;
			System.out.println(n[i]);
		}
		
	}
	
	public void method4() {
		//String 배열 만들자
		String[] foods = new String[5];
		
		//String 배열 인덱스에 값 대입
		
//		foods[0]="한식 뷔페";
//		foods[1]="서브웨이";
//		foods[2]="스파게티";
//		foods[3]="햄버거";
//		foods[4]="김밥";
//		
//		for(int i=0;i<foods.length; i++) {
//			System.out.println(foods[i]);
//		}
		
		
		//문자열도 반복문으로 대입해보기		
		for(int i=0;i<foods.length;i++) {
			System.out.println("점심메뉴를 입력:");
			foods[i]=sc.nextLine();
		}
		
		for(int i=0;i<foods.length; i++) {
			System.out.println(foods[i]);
		}
		
	}
	
	public void method5() {
		
		//정수형 배열 5칸 만들고
		//각 인덱스에 임의의 값 입력 받고
		//배열에 담긴 값 출력
		//반복문 이용
		
		int[] n=new int[5];
		
		for(int i=0;i<n.length;i++) {
			System.out.println("정수 입력:");
			n[i]=sc.nextInt();
		}
		
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);	
		}
		System.out.println("배열의 크기:"+n.length);
				
	}
	
	public void method6() {
		//배열 선언과 동시에 할당 및 초기화
		
		//배열 선언
		String[] s = new String[3];
		//배열 선언과 할당 및 초기화까지
		String[] s2 = new String[] {"안녕","하세요","반갑","습니다"};
		//배열 선언과 할당 및 초기화 방법2
		String[] s3 = {"오늘은","즐거운","금요일","야호"};
		
		System.out.println("s의 크기:"+s.length);
		System.out.println("s2의 크기:"+s2.length);
		System.out.println("s3의 크기:"+s3.length);
		
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
		}
		System.out.println();
		
		for(int i=0; i<s3.length;i++) {
			System.out.println(s3[i]);
		}
	}
	
	public void method7() {
		//문자열 타입 배열로 본인의 인생영화 3~5개를 넣고 출력하기
		//중괄호 초기화 방법을 이용
		//출력은 반복문
		
		String[] s=new String[5];
//		String[] s2=new String[] {"ㄱ","ㄴ","ㄷ"};
//		
//		for(int i=0;i<s2.length;i++) {
//			System.out.println(s2[i]);
//		}
		
		System.out.println("5개 입력:");

		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextLine();
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);					
		}
	}
	
	
	public void method8() {
		//정수 입력받아 최댓값 구하기
//		정수형 배열5칸짜리
//		반복문으로 입력받고 그 수 중에서 최댓값
		//최댓값 변수를 0으로 시작
		int[] n=new int[5];
		int k=0;
		
		System.out.println("정수를 입력하세요:");
		
		for(int i=0;i<n.length;i++) {//최댓값
			 n[i]=sc.nextInt();		
			if(k<n[i]) {
				k=n[i];
			}
		}
		System.out.println("최댓값:"+k);
		
		k=0;
		System.out.println("다시 입력:");
		k=sc.nextInt();		
		for(int i=0;i<n.length-1;i++) {//최솟값
			int j=sc.nextInt();
			if(k>j) {
				k=j;
			}
			else {
				continue;
			}
		}
		
		System.out.println("최솟값:"+k);
	}
	
	public void method9() {
		//치킨 시키기
		//String 배열에 5가지 작성
		//치킨메뉴 입력받아
		//해당 메뉴 있으면 배달 가능 메세지 띄우기
		//없으면 없다고 띄우기
		
		String[] s= {"후라이드","간장","양념","허니","레드"};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+",");
		}
		System.out.println("메뉴 입력:");
		String k=sc.nextLine();
		String k2="";
		
//	sol1		
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(k)) {
				k2=s[i]+"Yes";
				break;
			}
			else {
				k2="No";
			}
		}
		System.out.println(k2);
	}	

		
//	sol2
//		switch(k) {
//		
//		case"후라이드":k2="Yes";
//			break;
//		case"간장":k2="Yes";
//			break;
//		case"양념":k2="Yes";
//			break;
//		case"허니":k2="Yes";
//			break;
//		case"레드":k2="Yes";
//			break;
//		default:
//			System.out.println("No");
//		}
//		System.out.println(k2);
//		
//	}
//		
	
}