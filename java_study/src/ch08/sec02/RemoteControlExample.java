package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television(); //부모가 자식 객체를 참조하면 자동타입변환
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl ac = new Audio();
		ac.turnOn();
		ac.setVolume(5);
		
		ac.setMute(true);
		ac.setMute(false);
		
		ac.turnOff();
		
		//상수 => 클래스명.필드명
		/*
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		*/
		
		//정적메소드 호출 => 클래스명.메소드명
		RemoteControl.changeBattery();
	}

}
