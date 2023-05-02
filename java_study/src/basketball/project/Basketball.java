package basketball.project;

public class Basketball {
	//필드
	String name;
	int number;
	int score;
	double shootRatio;
	
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
		shootRatio = 40;
	}
	
	public double shootRatio(int shoottry, int shootsuccess) {
		return shootRatio = (shoottry / shootsuccess) / 100;
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