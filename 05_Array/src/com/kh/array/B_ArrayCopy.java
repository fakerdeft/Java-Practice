package com.kh.array;

public class B_ArrayCopy {
	
		/*
		 * 배열복사
		 * 1.얕은 복사: 배열의 주소값만을 복사
		 * 2.깊은 복사: 동일한 새 배열을 생성하여 내부 값까지 복사
		 * 
		 */
	public void method1() {//얕은 복사
		//원본 배열
		int[] origin=new int[5];
		
		origin[0]=1;
		
		//원본배열에 값 넣기
		for(int i=0; i<origin.length;i++) {
			origin[i]=i+1;
		}
		
		//원본배열에 들어간 값 출력해보기
		for(int j=0; j<origin.length;j++) {
			System.out.print(origin[j]+" ");
		}
		
		//복사본 배열
		int[] copy = origin;
		System.err.println();
		System.out.println("-----copy 배열-----");
		
		//복사본 배열에 값이 들어갔는지 확인
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		
		//원본배열 0번 인덱스에 99라는 값 넣어보기
		origin[0]=99;
		//값이 바뀌었는지 원본 배열 확인
		System.out.println();
		System.out.println("---99넣은 원본배열---");
		for(int i=0;i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		System.out.println("---copy건드린적없음---");
		for(int i=0; i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		
		System.out.println();
		//배열 변수가 가지고 있는 배열객체의 주소값이 원본과 복사본이 같다
		//얕은 복사
		System.out.println(origin);
		System.out.println(copy);
		
		int[] arr=new int[5];
		System.out.println(copy);
	}
	
	//깊은 복사
	public void method2() {
		//원본 배열
		int[] origin= {1,2,3,4,5};
		//복사본 배열		
		int[] copy=new int[origin.length];
		
		//복사본 배열 출력해보기
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		//원본 배열에 i번 인덱스에 담긴 값은 원본배열 i번 인덱스에 담는 반복문
		for(int i=0;i<origin.length;i++) {
			copy[i]=origin[i];
		}
		
		System.out.println("원본배열-----");
		for(int i=0;i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		System.out.println("복사본배열-----");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		System.out.println();
		origin[0]=99;
		copy[3]=150;
		System.out.println("-----원본 배열 수정 후-----");
		System.out.println("원본배열-----");
		for(int i=0;i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		System.out.println("복사본배열-----");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		System.out.println();
		System.out.println("원본 주소값: "+origin);
		System.out.println("복사본 주소값: "+copy);
		
	}
	
	public void method3() {
		//문자열배열 배우5명넣고
		//복사본만들고 원본 3번 인덱스에 새로운 배우 이름 넣고
		//원본과 복사본 비교
		
		String[] s1= {"a","b","c","d","e"};
		String[] copy=new String[s1.length];
				
		for(int i=0;i<s1.length;i++) {
			copy[i]=s1[i];
		}
		s1[3]="f";
		for(int i=0;i<s1.length;i++) {			
			System.out.print(s1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<s1.length;i++) {
			System.out.print(copy[i]+" ");
		}
	}
	
	public void method4() {
		//System.arraycopy()메소드 사용
		//새로운 배열을 생성후 System.arraycopy()메소드를 호출
		//각 위치에 들어갈 값들을 넣어 만들어준다
		
		int[]origin=new int[] {1,2,3,4,5};
		int[] copy=new int[10];
		
//		[표현법]System.arraycopy(원본배열이름,원본배열에서 복사를 시작할 인덱스,
//								복사본 배열 이름,복사본 배열에서 복사될 시작 인덱스,
//								복사 개수);
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		
		//원하는 위치와 개수를 지정할 수 있지만 배열의 범위를 벗어나지 않도록 주의해야한다.
		System.arraycopy(origin, 2, copy, 5, origin.length-2);

		for(int i=0; i<copy.length; i++){
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		System.out.println(origin);
		System.out.println(copy);
	
	}

}
















