package ch06.sec11.exam01;

public class Korea {
	//인스턴스 필드
	final String nation = "대한민국";
	final String ssn; //final은 초기값을 줘야하고 생성자에서도 줄수 있따
	
	//인스턴스 필드
	String name;
	
	public Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
