package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		 char grade = 'B'; //string도 가능, 근데 쌍따옴표로 바꿔야됨
		 
		 switch (grade) {
		 case 'A':
		 case 'a':
			System.out.println("우수회원 입니다.");
			break;
		 case 'B':
		 case 'b':
			System.out.println("일반회원 입니다.");
			break;
		default:
			System.out.println("손님 입니다.");
			break;
		}
	}

}
