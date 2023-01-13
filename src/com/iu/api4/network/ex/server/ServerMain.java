package com.iu.api4.network.ex.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class ServerMain {

	public static void main(String[] args) {
		
		ServerDAO serverDAO = null;
		ServerView serverView = null;
		ArrayList<ServerDTO> ar = null;
		
		ServerSocket ss = null;
		Socket socket= null;
		boolean check = true;
		
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
			switch (select) {
			case 1: 
				serverView.view(ar);
				break;
			case 2:
				System.out.println("찾는 학생의 이름을 작성");
				ServerDTO serverDTO = serverDAO.findByName(ar);
				if(serverDTO != null) {
					serverView.view(serverDTO);
				}else {
					serverView.view("찾는 학생이 없다");
				}
				break;
			case 3:
				br.readLine();
				break;
			case 4:
				br.readLine();
				break;
			default:
				System.out.println("서버 프로그램을 종료 합니다");
				check=false;
				//check=!check;
			}
			
			if(check) {
				bw.write("\r\n");
				bw.flush();
			}
		}
			
		} catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
}


