package question;

public class Q4_7 {

	public static void main(String[] args) {
		// 1,1,2,3,5,8,13,21,34,55..
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.println(num1 + "," + num2);
		//8번 덧셈
		for (int i=0; i<8; i++) {
			num3 = num1 + num2;
			System.out.println("," + num3);
		}
	}

}
