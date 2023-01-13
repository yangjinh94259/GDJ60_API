package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		// Client접속 대기
		// 1. 점심메뉴중 하나를 랜덤하게 골라서 전송
		// 2. 저녁메뉴중 하나를 랜덤하게 골라서 전송
		// 3. 종료
		String [] lunch= {"라면", "햄버거", "짜장면", "짬뽕", "굶기"};
		String [] dinner= {"삼겹살", "갈비", "순두부", "김밥", "바나나"};
		boolean check = true;
		ServerSocket ss = null;
		Socket socket= null;
		InputStream is = null;
		InputStreamReader ir= null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(8282);
			socket = ss.accept();
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			
			while(check) {
				String data = br.readLine();
				
				int select = Integer.parseInt(data);
				
				Calendar ca = Calendar.getInstance();
				Random random = new Random(ca.getTimeInMillis());
		
				
				String menu=null;
				switch (select) {
				case 1: 
					select = random.nextInt(100)%5;
					menu = lunch[select];
					break;
				case 2:
					select = random.nextInt(100)%5;
					menu = dinner[select];
					break;
				default:
					System.out.println("서버 프로그램을 종료 합니다");
					check=false;
					//check=!check;
				}
				
				if(check) {
					bw.write(menu+"\r\n");
					bw.flush();
				}
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
			
}
