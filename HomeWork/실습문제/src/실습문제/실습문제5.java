package 실습문제;

import java.util.*;

public class 실습문제5 {

	public Scanner sc=new Scanner(System.in);
	
//////////////////////////////////////////////////////////////////////
	public void method1() {//실습문제1
		int[] n=new int[10];
		for(int i=0; i<n.length;i++) {
			n[i]=i+1;
			System.out.println(n[i]);
		}
	}
//////////////////////////////////////////////////////////////////////	
	public void method2() {//실습문제2
		int[] n=new int[10];
		for(int i=9;i>=0;i--) {
			n[i]=i+1;
			System.out.println(n[i]);
		}
		
	}
//////////////////////////////////////////////////////////////////////
	public void method3() {//실습문제3
		System.out.println("정수 입력:");
		int a=sc.nextInt();	
		System.out.println("양의 정수:"+a);
		int[] b=new int[a];
		
		for(int i=0;i<b.length;i++) {
			b[i]=i+1;
			System.out.println(b[i]);
		}
		
	
	}
//////////////////////////////////////////////////////////////////////
	public void method4() {//실습문제4
		String[] s= {"사과","귤","포도","복숭아","참외"};
		
		System.out.println(s[1]);
	}
//////////////////////////////////////////////////////////////////////
	public void method5() {//실습문제5
		
		System.out.println("문자열 입력:");
		String w=sc.nextLine();//문자열 입력
		String[] s=new String[w.length()];//입력된 문자열 길이 만큼 배열 생성 

		for(int i=0;i<s.length;i++) {
			s[i]=String.valueOf(w.charAt(i));//문자 하나하나를 string으로 형변환 해서 배열에 넣기
		}
		
		System.out.println("문자 입력:");
		String w2=sc.nextLine();//찾는 문자 입력
		
		int a=0;// 정수1 초기화
		
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(w2)) {//배열에 있는 문자와 찾는 문자가 일치하는 경우
				a++;//정수1 증가
				System.out.println((i+1)+"번째");
			}
		}
		System.out.println(w2+"개수:"+a);//찾는 문자의 개수 출력
	}
//////////////////////////////////////////////////////////////////////
	public void method6() {//실습문제6
		String[] s= {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};//배열 생성
		
		System.out.println("0~6중 하나 입력:");
		int n=sc.nextInt();//정수 입력
		String w="";//문자열 변수 생성
		
		for(int i=0;i<s.length;i++) {
			if(i==n){//0~6을 입력한 경우
				w=s[i];//변수에 배열에서 해당하는 값 넣고 탈출
				break;
			}
			else {//다른 수를 입력한 경우
				w="잘못 입력하셨습니다.";
			}
		}
		System.out.println(w);//출력
		
	}
//////////////////////////////////////////////////////////////////////
	public void method7() {//실습문제7
		System.out.println("배열의 길이 입력:");
		int n1=sc.nextInt();//배열의 길이 입력
		int[] n2=new int[n1];//입력받은 길이 만큼 배열 생성
		int n4=0; //정수1 초기화
		
		for(int i=0;i<n2.length;i++) {//배열 길이만큼 반복
			System.out.println("배열 "+(i+1)+"번 째에 넣을 값:");
			int n3=sc.nextInt(); //배열에 넣을 값 입력
			n2[i]=n3;//배열에 입력받은 값 넣기
			n4+=n3;//누적하기
		}
		for(int i=0;i<n2.length;i++) {
		System.out.print(n2[i]+" ");//배열 출력
		}
		System.out.println("\n총 합:"+n4);//총 합 출력
	}
//////////////////////////////////////////////////////////////////////
	public void method8() {//실습문제8
		System.out.println("정수 입력:");
		int n=0; //정수1 초기화
		int n3=0; //정수2 초기화
		while(true) {//무한반복
			n=sc.nextInt(); //정수 입력
			if(n%2==0) {//짝수인 경우
				System.out.println("다시 입력:");
			}
			else {//홀수인 경우 탈출
				break;
			}
		}
		
		int[] n2=new int[n]; // 정수형 배열 생성
		
		for(int i=0;i<n2.length;i++) {//배열의 크기 만큼 반복
			if(i<((n2.length)/2)+1) {//입력값의 중간보다 작은 경우
				n3++;//증가
			}
			else{//중간보다 큰 경우
				n3--;//감소
			}
			n2[i]=n3;//조건문에 만족하는 수를 배열에 넣기
			System.out.print(n2[i]+" ");
		}
		
	}
//////////////////////////////////////////////////////////////////////
	public void method9() {//실습문제 9
		
		String[] s= {"후라이드","간장","양념","허니","레드"}; //배열 생성
		for(int i=0;i<s.length;i++) { //배열 출력
			System.out.println(s[i]+",");
		}
		System.out.println("메뉴 입력:");
		String k=sc.nextLine(); //원하는 메뉴 입력
		String k2=""; // 문자열 변수 생성
			
		for(int i=0;i<s.length;i++) {//입력받은 문자열 길이만큼 반복
			if(s[i].equals(k)) {//입력받은 문자열과 배열의 요소값이 일치하는 경우
				k2=k+"치킨 배달 가능";
				break;
			}
			else {//일치하지 않는 경우
				k2=k+"치킨은 없는 메뉴입니다.";
			}
		}
		System.out.println(k2);//출력
		
	}
//////////////////////////////////////////////////////////////////////
	public void method10() {//실습문제 10
		//ctrl+shift+o -> 자동 import
		
		int[] n=new int[10]; //int형 10자리 배열 생성
		
		for(int i=0;i<n.length;i++) {// 난수를 배열에 넣기
			Random r= new Random();
			int num=r.nextInt(10)+1; //1~10까지 난수 발생
			n[i]=num; //난수 배열에 넣기
			System.out.println(n[i]+" "); //배열 출력
		}
		
	}
//////////////////////////////////////////////////////////////////////
	public void method11() {//실습문제 11
		
//		int[] arr= {5,4,2,1,3};
//		int[] copy;
//		
//		copy=arr;// 얕은 복사: 주소값만 같게 되므로 같은 배열을 참조하게 되어서 이러면 안된다
//		
//		//copy 배열
//		for(int i=0; i<copy.length; i++) {
//			System.out.println(copy[i]+" ");
//		}
//		
//		/////깊은 복사/////
//		//copy 배열도 메모리영역에서 할당 받아야함
//		copy=new int[5];
//		
//		//원본배열만큼 반복
//		for(int i=0;i<arr.length;i++) {
//			//copy배열의 i번째 인덱스에 원본배열 i번째 인덱스에 들어있는 값을 넣겠다(복사)
//			copy[i]=arr[i];
//		}
//		
//		//copy배열 출력
//		for(int i=0;i<copy.length;i++) {
//			System.out.println(copy[i]+" ");
//		}
//		System.out.println();
//		
//		arr[0]=10;
//
//		//copy배열 출력
//				for(int i=0;i<copy.length;i++) {
//					System.out.println(copy[i]+" ");
//				}
//				System.out.println();
		
		System.out.println("주민번호 입력:");
		String s1= sc.nextLine(); //주민번호 입력 받기
		char[] c1=new char[s1.length()]; //입력받은 정수의 길이만큼 char형 배열 생성
		
		for(int i=0;i<c1.length;i++) { //배열에 문자열 넣기
			c1[i]=s1.charAt(i); 
		}
		
		char[] copy=new char[s1.length()]; //복사배열 생성
		
		for(int i=0; i<c1.length;i++) { //배열에서 8번째 인덱스부터 '0*'로 변환
			if(i>7) {//8번째 자리부터인 경우
				c1[i]='*'; // '*' 대입
			}
		}
		System.out.println(c1); //복사된 배열 출력
		
				
	}

//////////////////////////////////////////////////////////////////////
	public void method12() {//추가문제1
		int[] n=new int[10];
		
		for(int i=0;i<n.length;i++) {
			Random r=new Random();
			int num=r.nextInt(10)+1;
			n[i]=num;
			System.out.print(n[i]+" ");
		}
		int a=n[0];
		int b=n[0];
		for(int i=0;i<n.length;i++) {
			if(a<=n[i]) {
				a=n[i];
			}
			else if(b>=n[i]){
				b=n[i];
			}
		}
		System.out.println("\n최댓값: "+a);
		System.out.println("최솟값: "+b);
	}
//////////////////////////////////////////////////////////////////////
	public void method13() {//추가문제2

		Random r=new Random();
		int[] n=new int[10];

		for(int i=0; i<n.length; i++) {
			n[i]=r.nextInt(10)+1;//1~10난수 발생
			for(int j=0;j<i;j++) {
				if(n[i]==n[j]) {
					i--;
				}
			}			
		}
		for(int i=0;i<n.length;i++)
			System.out.println(n[i]);
	}
	
//////////////////////////////////////////////////////////////////////


}//class

