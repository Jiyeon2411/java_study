package ch02.sec07;

public class PromotionExample2 {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = 'A';
		intValue = charValue;
		System.out.println(intValue);
		
		byteValue = 65;
		charValue = (char) byteValue;
		System.out.println(charValue);
	}

}
