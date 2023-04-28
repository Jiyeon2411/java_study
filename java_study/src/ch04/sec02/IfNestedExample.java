package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		//공식 int num = (int) (Math.random() * n ) + start;
		//n: 정수의 갯수, start: 시작 숫자
		
		//로또 번호(1부터 45개의 정수를 만든다)
		//int score = (int) (Math.random() * 45) + 1; //0.0~1.0 사이의 숫자를 만들어준다.
		//System.out.println(score);
		
		int score = (int)(Math.random()*20) + 81;  
		String grade;
		
		if (score >= 90) {
			if (score>=95) grade = "A+";
			else grade = "A";
		} else {
			if (score>=85) grade = "B+";
			else grade = "B";
		}
		
		System.out.println("학점: " + grade + ", 점수: " + score);
		
	}

}
