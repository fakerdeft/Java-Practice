package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {
	

	public static void main(String[] args) {
		
		// .xml
		//다양한 프로그래밍 언어들과 호환성이 좋다
		
		Properties prop = new Properties();
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("Set"));
		
		
		Properties inputProp = new Properties();
		try {
			//XML로 파일 출력하기
			prop.storeToXML(new FileOutputStream("text.xml"), "XML TEST");
		
			//XML파일 읽어오기 
			inputProp.loadFromXML(new FileInputStream("test.xml"));
			
			System.out.println(inputProp);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

















