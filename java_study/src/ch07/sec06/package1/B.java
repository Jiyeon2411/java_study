package ch07.sec06.package1;

public class B {
	public void method() {
		//클래스가 서로 같은 패키지에 있으면 접근할 수 있따
		A a = new A();
		a.field = "value";
		a.method();
	}
}
