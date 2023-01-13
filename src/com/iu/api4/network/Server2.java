package com.iu.api4.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		//Client접속 대기
		//1. 점심 메뉴 중 하나를 랜덤하게 골라서 전송
		//2. 저녁 메뉴 중 하나를 랜덤하게 골라서 전송
		//3. 서버와 클라이언트 종료
		
		String [] lunch = {"라면", "햄버거", "짜장면", "짬뽕", "굶기"};
		String [] dinner = {"삼겹살", "갈비", "순두부", "김밥", "바나나"};
		boolean check = true;
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(8282);
			Socket socket = ss.accept();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(check) {
			Calendar ca = Calendar.getInstance();
			Random random = new Random(ca.getTimeInMillis());
		
			int select = 1;
			String menu = null;
			
			switch(select) {
			case 1:
				select = random.nextInt(100) % 5;
				menu = lunch[select];
				break;
			case 2:
				select = random.nextInt(100) % 5;
				menu = dinner[select];
				break;
			default :
				System.out.println("서버 프로그램 종료");
				//check = false;
				check =! check;
			}
		}
		
	}

}
