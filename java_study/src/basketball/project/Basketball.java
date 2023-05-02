package basketball.project;

public class Basketball {
	//필드
	String name;
	int number;
	int score;
	double shootRatio;
	int shoottry;
	int shootsuccess;
	
	//생성자
	public Basketball() {
		initBasketball();
	}
	
	public Basketball(String name, int number) {
		this.name = name;
		this.number = number;
		initBasketball();
	}

	public void initBasketball() {
		score = 20;
		shoottry = 10;
		shootsuccess = 5;
	}
	
	public double shootRatio(int shoottry, int shootsuccess) {
		shootRatio = (shootsuccess / shoottry) * 100;
		return shootRatio(shoottry, shootsuccess);
		
	}
	
	public String PlayerInfo() {
		return name + "의 득점 점수: " + score + ", 득점 비율: " + shootRatio + "%";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
