package 실습문제;

import java.util.Scanner;

public class 실습문제2 {

	public Scanner sc=new Scanner(System.in); // 스캐너
	
	public void solve1() {// 실습문제1
		System.out.println("정수 입력: ");
		int n=sc.nextInt(); //정수 입력
		String st=(n>0)?"양수입니다.":"양수가 아닙니다."; //양수 판단
		System.out.println(st);
	}
	
	public void solve2() {// 실습문제2
		System.out.println("정수 입력:");
		int n = sc.nextInt(); //정수 입력
		String st=(n>0)?"양수입니다.":((n==0)?"0입니다.":"음수입니다."); //양수,음수,0 판단
		System.out.println(st);
	}
	
	public void solve3() {// 실습문제3
		System.out.println("정수 입력:");
		int n =sc.nextInt(); //정수 입력
		String st=(n%2==0)?"짝수입니다":"홀수입니다"; // 홀짝 판단
		System.out.println(st);
	}
	
	public void solve4() {// 실습문제4
		System.out.println("인원 수 입력:");
		int n1=sc.nextInt(); //인원 수 입력
		sc.nextLine();
		System.out.println("사탕 수 입력:");
		int n2=sc.nextInt(); //사탕 수 입력
		sc.nextLine();
		System.out.printf("1인당 사탕 개수: %d\n남는 사탕 개수: %d",
					n2/n1,n2%n1); 
	}
	
	public void solve5() {// 실습문제5
		System.out.println("이름,학년,반,번호,성별,성적을\n순서대로 입력하세요.");
		String name=sc.nextLine(); // 이름 입력
		int n1=sc.nextInt(); // 학년 입력
		sc.nextLine();
		int n2=sc.nextInt(); // 반 입력
		sc.nextLine();
		int n3=sc.nextInt(); // 번호 입력
		sc.nextLine();
		String gender=sc.nextLine(); // 성별 입력
		String rst=(gender.equals("M"))?"남학생":"여학생"; // 성별 판단
		double d1=sc.nextDouble(); // 성적 입력
		
		System.out.printf("%d학년 %d반 %d번 %s %s의\n성적은 %.2f이다.",
						n1,n2,n3,name,rst,d1);	
	}
	
	public void solve6() {// 실습문제6
		System.out.println("나이 입력:");
		int n=sc.nextInt(); // 나이 입력
		String st=(n<=13)?"어린이":((n>13)&&(n<=19)?"청소년":"성인");// 나이 판단
		System.out.println(st);
	}
	
	public void solve7() {// 실습문제7
		System.out.println("국어,영어,수학을\n순서대로 입력하세요(정수)");
		int n1=sc.nextInt(); //국어
		sc.nextLine();
		int n2=sc.nextInt(); //영어
		sc.nextLine();
		int n3=sc.nextInt(); //수학
		
		int r1=n1+n2+n3; //합계
		int r2=(n1+n2+n3)/3; //평균
		System.out.printf("합계: %d\n평균: %d\n",r1,r2);
		String st=((r1>=40)&&(r2>=60))?"합격":"불합격"; //합불판단
		System.out.println(st);
	}
	
	public void solve8() {// 실습문제8
		System.out.println("주민번호를 입력하세요(-포함):");
		char n=sc.nextLine().charAt(7); //주민번호 뒷자리 첫 번째 수
		String st=(n=='1')?"남자":"여자"; //성별 판단
		System.out.println(st);
	}
	
	public void solve9() {// 실습문제9
		System.out.println("정수를 두 개 입력하세요(n1<n2):");
		int n1=sc.nextInt(); //정수 입력
		sc.nextLine();
		int n2=sc.nextInt(); //정수 입력
		sc.nextLine();
		System.out.println("정수 한 개 더 입력하세요");
		int n3=sc.nextInt(); //정수 입력
		String st=((n3<=n1)||(n3>n2))?"True":"False"; //참거짓 판단
		System.out.println(st);
	}
	
	public void solve10() {// 실습문제10
		System.out.println("3개의 수를 입력하세요");
		int n1=sc.nextInt(); //정수 입력
		sc.nextLine();
		int n2=sc.nextInt(); //정수 입력
		sc.nextLine();
		int n3=sc.nextInt(); //정수 입력
		sc.nextLine();
		System.out.printf("입력1: %d\n입력2: %d\n입력3: %d\n",n1,n2,n3);
		String st=((n1==n2)&&(n2==n3))?"True":"False"; //3개의 수 동일한지 판단
		System.out.println(st);
	}
	
	public void solve11() {// 실습문제11
		System.out.println("A,B,C사원의 연봉을\n순서대로 입력하세요.");
		int n1=sc.nextInt(); //A사원 연봉
		sc.nextLine();
		int n2=sc.nextInt(); //B사원 연봉
		sc.nextLine();
		int n3=sc.nextInt(); //C사원 연봉
		sc.nextLine();

		double d1=n1+(n1*0.4), d2=n2, d3=n3+(n3*0.15); //인센티브 계산
		
		String st1=(d1>=3000)?"3000만원 이상":"3000만원 미만"; //A판단
		String st2=(d2>=3000)?"3000만원 이상":"3000만원 미만"; //B판단
		String st3=(d3>=3000)?"3000만원 이상":"3000만원 미만"; //C판단

		System.out.printf("A사원의 연봉/연봉+a: %d/%.1f\n%s\n"
				+ "B사원의 연봉/연봉+a: %d/%.1f\n%s\n"
				+ "C사원의 연봉/연봉+a: %d/%.1f\n%s",
					n1,d1,st1,n2,d2,st2,n3,d3,st3);
	}
	
}
