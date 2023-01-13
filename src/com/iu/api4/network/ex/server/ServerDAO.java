package com.iu.api4.network.ex.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ServerDAO {
	
	private StringBuffer sb;
	private Scanner sc;
	
	public ServerDAO() {
		this.sc=new Scanner(System.in);
		this.sb=new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
	
	//학생정보백업
	//현재시간을 파일명으로 해서 파일작성
	public void serverBackUp(ArrayList<ServerDAO> ar) {
		//Calendar ca = new GregorianCalendar()
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
		
		
		File file = new File("C:\\fileTest", time+".txt");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			for(ServerDAO serverDTO : ar) {
				StringBuffer sb = new StringBuffer();
				sb.append(serverDTO.getName());
				sb.append(",");
				sb.append(serverDTO.getNum());
				sb.append(",");
				sb.append(serverDTO.getKor());
				sb.append(",");
				sb.append(serverDTO.getEng());
				sb.append(",");
				sb.append(serverDTO.getMath());
				sb.append("\r\n");
				
				fw.write(sb.toString());
				fw.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}


	//학생정보삭제
	public int removeServer(ArrayList<ServerDTO> ar) {
		//삭제확인용 변수
		//0이면 삭제 실패, 1 이면 삭제 성공
		int result=0;
		
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		//ar.remove(인덱스번호)
		//ar.remove(Object)
//		for(int i=0;i<ar.size();i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
//				result=1;		
//				break;
//			}
//			
//		}
		for(ServerDTO serverDTO:ar) {
			if(name.equals(serverDTO.getName())) {
				ar.remove(serverDTO);
				result=1;
				break;
			}
		}
		
		return result;
		
	}
	
	//학생정보추가
	public void addServer(ArrayList<ServerDTO> ar) {
		ServerDTO serverDTO = new ServerDTO();
		System.out.println("이름을 입력");
		serverDTO.setName(sc.next());
		System.out.println("번호를 입력");
		serverDTO.setNum(sc.nextInt());
		System.out.println("국어점수를 입력");
		serverDTO.setKor(sc.nextInt());
		System.out.println("영어점수를 입력");
		serverDTO.setEng(sc.nextInt());
		System.out.println("수학점수를 입력");
		serverDTO.setMath(sc.nextInt());
		ar.add(serverDTO);
		
		
	}
	
	//학생정보검색
	public ServerDTO findByName(ArrayList<ServerDTO> ar) {
		System.out.println("검색할 이름 입력");
		String name = sc.next();
		
		ServerDTO st=null;
		
		for(ServerDTO serverDTO:ar) {
			if(name.equals(serverDTO.getName())) {
				st = serverDTO;
				break;
			}
		}
		
		return st;
	}
	
	
	//학생정보초기화
	public ArrayList<ServerDTO>  init() {
		//String data = this.sb.toString();
		File file = new File("C:\\fileTest");
		
		String [] names = file.list();
		long max=0;
		for(String name:names) { //234.txt
			name=name.substring(0, name.lastIndexOf("."));
			long date = Long.parseLong(name);
			
			if(date>max) {
				max=date;
			}
			
		}
		
		
		
		//1. 파일정보 File
		file = new File(file, max+".txt");
		
		//2. 파일내용 읽기 위해서 연결 준비
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<ServerDTO> ar = new ArrayList<>();
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data=null;
			while((data=br.readLine()) != null) {
				data=data.replace(" ", ",");
				data=data.replace("-", "");
				StringTokenizer st = new StringTokenizer(data, ",");
				
				ServerDTO serverDTO = new ServerDTO();
				serverDTO.setName(st.nextToken());
				serverDTO.setNum(Integer.parseInt(st.nextToken()));
				serverDTO.setKor(Integer.parseInt(st.nextToken()));
				serverDTO.setEng(Integer.parseInt(st.nextToken()));
				serverDTO.setMath(Integer.parseInt(st.nextToken()));
				ar.add(serverDTO);
				
				
				
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				br.close();
				fr.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		return ar;
	}

}