package com.kh.chap03_char.run;

import java.io.IOException;

import com.kh.chap03_char.model.dao.FileCharDao;

public class CharRun {

	public static void main(String[] args) throws Exception {
		
		FileCharDao fcd = new FileCharDao();
		fcd.saveFile();
		
		fcd.readFile();

	}

}
