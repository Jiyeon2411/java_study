package question;

public class Q4_9 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; //사용자 입력을 저장할 공간
		int count = 0; //시도 횔수를 세기 위한 변수
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++; //시도횟수 증가
			
			System.out.println("1과 100사이의 값을 입력하세요:");
			input = s.nextInt(); //입력받은 값을 int타입으로 input에 저장한다.
			
			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요!!!!!");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요!!!!!");
			} else if (answer == input) {
				System.out.println("맞췄습니다!");
				System.out.println("시도횟수는 " + count);
				break;
			}
		} while(true); //무한반복
	}

}
