package com.iu.api3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		//1. 키보드 연결
		//표준 입력 : 키보드, 마우스, 스캐너
		//표준 출력 : 모니터
		
		//byte, 0, 1
		InputStream is = System.in;
		//char
		InputStreamReader ir = new InputStreamReader(is);
		//String
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.println("입력");
			String msg = br.readLine();
			System.out.println(msg);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
