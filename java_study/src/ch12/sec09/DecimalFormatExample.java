package ch12.sec09;

import java.text.*;

public class DecimalFormatExample {
	
	public static void main(String[] args) {
			double num = 1234567.89;
			
			DecimalFormat sdf;
			
			sdf = new DecimalFormat("#,###.#######");
			String strNow2 = sdf.format(num); //날짜의 포맷을 변경
			System.out.println(strNow2);
			
			sdf = new SimpleDateFormat("올해의 D번째 날");
			System.out.println();
	}
	
}
