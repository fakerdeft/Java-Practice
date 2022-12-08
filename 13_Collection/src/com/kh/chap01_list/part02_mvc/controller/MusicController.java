package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {
	//필드부
	//곡 담아둘 리스트 생성(저장소)
	private ArrayList<Music> list = new ArrayList<>();
	
//	public int insertMusic(String artist, String title) {//곡 추가
//		//리스트에 추가하겠다(Music 객체를)
//		int count=0;
//		//add메소드는 성공 true 실패 false
//		if(list.add(new Music(artist,title))) {
//			count++;
//		
//		}
//		return count;
//		
//		
//	}
	
	public void insertMusic(String artist,String title){//곡 입력
		list.add(new Music(artist,title));
	}
	
	
	public ArrayList<Music> showMusicList(){//곡 전체 출력
		
		return list;
	}
		
	
	public ArrayList<Music> searchMusic(String keyword) {//곡 서칭
		//검색된 결과들을 담아 둘 저장소 생성
		ArrayList<Music> searched =new  ArrayList<>();//비어있는 저장소
		
//		//전달받은 keyword로 조회해보기
//		for(int i=0;i<list.size(); i++) {
//			//만약 제목에 내가 전달받은 keyword가 포함되어 있다면 새로 만든 저장소에 저장
//			if(list.get(i).getTitle().contains(keyword)) {
//				//문자열.contains("키워드")
//				searched.add(list.get(i));
//			}
//		}
		
		//향상된 for문
		for(Music m: list) {
			if(m.getTitle().contains(keyword)) {
				searched.add(m);
			}
		}
		
		return searched;
	}

	
	public int removeMusic(String title) {//곡 삭제
		
		int result = 0;
		
//		for(Music m: list) {
//			if(m.getTitle().equals(title)) {
//				list.remove(m);
//				result++;
//			}
//		}
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++)
				if(list.get(j).getTitle().equals(title)) {
					list.remove(list.get(j));
					result++;
			}
		}
		
		return result;
			
	}

	public int updateMusic(String title, String artist, String newTitle) {
		//전달된 제목 또는 가수가 null이면 하나만 수정
		//둘 다 값이 있으면 둘 다 수정하는 처리
		
		int result=0;
		
		//전체수정
		if(title!=null&&artist!=null) {
			
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getTitle().equals(title)) {
//					list.set(i, new Music(title,artist));
					list.get(i).setArtist(artist);
					list.get(i).setTitle(newTitle);
					result++;
				}
			}
			
		}
		else if(title==null) {//가수만 전달
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getArtist().equals(title)) {
					list.get(i).setArtist(artist);
					result++;
				}
			}
		}
		else {//나머지 (제목만 전달)
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getTitle().equals(title)) {
					list.get(i).setTitle(title);
					result++;	
				}
			}
		}
		
		
		return result;
		
	}
	
	
}





























