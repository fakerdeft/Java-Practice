package 실습문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class 실습문제6 {
	public Scanner sc=new Scanner(System.in);
//////////////////////////////////////////////////////////////////////
	public void method1() {//실습문제1
		String[][] s=new String[3][3];//3행3열 선언 및 할당
		
		for(int i=0;i<s.length;i++){//1~3행
			for(int j=0;j<s.length;j++) {//1~3열
				s[i][j]="("+i+","+j+")"; //(i,j)형식으로 저장
				System.out.println(s[i][j]);//출력
			}
			System.out.println();//개행
		}

	}
//////////////////////////////////////////////////////////////////////
	public void method2() {//실습문제2
		
		int[][] n=new int[4][4];//4행4열 선언 및 할당
		int n2=1;
		
		for(int i=0;i<n.length;i++){//행
			for(int j=0;j<n.length;j++) {//열
				n[i][j]=n2++; //1씩 증가
				System.out.print(n[i][j]+" ");//출력
			}
			System.out.println();
		}
		
	}
//////////////////////////////////////////////////////////////////////
	public void method3() {//실습문제3
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int t=a*b+1;
		
		int[][] n=new int[a][b];		
		
		for(int i=0;i<n.length;i++){
			for(int j=0;j<n.length;j++) {
				n[i][j]=(t)-1;
				System.out.print(n[i][j]+" ");
				t=n[i][j];
			}
			System.out.println();
		}
		
		
	}
//////////////////////////////////////////////////////////////////////
	public void method4() {//실습문제4
		
		Random r=new Random();
				
		while(true) {
			System.out.println("행 크기와 열 크기를\n입력하세요:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			if((a<1||a>10)||(b<1||b>10)) {
				System.out.println("반드시 1~10사이의 \n정수를 입력해야 합니다.\n");
				continue;
			}
			System.out.println("행 크기: "+a+"\n열 크기: "+b);
			
			String[][] c=new String[a][b];
			
			for(int i=0;i<c.length;i++){
				for(int j=0;j<c[i].length;j++) {
					char t=(char) (r.nextInt(25)+'A');
					c[i][j]=String.valueOf(t);
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			break;
		}

	}
//////////////////////////////////////////////////////////////////////
	public void method5() {//실습문제5
		int[][] n=new int[3][5];
		
		//성적 출력
		for(int i=0;i<n.length;i++){
			for(int j=0;j<n[i].length;j++) {
				n[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n.length;i++){
			System.out.println((i+1)+"반: "+Arrays.toString(n[i]));
		}
		
		//평균 출력
		System.out.println();
		
		int k=0,k1=0;
		
		for(int i=0;i<n.length;i++){
			for(int j=0;j<n[i].length;j++) {
				k+=n[i][j];
			}
			System.out.println((i+1)+"반의 평균: "+(k/5));
			k=0;
		}
		
		//72점인 학생의 전체석차
		System.out.println("\n72점인 학생의 전체석차: ");
		
			int count1=0;
			int count2=-1;
			
			for(int i=0;i<n.length;i++){
				for(int j=0;j<n[i].length;j++) {
					if(72>n[i][j]) {
						count1++;
					}
					else if(72==n[i][j]) {
						count2++;
					}
				}
			}
			
		System.out.println(15-count1-count2+"등");
		

	}
//////////////////////////////////////////////////////////////////////
	
}//class





















