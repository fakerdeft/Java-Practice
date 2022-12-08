package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun {

	public static void main(String[] args) {

		//Properties: Map 계열 -> Key + Value 세트로 저장
		//특징: 제네릭타입 모두 String 타입으로 저장한다.
		//[표현법] Properties prop= new Properties();
		
		Properties prop = new Properties();
		
		prop.put("홈런볼", new Snack("초코맛",2000));
		
		System.out.println(prop);
		System.out.println(prop.get("홈런볼"));
		
		//Map계열이기 때문에 put메소드를 이용해서
		//키+밸류의 형태로 저장되고 String 타입이 아니여도 잘 들어간다.
		
		/*
		 * Properties의 용도-> 파일 입출력을 하기 위함
		 * key + value 세트들을 파일로 기록한다거나
		 * 파일로부터 읽어오는 용도로 많이 사용된다.
		 * - .properties 파일 확장자를 가진다.
		 * 자주 변경되지 않는 설정파일이나 해당 프로그램이 기본적으로 가져야할 설정 정보들을 담는 파일이다.
		 */
		
		//String,String 형태로 담아보자
		/*
		prop.put("List", "ArrayList");
		prop.put("Set","HashSet");
		prop.put("Map","HashMap");
		
		System.out.println(prop);
		prop.put("Map","HashTable"); //기존 키값에 밸류가 덮어씌워진다.
		System.out.println(prop);
		*/
		
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);
		prop.setProperty("List", "Vector");
		System.out.println(prop);
		
		
		Properties inputProp = new Properties();
		
		try {
			//파일 출력
			prop.store(new FileOutputStream("test.properties")
					, "Properties Test");
			//store()메소드: 파일로 기록할때 쓰이는 메소드
			//key=value형태로 파일에 출력된다.
			
			//파일 입력
			System.out.println("파일에게 입력받은 내용:");
			inputProp.load(new FileInputStream("test.properties"));
			//load()메소드: 파일로부터 데이터를 읽어오는 메소드
			
			System.out.println(inputProp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}


































