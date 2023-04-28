package ch06.sec07.exam01;

public class Car {
	//필드(멤버 변수)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자
	Car(String model, String color, int maxSpeed) {
		//주로 필드 초기화를 할때 쓴다.
		//this: 이 클래스 => Car클래스 => Car클래스 안에 있는 필드
		this.model = model; //Car 클래스 안에 있는 모델
		this.color = color; //Car 클래스 안에 있는 컬러
		this.maxSpeed = maxSpeed; //Car 클래스 안에 있는 최고속도
	}
}
