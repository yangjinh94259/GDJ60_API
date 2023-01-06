package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	private Scanner sc;
	public WeatherInput() {
		this.sc = new Scanner(System.in);
	}
	
	//search
	//배열을 받고, 키보드로 부터 검색할 도시명 입력 받음(대,소문자 상관 없이 검색)
	//찾은 DTO 리턴, 없으면 null
//	public WeatherData findWeather(WeatherDTO [] weatherDTO) {
//		System.out.println("알고 싶은 지역 검색");
//		String sch = sc.next();
//		WeatherData weatherData = null;
//		
//		for(int i=0; i < weatherDTO.length; i++) {
//			if(sch.equals(weatherDTO[i])) {
//				WeatherData = weatherDTO[i];
//			}
//		}
//		
//		return WeatherData;
//	}
	
	
	//add메소드
	//배열을 받고, 키보드로 부터 정보들을 입력 받음
	//배열에 추가, 배열을 리턴
		public WeatherDTO [] add(WeatherDTO [] weatherDTOs) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명 입력");
		weatherDTO.setCity(sc.next());
		System.out.println("기온 입력");
		weatherDTO.setGion(sc.next());
		System.out.println("날씨 입력");
		weatherDTO.setStatus(sc.next());
		System.out.println("미세먼지 입력");
		weatherDTO.setMise(sc.next());
		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length + 1];
		
		for(int i=0; i < weatherDTOs.length; i++) {
			newInfo[i] = weatherDTOs[i];
		}
		
		newInfo[weatherDTOs.length] = weatherDTO;
		
		return newInfo;
	}
		
		
	//remove
	//배열을 받고, 키보드로 부터 삭제할 도시명 입력 받음
	//배열에서 삭제하고 배열을 리턴
//	public WeatherDTO [] remove(WeatherDTO [] weatherDTOs) {
//		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length - 1];
//		System.out.println("삭제 도시명 입력");
//		String name = sc.next().
//	}
	
}
