

public class HelloWorld {
	
	static void test() { // test 메소드 
		System.out.println("ㅇㅇㅇ"); // ㅇㅇㅇ 출력 
	}
	
	
	static void test2() { // test2 메소드
		System.out.println("ㄴㄴㄴ"); // ㄴㄴㄴ출력
	}
	
	static int a=10; // 정수형 변수 a 데이터값:10
	
	public static void main (String[] args){ // 메인메소드: 프로젝트의 시작점
		
	
		System.out.println("Hello World!!"); // Hello World!! 출력
		System.out.println("Hello Java!!"); // Hello Java!! 출력
		HelloWorld.test(); // test 메소드 불러오기
		HelloWorld.test2(); // test2 메소드 불러오기
		System.out.println(a); // 10 출력
	}
}
