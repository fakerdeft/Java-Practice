package com.kh.chap01_network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 네트워크(Network)
		 * 여러개의 컴퓨터가 그물처럼 연결되어 있는 것
		 * 말 그대로, 여러개의 통신기기와 같은 컴퓨터들을 연결해서 데이터를 손쉽게 주고받을 수 있다.
		 * 
		 * 네트워크의 목적
		 * 여러개의 통신기기와 같은 컴퓨터들을 연결해서 데이터를 손쉽게 주고받기 위함
		 * 
		 * java.net 패키지의 클래스들을 통해 지원
		 * 
		 * 서버와 클라이언트
		 * -서버(server): 서비스를 제공하는 컴퓨터 또는 프로그램
		 * -클라이언트(Client): 서비스를 제공받는 서비스를 이용하는 사용자 또는 프로그램 또는 컴터
		 * 
		 * -서버의 역할: 서비스를 제공할 뿐만 아니라 클라이언트의 연결 요청을 수락하고 응답한다.
		 * 
		 * 네트워크 주소 체계
		 * -IP주소: Internet Protocol
		 *  네트워크 상에서 컴퓨터를 식별하는 번호
		 *   네트워크 상에서 통신기기들이 서로 인식하고 통신하기 위해 사용하는 "고유한 주소"
		 *   -> 중복되면 "충돌" 발생
		 * -Port번호: 같은 컴퓨터 내에서 각각의 프로그램을 식별하고 있는 고유 번호-> 중복되면 "충돌"
		 * -MAC주소: 컴퓨터간 데이터를 전송하기 위해 있는 컴퓨터의 물리적 주소 - 절대 변하지 않는 그 기계의
		 * 			고유 번호라고 생각.
		 * 
		 * -IP주소와 Port번호: 클라이언트가 서버에 요청을 하려면 IP주소와 Port번호를 알아야한다.
		 * 
		 * 소켓: 프로세스 간 통신에 사용되는 양쪽 끝 단
		 * 
		 * TCP: 데이터 전송 속도가 느리지만 정확하고 안정적으로 전달할 수 있는 전달 방식 체계(연결지향적 프로토콜)
		 * UDP: 데이터 전송 속도가 빠르지만 신뢰성이 없는 데이터를 전송하는 전달 방식 체계(비연결지향적 프로토콜)
		 * -프로토콜: 컴터간의 정보를 주고받을 때 통신방법에 대한 약속(접속,전달방법,데이터형태,검증방법 등등)
		 * 
		 */
		
		//InetAddress: 네트워크 정보를 확인 할 수 있는 클래스
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			//내 PC의 정보 반환
			
			System.out.println(localhost);
			System.out.println(localhost.getHostName());
			System.out.println(localhost.getHostAddress());
			
			//도메인 주소로 서버정보를 알아보자
			InetAddress naver = InetAddress.getByName("www.naver.com");
			InetAddress google = InetAddress.getByName("www.google.com");
			
			System.out.println(naver);
			System.out.println(google);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		

	}

}











