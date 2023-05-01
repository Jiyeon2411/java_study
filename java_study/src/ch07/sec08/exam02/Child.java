package ch07.sec08.exam02;

public class Child extends Parent{

	public int childfield;
	
	@Override
	public void method2() {
		System.out.println("child-method2()");
	}
	
	public void method3() {
		System.out.println("child-method3()");
	}

}
