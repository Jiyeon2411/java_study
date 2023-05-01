package ch07.sec08.exam02;

public class ChildExample {

	public static void main(String[] args) {		
		//자동 타입변환1
		/*
		Child child = new Child();
		Parent parent = child;
		*/
		
		//자동 타입변환2
		Parent parent = new Child();
		
		//2. 자동타입 변환시 자식클래스에 오버라이딩 된 메소드가 있으면 그게 실행댐
		parent.method1();
		parent.method2();
		parent.parentfield = 10;
		
		//1. 부모클래스에 선언된 필드와 메소드만 접근가능하다
		//parent.method3();
		//parent.childfield = 10;
		
		System.out.println();
		
		//강제 타입변환
		Child child = (Child) parent;
		child.method3();
		child.childfield = 10;
		child.method2();
		child.parentfield = 10;
	}

}