package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("x값 입력: ");
		String strX = scanner.nextLine(); //문자형으로 입력받음
		int x = Integer.parseInt(strX); //문자형 => 숫자형 변환
		
		System.out.print("y값 입력: ");
		String strY = scanner.nextLine(); //문자형으로 입력받음
		int y = Integer.parseInt(strY); //문자형 => 숫자형 변환
		
		int result = x + y;
		System.out.println("x + y: " + result);
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);*/
		
		//무한 반복
		/*while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			
			//자바에서 문자열(String타입)을 비교할때는 equals를 이용해 비교한다.
			if(data.equals("q")) { //data == "q"
				break;
			}
			
			System.out.println("출력 문자열: " + data);
		}
		
		System.out.println("종료"); */
		
//		System.out.println('A'+'B');
//		System.out.println('1'+2);
//		System.out.println('1'+'2');
		
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
//		int result = 5 + byteValue;
//		System.out.println(result);
		
//		float result = 5 + floatValue;
//   	System.out.println(result);
		
		double result = 5 + doubleValue;
		System.out.println(result);
	}

}
