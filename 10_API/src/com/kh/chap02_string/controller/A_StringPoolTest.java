package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	//String클래스 ->불변클래스 (변하지 않는 클래스)
	//수정하는 순간 기존의 값이 담겨있던 공간이 아닌 새 공간에 생김
	
	//String 클래스 형태의 객체 생성 방법
	//1.new 키워드로 생성자 호출
	//2.대입연산자를 통해서 직접 리터럴을 넣어 생성
	
	//1.생성자를 통해 문자열 담기
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		Test t = new Test();
		Test t2 =t;
		Test t3 = new Test();
		//toString()메소드
		System.out.println(t);
		System.out.println(str1/*.toString()*/);
		System.out.println(str2);
		//1.String클래스의 toString() 메소드는 
		//주소값이 아니라 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있음 
		
		//equals() 메소드
		System.out.println(str1.equals(str2));//true 문자열 내용을 비교한다.
		//String 클래스에서 equals 메소드는 주소값 비교가 아니라 문자열 비교로 오버라이딩 되어있다.
		System.out.println(t.equals(t2));
		
		//hashCode()메소드
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String 클래스에서 hashCode()메소드는 주소값 기반이 아닌 
		//문자열 기반으로 해시화 한 문자를 보여주도록 오버라이딩 되어있음 
		
		System.out.println(t.hashCode());
		System.out.println(t3.hashCode());
		
		//String클래스에서 주소값을 알고싶다면 
		//System.identityHashCode(참조변수명);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//실제주소값의 해시코드를 보여준다 
		System.out.println(str1==str2); // false 왜냐면 주소값을 비교하니까 다르다.
	}
	
	//2.문자열을 리터럴로 생성
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = "world";
		String str5 = "world";
		String str6 = new String("world");
		String str7 = new String("world");
		
		//toString() 메소드
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		//equals() 메소드
		System.out.println(str1.equals(str2)); //true
		
		//hashCode() 메소드
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//System.identityHashCode()메소드
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
		System.out.println(System.identityHashCode(str7));
		//==연산자로 주소값 비교 
		System.out.println(str1==str2);
	}
	
	//불변클래스와 String pool
	public void method3() {
		//리터럴 제시 
		String str = "hello";
		//문자열 리터럴로 대입하면 String pool영역에 올라감.
		//String pool 영역 특징 : 같은 문자열은 존재할 수 없음 
		
		String str2 = "hello";
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		
		str =str+"bye";
		System.out.println(System.identityHashCode(str));
		str+="hi";
		System.out.println(System.identityHashCode(str));
		//String 클래스는 불변 클래스이기 때문에 
		//값의 수정이 일어난다면 새로운 영역에 할당된다 
	}
	
	public void method4() {
		//문자열을 여러번 더하면 어떻게 될까
		
		String str="안녕";
		//여러번 더해보기
		
		//시간 측정하기
		//1970년 1월1일 부터 지금까지 얼마나 흘렀는지 알려주는 메소드 0.001초단위로
		long start = System.currentTimeMillis(); //-이 시점 기록
		System.out.println(start);
		for(int i=0; i<100000; i++) {
			str+="안녕못해";
			System.out.println(System.identityHashCode(str));
			System.out.println();
		}
		long finish = System.currentTimeMillis();// - 이 시점 기록 
		
		System.out.println("시작 시간 "+start);
		System.out.println("끝난 시간 "+finish);
		
		System.out.println("걸린 시간"+(finish-start)); //얼마나 걸렸는지 확인 
		//만번 - 166 //5만번 - 2382 //10만번 - 8906 
	}
	
	public void method5() {
		//문자열의 단점
		//불변클래스이기 때문에 합성이 느리다(새 메모리 영역을 할당받아야하기 때문에)
		//그래서 가변클래스를 이용한다
		//StringBuffer/StringBuilder
		//차이점
		//StringBuffer는 동기화가 되어 순서가 있어 안전하지만 상대적으로 느리다.
		//StringBuilder는 동기화가 되지 않아 상대적으로 빠르지만 안전하지 않다.
		
//		StringBuilder sb = new StringBuilder(); //100만번 4초
		StringBuffer sb = new StringBuffer(); //100만번 4초
		
		long start = System.currentTimeMillis(); //-이 시점 기록
		System.out.println(start);
		for(int i=0; i<1000000; i++) {
			
			sb.append("안녕");
			
			System.out.println(System.identityHashCode(sb));
			System.out.println();
		}
		long finish = System.currentTimeMillis();// - 이 시점 기록 
		
		System.out.println("시작 시간 "+start);
		System.out.println("끝난 시간 "+finish);
		
		System.out.println("걸린 시간"+(finish-start)); //얼마나 걸렸는지 확인 
		
		
		
	}
	
	

}
