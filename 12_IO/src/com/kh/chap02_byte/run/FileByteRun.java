package com.kh.chap02_byte.run;

import java.io.IOException;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class FileByteRun {

	public static void main(String[] args) throws IOException {
		
		FileByteDao fbd = new FileByteDao();
		
		fbd.saveFile();
		
		fbd.readFile();

		

	}

}
