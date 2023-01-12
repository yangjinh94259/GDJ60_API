package com.iu.api4.network;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) {
		//Client접속 대기
		//1. 점심 메뉴 중 하나를 랜덤하게 골라서 전송
		//2. 저녁 메뉴 중 하나를 랜덤하게 골라서 전송
		//3. 서버와 클라이언트 종료
		Calendar ca = Calendar.getInstance();
		Random random = new Random(ca.getTimeInMillis());
		String [] lunch = {"라면", "햄버거", "짜장면", "짬뽕", "굶기"};
		int idx = random.nextInt(100) % 5;
		
		lunch[idx]
	}

}
