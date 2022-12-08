package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	//프로그램 -> 외부매체(파일)
	//출력
	
	public void saveFile() {
		
		//FileWriter: 파일로 데이터를 2byte 단위로 출력하는 스트림
		FileWriter fw = null;
		
		try {
			//FileWriter: 파일로 데이터를 2byte 단위로 출력하는 스트림
			fw = new FileWriter("b_char.txt");//객체 생성-파일과 연결된 통로를 만들겠다.
			//파일에 문자 출력해보기
			fw.write("아 너무 재밌다 IO");
			
			fw.write('A');
			
			char[] arr= {'a','p','p','l','e'};
			
			fw.write(arr);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}//saveFile()
	
	
	public void readFile() throws IOException {
		//FileReader: 2byte단위로 파일에서 데이터를 읽어오는 스트림
		FileReader fr = null;
		try {
			 fr = new FileReader("b_char.txt");
			
			int value=0;
			while((value=fr.read())!=-1) {
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		fr.close();

		
	}//readFile()


}//class FileCharDao





