package com.iu.api3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {

	public static void main(String[] args) {
		File file = new File("C:\\filetest", "test.txt");
		System.out.println(file.exists());
		
		//파일에 내용을 작성
		String name = "Suji";
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(name + "\r\n");
			fw.flush();		//강제버퍼를 비우기
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
