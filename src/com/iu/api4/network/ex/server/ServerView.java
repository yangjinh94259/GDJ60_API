package com.iu.api4.network.ex.server;

import java.util.ArrayList;

public class ServerView {
	
	public void view(String msg) {
		System.out.println(msg);
	}
	
	public void view(ArrayList<ServerDTO> ar) {
		
		for(ServerDTO serverDTO:ar) {
			this.view(serverDTO);
		}
		
	}
	
	public void view(ServerDTO serverDTO) {
		
		System.out.println("Name : "+serverDTO.getName());
		System.out.println("Num  : "+serverDTO.getNum());
		System.out.println("Kor  : "+serverDTO.getKor());
		System.out.println("Eng  : "+serverDTO.getEng());
		System.out.println("Math : "+serverDTO.getMath());
		
	}

}