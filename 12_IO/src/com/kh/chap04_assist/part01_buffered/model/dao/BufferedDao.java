package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//BufferedReader / BufferedWriter
	//버퍼 공간을 제공해서 한번에 모아서 한번에 보내는 입출력
	//속도 향상 목적의 보조 스트림
	//[표현법]
	//보조스트림클래스이름 객체명= new 보조스트림클래스이름(기반스트림객체);
	//-보조스트림은 단독으로 존재 x
	
	//프로그램->파일
	//출력
	public void saveFile() {
		//BufferedWriter : 버퍼공간을 제공하여 한꺼번에 출력을 진행하겠다.
		FileWriter fw = null;
		BufferedWriter bw = null;
		//기반스트림이 Input/Output 계열일 경우 보조스트림도 Input/Output 계열
		//기반스트림이 Reader/Writer계열이면 보조 스트림도 Reader/Writer 계열
		

		try {
			//기반스트림 생성 - 연결통로를 먼저 생성하고
			fw = new FileWriter("c_buffered.txt");
			//보조스트림 생성(보조스트림 생성자 매개변수로 기반스트림 객체 넣어주기)
			bw = new BufferedWriter(fw);
			
			//파일에 출력하기
			bw.write("안녕하세요");
			bw.newLine();//개행(줄바꿈)
			bw.write("오늘 수업 너무 알차다");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close(); //자원반납시에는 생성의 역순으로 반납
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void readFile() throws Exception {
		//기반스트림: FileReader / 보조스트림: BufferedReader
		//읽어오는 메소드 readLine()
		//반복문을 통해 전부 읽어오기
//		FileReader fr = new FileReader("c_buffered.txt");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String st="";
//		while((st=br.readLine())!=null) {
//			System.out.println(st);
//		}
//		br.close();
//		fr.close();
		
		//try-resource 구문:기반스트림 생성과 보조스트림 생성구문을 작성하여 구문이 완료된 후 
		//					자원반납까지 자동으로 이루어짐
		try {BufferedReader bf 
			= new BufferedReader(new FileReader("c_buffered.txt"));
			String value=null;
			while((value=bf.readLine())!=null) {
				System.out.println(value);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}




























