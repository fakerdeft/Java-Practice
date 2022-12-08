package 실습문제;

import java.util.Scanner;
public class 실습문제3 {

	public Scanner sc=new Scanner(System.in);
	
////////////////////////////////////////////////////////////////////////	
	public void method1() {// 실습문제1
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");//메뉴
		
		System.out.println("메뉴 번호 입력:");
		int n=sc.nextInt();//메뉴 번호 입력
		
		switch(n) {
		
		case 1: // 1 입력
			System.out.println("입력 메뉴입니다.");
			break;
			
		case 2: // 2 입력
			System.out.println("수정 메뉴입니다.");
			break;
			
		case 3: // 3 입력
			System.out.println("조회 메뉴입니다.");
			break;
			
		case 4: // 4 입력
			System.out.println("삭제 메뉴입니다.");
			break;
			
		case 7: // 7 입력
			System.out.println("종료 메뉴입니다.");
		}
		
	}
////////////////////////////////////////////////////////////////////////
	public void method2() {// 실습문제2
		System.out.println("정수 입력:");
		int n=sc.nextInt(); // 정수 입력
		
		if(n>0) {// 양의 정수인 경우
			System.out.println("양의 정수");
			if(n%2==0){// 양의 정수이면서 짝수인 경우
				System.out.println("짝수");
			}
			else {// 홀수인 경우
				System.out.println("홀수");
			}
		}
		else {// 양의 정수 아닌 경우
			System.out.println("양의 정수만 입력하세요.");
		}
		
		
	}
////////////////////////////////////////////////////////////////////////
	public void method3() {// 실습문제3
		System.out.println("국, 영, 수 순서대로 입력하세요");
		int n1=sc.nextInt();//국어
		sc.nextLine();
		int n2=sc.nextInt();//영어
		sc.nextLine();
		int n3=sc.nextInt();//수학
		sc.nextLine();
		
		int r1=n1+n2+n3; //합계
		int r2=r1/3; //평균
		
		System.out.printf("국어: %d\n영어: %d\n수학: %d\n",
				n1,n2,n3); // 국영수 점수 출력
		
		if((n1>=40)&&(n2>=40)&&(n3>=40)&&(r2>=60))//국영수40이상,평균60이상
		{
			System.out.printf("합계: %d\n평균: %d\n"
					+ "축하합니다, 합격입니다!",r1,r2);
		}
		else {//국영수 40이상 or 평균 60이상 중 하나라도 아닌 경우
			System.out.println("불합격입니다.");
		}

		
	}
////////////////////////////////////////////////////////////////////////	
	public void method4() {// 실습문제4
		System.out.println("1~12사이의 정수 입력:");
		int n=sc.nextInt(); // 1~12 정수 입력
		
		switch(n) {

			
		case 3: // 3 입력
		case 4: // 4 입력
		case 5: // 5 입력
			System.out.println(n+"월은 봄입니다.");
			break;
			
		case 6: // 6 입력
		case 7: // 7 입력
		case 8: // 8 입력
			System.out.println(n+"월은 여름입니다.");
			break;
			
		case 9:	// 9 입력
		case 10:// 10 입력			
		case 11:// 11 입력
			System.out.println(n+"월은 가을입니다.");
			break;
			
		case 12: // 12 입력
		case 1: // 1 입력
		case 2: // 2 입력
			System.out.println(n+"월은 겨울입니다.");
			break;
		
		default: // 1~12 가 아닌 수 입력
			System.out.println(n+"월은 잘못 입력하셨습니다.");
		}
	}
////////////////////////////////////////////////////////////////////////	
	public void method5() {// 실습문제5
		
		//////회원가입 정보/////
		String id2="id12";//
		String pw2="pw12";//
		////////////////////
		
		System.out.println("아이디:");
		String id=sc.nextLine();//id입력
		System.out.println("비밀번호:");
		String pw=sc.nextLine();//pw입력
		
		if(id.equals(id2)) {//id 일치하는 경우
			if(pw.equals(pw2)) {//pw도 일치하는 경우
				System.out.println("로그인 성공");
			}
			else {//pw는 틀린 경우
				System.out.println("비밀번호를 틀렸습니다.");
			}
		}
		else if (pw.equals(pw2)) {//pw 일치하는 경우
			System.out.println("아이디를 틀렸습니다.");
		}
		else {//id,pw 둘 다 일치하지 않는 경우
			System.out.println("아이디/패스워드 모두 틀렸습니다.");
		}
		
	}
////////////////////////////////////////////////////////////////////////	
	public void method6() {// 실습문제6
		System.out.println("관리자, 회원, 비회원 중 하나를 입력:");
		String s=sc.nextLine();//관,회,비 중 하나 입력
		
		//회원 등급 출력
		System.out.printf("권한을 확인하고자 하는 \n회원 등급: %s\n",s);
		
		switch(s) {
		
		case "관리자": // 관리자 경우
			System.out.println("회원관리\n게시글 관리\n게시글 작성\n"
					+ "댓글 작성 게시글 조회");
			break;
		
		case "회원": // 회원인 경우
			System.out.println("게시글 작성\n게시글 조회\n댓글 작성");
			break;
		
		case "비회원": // 비회원인 경우
			System.out.println("게시글 조회");
		}
	}
////////////////////////////////////////////////////////////////////////	
	public void method7() {// 실습문제7
		System.out.println("키(m), 몸무게(kg) 입력:");
		double f1=sc.nextDouble(); // 키 입력
		sc.nextLine();
		double f2=sc.nextDouble(); // 몸무게 입력
		double bmi=f2/(f1*f1); // BMI 계산
		
		System.out.printf("키: %.2fm\n몸무게: %.2fkg\n"
				+ "BMI 지수: %f\n",
				f1,f2,bmi); // 키,몸무게,BMI지수 출력
		
		if(bmi<30) {//BMI30미만인 경우
			if(bmi>=18.5) {//18.5이상인 경우
				if(bmi>=23) {//23이상인 경우
					if(bmi>=25) {//25이상인 경우
						System.out.println("비만");
					}
					else {//25미만인 경우
						System.out.println("과체중");
					}
				}
				else {//23미만인 경우
					System.out.println("정상 체중");
				}
			}
			else {//18.5미만인 경우
				System.out.println("저체중");
			}
		}
		else {//30이상인 경우
			System.out.println("고도 비만");
		}
		
	}
////////////////////////////////////////////////////////////////////////	
	public void method8() {// 실습문제8
		System.out.println("두 개의 양의 정수, 연산자 입력:");
		int n1=sc.nextInt();// 첫 번째 정수 입력
		sc.nextLine();
		int n2=sc.nextInt();// 두 번째 정수 입력
		sc.nextLine();
		String c=sc.nextLine();// 연산자 입력
		
		int r1=n1+n2;// 두 정수의 합
		int r2=n1-n2;// 두 정수의 차
		int r3=n1*n2;// 두 정수의 곱
		double r4=n1/n2;// 두 정수 나누기
		
		System.out.printf("피연산자1: %d\n피연산자2: %d\n"
				+ "연산자(+,-,*,/): %s\n",n1,n2,c);// 두 정수,연산자 출력
		
		switch(c) {
		
		case "+": // +인 경우
			System.out.printf("%d + %d = %d",n1,n2,r1);
			break;
			
		case"-": // -인 경우
			System.out.printf("%d - %d = %d",n1,n2,r2);
			break;
			
		case"*": // *인 경우
			System.out.printf("%d * %d = %d",n1,n2,r3);
			break;
			
		case"/": // /인 경우
			System.out.printf("%d / %d = %f",n1,n2,r4);
			break;
		
		default:// 다른 문자인 경우
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}
////////////////////////////////////////////////////////////////////////	
	public void method9() {// 실습문제9
		System.out.println("중간고사, 기말고사\n과제점수, 출석횟수 입력:");
		int n1=sc.nextInt();//중간고사점수
		sc.nextLine();
		int n2=sc.nextInt();//기말고사점수
		sc.nextLine();
		int n3=sc.nextInt();//과제점수
		sc.nextLine();
		double n4=sc.nextDouble();//출석횟수
		sc.nextLine();
		int t=20; //전체 출석 횟수
		
		double f=(((n4/t)*100)*0.2); //출석 비율
		
		double f1=(n1*0.2)+(n2*0.3)+(n3*0.3)+f; //총점 
		
		System.out.printf("입력된 점수\n중간: %d\n기말: %d\n"
				+ "과제 점수: %d\n출석 횟수: %.0f (필수 출석 최소 15회)\n",n1,n2,n3,n4);
		
		System.out.println("=======결과=======");
		
		System.out.printf("중간(20): %.1f\n기말(30): %.1f\n"
				+ "과제 점수(30): %.1f\n출석 점수(20): %.1f\n"
				+ "총점: %.1f\n",(n1*0.2),(n2*0.3)
				,(n3*0.3),f,f1);
		
		if(f1<70||(n4*5)<=70) {//70점미만or결석30%이상
			if((n4*5)<=70) {//70점 미만인 경우
				System.out.printf("FAIl  [출석 횟수 부족(%.0f/%d)]\n\t★필수 출석 최소 15회★",n4,t);			
			}
			else {//70점이상이지만 결석30%이상인 경우
				
				System.out.printf("FAIL [점수 미달(%.1f/70)]",f1);
				}	
			}
		else {//70점이상이고 출석70%이상인 경우
			System.out.println("PASS");
		}
	}
	

}