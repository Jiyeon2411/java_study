
public class CompareOperationExample {

	public static void main(String[] args) {
		
		//char끼리 비교
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		
		boolean result4 = (char1 < char2); //65 < 66
		System.out.println("result4: " + result4);
		
		//타입이 다른 경우 비교
		int num3 = 1;
		float num4 = 1.0f;
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);
	}

}
