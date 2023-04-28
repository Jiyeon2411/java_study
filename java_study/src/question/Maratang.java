package question;

public class Maratang {
	int beef;
	int spicy;
	int price;
	
	//생성자
	Maratang() {
		this.beef = beef;
		this.spicy = spicy;
	}

	void beefAdd(int beef) {
		this.beef += beef;
		System.out.println("고기 " + beef + "개 추가입니다.");
	}
	
	void spicyNum(int spicy) {
		this.spicy += spicy;
		System.out.println("마라탕 " + spicy + "단계입니다.");
	}
	
	//계산
	void pay(int serve){
		if(beef > 0) {
			price = serve * 8000 + 3000 * beef;
		} else {
			price = serve * 8000;
		}
		
		System.out.println(serve + "인분의 " + spicy + "단계 마라탕의 가격은 " + price + "원입니다.");
	}
	
}