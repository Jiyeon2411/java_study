package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		//InterfaceC가 InterfaceA, InterfaceB를 상속하고 있으므로 아래와 같이 사용가능
		InterfaceA ia = new InterfaceCImpl();
		ia.methodA();
		
		InterfaceB ib = new InterfaceCImpl();
		ib.methodB();
		
		System.out.println();
		InterfaceC ic = new InterfaceCImpl();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
