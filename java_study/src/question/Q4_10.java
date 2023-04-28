package question;

import java.util.Scanner;

public class Q4_10 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; //잔고
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			//사용자에게 화면을 보여줌
			System.out.println("------------------------------");
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("------------------------------");
			
			//사용자에게 입력을 받는다.
			System.out.println("선택 > ");
			//입력받은 값을 menuNum에 넣어준다.
			int menuNum = scanner.nextInt(); 
			
			switch (menuNum) {
			case 1:
				System.out.println("예금액 > ");
				balance += scanner.nextInt();
				break;
				
			case 2:
				System.out.println("출금액 > ");
				balance -= scanner.nextInt();
				break;
				
			case 3:
				System.out.println("잔고 > ");
				System.out.println(balance);
				break;

			case 4: //종료
				run = false;
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
