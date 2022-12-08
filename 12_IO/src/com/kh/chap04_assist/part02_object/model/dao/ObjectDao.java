package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	//출력
	
	public void saveFile(String fileName) {
		Phone p = new Phone("아이폰12","apple",1500000);
		
		//ObjectOutputStream: 객체 단위를 파일에 출력하고자 할 때 필요한 보조스트림
		
		/*
		 * 1.기반스트림 생성
		 * 2.보조스트림 생성
		 * 3.파일출력
		 * 4.자원반납
		 * 
		 */
		
		//1,2단계 완료
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			oos.writeObject(p);//파일에 출력
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}//saveFile
	
	//입력
	
	public void readFile() throws Exception{
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		fis = new FileInputStream("oos.txt");
		ois = new ObjectInputStream(fis);
		
		Phone p = (Phone)ois.readObject();
		System.out.println(p);
		
		ois.close();
		fis.close();
		
	}//readFile

}














































