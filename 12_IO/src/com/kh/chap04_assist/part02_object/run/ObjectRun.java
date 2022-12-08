package com.kh.chap04_assist.part02_object.run;

import java.util.Scanner;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;

public class ObjectRun {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectDao od = new ObjectDao();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("파일 경로를 입력해주세요");
//		String fileName=sc.nextLine();
//		od.saveFile(fileName);
		od.readFile();
	}

}
