package ch12.sec08;

import java.text.*;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString(); //String타입으로 변환
		System.out.println(now);
		System.out.println(strNow1);
		
		//날짜 모양 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String strNow2 = sdf.format(now); //날짜의 포맷을 변경
		System.out.println(strNow2);
	}

}
