package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "검정");
		
		
		myPhone.setWifi(true);
		System.out.println("와이파이 상태: " + myPhone.wifi); //boolean 기본값은 false
	
		myPhone.bell();
		myPhone.sendVoice("여보세요????");
		myPhone.receiveVoice("안녕하세요ㅎㅎ 저는 이지연 입니다.");
		myPhone.hangUp();
		
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
	
	}

}
