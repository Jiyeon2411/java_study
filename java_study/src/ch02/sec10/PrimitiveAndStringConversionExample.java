package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		//문자열 => 숫자타입으로 변환
		int value1 = Integer.parseInt("10"); //String => int
		
		boolean value3 = Boolean.parseBoolean("true");
		
		
		
		System.out.println("value1: " + value1);
		
		System.out.println("value3: " + value3);
		
		//숫자타입 => 문자열
		String str1 = String.valueOf(10); //int => String
		String str2 = String.valueOf(3.14); //double => String
		String str3 = String.valueOf(true);
		
		System.out.println("value4: " + str1);
		System.out.println("value5: " + str2);
		System.out.println("value6: " + str3);
	}

}
