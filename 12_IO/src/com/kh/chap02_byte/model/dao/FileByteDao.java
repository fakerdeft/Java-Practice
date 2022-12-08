package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO (Data Access Object): 데이터가 보관되어 있는 공간을 직접 접근해서 데이터를 입출력하는 역할을 하는 클래스
//주로 model.dao 패키지에 모아놓는다.
public class FileByteDao {
	
	//바이트 스트림
	
	//프로그램에서 외부매체(파일)
	//출력: 프로그램 내의 데이터를 파일로 내보내기(기록)
	
	public void saveFile() throws IOException {
		//FileOutputStream: "파일"로 데이터를 출력하되 1byte 단위로 출력하겠다.
		//1.FileOutputStream 객체 생성
		//-해당 파일과 직접 연결되는 통로를 만들겠다.
		//해당 파일이 존재하지 않는 경우: 해당 파일이 생성되면서 통로도 연결
		//해당 파일이 존재하는 경우: 그냥 통로만 연결 - 옵션으로 지정가능
		//매개변수에 파일명, true/false 작성시 이어쓰기 옵션 설정 가능
		//true를 넣어주면 기존에 파일이 존재한다면 해당 파일에 데이터 뒤에 이어쓰기가 된다.
		//true 미작성시 기존에 파일에 있던 데이터가 사라지고 덮어쓰기 된다.
		
		//try안에서 선언하면 finally 구문에서 close를 할 수 없음 밖에서 선언하고 try 안에서 초기화하기
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream("a_byte.txt",true);
			
			//2.연결통로Stream으로 데이터를 출력해보자: write() 메소드 호출
			//1byte범위: -128~127까지의 숫자를 출력할 수 있다.
			//해당 숫자의 고유한 문자(아스키코드)가 기록된다.
			
			fos.write(65);
			fos.write(90);
			fos.write(100);
			
			byte[] arr= {66,77,88};
			
			fos.write(arr);
			
			fos.write(arr, 0, 1);//0번 인덱스부터 1개
			

			//한글은 2byte라서 깨져서 저장된다.
			//바이트스트림은 1byte씩만 가능하기 때문에 문자를 쓰고싶다면 문자 스트림을 사용하면 된다.
			
			//3.스트림을 다 사용했다면 꼭 반납해야 한다.
			fos.close();
			//-try문 안에 자원반납 메소드가 있을 때 만약 위에서 예외가 발생한다면
			//-자원반납 메소드까지 내려오지 않고 catch블럭으로 이동할 수 있기 때문에
			//-자원반납이 제대로 이루어지지 않을 수 있다. - finally 구문으로 해결!
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {//어떠한 예외가 발생하더라도 반드시 실행해야되는 구문을 작성하는 블럭
				  //마지막에 무조건 실행되는 구문
			
			fos.close();
		}
		
	}
	
	//프로그램 <---외부매체(파일)
	//입력: 파일로부터 데이터를 읽어오겠다.
	public void readFile() {
//		FileInputStream: 파일로부터 데이터를 가져오는데 1byte 단위로 가져오겠다
		
		FileInputStream fis= null;
		
		try {
			fis = new FileInputStream("a_byte.txt"); //객체 생성(스트림 열기)
			
			//데이터 입력받기 - read()메소드를 이용해서 1byte 단위로 읽어온다.
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			//파일의 끝을 만나는 순간 fis.read()를 호출하면 -1을 반환하여 끝을 알린다.
			//하나하나 찍어볼 수는 없으니 반복문 활용
			
			//-1을 만날때까지 반복
//			while(fis.read()!=-1) {//여기서 읽고
//				System.out.println(fis.read());//여기서도 읽고
//			}
			int value=0;
			//fis.read()를 호출하면 문자를 읽고 사라지기 때문에 
			//변수에 담아서 변수로 조건 비교 및 출력을 한다.
			while((value=fis.read())!=-1) {
				System.out.println(value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//다 쓴 자원 반납하기
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
	}
	

}



















