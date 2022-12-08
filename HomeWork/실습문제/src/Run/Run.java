package Run;

import java.util.*;

import 실습문제.실습문제1;
import 실습문제.실습문제2;
import 실습문제.실습문제3;
import 실습문제.실습문제4;
import 실습문제.실습문제5;
import 실습문제.실습문제6;
import 실습문제.실습문제7;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		실습문제1 a = new 실습문제1();
		실습문제2 b= new 실습문제2();
		실습문제3 c= new 실습문제3();
		실습문제4 d= new 실습문제4();
		실습문제5 e= new 실습문제5();
		실습문제6 f= new 실습문제6();
		
		
//		a.input4();
//		b.solve11();
//		c.method1();
//		d.method12();
//		e.method13();
//		f.method5();
		
//		실습문제7 g1=new 실습문제7();
//		
//		실습문제7 g2=new 실습문제7(100,"홍길동");
//		System.out.println(g2.info());
//		
//		실습문제7 g3=new 실습문제7(100,"홍길동","영업부","과장",25,
//				'남',2500000,0.05,"010-1234-5678","서울시 강남구");
//		System.out.println(g3.info2());
		
		
//		실습문제7 g4=new 실습문제7();
//		실습문제7 g5=new 실습문제7();
//		실습문제7 g6=new 실습문제7();
//		
//		g4.setId("tester");
//		g4.setPw("test1234");
//		g4.setAuthority("운영자");
//		g4.setPoint(sc.nextInt());
//
//		g5.setId("admin");
//		g5.setPw("admin1234");
//		g5.setAuthority("운영자");
//		g5.setPoint(sc.nextInt());
//		
//		g6.setId("user");
//		g6.setPw("user1234");
//		g6.setAuthority("");
//		g6.setPoint(sc.nextInt());
//		
//		g4.info();
//		g5.info();
//		g6.info();
		
	
		실습문제7 g7=new 실습문제7();
		실습문제7 g8=new 실습문제7();
		실습문제7 g9=new 실습문제7();
		실습문제7 g10=new 실습문제7();
		
		System.out.println("기종,통신사,가격\n약정기간을 입력하세요."
				+ "\n기종 입력:");
				
		g7.setName(sc.nextLine());
		System.out.println("통신사 입력:");
		g7.setTelecom(sc.nextLine());
		g7.setPrice(sc.nextInt());
		g7.setPeriod(sc.nextInt());
		
		g7.info();
		
		System.out.println("기종,통신사,가격\n약정기간을 입력하세요."
				+ "\n기종 입력:"+sc.nextLine());
		
		g8.setName(sc.nextLine());
		System.out.println("통신사 입력:");
		g8.setTelecom(sc.nextLine());
		g8.setPrice(sc.nextInt());
		g8.setPeriod(sc.nextInt());

		g8.info();
		
		System.out.println("기종,통신사,가격\n약정기간을 입력하세요."
				+ "\n기종 입력:"+sc.nextLine());
		
		g9.setName(sc.nextLine());
		System.out.println("통신사 입력:");
		g9.setTelecom(sc.nextLine());
		g9.setPrice(sc.nextInt());
		g9.setPeriod(sc.nextInt());

		g9.info();
		
		System.out.println("기종,통신사,가격\n약정기간을 입력하세요."
				+ "\n기종 입력:"+sc.nextLine());
		
		g10.setName(sc.nextLine());
		System.out.println("통신사 입력:");
		g10.setTelecom(sc.nextLine());
		g10.setPrice(sc.nextInt());
		g10.setPeriod(sc.nextInt());
		
		g10.info();
		
	}//main
}//class




















