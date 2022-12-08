package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		/*
		 * 간단하게 파일을 만드는 과정
		 * File 클래스를 가지고 작업
		 * java.io 패키지에 존재
		 * 
		 */
		
		//파일 클래스 객체 생성
		//1.별도의 경로 지정을 하지 않고 파일명만 제시해서 생성 
		//-> 이 프로젝트 폴더 내에 파일 생성
		File file1 = new File("test.txt");
		
		try {
			file1.createNewFile();
			
		//2. 경로를 지정하고 생성 - 실제 존재하는 경로로 지정해야 한다.
		//D:/hoho/test.txt 경로로 만들고 싶음
//			File f2 = new File("D:/hoho/test.txt");
//			f2.createNewFile();
			
		//3. 폴더를 생성하고 그 안에 파일을 생성하기
		File hoho = new File("D:/hoho");
		hoho.mkdir(); //makedirectory - 폴더 생성 메소드
			
		File f3 = new File("D:/hoho/test.txt");
		f3.createNewFile();
			
		File mk = new File("mkmk");
		mk.mkdir();
			
		//File에서 제공하는 메소드들
		System.out.println("파일인지 아닌지 확인: "+file1.isFile());
		System.out.println("파일인지 아닌지 확인: "+hoho.isFile());
			
		System.out.println("파일 이름: "+file1.getName());//파일 명만 추출
		System.out.println("상위 폴더: "+f3.getParent());//상위 폴더명 추출
		System.out.println("파일 용량: "+f3.length());//파일 크기
		System.out.println("절대 경로: "+f3.getAbsolutePath());//시작부터 풀경로
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 프로그램상의 데이터를 외부매체(모니터, 스피커,"파일" 등)
		 * 입력장치(키보드, 마우스, 마이크, "파일", 등등) 로 입력받는 과정
		 * ->IO(Input&Output)
		 * 외부와의 입출력을 위해선 연결통로인 stream을 생성해야 한다.
		 * 
		 * 스트림(stream)의 특징
		 * -단방향: 입력이면 입력, 출력이면 출력 각 스트림이 따로 존재하기 때문에
		 * 		만약 입출력을 함께 진행하고자 한다면 하나의 스트림이 아닌 각각
		 * 		스트림을 이용하여 작업해야함.
		 * -FIFO(First In First Out): 먼저 전달한 값이 먼저 나오게 된다.
		 * 
		 * 스트림의 구분
		 * -통로의 사이즈
		 * 바이트 스트림: 1byte 짜리가 이동할 수 있을 정도로 좁은 통로
		 * -입력(xxxInputStream)/출력(xxxOutputStream)
		 * 문자 스트림: 2byte짜리가 이동할 수 있을 정도의 넓은 통로
		 * -입력(xxxReader)/출력(xxxWriter)
		 * 
		 * 외부 매체와의 직접적인 연결 여부
		 * 기반 스트림: 외부 매체와 직접적으로 연결되는 통로
		 * 보조 스트림: 기반 스트림 만으로 부족한 성능을 향상시켜주는 
		 * 			보조 용도의 스트림. 항상 기반스트림과 사용해야함.
		 * ex)속도향상,변환,객체단위 입출력 등등...
		 * 
		 */

	}

}





















