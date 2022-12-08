package com.kh.chap01_list.part02_mvc.view;

import java.util.*;
import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	//메인화면 : 프로그램 실행시 사용자가 제일 먼저 보게 될 메뉴화면
	
	public void mainMenu() {//메인메뉴
		
		System.out.println("-----melon-----");
		
		while(true) {
		System.out.println("1. 새로운 곡 추가");//add 메소드
		System.out.println("2. 곡 전체 조회");//반복문 + toString 메소드
		System.out.println("3. 특정 곡 검색");//contains / equals / getTitle
		System.out.println("4. 특정 곡 삭제");//remove
		System.out.println("5. 특정 곡 수정");//set / setter
		System.out.println("0. 프로그램 종료");
		
		System.out.println("메뉴 번호 입력:");
		int select=sc.nextInt();
		sc.nextLine();
		
			switch(select) {
			case 1:insertMusic();
				break;
			case 2:showMusicList();
				break;
			case 3:searchMusic();
				break;
			case 4:removeMusic();
				break;
			case 5:updateMusic();
				break;
			case 0:System.out.println("프로그램을 종료합니다.");
				return;
			default:System.out.println("잘못 입력하셨습니다. 메뉴 번호를 확인해주세요.");
			}//switch
			
		}//while
		
	}//mainMenu
	
	
	public void insertMusic() {//새로운 곡 추가
		System.out.println("----곡 추가----");
		System.out.println("가수 입력:");
		String artist=sc.nextLine();
		System.out.println("제목 입력:");
		String title=sc.nextLine();
		
		//만약 return으로 추가 작업이 됐는지 판별해올 경우 - 추후 작업할 방법
		
		//controller에 곡 추가 작업 요청
		mc.insertMusic(artist,title);
		
	}
	
	
	public void showMusicList() {//곡 전체 조회
		System.out.println("---전체 곡 조회---");
		//요청
		ArrayList<Music> list = mc.showMusicList();//list의 주소값을 받아옴
		
		//리스트가 비어있다면 조건 처리
		if(list.isEmpty()) {
			System.out.println("현재 등록된 곡이 없습니다.");
		}
		else {
//			System.out.println(list); //한 줄로 나열됨
			//향상된 for문으로 출력해보기
			
			//기존 인덱스 활용 방법
//			for(int i=0;i<list.size();i++) {
//				System.out.println(list.get(1));
//			}
			       
			//향상된 for문
			for(Music m: list) {
				System.out.println(m);
			}
		}
		System.out.println();
			
	}
	
	
	public void searchMusic() {//특정 곡 검색
		System.out.println("---곡 검색---");
		System.out.println("검색어를 입력하세요.");
		String keyword=sc.nextLine();
		
		//요청 후 리턴값 담아두기
		ArrayList<Music> searched = mc.searchMusic(keyword);
		
			if(searched.isEmpty()) {
				System.out.println("다시 검색");
			}
			else {
				System.out.println(keyword+"로 검색한 노래목록");
				for(Music m: searched) {
					System.out.println(m);
				}
			}
			System.out.println();
	}
	
	
	public void removeMusic() {//특정 곡 삭제
		System.out.println("---곡 삭제---");
		showMusicList();
		System.out.println("삭제할 곡명: ");
		String title = sc.nextLine();
		//요청
		int result=mc.removeMusic(title);
		
		if(result>0) {
			System.out.println("총"+result+"개의"+title+"곡이 삭제되었습니다.");
		}
		else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
	}
	
	public void updateMusic() {//특정 곡 수정
		System.out.println("---곡 수정---");
		showMusicList();
		
		System.out.println("1. 제목 수정");
		System.out.println("2. 가수 수정");
		System.out.println("3. 전체 수정");
		System.out.println("0. 메인 메뉴");
		System.out.println("메뉴 번호를 입력하세요:");
		int select = sc.nextInt();
		sc.nextLine();
		int result=0;
		
		
	}
	

}//class 




















































