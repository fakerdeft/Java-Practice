package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedDao bfd = new BufferedDao();
		bfd.saveFile();
		
		bfd.readFile();
	}

}
