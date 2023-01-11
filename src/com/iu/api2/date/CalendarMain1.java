package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		//GregorianCalendar
		Calendar ca = new GregorianCalendar();
		//현재날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		System.out.println(ca);
		
		ca.set(Calendar.YEAR, 2032);
		ca.set(Calendar.MONTH, 11);
		
		ca.set(0, 0, 0);
		
		//year
		int year = ca.get(Calendar.YEAR);
		System.out.println("Year : " + year);
		
		//월은 0부터 시작
		int month = ca.get(Calendar.MONTH);	
		System.out.println("Month : " + (month + 1));
		
		//일
		int date = ca.get(Calendar.DATE);
		int day = ca.get(Calendar.DAY_OF_WEEK);		//DB : 0, Java : 1
		System.out.println("Date : " + date);
		System.out.println("Day : " + day);
		
		//시간 분 초
		int hour = ca.get(Calendar.HOUR);
		int minute = ca.get(Calendar.MINUTE);
		int second = ca.get(Calendar.SECOND);
		System.out.println("Hour : " + hour);
		System.out.println("Minute : " + minute);
		System.out.println("Second : " + second);
		
		
		
	
	}

}
