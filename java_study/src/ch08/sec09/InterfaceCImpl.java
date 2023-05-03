package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceImple-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceImple-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceImple-methodC() 실행");
	}

}
