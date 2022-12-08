package com.kh.chap02_tcp.client.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClientRun {

	public static void main(String[] args) {

		//클라이언트 연결 순서
		//1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		//-> 해당 서버로 요청하겠다
		//2. OutputStream,InputStream 생성
		//3. 보조스트림으로 성능 개선
		//4. 스트림을 통해 읽고 쓰기
		//5. 통신종료 -> 자원반납까지
		
		Scanner sc = new Scanner(System.in);
		
		PrintWriter pw = null;
		BufferedReader br = null;
		
		//서버의 IP주소 port번호
		String serverIp= "192.168.50.24";
		
		int port = 3000;
		
		Socket socket = null;
		
		
		//1)서버에 연결 요청 보내기
		try {
			socket = new Socket(serverIp,port);
			//만약 연결이 실패된다면 socket에 null담김
			
			if(socket==null) {
				System.out.println("연결 실패!");
			}
			else {
				System.out.println("서버와의 연결 성공!");
			}
			
			//2)기반스트림 및 보조스트림 생성
			
			//입력스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//출력스트림
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				//3.스트림을 통해 읽고 쓰기
				System.out.println("서버에게 보낼 메세지: ");
				String send = sc.nextLine();
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
				String time = sdf.format(d);
				
				pw.println(time+send);//메세지 출력
				pw.flush();
				
				String message = br.readLine();
				
				System.out.println("서버에게 받은 메세지: "+ message);
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//자원반납 - 생성 역순
			try {
				pw.close();
				br.close();
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
