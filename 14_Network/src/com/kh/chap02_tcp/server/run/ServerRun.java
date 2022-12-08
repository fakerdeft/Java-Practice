package com.kh.chap02_tcp.server.run;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ServerRun {

	public static void main(String[] args) {
		
		//서버 연결 순서
		//1. 서버의 소켓 객체 생성
		//2. 클라이언트의 접속 요청을 기다림
		//3. 요청오면 수락
		//4. 클라이언트 정보 저장
		//5. 클라이언트 정보로 OutputStream 생성
		//6. 클라이언트 정보로 InputStream 생성
		//7. 연결된 스트림을 통해서 읽고 쓰기
		//8. 연결 종료시키기
		Scanner sc = new Scanner(System.in);
		
		PrintWriter pw = null;
		BufferedReader br =null;
		
		// 1)포트 번호 지정(서버측) -> 0~약 65000까지 설정 가능하나
		//  0~1300번대 정도까지는 이미 사용 중
		int port = 3000; //프로그램 고유 번호
		
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			//2)서버 소켓 객체 생성
			server = new ServerSocket(port);
			
			//3)클라이언트로부터 접속 요청이 올 때까지 대기
			System.out.println("3만년째 기다리는 중");
			
			//4)요청이 오면 요청을 수락하고 해당 클라와 통신 할 수 있는 서버측 소켓 객체 생성
			socket = server.accept();//socket ==클라이언트와 통신할 수 있는 소켓 객체
			String clientIp=socket.getInetAddress().getHostAddress();
			System.out.println(clientIp+"님이 연결되었습니다.");
			
			//5)기반스트림,보조스트림 열어주기
			//입력용 스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력용 스트림
			pw = new PrintWriter(socket.getOutputStream());
			
			//PrintWriter: 데이터 출력시 print(),println()메소드 사용 가능
			while(true) {
				//6)스트림을 통해 읽고 쓰기
				String message = br.readLine(); //읽기
				System.out.println(clientIp+"님이 보낸 메세지: "+message);
				
				System.out.println("클라이언트에게 보낼 메세지:");
				String send = sc.nextLine();
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[a hh:mm:ss]");
				String time = sdf.format(d);
				
				pw.println(time+send);//메세지 출력
				pw.flush(); //혹시나 남은 데이터가 있을 수 있으니 전부 보내겠다라는 마무리 작업.
				
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//자원반납
			//항상 생성의 역순으로 반납
			try {
				pw.close();
				br.close();
				socket.close();
				server.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}


















