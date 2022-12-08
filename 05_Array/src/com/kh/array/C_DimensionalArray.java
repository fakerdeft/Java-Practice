package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {
	public void method1() {

		//이차원 배열의 선언
		int[][] arrD1;
		int arrD2[][];
		int[] arrD3[];
		
		//이차원 배열의 할당
		arrD1= new int[3][3];

		//이차원 배열 - 선언 및 할당
		int[][] arrD=new int[5][10];
		int[][] arrD4= {{1,2,3},{3,2,1},{5,5,5,5}};
		
		System.out.println(arrD4);
		System.out.println(arrD4[0]);
		System.out.println(arrD4[1]);
		System.out.println(arrD4[2]);
		
		System.out.println("값에 접근하고 싶다면");
		System.out.println(arrD4[0][0]);
		System.out.println(arrD4[2][1]);
		System.out.println(arrD4[1][0]);
		
		//행에 대한 길이를 알 수 있는 length
		System.out.println(arrD.length);
		//[0]행에 있는 열에 대한 length
		System.out.println(arrD[0].length);
		
		for(int i=0;i<arrD4.length;i++) {
			System.out.println(i+"행에 대한 열의 길이"+arrD4[i].length);
		}
		
		//행 접근
		for(int i=0;i<arrD4.length;i++) {
			//각 행에 담긴 배열 열을 하나씩 접근하는 반복문
			for(int j=0;j<arrD4[i].length;j++) {
				System.out.print(arrD4[i][j]+" ");
			}
			System.out.println();			
		}
		
	}
	
	public void method2(){
		//3행 5열의 이차원 배열을 생성하여
		//각각 인덱스에 1~15까지 순차적으로 값을 넣고
		//출력해보세요.
//		int[][] a= {{1,2,3,4,5},{4,5,6,7,8},{9,8,7,6,5}};
//		
////		for(int i=0;i<a.length;i++) {
////			for(int j=0;j<a[i].length;j++) {
////				System.out.print(a[i][j]);
////			}
////			System.out.println();
////		}
		
		int [][] a=new int[3][5];
		int n=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=n++;
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println((i+1)+"행"+(j+1)+"열 "+a[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void method3() {//가변 배열
		/*
		 * 가변배열
		 * 행의 크기는 정해져 있으나 각각 행별 열의 크기는 정해지지 않은 상태
		 * 이차원 배열==일차원 배열의 묶음
		 * 일차원 배열들이 전부 같은 크기일 필요x - 가변배열
		 * 위에서 했던{{1,2},{3,3,4},{5,5,5,5}}와 같이 각각 크기가 달라도 가능
		 * 행의 크기는 정해져야함. 열의 크기는 생략 가능
		 *
		 */
		//기존에 했던 방식-각 행별로 열의 크기가 똑같이 고정되어있음
		int[][] arr=new int[3][5];
		
		//행의 크기는 정해야 하고 열의 크기는 필요 없음
		int[][] arr2=new int[3][];
		
		//null 아무것도 참조x
		System.out.println(arr2[0]);
		
		arr2[0]=new int[5];
		arr2[1]=new int[10];
		arr2[2]=new int[2];
		
		System.out.println(arr2[0]);
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j]=5;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		//3행 가변배열 생성하고 사용자에게 각 행별 열의 크기를 입력받아
		//생성하시오
		Scanner sc=new Scanner(System.in);

		int[][] a=new int[3][];
		
		for(int i=0;i<a.length;i++) {

				System.out.println("원하는 열 입력");
				int n=sc.nextInt();
				a[i]=new int[n];
			
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=1;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
}
































