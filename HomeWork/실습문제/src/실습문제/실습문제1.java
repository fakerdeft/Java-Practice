package 실습문제;

import java.util.Scanner;

public class 실습문제1 {
	
	public void input1() { // 실습문제 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 성별, 나이, 키를 \n순서대로 입력하세요.");
		
		String name = sc.nextLine(); // 문자형 이름 입력
		String gender = sc.nextLine(); // 문자형 성별 입력
		int age = sc.nextInt(); // 정수형 나이 입력
		sc.nextLine();
		double height = sc.nextDouble(); // 실수형 키 입력
		sc.nextLine();
		
		System.out.printf("이름: %s\n성별: %S\n나이: %d\n키: %.1f\n",
				name,gender,age,height);
		
		System.out.printf("키 %.1fcm인 %s님\n반갑습니다^^\n",height,name);
		
	}
	
	public void input2() { // 실습문제 2
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n첫 번째 정수:");
		int n1= sc.nextInt(); // 정수형 첫 번째 정수 입력
		sc.nextLine();
		
		System.out.println("두 번째 정수:");
		int	n2=sc.nextInt(); // 정수형 두 번째 정수 입력
		sc.nextLine();
		
		int add=n1+n2,m=n1-n2,ast=n1*n2,dv=n1/n2; // 덧셈,뺄셈,곱셈,나눗셈
		
		System.out.printf("더하기 결과: %d\n",add);
		System.out.printf("빼기 결과: %d\n",m);
		System.out.printf("곱하기 결과: %d\n",ast);
		System.out.printf("나누기 몫 결과: %d\n",dv);
	}
	
	public void input3() { // 실습문제 3
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n가로:");
		double a=sc.nextDouble(); // 실수형 가로 입력
		sc.nextLine();
		
		System.out.println("세로:");
		double b=sc.nextDouble(); // 실수형 세로 입력
		sc.nextLine();
		
		double abab= a*b; // 사각형 면적:가로x세로
		double aabb= 2*(a+b); // 사각형 둘레:2x(가로+세로)
		
		System.out.printf("면적: %.2f\n둘레: %.2f\n",abab,aabb);
		
		}
	
	public void input4() { // 실습문제4
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n문자열을 입력해주세요: ");
		
		String str=sc.nextLine(); // 문자열 입력

		System.out.printf("첫 번째 문자: %s\n두 번째 문자: %s\n세 번째 문자: %s",
				str.charAt(0),str.charAt(1),str.charAt(2));
		
	}

}